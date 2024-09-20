public class Yadon {

        String name = "ヤドン";
        int hp = 30;

        public Yadon() {
        }

        public void showData() {
            System.out.println("ぼくの名前は" + name + "!HP は" + hp + "だよ！");
        }

        public void walk() {
            System.out.println("てくてく・・・");
            --hp;
        }

        public void sleep() {
            System.out.println("ぐうぐう・・・");
            ++hp;
        }



}
