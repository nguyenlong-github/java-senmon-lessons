public class Card {
    private static int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int rest = cards.length;
    Card(){
        int rand = (int)(Math.random()*rest);

        rest--;

        int swap = cards[rand];
        cards[rand] = cards[rest];
        cards[rest] = swap;

    }
    int getNumber(){
        return cards[rest];
    }
}
