import java.util.Scanner;

/*
    課題名：J2Kad03S「3回目のおつかい?@」
    作成日：2022/10/03
    作成者：田中太郎
 */
public class J2Kad03X {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        String[] place = {"ECC コーヒー" , "ECC バーガー" , "ECC ドーナツ" };

        Stack statment = new Stack(size);
        System.out.println("のび太がおつかいに行きます！");
        if(statment.isEmpty()){
            statment.push("のび太の家");
        }
        while(true){
            statment.space();
            System.out.print(statment.getData(statment.size() - 1) + "どこへ行きますか？（0：ECC コーヒー、1：ECC バーガー、2：ECC ドーナツ、-1：戻る）＞");
            int numberPlace = in.nextInt();

            if(numberPlace < 0){
                statment.space();
                System.out.println("もと来た道を戻ります！");
                while(!statment.isEmpty()){
                    statment.space();
                    System.out.println(statment.pop() +"に戻ってきた！");
                }
                break;
            }else {
                if (statment.isFull()) {
                    statment.space();
                    System.out.println("これ以上進むと帰れないよ?");
                    continue;
                } else {
                    statment.push(place[numberPlace]);
                }
            }
        }
    }
}
