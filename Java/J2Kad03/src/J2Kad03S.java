import java.util.Scanner;

/*
    �ۑ薼�FJ2Kad03S�u3��ڂ̂�����?@�v
    �쐬���F2022/10/03
    �쐬�ҁF�c�����Y
 */
public class J2Kad03S {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
        String[] place = {"ECC �R�[�q�[" , "ECC �o�[�K�[" , "ECC �h�[�i�c" };

        Stack statment = new Stack(size);
        System.out.println("�̂ё����������ɍs���܂��I");
        if(statment.isEmpty()){
            statment.push("�̂ё��̉�");
        }
        while(true){
            System.out.print(statment.getData(statment.size() - 1) + "�ǂ��֍s���܂����H�i0�FECC �R�[�q�[�A1�FECC �o�[�K�[�A2�FECC �h�[�i�c�A-1�F�߂�j��");
            int numberPlace = in.nextInt();
            if(numberPlace < 0){
                System.out.println("���Ɨ�������߂�܂��I");
                while(!statment.isEmpty()){
                    System.out.println(statment.pop() +"�ɖ߂��Ă����I");
                }
                break;
            }else {
                if (statment.isFull()) {
                    System.out.println("����ȏ�i�ނƋA��Ȃ���?");
                    continue;
                } else {
                    statment.push(place[numberPlace]);
                }
            }
        }
    }
}
