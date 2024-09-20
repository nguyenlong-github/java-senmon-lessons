/*
	課題名：J2Kad06C「ポリモーフィズム」
	作成日：2022/10/17
	作成者：田中太郎
*/
public class J2Kad06C {
    public static void main(String[] args) {
    Monster[] monsters = new Monster[3];
    monsters[0] = new Monster("ピカチュウ");
    monsters[1] = new FireMonster("ヒトカゲ");
    monsters[2] = new RockMonster("カブト");
    for(Monster monster : monsters){
        monster.intro();
        System.out.println();
    }


    }
}
