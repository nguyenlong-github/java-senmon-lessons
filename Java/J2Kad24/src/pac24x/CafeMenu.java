package pac24x;

import java.util.ArrayList;

public class CafeMenu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    public CafeMenu() {
        menu.add(new MenuItem("�h���b�v�R�[�q�[", 390));
        menu.add(new MenuItem("�A�[���O���C", 430));
        menu.add(new MenuItem("�I�����W�W���[�X", 220));
    }
    public ArrayList<MenuItem> getMenu() { return menu; }
}
