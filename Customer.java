public class Customer {
    private Driver driver;
    private String name;
    private Payment visa;
    private String state;
    private float distance;
    public Customer(Driver driver,String name,Payment visa,float distance){
        this.driver = driver;
        this.name = name;
        this.visa = visa;
    }
    public void setState(String state){
        this.state = state;
    }
    public void Service(){
        driver.Service();
    }
    public void setBalance(Payment payment,float balance){
        payment.setBalance(balance);
    }
    public float getBalance(Payment payment){
        return payment.getBalance();
    }
    public void info(){
        System.out.println(name+" is a customer of "+driver.getName());
        System.out.println("Customer's balance is "+visa.getBalance());
        visa.transfer(40.0f, driver);
        System.out.println("Customer's balance left "+visa.getBalance());
        System.out.println("Driver's balance is "+driver.getBalance());
    }
    
}
