public class Yadon {

        String name = "���h��";
        int hp = 30;

        public Yadon() {
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
