
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    public class Pika {
        String name = "�s�J�`���E";
        int hp = 20;

        public Pika() {
        }

        public void showData() {
            System.out.println("�ڂ��̖��O��" + name + "!HP ��" + hp + "����I");
        }

        public void walk() {
            System.out.println("�Ă��Ă��E�E�E");
            --hp;
        }

        public void sleep() {
            System.out.println("���������E�E�E");
            ++hp;
        }

}
