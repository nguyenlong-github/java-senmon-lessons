/*
	課題名：J2Kad06D「スーパークラスの参照」
	作成日：2022/10/17
	作成者：田中太郎
*/
public class J2Kad06D {
    public static void main(String[] args) {
        // Monster
        Monster m0 = new Monster("ピカチュウ");
        m0.intro();
        System.out.println();

        // FireMonster
        Monster m1 = new FireMonster("ヒトカゲ");
        m1.intro();
        System.out.println();

        // RockMonster
        Monster m2 = new RockMonster("カブト");
        m2.intro();

    }
}
