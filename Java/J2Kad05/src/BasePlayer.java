public class BasePlayer {
    protected String name;
    protected int take;				// 取る石の数
    BasePlayer(){
        //「BasePlayer のコンストラクタが呼び出されました！」と表示し、name に「CPU」を代入する
        System.out.println("BasePlayer のコンストラクタが呼び出されました！");
        name = "CPU";
    }
    public void intro(){
        //「名前：?・・・取る石の数を乱数で決めます。」（?はname）と表示する。
        System.out.println("名前：" + name + "・・・取る石の数を乱数で決めます。");
    }
    public String toString(){
        //name を返す（このメソッドがあるとインスタンス名を戻り値の文字列として扱える）。
        return name;
    }
    public int takeStone(int stone){
        //BasePlayer：乱数で1?3 の値を返す。
        if(stone >= 3) {
            take = (int) (Math.random() * 3) + 1;
        }else{
            take = (int) (Math.random() * stone) + 1;
        }
        return take;
    }
}
