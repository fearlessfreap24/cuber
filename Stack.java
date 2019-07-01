package testApp;
import java.util.*;
public class Stack {

	private StackElement top;
	
	// class initiator with nothing passed
	public Stack() {
		top = null;
	}
	
	// class initiator with passed integer
	public Stack(StackElement a) {
		top = a;
	}
	
	// add an element to the stack
	public void stackAdd(int a) {
		// create new element
		StackElement z = new StackElement(a);
		// if the stack is empty
		if (top == null) {
//			set top element as the new element
			top = z;
		}
		else {
//			add the top as the next element for the new element
			z.setNext(top);
			// set the new element as the top
			top = z;
		}
	}
	
	// remove an element from stack
	public int stackPop() {
		// initiate element for shuffling
		StackElement a;
		// get the integer from the top element
		int b = top.getA();
		// checking to see if last element in stack
		if (top.getNext() == null) {
			// clear the stack by setting top to null
			top = null;
		}
		else {
			// use new element to hold the next element
			a = top.getNext();
			// set new element as top
			top = a;
		}
		return b;		
	}
	// dump the stack to an array list
	public ArrayList<Integer> stackDump() {
		// initiate array list to hold elements
		ArrayList<Integer> a = new ArrayList<>();
//		loop to dump stack into array list
		while (top != null) {
			// add top element to stack
			a.add(top.getA());
			// set top as null if last element
			if (top.getNext() == null) {
				top = null;
			}
			else {
				top = top.getNext();
			}
		}
		
//		return array list
		return a;
	}
	
	// the stack is not empty if the top element is not null
	public boolean isEmpty() {
		return top == null;
	}
	
	// check is the stack has more than one element
	public boolean hasNext() {
		return top.getNext() == null;
	}
}
