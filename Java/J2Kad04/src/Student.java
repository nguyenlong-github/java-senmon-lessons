public class Student {
    private String name;
    private static String course;
    public Student(String name, String course) {
        //�R���X�g���N�^�B�����̒l��Ή�����t�B�[���h�ɐݒ肷��B
        this.name = name;
        this.course = course;
    }
    public void showData(){
        System.out.println("���O:" + this.name + "�R�[�X�F" + this.course );
    }
}
