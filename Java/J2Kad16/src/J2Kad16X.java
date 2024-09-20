import java.util.LinkedList;
import java.util.Queue;

/*
	課題名：J2Kad16X「右折できません！（デッドロック）」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad16X {
    public static void main(String[]args) {
        Lane lane1 = new Lane("レーン1");
        Lane lane2 = new Lane("レーン2");

        lane1.setAnotherLine(lane2.getLine());
        lane2.setAnotherLine(lane1.getLine());

        lane1.start();
        lane2.start();
        try {
            Thread.sleep(50);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            lane1.join(1000);
            lane2.join(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        lane1.running = false;
        lane2.running = false;

    }

}
