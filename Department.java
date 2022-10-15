import java.util.Scanner;

public class Department {
    private String name;
    private Employee hodName;
    private Employee labIncharge;
    private Lab[] labs = new Lab[10];

    public Department(String name, Employee hodName, Employee labIncharge, Lab[] labs){
        this.name = name;
        this.hodName = hodName;
        this.labIncharge = labIncharge;
        this.labs = labs;
    }

    public Department(){
        hodName = new Employee();
        labIncharge = new Employee();
        labs = null;
    }

    public Department( Department d){
        this.name = d.name;
        this.hodName = d.hodName;
        this.labIncharge = d.labIncharge;
        this.labs = d.labs;

        /*if ( d.labs != null ){
            for ( int i = 0; i < d.labs.length; i++ ){
                this.labs[i] = (Lab) d.labs[i].clone();
            }
        }*/
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHodName(Employee hodName) {
        this.hodName = hodName;
    }

    public void setLabIncharge(Employee labIncharge) {
        this.labIncharge = labIncharge;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public String getName() {
        return name;
    }

    public Employee getHodName() {
        return hodName;
    }

    public Employee getLabIncharge() {
        return labIncharge;
    }

    public Lab[] getLabs() {
        return labs;
    }

    @Override
    public Object clone(){
        return new Department(this);
    }

    @Override
    public boolean equals(Object other){
        Department d = (Department) other;
        return this.name.equals(d.name);
    }

    @Override
    public String toString(){
        return "Name of Department :"+name +"HOD Name :"+hodName +"Lab Incharge :"+labIncharge +"Labs :"+labs;
    }

    public static String getNewLine(){
        Scanner s = new Scanner(System.in);
        String nextInput = s.nextLine();

        while ( nextInput.length() == 0 || nextInput.charAt(0) == '\n' ){
            nextInput = s.nextLine();
        }
        return nextInput;
    }

    public void getInput(){
        Scanner s = new Scanner( System.in );
        System.out.println( "\nNumber of labs to be added: " );
        Lab labs[] = new Lab[s.nextInt()];

        for ( int i = 0; i < labs.length; i++ ){
            System.out.println( "\nEnter name of lab: " );
            String labName = getNewLine();

            System.out.println( "\nEnter info. of lab attendant as follows" );
            System.out.println( "\nName: " );
            String name = getNewLine();
            System.out.println( "\nID: ");
            String id = getNewLine();
            System.out.println( "\nDesignation: ");
            String designation = getNewLine();

            System.out.println( "\nHow many systems do you want to add in this lab?" );
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
            labs[i] = new Lab( labName, new Employee( name, id, designation ), systems );
        }
        for ( int j = 0; j < labs.length; j++){
            this.addLab(labs[j]);
        }
    }

    public void addLab( Lab l ) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = l;
                break;
            }
        }
    }

    public void removeLab( int labNo ){
        if (labs[labNo] == null){
            System.out.println( "Lab has been removed already" );
            return;
        }
        if (labs[labNo] != null){
            labs[labNo] = null;
            return;
        }
    }

    public void printLab(){
        for ( int k = 0; k < labs.length; k++){
            if ( labs[k] != null ){
                System.out.println( labs[k] );
            }
        }
    }
}
