public class Account {
    private String name;
    private int accountNumber;
    private int money;
    private String secretNumber;

    public Account(String name, int accountNumber, int money, String secretNumber) {
        //�R���X�g���N�^�B������Ή�����t�B�[���h�ɐݒ肷��B
        this.name = name;
        this.accountNumber = accountNumber;
        this.money = money;
        this.secretNumber = secretNumber;
    }
    public String getName() {
        //�������`�̃Q�b�^�[�B
        return name;
    }

    public int getAccountNumber() {
        //�����ԍ��̃Q�b�^�[�B
        return accountNumber;
    }
    public int getMoney(){
        return money;
    }
    public int money() {
        //�a���c���̃Q�b�^�[�B
        return money;
    }
    public void addMoney(int money) {
        //�a���c���Ɉ���money �����Z����B
        this.money += money;
    }
    public boolean subMoney(int money) {
        //�a���c��������money ���傫���Ƃ�false ��Ԃ��i�c���s���j�B
        //�����łȂ��Ƃ��a���c���������money �����炵�Atrue ��Ԃ��B
        if(money >= this.money){
            return false;
        }else{
            this.money -= money;
            return true;
        }
    }
    public boolean checkSecretNumber(String secretNumber) {
//        �Ïؔԍ��ƈ���secretNumber ����v���Ă�����true ��Ԃ��B
//    ��v���Ă��Ȃ�������false ��Ԃ��B
//         ���Ïؔԍ��ɂ��Ă̓Q�b�^�[�����Ȃ��B
        if(this.secretNumber.equals(secretNumber)){
            return true;
        }else{
            return false;
        }
    }

}
