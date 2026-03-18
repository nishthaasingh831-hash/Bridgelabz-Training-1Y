package com.gla.coma.company.analytics;
import com.gla.coma.company.analytics.sale.SalesReport;
import com.gla.coma.company.analytics.hr.EmployeeReport;
public class Runner{
    public static void main(String[] args){
        SalesReport s=new SalesReport();
        EmployeeReport e=new EmployeeReport();
        System.out.println("Company Analytics Report");
        s.displaySales();
        e.displayEmployees();
    }
}