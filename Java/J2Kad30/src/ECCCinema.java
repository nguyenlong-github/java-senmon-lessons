import java.util.Scanner;

public class ECCCinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Window[] w = { new Window(), new Window(), new Window()};
        while(true) {
            System.out.print("何番の窓口で購入しますか？＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            w[n].issueTicket();
        }
    }
}
// 発券機
class TicketMaker {
    private int ticket = 0;
    public int next() { return ++ticket; }
}
// 窓口
class Window {
    private TicketMaker t = new TicketMaker();
    public void issueTicket() { System.out.println("あなたの座席番号は" + t.next() + "番です。");}
}