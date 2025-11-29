package Latihan_Clean_Code.Switch_Statements;

public class Employee_Clean {
    class EmployeeType {
        abstract int payAmount(Employee emp);
    }
    class Salesman {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getCommission();
        }
    }
    class Manager {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getBonus();
        }
    }
}
