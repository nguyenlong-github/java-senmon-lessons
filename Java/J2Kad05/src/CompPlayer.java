import java.util.Scanner;

public class CompPlayer extends BasePlayer{
    private Scanner in = new Scanner(System.in);
    CompPlayer(){
        System.out.println("CompPlayer のコンストラクタが呼び出されました！");
        name = "HAL";
    }
    public void intro(){
        System.out.println("名前：" + name + "・・・少し強いです。");
    }
    public int takeStone(int stone){
        if(stone == 1){
            take = 1;
        }else if(2 <= stone && stone <= 4){
            take = stone - 1;
        }else if(6 <= stone && stone <= 8) {
            take = stone - 5;
        }else{
            take = (int)(Math.random() * 3) + 1;
            stone -= take;
        }
        stone -= take;
        return take;

    }
}
