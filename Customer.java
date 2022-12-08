public class Customer {
    private Driver driver;
    private String name;
    private Payment visa;
    private String state;
    public Customer(Driver driver,String name,Payment visa){
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
    }
}
