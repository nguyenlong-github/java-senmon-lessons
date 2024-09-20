/*
	課題名：J2Kad21D「ヒープ」
	作成日：2022/12/12
	作成者：田中太郎
*/
public class J2Kad21D {
    public static void main(String[] args) {
        System.out.println("現在のメモリの空きサイズ：" + Runtime.getRuntime().freeMemory()); // ヒープの空きサイズを返す
        int[] data = new int[1000];
        System.out.println("現在のメモリの空きサイズ：" + Runtime.getRuntime().freeMemory()); // ヒープの空きサイズを返す
    }
}
