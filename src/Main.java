import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static EmployeeBook employeeBook = new EmployeeBook();

    public static void main(String[] args) {
        employeeBook.addEmployee("Алексеев Алексей Алексеевич", 1, 55_000);
        employeeBook.addEmployee("Борисов Борис Борисович", 2, 44_000);
        employeeBook.addEmployee("Владимиров Владимир Владимирович", 2, 33_000);
        employeeBook.addEmployee("Генадиев Геннадий Геннадьевич", 4, 22_000);
        employeeBook.addEmployee("Дмитров Дмитрий Дмитриевич", 5, 144_000);
        employeeBook.addEmployee("Захаров Захар Захарович", 1, 100_000);
        employeeBook.addEmployee("Игорев Игорь Игорьевич", 2, 90_500);
        employeeBook.addEmployee("Константинов Константин Константинович", 3, 72_900);
        employeeBook.addEmployee("Леонидов Леонид Леонидович", 4, 50_500);
        employeeBook.addEmployee("Михайлов Михаил Михайлович", 5, 94_400);


        System.out.println();
        //8a
        employeeBook.printAllEmployees();
        System.out.println();
        //8b
        System.out.println("Cумма затрат на ЗП в месяц = " + employeeBook.summSalaryMonth());
        //8c
        Employee getMinSalary = employeeBook.minSalary();
        if(getMinSalary != null) {
            System.out.println("Cотрудник с минимальной ЗП = " + employeeBook.minSalary().getFullName());
        }
        else {
            System.out.println(" No");
        }
        //8d*/
        System.out.println("Cотрудника с максимальной ЗП = " + employeeBook.employeeMaxSalary());
        //8e
        System.out.println("Средняя зп = " + employeeBook.midlSalaryMonth());
        //8f
        employeeBook.allEmployees();


    }

}