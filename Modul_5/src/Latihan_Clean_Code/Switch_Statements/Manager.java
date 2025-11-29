package Latihan_Clean_Code.Switch_Statements;

public class Manager {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
