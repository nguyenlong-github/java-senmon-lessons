/*
	課題名：J2Kad27D「表示機能の切り離し（Visitorパターン）」
	作成日：2023/1/26
	作成者：田中太郎
*/
public class J2Kad27D {
    public static void main(String[] args) {
        MenuItem item = new MenuItem("ハンバーグステーキ", 449, 662);
        Printer printer = new Printer();
        item.print(printer);
    }
}
