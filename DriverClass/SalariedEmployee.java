
/**
 * Write a description of class SalariedEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SalariedEmployee extends Employee {
   private double weeklyWage;
   
   public SalariedEmployee(){}

    
    public SalariedEmployee(String fName, String lName, String SSnum,double weeklyWage){
     
      this.fName=fName;
      this.lName=lName;
      this.SSnum=SSnum;
      this.weeklyWage=weeklyWage;
      
   }
   
    @Override
    public void setSNumber(String SSnum){
        this.SSnum=SSnum;
    }
    @Override
    public void setfName(String fName){
         this.fName=fName;
     }
    @Override
   public void setlName(String lName){
       this.lName=lName;
   }
   
    /**
     *
     * @param weeklyWage
     */
   
   
     public void setweeklyWage(double weeklyWage)
    {
        this.weeklyWage=weeklyWage;
    }
    @Override
   public String getSNumber(){
       return SSnum;
   }
    @Override
   public String getfName(){
       return fName;
   }
    @Override
   public String getlName(){
       return lName;
   }
    @Override
   public double getPaymentAmount(){
       
       return weeklyWage;
   }
   
    @Override
   public String toString(){
    return "For Salaried Employee: "+fName+" "+lName+'\n'+
            "Social Security Number: "+SSnum+'\n'+
            "Weekly Salary: $"+weeklyWage+'\n'+
            "Payment due: $"+getPaymentAmount()+'\n';
   }
}

