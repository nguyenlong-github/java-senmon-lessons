public class Monster {
    String name;
    int hp ;

    public void setData (String n, int h){
        name = n;
        hp = h;
    }
    public void showData() {
        System.out.println("ぼくの名前は" + name + "!HP は" + hp + "だよ！");
    }

    public void walk() {
        if(hp > 0) {
            System.out.println("てくてく・・・");
            --hp;
        }else{
            System.out.println("つかれて歩けないよ?");
        }
    }

    public void sleep() {
        System.out.println("ぐうぐう・・・");
        ++hp;
    }

    public void main(String[] args) {
        showData();
        walk();
        walk();
        walk();
        showData();
        sleep();
        sleep();
        sleep();
        showData();
    }
}
