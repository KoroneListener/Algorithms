package Piles;

import Piles.*;

public class TestPile {
    public static void goThrough(PileParTableau p) throws EmptyStackException {
        PileParTableau temp = null;
        temp = p.copier();

        while (!temp.isEmpty()) {
            System.out.println("Current element: " + temp.unStack());
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("\n-----TestPile----");
            PileParTableau p = new PileParTableau(10);

            for (int i = 0; i < 5; i++) {
                p.stack(new Integer(i));
            }
            System.out.println("\n--- Show stack p: ");
            goThrough(p);

            p.delete();
            System.out.println("\nStack p deleted");

            System.out.println("\n--- Show stack p: ");
            goThrough(p);

            if (p.isEmpty())
                System.out.println("\nThe Stack p is empty");
            else
                System.out.println("\nThe Stack p is not empty");
        } catch (FullStackException |EmptyStackException e) {
            e.printStackTrace();
        }
    }
}
