public class FlyMonster extends Monster{
    //コンストラクタ
    public FlyMonster(){
        System.out.println("FlyMonster のコンストラクタが呼び出されました！\n");
    }
    //追加メンソッド
    public void fly(){
        if(hp <= 0){
            System.out.println("疲れて飛べない");
        }else{
            System.out.println(name + "が飛ぶよ！びゅ?ん!!");
            hp--;
        }
    }
}

