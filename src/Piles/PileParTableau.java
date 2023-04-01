package Piles;

public class PileParTableau implements Pile {
	
	private int TAILLEMAX = 100;
	private int head = -1;
	private Object [] array;
	
	public PileParTableau(int max) {
		TAILLEMAX = max;
		head = -1;
		array = new Object[TAILLEMAX];
	}
	
	public void delete() {head = -1;}
	
	public void stack(Object element) throws FullStackException
	{
		if(head == TAILLEMAX -1)
			throw new FullStackException();
		array[++head] = element;
	}
	
	public Object unStack()throws EmptyStackException{
		if(EmptyStack())
			throw new EmptyStackException();
		Object temp = array[head--];
		return temp;
	}
	
	public boolean isEmpty() {return (head == -1);}
	
	public Object head() throws EmptyStackException {
		if(EmptyStack())
			throw new EmptyStackException();
		return array[head];
	}
	
	public PileParTableau copier() {
		PileParTableau copie = new PileParTableau(TAILLEMAX);
		for(int i = 0; i<= head; i++) {
			copie.array[i] = array[i];
		}
		copie.head = head;
		return copie;
	}

}
