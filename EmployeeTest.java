import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args){
        char percentSign = '%';
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Alpay Can", "Altuntas", 20000.00);
        Employee employee2 = new Employee("Manayeh", "Linton", 25000.00);

        System.out.printf("The employee %s %s has a yearly salary of: $%f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("The employee %s %s has a yearly salary of: $%f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
        System.out.printf("After a raise of 10%c, the employee %s %s has a yearly salary of: $%f%n", percentSign, employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 13.2);
        System.out.printf("After a raise of 10%c, of he employee %s %s has a yearly salary of: $%f%n", percentSign, employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 13.2);

    }
}


