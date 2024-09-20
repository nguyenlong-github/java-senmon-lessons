public class Monster {
    protected String name;
    protected int hp;

    public Monster() { System.out.println("Monsterクラスのコンストラクタが呼び出されました！"); }
    public void setData(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void showData() { System.out.println(name + "（体力：" + hp + "）"); }
    public void intro() {
        System.out.println("おいらの名前は" + name + "。");
        System.out.println("趣味は散歩。特技はどこでも眠れることだよ。");
    }
    public void walk() {
        if (hp <= 0) {
            System.out.println("疲れて歩けないよ?");
            return;
        }
        System.out.println("てくてく・・・");
        hp--;
    }
    public void sleep() {
        System.out.println("ぐうぐう・・・");
        int recover = (int)(Math.random() * 3);
        if (recover == 0) {
            System.out.println("よく眠れなかった！");
            return;
        }
        System.out.println("体力が" + recover + "ポイント回復した！");
        hp += recover;
    }
}
