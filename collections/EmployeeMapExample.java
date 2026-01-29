import java.util.HashMap;
import java.util.Map;

public class EmployeeMapExample {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1, "Musa", "Engineering"));
        employeeMap.put(2, new Employee(2, "Ali", "QA"));
        employeeMap.put(3, new Employee(3, "Sara", "HR"));

        Employee emp = employeeMap.get(2);
        System.out.println(emp);
    }
}
