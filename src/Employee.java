import java.util.Objects;

public class Employee {
    private String fullName;
    private int departNum;
    private double salary;
    private int id;
    private static int idCounter = 1;

    public Employee(String fullName, int departNum, double salary) {
        this.fullName = fullName;
        this.departNum = departNum;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartNum() {
        return departNum;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartNum(int departNum) {
        this.departNum = departNum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id: " + id + ", " +
                "ФИО: " + fullName +
                ", отдел: " + departNum +
                ", зарплата сотрудника: " + salary + " руб.";
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(fullName, employee.fullName);

    }

    public int hashCode() {
        return Objects.hash(fullName, id);
    }

}
