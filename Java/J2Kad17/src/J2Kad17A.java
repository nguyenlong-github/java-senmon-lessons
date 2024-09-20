import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
	�ۑ薼�FJ2Kad17A�u�h�b�g�p�^�[���̕\���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
*/
public class J2Kad17A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String PATHNAME = "./data/";
        String fileName;
        while(true) {
            for(int i = 0; i <= 9 ; i++){
                System.out.print(i + ".txt \t" );
            }
            System.out.println();
            for(int i = 1; i <= 'Z' - 'A' + 1 ; i++ ){
                System.out.print((char)(i + 'A' - 1) + ".txt \t");
                if(i % 10 == 0) System.out.println();
            }
            System.out.println();

            System.out.print("�ǂ̃h�b�g�p�^�[�������܂����H�i�g���q�s�v�A-1�F�I���j��");
            fileName = in.next();
            fileName = fileName.toUpperCase();

            if(fileName == "-1") break;

            File file = new File(PATHNAME + fileName + ".txt");
            if(file.exists()) {
                try {
                    if (file.exists()) {
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while ((line = br.readLine()) != null) System.out.println(line);

                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }else{
                System.out.println("���̃f�[�^�͑��݂��܂���I");
            }
        }

    }
}
