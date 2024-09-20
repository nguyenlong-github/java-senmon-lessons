public class Sleepy extends Animal implements Runnable{
    private String msg = "眠りウサギは昼寝した！！";
    private String msg2 = "眠りウサギは目を覚ました！！";

    public Sleepy(){
        super("眠りウサギ");
        wait = 500;
    }
    public void run() {
        System.out.println(name + "が走ります！");
        for( int i = distance ; i > 0 ; i--){
            int rand = (int)(Math.random()*100);
            if(rand == 0) {
                try {
                    System.out.println(msg);
                    Thread.sleep(wait);
                    System.out.println(msg2);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println(name + "：残り" + i + " メートル");
        }
        System.out.println(name + "：ゴールしました！");
    }

}
