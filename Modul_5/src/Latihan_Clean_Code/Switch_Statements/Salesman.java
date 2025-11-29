package Latihan_Clean_Code.Switch_Statements;

public class Salesman {
    int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
