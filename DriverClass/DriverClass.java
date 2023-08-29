
/**
 * Write a description of class DriverClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author peace
 */
public class DriverClass {
   
    public static void main(String[] args){
       
    SalariedEmployee se=new SalariedEmployee("John","Smith","111-11-1111",800.00);
    HourlyEmployee he=new HourlyEmployee("Karen","Price","222-22-2222",16.75,40.00);
    CommissionEmployee ce=new CommissionEmployee("Sue","Jones","333-33-3333",0.06,10000);
    BasePlusCommissionEmployee bpce=new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",0.04,5000,300);
    
    Invoice i = new Invoice(5678,4,79.95,319.80);
    System.out.println(i.toString());
}}
