import java.util.Scanner;

public class J2Kad02X {
    static Scanner in = new Scanner(System.in);
    public static void showData(Stack s) {
        //�X�^�b�N�Ɋi�[����Ă���f�[�^��\������B�ustack�F�f�[�^1 �f�[�^2 �c�v
        System.out.print("data : ");
        for(int i = 0 ; i < s.i ; i++){
            System.out.print(s.getData(i)+ "\t");
        }
        System.out.println();
    }
    public static void pushData(Stack s) {
        //�X�^�b�N��0?99 �܂ł̒l�i�����Ō���j��3 �i�[����B
        //�������X�^�b�N����t�̂Ƃ��́u�X�^�b�N�������ς��ł��I�v�ƕ\�����ďI���B
        for(int i = 0 ; i < 3 ; i++){
            if(!s.isFull()) {
                int data = (int) (Math.random() * 100);
                s.push(data);
            }else{
                System.out.println("�X�^�b�N�������ς��ł��I");
                break;
            }
        }
    }
    public static void popData(Stack s) {
        //�X�^�b�N����f�[�^��1 ���o���āuxx �����o���܂����I�v�ƕ\������B
        //�������X�^�b�N�Ƀf�[�^���Ȃ��Ƃ��́u�f�[�^������܂���I�v�ƕ\�����ďI���B
        if(!s.isEmpty()) {
            System.out.println(s.pop() + "�����o���܂����I");
        }else{
            System.out.println("�f�[�^������܂���I");
        }
    }
    public static void main(String [] args){
        int size = 10;
        Stack s = new Stack();
        s.createStack(size);
        System.out.println(s.size);
        System.out.println(s.data.length);
        System.out.println("�X�^�b�N��������܂��I");
        while(true) {
            System.out.print("�ǂ����܂����H�i1�Fpush�A2�Fpop�A-1�F�I���j��");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    pushData(s);
                    showData(s);
                    break;
                case 2:
                    popData(s);
                    showData(s);
                    break;
            }
            if (choice == -1) {
                break;
            }
        }
    }
}

