/*
	課題名：J2Kad21C「ガーベッジコレクション」
	作成日：2022/12/12
	作成者：田中太郎
*/
public class J2Kad21C {
    public static void main(String[] args) {
        class DataSet {
            int[] data = new int[1000];
        }
        //データの生成
        DataSet[] dataSet = new DataSet[10000];
        //現在のメモリを表示
        System.out.println("現在のメモリの空きサイズ："
                + Runtime.getRuntime().freeMemory()); // ヒープの空きサイズを返す
        //全要数にDataSetのインスタンスを作成
        for(int i = 0 ; i < dataSet.length ; i++) {
            //DataSetのインスタンスを生成
            dataSet[i] = new DataSet();
            //ガーベッジコレクション(インスタンスの解放)
            dataSet[i] = null;
            //100インスタン毎のメモ空きサイズを表示
            if((i + 1) % 100 == 0) {
                System.out.print("生成済みインスタンス数：" + (i + 1));
                System.out.println("現在のメモリの空きサイズ："
                        + Runtime.getRuntime().freeMemory()); // ヒープの空きサイズを返す
            }
        }
    }
}

