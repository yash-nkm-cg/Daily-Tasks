
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR", 55000, LocalDate.of(1990, 1, 15)));
        employees.add(new Employee("Alice", "Finance", 60000, LocalDate.of(1992, 3, 22)));
        employees.add(new Employee("Alice", "HR", 55000, LocalDate.of(1991, 5, 18)));
        employees.add(new Employee("Alice", "HR", 55000, LocalDate.of(1989, 12, 10))); // Edge case: Same name, dept, salary, earlier DOB
        employees.add(new Employee("Bob", "Finance", 70000, LocalDate.of(1988, 11, 25)));
        employees.add(new Employee("Bob", "HR", 60000, LocalDate.of(1990, 6, 12)));
        employees.add(new Employee("Bob", "Finance", 70000, LocalDate.of(1990, 1, 30))); // Same salary, different DOB
        employees.add(new Employee("Charlie", "HR", 60000, LocalDate.of(1989, 8, 10)));
        employees.add(new Employee("Charlie", "Finance", 75000, LocalDate.of(1987, 2, 5)));
        employees.add(new Employee("Charlie", "IT", 70000, LocalDate.of(1990, 12, 1)));
        employees.add(new Employee("Alice", "IT", 62000, LocalDate.of(1991, 10, 20)));
        employees.add(new Employee("Bob", "IT", 50000, LocalDate.of(1993, 7, 30)));
        employees.add(new Employee("David", "Finance", 85000, LocalDate.of(1985, 4, 4)));
        employees.add(new Employee("David", "HR", 85000, LocalDate.of(1986, 9, 15))); // Same name, salary, different dept
        employees.add(new Employee("David", "Finance", 90000, LocalDate.of(1985, 4, 4))); // Higher salary, same name
        employees.add(new Employee("Alice", "HR", 55000, LocalDate.of(1990, 1, 15))); // Duplicate for testing stability
        employees.add(new Employee("Eve", "HR", 45000, LocalDate.of(1995, 7, 7)));
        employees.add(new Employee("Eve", "HR", 55000, LocalDate.of(1994, 3, 3))); // Higher salary, same dept
        employees.add(new Employee("Charlie", "IT", 70000, LocalDate.of(1990, 6, 1))); // Same name, dept, salary, earlier DOB
        employees.add(new Employee("Charlie", "IT", 70000, LocalDate.of(1991, 1, 1))); // Same name, dept, salary, later DOB

        for(Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
        Collections.sort(employees,new SortingFunction());
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

}
