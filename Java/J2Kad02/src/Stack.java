public class Stack {
    int size;
    int [] data;
    int i = 0;
    public void createStack(int size) {
        //size �܂Ńf�[�^���i�[�ł���X�^�b�N�����
        this.size = size;
        data = new int[size];
    }
    public void push(int data) {
        //�X�^�b�N�Ƀf�[�^�idata�j���i�[����B
        this.data[i] = data;
        i++;
    }
    public int pop() {
        //�X�^�b�N����f�[�^�����o���l��Ԃ��B
        return data[--i];
    }
    public int getData(int i) {
        //�X�^�b�N�̂��Ԗڂ̃f�[�^��Ԃ��B
        return data[i];
    }
    public int size() {
        //�X�^�b�N�Ɋi�[����Ă���f�[�^����Ԃ��B
        return size;
    }
    public boolean isEmpty() {
        //�X�^�b�N����Ȃ�true�A�f�[�^������Ȃ�false ��Ԃ��B
        if (i == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull() {
        //�X�^�b�N����t�Ȃ�true�A�܂��f�[�^���i�[�ł���̂Ȃ�false ��Ԃ��B
        if (i == (size - 1)) {
            return true;
        }else{
            return false;
        }
    }
}
