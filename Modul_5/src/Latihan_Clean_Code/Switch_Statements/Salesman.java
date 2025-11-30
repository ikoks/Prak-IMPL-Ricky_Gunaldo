package Latihan_Clean_Code.Switch_Statements;

public class Salesman extends EmployeeType {
    @Override
    int payAmount(Employee_Clean emp) {
        return emp.getMonthlySalary() + emp.getCommission();
    }
}
