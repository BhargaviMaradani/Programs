import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
/**
 * Employee class which holds employee data
 * @author t487060
 */
public class Employee
{
    //Declaring the reuired parameters of employee class
    private long emp_id;
    private String firstname;
    private String lastname;
    private int age;
    private long salary;
    private String address;
    private List<String> skills;

    public Employee(long emp_id, String firstname, String lastname, int age, long salary, String address, List<String> skills)
    {
        this.emp_id = emp_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.salary = salary ;
        this.skills = skills;
    }

    public long getEmp_id() {;
        return emp_id;
    }
    public String getFirstname() {

        return firstname;
    }
    public String getLastname() {

        return lastname;
    }
    public int getAge() {

        return age;
    }
    public long getSalary() {

        return salary;
    }
    public String getAddress() {
        return address;
    }
    public List<String> getSkills(){

        return skills;
    }

}





