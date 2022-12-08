public class Customer {
    private Driver driver;
    private String name;
    private Payment visa;
    public Customer(Driver driver,String name,Payment visa){
        this.driver = driver;
        this.name = name;
        this.visa = visa;
    }
}
