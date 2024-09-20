package pac22a;

public class RPGCharacter {
    private static String[] nameData = {
            "ピタゴラス",
            "アルキメデス",
            "エラストテネス",
            "ユークリッド",
            "フィボナッチ",
            "デカルト",
            "フェルマー",
            "パスカル",
            "オイラー",
            "ラプラス",
            "フーリエ",
            "ガウス",
            "ド・モルガン",
            "ブール",
            "リーマン",
            "ポアンカレ",
            "ラッセル",
            "ニュートン",
            "テイラー",

            "ケプラー",
            "ガリレオ",
            "ボイル",
            "フック",
            "ホイヘンス",
            "ベルヌイ",
            "ラグランジュ",
            "ファラデー",
            "ジュール",
            "フーコー",
            "ストークス",
            "マクスウェル",
            "マッハ",
            "レントゲン",
            "キュリー",
            "ラザフォード",
            "アインシュタイン",
    };
    private static int rest = nameData.length;
    private String name;

    Job job = null;

    public RPGCharacter() {
        int n = (int) (Math.random() * rest);
        name = nameData[n];
        nameData[n] = nameData[--rest];
        nameData[rest] = name;
        if (rest == 0) rest = nameData.length;
    }

    public void setJob(Job job){
        this.job = job;
    }
    public String toString() { return name; }
    public void attack() {
        if(job != null) {
            //jobがnullでない場合
            job.attack();
        }else {
            //jobがnull
            System.out.println("攻撃方法を知らない！");
        }
    }
    public void defend() {
        if(job != null) {
            //jobがnullでない場合
            job.defend();
        }else {
            //jobがnull
            System.out.println("防御方法を知らない！");
        }
    }
}
// 職業クラス
class Fighter extends Job {
    public void attack() { System.out.println("武器で攻撃します！"); }
    public void defend() { System.out.println("盾で防御します！"); }
}
class Mage extends Job {
    public void attack() { System.out.println("攻撃の魔法を唱えます！"); }
    public void defend() { System.out.println("防御の魔法を唱えます！"); }
}
class Monk extends Job {
    public void attack() { System.out.println("素手で戦います！"); }
    public void defend() { System.out.println("素手で守ります！"); }
}
class Job{
    public void attack(){};
    public void defend(){};

}
