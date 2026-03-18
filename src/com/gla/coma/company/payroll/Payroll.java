package com.gla.coma.company.payroll;
import com.gla.coma.company.hr.Employee;
public class Payroll{
    public double calculateBonus(Employee e){
        double bonus=e.getSalary()*0.10;
        double totalSalary=e.getSalary()+bonus;
        return totalSalary;
    }
}
