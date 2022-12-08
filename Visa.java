public class Visa implements Payment {
    private float balance;
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
}
