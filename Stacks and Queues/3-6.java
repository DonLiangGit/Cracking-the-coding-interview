/* Cracking the coding interview
 * 3-6
 * Sort Stack
 */

public static Stack<Integer> sort(Stack<Integer> stack) {

	Stack<Integer> additionalStack = new Stack<Integer>();

	int tempData = null;
	while(!stack.isEmpty()) {
		tempData = stack.pop();
		while(!additionalStack.isEmpty() 
			&& additionalStack.peek() > tempData) {
			stack.push(additionalStack.pop());
		}
		additionalStack.push(tempData);
	}

	return additionalStack;
}

/*
 * Extension:
 * APIs: 
 * Note: Stack Implementation
 */