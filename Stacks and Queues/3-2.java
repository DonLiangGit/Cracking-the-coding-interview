/* Cracking the coding interview
 * 3-2 
 * Method: use another stack to store piece of data, efficient.
 * 
 * Deprecated method: store each stack element 
 * together with the min corresponding its position.
 */

public class MinStack extends Stack<Integer> {

	Stack<Integer> stackTwo;

	public MinStack() {
		stackTwo = new Stack<Integer>();
	}

	public void push(int value) {
		if(value <= min()) {
			stackTwo.push(value);
		}
		super.push(value);
	}

	public Integer pop() {
		int value = super.pop();
		if(value <= min()) {
			stackTwo.pop();
		}
		return value;
	}

	public int min() {
		if(stackTwo.isEmpty()) {
			// Error value
			return Integer.MAX_VALUE;
		} else {
			return stackTwo.peek();
		}
	}
}

/*
 * Extension:
 * APIs: 
 * Note: Stack Implementation
 */