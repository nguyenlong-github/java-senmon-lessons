public class Profile {
    private String name;
    private double height;
    private double weight;

    public Profile(String name, double height, double weight) {
        //�R���X�g���N�^�B������Ή�����t�B�[���h�ɐݒ肷��B
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        // name �̃Q�b�^�[�Bname ��Ԃ��B
        return name;
    }

    public double getHeight() {
        //height �̃Q�b�^�[�Bheight ��120 ��菬�����Ƃ���170 ��Ԃ��i�g�������܂����j�B
        if(height < 120){
            return 170;
        }else{
            return height;
        }
    }

    public double getWeight() {
        //weight �̃Q�b�^�[�Bweight ��100 ���傫���Ƃ���50 ��Ԃ��i�̏d�����܂����j
        if(weight > 100){
            return 50;
        }else{
            return weight;
        }
    }

}

