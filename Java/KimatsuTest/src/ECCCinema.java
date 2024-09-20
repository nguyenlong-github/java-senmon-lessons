import java.util.Scanner;

public class ECCCinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Window[] w = { new Window(), new Window(), new Window()};
        while(true) {
            System.out.print("‰½”Ô‚Ì‘‹Œû‚Åw“ü‚µ‚Ü‚·‚©H„");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            w[n].issueTicket();
        }
    }
}
// ”­Œ”‹@
class TicketMaker {
    private int ticket = 0;
    private static TicketMaker instance = new TicketMaker();
    public int next() { return ++ticket; }
    private TicketMaker(){}
    public static TicketMaker getInstance(){
        return instance;
    }
}
// ‘‹Œû
class Window {
    public void issueTicket() { System.out.println("‚ ‚È‚½‚ÌÀÈ”Ô†‚Í" + TicketMaker.getInstance().next() + "”Ô‚Å‚·B");}
}