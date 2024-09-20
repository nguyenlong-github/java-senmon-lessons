class MenuItem {
    protected String name;
    protected int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public int getPrice() { return price; }
}
class HouseBlend extends MenuItem {
    public HouseBlend() { super("�u�����h�R�[�q�[", 380); }
}
class Espresso extends MenuItem {
    public Espresso() { super("�G�X�v���b�\", 320); }
}
class DarkRoast extends MenuItem {
    public DarkRoast() { super("�[����R�[�q�[", 400); }
}
// ��������
class HouseBlendSoy extends MenuItem {
    public HouseBlendSoy() { super("�u�����h�R�[�q�[�{����", 380 + 40); }
}
class EspressoSoy extends MenuItem {
    public EspressoSoy() { super("�G�X�v���b�\�{����", 320 + 40); }
}
class DarkRoastSoy extends MenuItem {
    public DarkRoastSoy() { super("�[����R�[�q�[�{����", 400 + 40); }
}
// �z�C�b�v�N���[������
class HouseBlendWhip extends MenuItem {
    public HouseBlendWhip() { super("�u�����h�R�[�q�[�{�z�C�b�v", 380 + 50); }
}
class EspressoWhip extends MenuItem {
    public EspressoWhip() { super("�G�X�v���b�\�{�z�C�b�v", 320 + 50); }
}
class DarkRoastWhip extends MenuItem {
    public DarkRoastWhip() { super("�[����R�[�q�[�{�z�C�b�v", 400 + 50); }
}
// �R�R�A����
class HouseBlendCocoa extends MenuItem {
    public HouseBlendCocoa() { super("�u�����h�R�[�q�[�{�R�R�A", 380 + 30); }
}
class EspressoCocoa extends MenuItem {
    public EspressoCocoa() { super("�G�X�v���b�\�{�R�R�A", 320 + 30); }
}
class DarkRoastCocoa extends MenuItem {
    public DarkRoastCocoa() { super("�[����R�[�q�[�{�R�R�A", 400 + 30); }
}
