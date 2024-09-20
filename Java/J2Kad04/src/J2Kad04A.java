/*
    課題名：J2Kad04A
    作成日：2022/10/06
    作成者：田中太郎
 */
public class J2Kad04A {
    public static void main(String[] args) {
        System.out.println("10枚カードを引きます！");
        for(int i = 0 ; i < 10 ; i++){
            Card card = new Card();
            System.out.println("カードの番号は" + card.getNumber() +"です！");
        }

    }
}
