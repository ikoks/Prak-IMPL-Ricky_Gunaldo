package Latihan_Clean_Code.Switch_Statements;

public class Employee_Clean {
    public int getMonthlySalary() {
        return 1;
    }

    public int getCommission() {
        return 1;
    }

    public int getBonus() {
        return 1;
    }

    abstract class EmployeeType {
        abstract int payAmount(Employee emp);
    }
    public class Salesman {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getCommission();
        }
    }

    public class Manager {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getBonus();
        }
    }
}
