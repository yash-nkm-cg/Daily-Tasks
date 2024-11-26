
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        // Using LocalDate directly for dates
        employees.add(new Employee("Rajesh", "FS", 67000, LocalDate.of(2023, 2, 11)));
        employees.add(new Employee("Aarav", "IT", 62000, LocalDate.of(2023, 1, 21)));
        employees.add(new Employee("Aditi", "IT", 75000, LocalDate.of(2023, 3, 10)));
        employees.add(new Employee("Aarav", "HR", 55000, LocalDate.of(2023, 2, 15)));
        employees.add(new Employee("Aditi", "FS", 70000, LocalDate.of(2023, 2, 20)));
        employees.add(new Employee("Aditi", "FS", 60000, LocalDate.of(2023, 3, 15)));
        employees.add(new Employee("Devansh", "FS", 52000, LocalDate.of(2023, 3, 25)));
        employees.add(new Employee("Kavya", "IT", 58000, LocalDate.of(2023, 5, 5)));
        employees.add(new Employee("Kavya", "IT", 65000, LocalDate.of(2023, 3, 10)));
        employees.add(new Employee("Kavya", "HR", 47000, LocalDate.of(2023, 4, 1)));
        employees.add(new Employee("Meera", "IT", 55000, LocalDate.of(2023, 5, 22)));
        employees.add(new Employee("Meera", "HR", 45000, LocalDate.of(2023, 3, 18)));
        employees.add(new Employee("Yash", "IT", 52000, LocalDate.of(2023, 5, 10)));
        employees.add(new Employee("Meera", "HR", 40000, LocalDate.of(2023, 5, 1)));
        employees.add(new Employee("Rajesh", "IT", 63000, LocalDate.of(2023, 2, 15)));
        employees.add(new Employee("Sneha", "FS", 90000, LocalDate.of(2023, 1, 12)));
        employees.add(new Employee("Sneha", "FS", 59000, LocalDate.of(2023, 4, 5)));
        employees.add(new Employee("Sneha", "IT", 61000, LocalDate.of(2023, 3, 20)));
        employees.add(new Employee("Yash", "HR", 49000, LocalDate.of(2023, 3, 30)));
        employees.add(new Employee("Devansh", "HR", 52000, LocalDate.of(2023, 4, 5)));





        for(Employee emp : employees) {
            System.out.println(emp);
        }
//        System.out.println();
//        System.out.println("----------------------------------------------------------");
//        Collections.sort(employees,new SortingFunction());

        boolean flag = true;
        while (flag){
            List<Employee> temp = new ArrayList<>(employees);
            System.out.println("Enter your options");
            System.out.println("1. For sorting by Name");
            System.out.println("2. For sorting by Name and Department");
            System.out.println("3. For sorting by Name , Department and Salary");
            System.out.println("4. Sort by every field");
            System.out.println("5. For exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : Collections.sort(temp,new SortingFunctionName());
                    for(Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 2: Collections.sort(temp,new SortingFunctionDep());
                    for(Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 3: Collections.sort(temp,new SortingFunctionSalary());
                    for(Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 4: Collections.sort(temp,new SortingFunction());
                    for(Employee emp : temp) {
                        System.out.println(emp);
                    }
                    break;
                case 5: flag = false;
                        break;

            }
            System.out.println("END");

        }
    }


}
