import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeMain {
    public static void main(String[] args)
    {
        ArrayList<Employee> employeelist;
        employeelist = new ArrayList<>();

        employeelist.add(new Employee(12345, "Jack", "Music", 25, 200000, "klmaf", Arrays.asList("Java", "Python", "Robotics")));

        employeelist.add(new Employee(23456, "Jimmy",  "BTS", 28, 250000, "klmafe",  Arrays.asList("Python", "Robotics")));

        employeelist.add(new Employee(34567, "Vector", "Superb", 24, 280000, "klmafg",  Arrays.asList("Java",  "Robotics")));

        employeelist.stream()
                .filter(e -> e.getSkills().contains("Java"))
                .map(Employee::getEmp_id)
                .forEach(System.out::print);

        //key=EmpId,Value=Emp_firstname

        Map<Long, String> employeemap1 = employeelist
                .stream()
                .collect(Collectors.toMap(Employee::getEmp_id, Employee::getFirstname));
        System.out.println(employeemap1);

        //key=Emp_Laastname,Value=Emp_Age
        Map<String, Integer> employeemap2 = employeelist
                .stream()
                .collect(Collectors.toMap(Employee::getLastname, Employee::getAge));
        System.out.println(employeemap2);

        //key=Salary,Value=Address

        Map<Long, String> employeemap3 = employeelist
                .stream()
                .collect(Collectors.toMap(Employee::getSalary, Employee::getAddress));
        System.out.println(employeemap3);

    }
}
