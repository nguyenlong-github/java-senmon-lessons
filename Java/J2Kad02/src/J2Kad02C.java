public class J2Kad02C {
    public static void main(String[]args){
        Monster monster1 = new Monster();
        monster1.setData("�f�B�A���K", 1000);
        System.out.println(monster1.name + "�����ꂽ�I");
        monster1.showData();
        Monster monster2 = new Monster();
        monster2.setData("�R�C�L���O", 1);
        System.out.println(monster2.name + "�����ꂽ�I");
        monster2.showData();
        System.out.println(monster1.name + "���U�������܂�");
        monster1.walk();
        monster1.walk();
        monster1.walk();
        monster1.showData();
        monster2.setData("�R�C�L���O", 1);
        System.out.println(monster2.name + "���U�������܂�");
        monster2.walk();
        monster2.walk();
        monster2.walk();
        monster2.showData();


    }
}
