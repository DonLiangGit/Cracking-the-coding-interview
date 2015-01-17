/* Cracking the coding interview
 * 3-5
 * One stack takes care of the INStack items
 * One stack takes care of the OutStack Items
 */

public class TwoStacksQueue {

	Stack<Integer> InStack = new Stack<Integer>;
	Stack<Integer> OutStack = new Stack<Integer>;

	public void push(int value) {
		InStack.push(value);
	}

	public void pop() {
		if(OutStack.isEmpty()) {
			shiftStack();
		}
		return OutStack.pop();
	}

	public int peek() {
		if(OutStack.isEmpty()) {
			shiftStack();
		}
		return OutStack.peek();
	}

	private void shiftStack() {
		while(!InStack.isEmpty()) {
			OutStack.push(InStack.pop());
		}
	}
	
}

/*
 * Extension:
 * APIs: 
 * Note: Stack Implementation
 */