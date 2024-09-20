import java.util.Scanner;

/*
    課題名：J2Kad01B「ライチュウ現る！」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01B {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int choice;
        J2Kad01C.showData();
        System.out.println(J2Kad01C.name + "?が進化した！");
        J2Kad01C.name = "ライチュウ";
        J2Kad01C.hp = 40;
        J2Kad01C.showData();
        while(true){
            System.out.print("どうしますか？（1：散歩する、2：眠る、-1：終了）＞");
            choice = in.nextInt();
            switch(choice) {
                case 1:
                    J2Kad01C.walk();
                    J2Kad01C.showData();
                    break;
                case 2:
                    J2Kad01C.sleep();
                    J2Kad01C.showData();
                    break;
            }
            if(choice == -1){
                break;
            }
        }
    }
}

