/*
	課題名：J2Kad28A「平均値と素数判定」
	作成日：2023/1/30
	作成者：田中太郎
*/
public class J2Kad28A {
    public static void main(String[] args) {
        NumberGenerator g = new NumberGenerator();
        g.addObserver(new MaxObserver());
        g.addObserver(new MinObserver());
        g.addObserver(new AvrObserver());
        g.addObserver(new PrimeObserver());
        g.execute();
    }
}

