public class Sheep {
    static private int count = 0; // 羊の数。初期値0。
    static public void countSheep() {
//       「羊を数えます！」と表示し、羊の数を数える。
//        羊が0 匹のとき「まだ羊はいません！」と表示する。
//        羊がいるとき「羊が1 匹」「羊が2 匹」と羊の数だけ表示する。
//    コンストラクタ 「羊がやってきた！」と表示し、羊の数を1 増やす。
        System.out.println("羊を数えます！");
        if(count == 0){
            System.out.println("まだ羊はいません！");
        }else{
            for(int i = 1 ; i <= count ; i++) {
                System.out.println("羊が" + i + " 匹");
            }
        }
    }
    public Sheep(){
        System.out.println("羊がやってきた！");
        count++;
    }
}
