/*
	�ۑ薼�FJ2Kad05B�u�Ύ��Q�[���̏����v
	�쐬���F2022/10/13
	�쐬�ҁF�c�����Y
*/
public class J2Kad05B {
    public static void main(String[] args) {
        System.out.println("�Ύ��Q�[���̏��������܂��I");
        System.out.println();

        // BasePlayer�̐���
        BasePlayer basePlayer = new BasePlayer();
        basePlayer.intro();

        System.out.println();

        // UserPlayer�̐���
        UserPlayer userPlayer = new UserPlayer();
        userPlayer.intro();

        System.out.println();

        // BasePlayer VS UserPlayer
        System.out.println(basePlayer+ "��" + userPlayer+ "���킢�܂�");

    }
}
