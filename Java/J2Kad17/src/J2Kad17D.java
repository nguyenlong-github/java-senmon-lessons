import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
	�ۑ薼�FJ2Kad17D�u�t�@�C���ւ̏����o���v
	�쐬���F2022/11/28
	�쐬�ҁF�c�����Y
*/
public class J2Kad17D {
    public static void main(String[] args) throws IOException {
        final String FILENAME = "test.txt";
        final String ECCCOMP = "ECCCOMP";
        File file = new File(FILENAME);
        try{
            if(file.createNewFile()){
                System.out.println(FILENAME + " ���쐬���܂����I");
                FileWriter fw = new FileWriter(file);
                fw.write(ECCCOMP);
                fw.close();
                System.out.println(FILENAME + "��" + ECCCOMP + "���������݂܂����I");
            }
        }catch(IOException e){
            System.out.println(e);
        }



    }
}
