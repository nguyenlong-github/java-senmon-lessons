package J2Test;

public class J2Test13_3 {
    public static void main(String[] args) {
        Sheep.showCounter();									// —r‚Ì”‚ğ•\¦
        Sheep s1 = new Sheep();					// s1‚É—r‚ğ1•C¶¬
        Sheep.showCounter();									// —r‚Ì”‚ğ•\¦

        Sheep[] sn = new Sheep[3];					// sn‚É—r‚Ì”z—ñi3•C•ªj‚ğ¶¬
        for (int i = 0; i < sn.length; i++) {
            sn[i] = new Sheep();				// ”z—ñ‚É—r‚ğ¶¬
        }
        Sheep.showCounter();									// —r‚Ì”‚ğ•\¦
    }

}
