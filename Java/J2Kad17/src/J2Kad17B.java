import java.io.*;

/*
	�ۑ薼�FJ2Kad17B�u�X�g���[���̘A���v
	�쐬���F2022/11/24
	�쐬�ҁF�c�����Y
*/
public class J2Kad17B {
    public static void main(String[] args) {
        final String FILENAME = "test.txt";
        File file = new File(FILENAME);
        if (file.exists()) {
            if(file.delete()) {
                System.out.println(FILENAME + " ���폜���܂����I");
            }else{
                System.out.println("�폜���s" );
            }
        }
        try {
            if (file.createNewFile()) {
                System.out.println(FILENAME + " ���쐬���܂����I");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("�����X�^�[�ꗗ���쐬���܂��I");
            for (int i = 0; i < 5; i++) {
                Monster monster = new Monster();
//                bw.write(monster.getName());
//                bw.newLine();
                pw.println(monster.getName());
                System.out.println(monster + "��ǉ������I");
            }
            bw.close();
            fw.close();


            System.out.println();
            System.out.println("�����X�^�[�ꗗ��\�����܂��I");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) System.out.println(line + "��ǂݏo�����I");
            br.close();
            fr.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
