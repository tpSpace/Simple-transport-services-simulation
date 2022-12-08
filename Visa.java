public class Visa implements Payment {
    private float balance =0f;
    public Visa(float balance){
        this.balance = balance;
       // System.out.println("Visa is a payment method");
    }
    public float transactionFee(float amount){
        return amount*0.01f;
    }  
    //getter and setter
    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void transfer(float amount,Driver driver){
        this.setBalance(this.getBalance()-amount);
        driver.setBalance(driver.getBalance()+amount);
        System.out.println("Run transfer method in Visa "+(this.getBalance()));
    } 
   
}
