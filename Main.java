import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
       // make random number 3-10
        int num = (int)(Math.random()*10)+3;
        System.out.println("There are "+num+" threads");
        Draw draw = new Draw(num);
         for(int i=0;i<num;i++){
                RunThread runThread = new RunThread(i);
                runThread.start();
         } 
        
    }
    
}
