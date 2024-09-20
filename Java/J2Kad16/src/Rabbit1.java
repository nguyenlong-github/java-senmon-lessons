public class Rabbit1 extends Thread{
    private int distance = 1000;
    public Rabbit1(){
        System.out.println("ウサギがやってきた！");
    }

    @Override
    public void run() {
        System.out.println("ウサギが走ります！");
        for( int i = distance ; i > 0 ; i--){
            System.out.println("ウサギ：残り" + i + " メートル");
        }
        System.out.println("ウサギ：ゴールしました！");
    }
}
