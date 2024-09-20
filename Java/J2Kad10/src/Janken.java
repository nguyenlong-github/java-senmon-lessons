public class Janken {
    //勝ち負け、ドローをenumで定義
    enum Result{
        //đây là tập hợp tất cả constructer của enum(＝class)　Result,
        //nên khi gọi new Result("abc") thì giống như gọi new WIN("abc")
        WIN("あなたの勝ち"), LOSE("あなたの負け"), DRAW("引き分け");
        //enum内の変数
        String msg;                 // 勝敗メッセージ
        //enum内のコンストラクタ
        Result(String msg){
            this.msg = msg;
        }
    }

    enum Hand{
        GU("グー", "チョキに勝って、パーに負けます！"), // 名前、特徴
        CHOKI("チョキ", "パー勝って、グーに負けます！"), // 名前、特徴
        PA("パー", "グーに勝って、チョキに負けます！"); // 名前、特徴
        public String name; // 名前
        public String feature; // 特徴
        //コンストラクタで名前と特徴を設定する
        Hand(String name,String feature){
            this.name = name;
            this.feature = feature;
        }
    }

    //2次元配列で結果を定義
    public static Result[][] results = {
            {Result.DRAW,Result.WIN,Result.LOSE},
            {Result.LOSE,Result.DRAW,Result.WIN},
            {Result.WIN,Result.LOSE,Result.DRAW},
    };
}
