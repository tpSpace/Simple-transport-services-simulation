public class Customer {
    private Driver driver;
    private String name;
    private Payment visa;
    private String state;
    private float distance = 10f;
    private int time;
    public Customer(Driver driver,String name,Payment visa,float distance){
        this.driver = driver;
        this.name = name;
        this.visa = visa;
        this.distance = distance;
        this.time = time;
    }
    public void setState(String state){
        this.state = state;
    }
    public void Service(){
        driver.Service();
    }
    public void setBalance(float balance){
        visa.setBalance(balance);
    }
    public float getBalance(){
        return visa.getBalance();
    }
    public void info(){
        driver.pay(distance, this);
        System.out.println("Total distance: "+distance+" Customer "+name+" pay "+distance+" to driver "+driver.getName()+" from thread "+Thread.currentThread().getName());
      
    }
    public String getName(){
        return name;
    }
    
}
