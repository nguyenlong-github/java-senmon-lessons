public class Student {
    private String name;
    private static String course;
    public Student(String name, String course) {
        //コンストラクタ。引数の値を対応するフィールドに設定する。
        this.name = name;
        this.course = course;
    }
    public void showData(){
        System.out.println("名前:" + this.name + "コース：" + this.course );
    }
}
