package Piles;

public interface Pile {
	
	public void delete();
	
	public void stack(Object element)
		throws FullStackException;
	
	public Object unStack() throws EmptyStackException;
	
	
	
	public boolean EmptyStack();
	
	public Object head() throws EmptyStackException;

}
