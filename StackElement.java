package testApp;

public class StackElement {

	private int a;
	private StackElement next;
	
	public StackElement(int a) {
		this.a = a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
	
	public void setNext(StackElement next){
		this.next = next;
	}
	
	public StackElement getNext() {
		return next;
	}
	
}
