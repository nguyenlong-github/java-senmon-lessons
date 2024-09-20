/*
	課題名：J2Kad28B「最大値と最小値（Observer）」
	作成日：2023/1/30
	作成者：田中太郎
*/
public class J2Kad28B {
    public static void main(String[] args) {
        NumberGenerator g = new NumberGenerator();
        g.addObserver(new MaxObserver());
        g.addObserver(new MinObserver());
        g.execute();
    }
}

