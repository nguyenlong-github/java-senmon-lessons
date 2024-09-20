
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    public class Pika {
        String name = "ピカチュウ";
        int hp = 20;

        public Pika() {
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
