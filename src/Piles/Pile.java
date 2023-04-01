package Piles;

public interface Pile {
	
	public void delete();
	
	public void stack(Object element)
		throws FullStackException;
	
	public Object unStack() throws EmptyStackException;
	
	
	
	public boolean isEmpty();
	
	public Object head() throws EmptyStackException;

}
