package dataStructure.stack;

import dataStructure.Stack;

public class StackSumN {
	public static int stackAddition(int num) {
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
