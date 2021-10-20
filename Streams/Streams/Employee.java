import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class Employee
{
    //Declaring the reuired parameters of employee class
    long Emp_id;
    String Emp_Firstname;
    String Emp_Lastname;
    int age;
    long Salary;
    String Address;
    private List<String> skills;
    //creating an constructor for the given parameters

    public Employee(long Emp_id, String Emp_Firstname,String Emp_Lastname,int age,long Salary,String Address)
    {
        this.Emp_id=Emp_id;
        this.Emp_Firstname=Emp_Firstname;
        this.Emp_Lastname=Emp_Lastname;
        this.age=age;
        this.Salary=Salary;
        this.Address=Address;
    }
    public long getEmp_id() {
        return Emp_id;
    }
    public String getEmp_Firstname() {
        return Emp_Firstname;
    }
    public String getEmp_Lastname() {
        return Emp_Lastname;
    }
    public int getAge() {
        return age;
    }
    public long getSalary() {
        return Salary;
    }
    public String getAddress() {
        return Address;
    }
    public static void main(String[] args)
    {
        ArrayList<Employee>employeelist=new ArrayList<>();
        List<String> Skills =Arrays.asList("Java","Python","Robotics");
        employeelist.add(new Employee(12345,"Jack","BTS",25,200000,"klmaf"));
        System.out.println("Employee details:"+employeelist);
        //employeelist.addALL(Skills);
        //key=EmpId,Value=Emp_firstname
        Map<Long,String> employeemap1=employeelist.stream().collect(
                Collectors.toMap(Employee::getEmp_id,Employee::getEmp_Firstname));
        System.out.println("Employee details(Empid,EmpFirstName) after mapping:"+employeemap1);
        //key=Emp_Laastname,Value=age
        Map<String,Integer> employeemap2=employeelist.stream().collect(
                Collectors.toMap(Employee::getEmp_Lastname,Employee::getAge));
        System.out.println("Employee details(EmpLastname,EmpAge) after mapping:"+employeemap2);
        //key=Salary,Value=Address
        Map<Long,String> employeemap3=employeelist.stream().collect(
                Collectors.toMap(Employee::getSalary,Employee::getAddress));
        System.out.println("Employee details(Empsalary,EmpAddress) after mapping:"+employeemap3);

    }
}




