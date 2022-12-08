public class Main implements Runnable{
    public static void main(String[] args){
        Driver driver = new Driver(new Grab(),"John",new Visa(100.0f));
        Customer customer = new Customer(driver,"Mary",new Visa(100.0f),10);
        driver.setState("processing");
        customer.info();
    }
    @Override
    public void run(){
        System.out.println("Hello World");
    }
}
