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
            System.out.print("�ǂ����܂����H�i0�Fgenerate�A-1�F��߂�j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            int n = (int)(Math.random() * 100);
            System.out.println(n + "���o�܂����I");
            mount += n;
            count++;

            // �I�u�U�[�o�[�ւ̒ʒm
            notifyObservers(n);

            System.out.println();
        }
    }
}

// Observer�C���^�[�t�F�C�X
interface Observer{
    void update(int n);
}
class MaxObserver implements Observer{
    private int max = 0;
    @Override
    public void update(int n) {
        if(n > max) {
            max = n;
            System.out.println("MaxObserver�F����܂ł̍ő�l�ł��I");
        }
    }
}
class MinObserver implements Observer{
    private int min = 0;
    @Override
    public void update(int n) {
        if(min == 0 || n < min){
            min = n;
            System.out.println("MinObserver�F����܂ł̍ŏ��l�ł��I");
        }
    }
}
class AvrObserver implements Observer{
    private double avr = 0;
    @Override
    public void update(int n) {
        avr = NumberGenerator.mount / NumberGenerator.count;
        System.out.println("AvrObserver�F����܂ł̕��ς�" + avr + " �ł��I");
    }
}
class PrimeObserver implements Observer{
    private int prime = 0;
    @Override
    public void update(int n) {
        if (n == 0 || n == 1) return; // ������0�A1�̏ꍇ�͑f���ł͂Ȃ��̂ŏ������I���
        for (int i = 2; i <= (int)Math.sqrt((double)n); i++) { // (int)Math.sqrt((double)n)�͐����̕����������߂郁�\�b�h
            // ������i�ł��]�肪0�ɂȂ�Αf���ł͂Ȃ��̂ŏ����𔲂���
            if(n % i == 0) return;
        }
        System.out.println("PrimeObserver�F����͑f���ł��I");
    }
}
