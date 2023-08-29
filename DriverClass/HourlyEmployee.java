public class HourlyEmployee extends Employee {
  private  double hourlyWage, hoursWorked;
    
    public HourlyEmployee(String fName, String lName, String SSnum,double hourlyWage, double hoursWorked)
    {
        this.fName=fName;
        this.lName=lName;
        this.SSnum=SSnum;
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWorked;
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
     double Earned=hourlyWage*hoursWorked;
     return Earned;
   }
    @Override
   public String toString(){
    return "For Hourly Employee:"+fName+" "+lName+'\n'+
            "Social Security Number: "+SSnum+'\n'+
            "Hourly Wage: $"+hourlyWage+'\n'+
            "Hours Worked: $"+hoursWorked+'\n'+
            "Payment due: $"+getPaymentAmount()+'\n';
   
}}
