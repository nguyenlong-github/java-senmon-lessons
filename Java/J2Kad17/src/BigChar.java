import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private boolean[][] fontdata;
    public BigChar(char charname){
         fontdata = new boolean[HEIGHT][WIDTH];
        for(int i = 0 ; i < fontdata.length ; i++){
            for (int j = 0; j < fontdata[i].length; j++) {
                fontdata[i][j] = false;
            }
        }
         String letter = String.valueOf(charname).toUpperCase();
         System.out.println(letter);
         String PATHNAME = "./data/";
         File file = new File(PATHNAME + letter + ".txt");
         try {
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                for(int i = 0 ; i < fontdata.length ; i++){
                    String line;
                    if((line = br.readLine()) != null) {
                        for (int j = 0; j < fontdata[i].length; j++) {
                            fontdata[i][j] = line.charAt(j) == '*' ? true : false;
                        }
                    }
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void draw(Canvas c){
        c.drawFont(fontdata);
    }



}
