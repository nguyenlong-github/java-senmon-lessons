public class Sheep {
    static private int count = 0; // �r�̐��B�����l0�B
    static public void countSheep() {
//       �u�r�𐔂��܂��I�v�ƕ\�����A�r�̐��𐔂���B
//        �r��0 �C�̂Ƃ��u�܂��r�͂��܂���I�v�ƕ\������B
//        �r������Ƃ��u�r��1 �C�v�u�r��2 �C�v�Ɨr�̐������\������B
//    �R���X�g���N�^ �u�r������Ă����I�v�ƕ\�����A�r�̐���1 ���₷�B
        System.out.println("�r�𐔂��܂��I");
        if(count == 0){
            System.out.println("�܂��r�͂��܂���I");
        }else{
            for(int i = 1 ; i <= count ; i++) {
                System.out.println("�r��" + i + " �C");
            }
        }
    }
    public Sheep(){
        System.out.println("�r������Ă����I");
        count++;
    }
}
