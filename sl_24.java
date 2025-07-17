public class sl_24 {
     public static void main(String[] args) {
        int card = (int)(Math.random() * 52);
        int rank = card % 13;
        int suit = card / 13;

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        System.out.println("The card you picked is " + ranks[rank] + " of " + suits[suit]);
    }
}
