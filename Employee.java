// Creator: Alpay Altuntas
// CSC 125 Exercise 3.14


public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;



    //constructor for the classes
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0.00) {
            this.monthlySalary = monthlySalary;
        }
    }

    //set method for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set method for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set method for monthlysalary
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    //get method for firstName
    public String getFirstName() {
        return firstName;
    }

    //get method for lastName
    public String getLastName() {
        return lastName;
    }

    //get method for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }
}