public class Monster {
    private static String nameData[] = {
            "�E�C���f�B",
            "�C�V�c�u�e",
            "�C�����R",
            "�I�R���U��",

            "�J�r�S��",
            "�P���^����",
            "�L���^�s�[",
            "�M�����h�X",
            "�L���O���[",
            "�S�[�X�g",

            "�T���h",
            "�W���S��",
            "�X�s�A�[",
            "�X���[�v",
            "�[�j�K��",

            "�f�B�O�_",
            "�h�[�h�[",
            "�g�����Z��",
            "�h�N�N���Q",

            "�i�]�m�N�T",
            "�j���r�[",
            "�j�h����",

            "�o�^�t���[",
            "�s�J�`���E",
            "�s�W����",
            "�q�g�J�Q",
            "�t�V�M�_�l",
            "�x�g�x�g��",

            "�}���}�C��",
            "�~�j�����E",
            "�~���E",
            "���b�N��",
            "���N���[",

            "���h��",
            "�����Q���[",

            "���b�^",
            "���v���X",
            "���U�[�h��",
            "���A�R�C��",
    };
    private String name;
    public Monster() {
        name = nameData[(int)(Math.random() * nameData.length)];
    }
    @Override
    public String toString() { return name; }
}
