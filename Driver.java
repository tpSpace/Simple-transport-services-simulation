public class Driver {
    private String name="";//name of driver
    private String state="";//free or processing
    private Transportation transportation;
    private Payment visa;
    public Driver(Transportation transportation, String name, Payment visa){
        this.transportation = transportation;
        this.name = name;
        this.visa = visa;
    }
    public void setState(String state){
        this.state = state;
    }
    public void Service(){
        transportation.Service();
    }
    public String getName(){
        return name;
    }
    public String getState(){
        return state;
    }
    public void setBalance(float balance){
        visa.setBalance(balance);
    }
    public float getBalance(){
        return visa.getBalance();
    }
}
