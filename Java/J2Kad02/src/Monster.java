public class Monster {
    String name;
    int hp ;

    public void setData (String n, int h){
        name = n;
        hp = h;
    }
    public void showData() {
        System.out.println("�ڂ��̖��O��" + name + "!HP ��" + hp + "����I");
    }

    public void walk() {
        if(hp > 0) {
            System.out.println("�Ă��Ă��E�E�E");
            --hp;
        }else{
            System.out.println("����ĕ����Ȃ���?");
        }
    }

    public void sleep() {
        System.out.println("���������E�E�E");
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
