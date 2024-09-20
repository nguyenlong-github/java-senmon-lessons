public class Profile {
    private String name;
    private double height;
    private double weight;

    public Profile(String name, double height, double weight) {
        //コンストラクタ。引数を対応するフィールドに設定する。
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        // name のゲッター。name を返す。
        return name;
    }

    public double getHeight() {
        //height のゲッター。height が120 より小さいときは170 を返す（身長をごまかす）。
        if(height < 120){
            return 170;
        }else{
            return height;
        }
    }

    public double getWeight() {
        //weight のゲッター。weight が100 より大きいときは50 を返す（体重をごまかす）
        if(weight > 100){
            return 50;
        }else{
            return weight;
        }
    }

}

