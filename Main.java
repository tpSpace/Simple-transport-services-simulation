public class Main {
    public static void main(String[] args){
        Driver driver = new Driver(new Grab(),"John",new Visa(100));
        Customer customer = new Customer(driver,"Mary",new Visa(100));
        driver.setState("processing");
        
    }
}
