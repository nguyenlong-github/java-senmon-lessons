import java.io.*;

/*
	課題名：J2Kad17B「ストリームの連結」
	作成日：2022/11/24
	作成者：田中太郎
*/
public class J2Kad17B {
    public static void main(String[] args) {
        final String FILENAME = "test.txt";
        File file = new File(FILENAME);
        if (file.exists()) {
            if(file.delete()) {
                System.out.println(FILENAME + " を削除しました！");
            }else{
                System.out.println("削除失敗" );
            }
        }
        try {
            if (file.createNewFile()) {
                System.out.println(FILENAME + " を作成しました！");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("モンスター一覧を作成します！");
            for (int i = 0; i < 5; i++) {
                Monster monster = new Monster();
//                bw.write(monster.getName());
//                bw.newLine();
                pw.println(monster.getName());
                System.out.println(monster + "を追加した！");
            }
            bw.close();
            fw.close();


            System.out.println();
            System.out.println("モンスター一覧を表示します！");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) System.out.println(line + "を読み出した！");
            br.close();
            fr.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
