
/**
 * Abstract class Employee - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Employee implements Payable {
    public String fName,lName,SSnum;
    
    public abstract void setSNumber(String SSnum);
    public abstract void setfName(String fName);
    public abstract void setlName(String lName);
    
    public abstract String getSNumber();
    public abstract String getfName();
    public abstract String getlName();
    
    public abstract double getPaymentAmount();
    
    public abstract String toString();
    
}
