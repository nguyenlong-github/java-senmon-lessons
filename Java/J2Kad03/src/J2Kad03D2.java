/*
    課題名：J2Kad03D2「引数付きコンストラクタ」
    作成日：2022/10/03
    作成者：田中太郎
 */
public class J2Kad03D2 {
    public static void main(String[] args) {
        Monster m1 = new Monster("まだないよ?", 1);
        m1.showData();
        m1.setData("ピカチュウ", 20);
        m1.showData();
    }
}
