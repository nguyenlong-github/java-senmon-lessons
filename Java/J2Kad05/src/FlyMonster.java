public class FlyMonster extends Monster{
    //�R���X�g���N�^
    public FlyMonster(){
        System.out.println("FlyMonster �̃R���X�g���N�^���Ăяo����܂����I\n");
    }
    //�ǉ������\�b�h
    public void fly(){
        if(hp <= 0){
            System.out.println("���Ĕ�ׂȂ�");
        }else{
            System.out.println(name + "����Ԃ�I�т�?��!!");
            hp--;
        }
    }
}

