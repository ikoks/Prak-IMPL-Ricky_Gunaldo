package Latihan_Clean_Code.Switch_Statements;

public class Manager extends EmployeeType {
    @Override
    int payAmount(Employee_Clean emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
