public class Sample02_1 {
    public static void main(String[] args) {
        // 定義
        FightChara samurai; // 侍キャラ
        samurai = new FightChara(); // インスタンスを生成
        samurai.showInfo(); // 基本情報を表示
        samurai.name = "侍"; // 名前を設定
        samurai.power = 25; // 攻撃力を設定
        samurai.showInfo();// 基本情報を表示
    }
}
