import java.util.Scanner;

public class UserPlayer extends BasePlayer {
    private Scanner in = new Scanner(System.in);
    public UserPlayer() { super("あなた"); }
    public int selectHand() {
        // 実装すること
        System.out.print("何をだしますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
        int n = in.nextInt();
        return n;
    }
}
