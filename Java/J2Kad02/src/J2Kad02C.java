public class J2Kad02C {
    public static void main(String[]args){
        Monster monster1 = new Monster();
        monster1.setData("ディアルガ", 1000);
        System.out.println(monster1.name + "が現れた！");
        monster1.showData();
        Monster monster2 = new Monster();
        monster2.setData("コイキング", 1);
        System.out.println(monster2.name + "が現れた！");
        monster2.showData();
        System.out.println(monster1.name + "を散歩させます");
        monster1.walk();
        monster1.walk();
        monster1.walk();
        monster1.showData();
        monster2.setData("コイキング", 1);
        System.out.println(monster2.name + "を散歩させます");
        monster2.walk();
        monster2.walk();
        monster2.walk();
        monster2.showData();


    }
}
