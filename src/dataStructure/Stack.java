package dataStructure;

public class Stack {
	private int maxSize;
	private int[] data;
	private int top;

	public Stack(int s) {
		maxSize = s;
		data = new int[maxSize];
		top = -1;
	}

	public void push(int p) {
		data[++top] = p;
	}

	public int pop() {
		return data[top--];
	}

	public char popChar() {
		return (char) data[top--];
	}

	public int peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public static int stackAdditionN(int num) {
		Stack theStack = new Stack(10000);
		int ans = 0;
		while (num > 0) {
			theStack.push(num);
			--num;
		}
		while (!theStack.isEmpty()) {
			int newN = theStack.pop();
			ans += newN;
		}
		return ans;
	}

}
