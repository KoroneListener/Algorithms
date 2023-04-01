package Piles;

public class Test {
	public static void main(String arg[]) {
		try {
			Pile pile = new PileParTableau(10);
			pile.stack("Element 1");
			pile.stack("Element 2");
			pile.stack("Element 3");
			System.out.println(pile.unStack());
			System.out.println(pile.unStack());
			System.out.println(pile.head());
			pile.delete();
			System.out.println(pile.EmptyStack());
			}catch(FullStackException | EmptyStackException e) {
				e.printStackTrace();
			}
	}

}

