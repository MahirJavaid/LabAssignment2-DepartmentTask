import java.util.Scanner;

public class Lab {
    private String name;
    private Employee labAttendant;
    private PC[] computers;

    public Lab(){

    }

    public Lab(String name, Employee labAttendant, PC[] computers){
        this.name = name;
        this.labAttendant = labAttendant;
        this.computers = computers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void setComputers(PC[] computers) {
        this.computers = computers;
    }

    public String getName() {
        return name;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public PC[] getComputers() {
        return computers;
    }

    public Lab( Lab lab){
        this.name = lab.name;
        this.labAttendant = lab.labAttendant;
        this.computers = lab.computers;

        /*if ( lab.computers != null ){
            for ( int i = 0; i < lab.computers.length; i++ ){
                this.computers[i] = (PC) lab.computers[i].clone();
            }
        }*/
    }

    @Override
    public Object clone(){
        return new Lab(this);
    }

    @Override
    public boolean equals( Object other ){
        Lab lab = (Lab) other;
        return this.name.equals( lab.name );
    }

    @Override
    public String toString(){
        return "Lab Name :"+name +"Lab Attendant :"+labAttendant +"Computers :"+computers;
    }

    public void askForInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Number of systems to be added = ");
        PC systems[] = new PC[s.nextInt()];

        for ( int k = 0; k < systems.length; k++ ){
            System.out.println( "\nEnter asset ID: " );
            String sysID = Department.getNewLine();
            System.out.println( "\nEnter model name: ");
            String sysModel = Department.getNewLine();
            System.out.println( "\nName of LCD: " );
            String LCDName = Department.getNewLine();
            System.out.println( "\nRAM Size(MB): " );
            int RAMSize = s.nextInt();
            System.out.println( "\nDisk Size(GB): " );
            int DiskSize = s.nextInt();
            System.out.println( "\nDoes system has a Graphic card? (y/n)" );
            String hasGPU = Department.getNewLine();
            systems[k] = new PC( sysID, sysModel, LCDName, RAMSize, DiskSize, hasGPU.charAt(0) == 'y' );
        }
        for ( int j = 0; j < systems.length; j++ ){
            this.addSystem(systems[j]);
        }
    }

    public void addSystem( PC p1 ) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = p1;
                break;
            }
        }
    }

    public void removeSystem( int systemNo ){
        if ( computers[systemNo] == null ){
            System.out.println( "System has been removed already" );
            return;
        }
        if ( computers[systemNo] != null ){
            computers[systemNo] = null;
            return;
        }
    }
}
