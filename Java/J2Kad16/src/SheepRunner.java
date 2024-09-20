public class SheepRunner extends Sheep implements Runnable{
    private int distance = 100;
    public SheepRunner(){
        super();
    }
    public void run(){
        System.out.println(super.toString() + "が走ります！");
        for(int i = 100 ; i > 0 ; i-- ){
            System.out.println(this + "：残り" + i +" メートル！" );
        }
        System.out.println(this + "：ゴールしました！");
    }
}
