/*
	�ۑ薼�FJ2Kad28B�u�ő�l�ƍŏ��l�iObserver�j�v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
*/
public class J2Kad28B {
    public static void main(String[] args) {
        NumberGenerator g = new NumberGenerator();
        g.addObserver(new MaxObserver());
        g.addObserver(new MinObserver());
        g.execute();
    }
}

