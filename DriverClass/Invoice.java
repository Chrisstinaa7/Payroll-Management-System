
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice implements Payable
{
   public double partNumber, partDescription, pricePerItem;
   public int quantity;
   public double amount;
   
   public Invoice(double partNumber,int quantity,double pricePerItem,double amount)
   {
       this.partNumber=partNumber;
       this.quantity=quantity;
       this.pricePerItem=pricePerItem;
       this.amount=amount;
   }
   public void setpartNumber(double partNumber){
       this.partNumber=partNumber;
   }
   
   public void setpartDescription(double partDescription){
       this.partDescription=partDescription;
   }
    
   public void setpricePerItem(double pricePerItem){
       this.pricePerItem=pricePerItem;
   }
   
   public void setquantity(int quantity){
       this.quantity=quantity;
   }
     public void setamount(double amount){
       this.amount=amount;
   }
  
   public double getamount(){
       return amount;
   }
   public double getpartNumber(){
       return partNumber;
   }
   
   public double getpartDescription(){
       return partDescription;
   }
    
   public double getpricePerItem(){
       return pricePerItem;
   }
   
   public int getquantity(){
       return quantity;
   }
    public double getPaymentAmount(){
        return amount;
    }
   public String toString(){
    return  "Invoice: "+'\n'+
            "Part Number: "+partNumber+'\n'+
            "Quantity: $"+quantity+'\n'+
            "Price per item: "+pricePerItem+'\n'+
            "Amount: "+amount+'\n';
            
   }
}
