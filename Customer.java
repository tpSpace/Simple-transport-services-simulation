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
    public void info(){
        System.out.println(name+" is a customer of "+driver.getName());
        System.out.println("Customer's balance is "+visa.getBalance());
        this.transfer(visa,50f);
        System.out.println("Customer's balance is "+visa.getBalance());
    }
    public void transfer(Payment payment,float amount){
        payment.transfer(payment.getBalance(),driver);
    }
}
