import java.util.ArrayList;
import java.util.Scanner;

public class NumberGenerator {
    public static int count;
    public static int mount;
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o){
        observers.add(o);
    }
    public void notifyObservers(int n){
        for(Observer o : observers) {
            o.update(n);
        }
    };
    public void execute() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("どうしますか？（0：generate、-1：やめる）＞");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            int n = (int)(Math.random() * 100);
            System.out.println(n + "が出ました！");
            mount += n;
            count++;

            // オブザーバーへの通知
            notifyObservers(n);

            System.out.println();
        }
    }
}

// Observerインターフェイス
interface Observer{
    void update(int n);
}
class MaxObserver implements Observer{
    private int max = 0;
    @Override
    public void update(int n) {
        if(n > max) {
            max = n;
            System.out.println("MaxObserver：これまでの最大値です！");
        }
    }
}
class MinObserver implements Observer{
    private int min = 0;
    @Override
    public void update(int n) {
        if(min == 0 || n < min){
            min = n;
            System.out.println("MinObserver：これまでの最小値です！");
        }
    }
}
class AvrObserver implements Observer{
    private double avr = 0;
    @Override
    public void update(int n) {
        avr = NumberGenerator.mount / NumberGenerator.count;
        System.out.println("AvrObserver：これまでの平均は" + avr + " です！");
    }
}
class PrimeObserver implements Observer{
    private int prime = 0;
    @Override
    public void update(int n) {
        if (n == 0 || n == 1) return; // 数字が0、1の場合は素数ではないので処理を終わる
        for (int i = 2; i <= (int)Math.sqrt((double)n); i++) { // (int)Math.sqrt((double)n)は数字の平方根を求めるメソッド
            // 数字をiでわり余りが0になれば素数ではないので処理を抜ける
            if(n % i == 0) return;
        }
        System.out.println("PrimeObserver：これは素数です！");
    }
}
