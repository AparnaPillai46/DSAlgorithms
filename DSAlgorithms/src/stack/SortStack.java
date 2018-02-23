package stack;


import java.util.Stack;

public class SortStack {

	public static Stack<Integer> sortStack(Stack<Integer> stack) {

		Stack<Integer> helperStack = new Stack<>();
		int temp;
		helperStack.push(stack.pop());

		while (!stack.isEmpty()) {
			temp = stack.pop();

			while (!helperStack.isEmpty() && helperStack.peek() < temp) {
				stack.push(helperStack.pop());
			}

			helperStack.push(temp);

		}
		return helperStack;
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(3);
		st.push(5);
		st.push(1);
		st.push(2);
		st.push(4);

		Stack<Integer> st1 = sortStack(st);

		for (Integer integer : st1) {
			System.out.println(integer);
		}

	}
}
