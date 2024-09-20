public class Tutle1 extends Thread{
    private int distance = 1000;
    private int wait = 10;
    public Tutle1(){
        System.out.println("カメがやってきた！");
    }

    @Override
    public void run() {
        System.out.println("カメが走ります！");
        for( int i = distance ; i > 0 ; i--){
            try{
                sleep(wait);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("カメ：残り" + i + " メートル");
        }
        System.out.println("カメ：ゴールしました！");
    }
}
