import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
	�ۑ薼�FJ2Kad17C�u�t�@�C������̓ǂݏo���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
*/
public class J2Kad17C {
    public static void main(String[] args) {
        final String FILENAME = "test.txt";
        File file = new File(FILENAME);
        FileReader fr = null;
        try{
            if (file.exists()) {
                System.out.println(FILENAME + " ���當�����ǂݏo���܂��I");
                fr = new FileReader(file);
                int data;
                while ((data = fr.read()) != -1) System.out.println((char)data + "��ǂݏo���܂����I");
                fr.close();
            }
        }catch (IOException e){
            System.out.println(e);
        }


     }
}
