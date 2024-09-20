public class Customer extends Thread{
    public Customer(){
        System.out.println("預金者がやってきた！「がんばってお金を預けるぞ！」");
    }
    public void run(){
        for(int i = 0 ; i < 10000 ; i++){
            Bank.addOneYen();
        }
    }
}
