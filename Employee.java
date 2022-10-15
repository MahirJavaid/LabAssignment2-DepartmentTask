import java.util.Objects;

public class Employee {
    private String name;
    private String id;
    private String designation;

    public Employee( String name, String id, String designation ){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    public Employee(){
        name = "";
        id = "";
        designation = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee( Employee e ){
        this.name = e.name;
        this.id = e.id;
        this.designation = e.designation;
    }

    @Override
    public Object clone(){
        return new Employee(this);
    }

    @Override
    public String toString(){
        return "Name :"+name +"ID :"+id +"Designation :"+designation;
    }

    @Override
    public boolean equals(Object other){
        Employee temp = (Employee) other;
        return temp.id.equals(this.id);
    }
}
