public class Draw {
    private static int numberThread=0;
    private static int counter =0 ;
    public Draw(int x){
        numberThread = x;
    }
    public static void addThread(){
        
        if(counter<=numberThread){
            counter++;
        } else {
            drawTable();
            counter=0;
        }
    }
    public static void drawTable(){
        System.out.println("============================================");
    }
}
