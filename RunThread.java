import java.util.Random;
import java.util.ArrayList;

public class RunThread extends Thread {
    //driver and customer initlaize
    private int numberThread;
    private int distance;
    private int time;
    private String name1;
   
    ArrayList<String> name = new ArrayList<String>();
    public RunThread(int x){
        
        this.numberThread = x;
        name.add("John");
        name.add("Tom");
        name.add("Jack");
        name.add("Mary");
        name.add("Lily");
        name.add("Lucy");
        name.add("Bob");
        name.add("Alice");
        name.add("Mike");
        name.add("David");
        name.add("Peter");
        name.add("Linda");
        Random random = new Random();
        int index = random.nextInt(name.size());
        name1 = name.get(index);
        distance = (int)(Math.random()*10)+1;
        time = 0;
    }
    @Override
    public void run() {
        //random number 1-10
        
        // make a array of rnadom name
        
        
        //random pick name from array
        

        Driver driver = new Driver(new Grab(),"John",new Visa(100f));
            Customer customer = new Customer(driver,name1,new Visa(100f),distance);
        customer.setState("processing");
        driver.setState("processing");
        while (time<distance){
            try {               
                time++;   
                System.out.println("From thread"+numberThread+" "+customer.getName()+" is being carried by "+driver.getName()+" for "+distance);
                Draw.addThread();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   
        }
        while (true){
           
            try {               
                customer.info();
                Draw.addThread();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
        

    }
}
