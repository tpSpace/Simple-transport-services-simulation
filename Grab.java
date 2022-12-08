public class Grab implements Transportation {
    public Grab(){
        System.out.println("Grab is a transportation service");
    }
    public void Service(){
        System.out.println("Grab is a transportation service");
    }
    public float Pay(float distance){

        if(distance<=2.0){
            return distance*0.5f;
        } else if(distance>2){
            return distance*0.5f + (distance-2);
        } else {
            return 0;
        }
    }
    @Override
    public float getBalance(Payment payment) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void setBalance(Payment payment, float balance) {
        // TODO Auto-generated method stub
        
    }
}
