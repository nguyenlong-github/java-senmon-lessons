package pac23s;

public class J2Kad23S {
    public static void main(String[] args) {
        Folder pac23a = new Folder("pac23a");
        pac23a.add(new File("J2Kad23A"));
        pac23a.add(new File("MenuList.java"));

        Folder pac23b = new Folder("pac23b");
        pac23b.add(new File("J2Kad23B"));
        pac23b.add(new File("MenuList.java"));
        Folder pac23c = new Folder("pac23c");
        pac23c.add(new File("J2Kad23C"));
        pac23c.add(new File("MenuList.java"));
        Folder pac23d = new Folder("pac23d");
        pac23d.add(new File("J2Kad23D"));
        pac23d.add(new File("MenuList.java"));
        Folder pac23s = new Folder("pac23s");
        pac23s.add(new File("Component.java"));
        pac23s.add(new File("J2Kad23S"));
        Folder pac23x = new Folder("pac23x");
        pac23x.add(new File("J2Kad23X.java"));
        Folder src = new Folder("src");
        src.add(pac23a);
        src.add(pac23b);
        src.add(pac23c);
        src.add(pac23d);
        src.add(pac23s);
        src.add(pac23x);
        src.print(""); // 表示
    }
}