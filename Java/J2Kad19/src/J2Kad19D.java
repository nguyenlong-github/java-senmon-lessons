/*
	�ۑ薼�FJ2Kad19D�u���Ƃ͂�낵���I�ithrows�j�v
	�쐬���F2022/12/5
	�쐬�ҁF�c�����Y
*/
import java.io.*;
import java.util.Scanner;

public class J2Kad19D {
    public static final String FILENAME = "test.txt";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("�ǂ����܂����H�i0�F�����o���A1�F�ǂݍ��ށA-1�F�I���j��");
            int cmd = Integer.parseInt(in.next());
            if (cmd < 0) break;

            try {
                switch (cmd) {
                    case 0:     // �����o��
                        System.out.print("�����o�����������͂��Ă���������");
                        String str = in.next();
                        // ��MyWriter���\�b�h�ɂ���
//                        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
//                        bw.write(str);
//                        bw.close();
//                        break;
                        myWriter(str);
                        break;
                    case 1:
                        // ��MyReader���\�b�h�ɂ���
//                        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
//                        String line;
//                        while((line = br.readLine()) != null) {
//                            System.out.println(line);
//                        }
//                        br.close();
                        myReader();
                        break;
                }
            } catch(IOException e) {
                System.out.println(e);
            }
            System.out.println();
        }
    }
    public static void myWriter(String str) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME));
        bw.write(str);
        bw.close();
    }
    public static void myReader() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(FILENAME));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
