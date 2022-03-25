import java.util.ArrayList;
import java.util.Date;

public class Emp implements EmpExpress,Comparable {

    private String FirstName;
    private String LastName;
    private double Salary;
    private Date date;
    private int Id;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void ListOfEmp(ArrayList e) {
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
