public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary;
    
    public BasePlusCommissionEmployee(String fName, String lName, String SSnum,double CommissionRate, double GrossSales, double baseSalary){
        super(fName,lName,SSnum,CommissionRate,GrossSales);
       this.baseSalary=baseSalary;

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
   
   public double setbaseSalary(double baseSalary){
     this.baseSalary=baseSalary;
     return baseSalary;
   }
   public double getbaseSalary(){
       return baseSalary;
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
   public double getPaymentAmount()
   {
     commission=CommissionRate*GrossSales;
     return baseSalary+commission;
   }
    @Override
   public String toString(){
    return "For Base Salaried Commission Employee:"+fName+" "+lName+'\n'+
            "Social Security Number: "+SSnum+'\n'+
            "Gross Sales: $"+GrossSales+'\n'+
            "Comission Rate: $"+CommissionRate+'\n'+
            "Base Salary: $"+baseSalary+'\n'+
            "Payment due: $"+getPaymentAmount();
   }

}


