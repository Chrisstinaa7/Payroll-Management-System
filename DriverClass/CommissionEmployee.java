
/**
 * Write a description of class CommissionEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 public class CommissionEmployee extends Employee {
   public double CommissionRate, commission;
   public double GrossSales, earned;
    
    public CommissionEmployee(String fName, String lName, String SSnum,double CommissionRate, double GrossSales){
        this.fName=fName;
        this.lName=lName;
        this.SSnum=SSnum;
        this.CommissionRate=CommissionRate;
        this.GrossSales=GrossSales;
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
     commission=CommissionRate*GrossSales;
     return commission;
   }
    @Override
   public String toString(){
    return "For Commission Employee:"+fName+" "+lName+'\n'+
            "Social Security Number: "+SSnum+'\n'+
            "Gross Sales: $"+GrossSales+'\n'+
            "Comission Rate: $"+CommissionRate+'\n'+
            "Payment due: $"+getPaymentAmount()+'\n';
   }
}
