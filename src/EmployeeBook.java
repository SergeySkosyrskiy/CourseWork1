import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int size;

    public boolean addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Недостаточно места в базе данных для добавления сотрудника");
            return false;
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
        return true;
    }

    private String returnFullName(int index) {
        if (index <= employees.length - 1) {
            return employees[index].getFullName();
        } else {
            return "Индекс за пределами массива";
        }
    }

    // Базовый 8а Метод выводящий  список всех сотрудников со всеми имеющимися по ним данными

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    //  Базовый 8b Метод суммирующий все зарплаты
    public double summSalaryMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    // Базовый 8с Метод Сотрудник с наимешьшим окладом
   /* public String employeeMinSalary() {
        return returnFullName(minSalary());
    }*/

    /*   public String minSalary() {
           int idx = 0;
          // Employee min = returnFullName(3);
           double min = employees[maxSalary()].getSalary();
           for (int i = 0; i < employees.length - 1; i++) {
               if (employees[i] != null && employees[i].getSalary() < min) {
                   min = employees[i].getSalary();
                   idx = i;

               }else if (employees[i]== null)
                   System.out.println("No Employee");

           }
           return returnFullName(idx);
       }*/
    public Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee tempEmployee = null;
        for (int i = 0; i < employees.length - 1; i++) {
            Employee employee = employees[i];
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = (int) employee.getSalary();
                tempEmployee = employee;

            } else if (employees[i] == null)
                System.out.println("No Employee");
        }
        return tempEmployee;
    }

    // Базовый 8d Метод Сотрудник с наибольшим окладом
    public String employeeMaxSalary() {
        return returnFullName(maxSalary());
    }

    private int maxSalary() {
        double max = 0;
        int idx = 0;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                idx = i;
            }
        }
        return idx;
    }


    // Базовый 8e Метод Средняя значение зарплаты
    public double midlSalaryMonth() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        sum = sum / employees.length;
        return sum;
    }

    // Базовый 8f Метод Список всех ФИО сотрудников
    public void allEmployees() {
        System.out.println("\nСписок всех ФИО сотрудников\n");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }


}
