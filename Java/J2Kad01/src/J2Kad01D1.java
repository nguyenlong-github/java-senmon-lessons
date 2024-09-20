/*
    課題名：J2Kad01D1「ローカル変数」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01D1 {
    public static void main(String[]args){
        int x = 10;
        for(int i = 0 ; i < 3 ; i++){
            add5(x);
        }
        System.out.println("x : " + x);

    }
    public static void add5(int x){
        x += 5;
        System.out.println("x に5 を足しました！");
    }
}
