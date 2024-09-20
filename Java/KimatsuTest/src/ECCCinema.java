import java.util.Scanner;

public class ECCCinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Window[] w = { new Window(), new Window(), new Window()};
        while(true) {
            System.out.print("���Ԃ̑����ōw�����܂����H��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            w[n].issueTicket();
        }
    }
}
// �����@
class TicketMaker {
    private int ticket = 0;
    private static TicketMaker instance = new TicketMaker();
    public int next() { return ++ticket; }
    private TicketMaker(){}
    public static TicketMaker getInstance(){
        return instance;
    }
}
// ����
class Window {
    public void issueTicket() { System.out.println("���Ȃ��̍��Ȕԍ���" + TicketMaker.getInstance().next() + "�Ԃł��B");}
}