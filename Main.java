public class Main implements Runnable{
    public static void main(String[] args){
        Driver driver = new Driver(new Grab(),"John",new Visa(100));
        Customer customer = new Customer(driver,"Mary",new Visa(100),10);
        driver.setState("processing");
        customer.info();
    }
    @Override
    public void run(){
        System.out.println("Hello World");
    }
}
