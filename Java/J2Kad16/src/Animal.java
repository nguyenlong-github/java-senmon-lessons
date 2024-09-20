public class Animal extends Thread{
    protected String name;
    protected int distance = 1000;
    protected int wait;
    protected String msg;
    public Animal(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "が走ります！");
        for( int i = distance ; i > 0 ; i--){
            try {
                Thread.sleep(wait);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name + "：残り" + i + " メートル");
        }
        System.out.println(name + "：ゴールしました！");
    }
}
