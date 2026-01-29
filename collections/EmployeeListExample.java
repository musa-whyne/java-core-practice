import java.util.ArrayList;
import java.util.List;

public class EmployeeListExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Musa", "Engineering"));
        employees.add(new Employee(2, "Ali", "QA"));
        employees.add(new Employee(3, "Sara", "HR"));

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
