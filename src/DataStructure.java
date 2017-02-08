import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

import dataStructure.GenQueue;
import dataStructure.Stack;

public class DataStructure {

	public static void main(String[] args) {
		System.out.println("");

		// 1. To Print Summation of n numbers via stack.
		System.out.println("1. To Print Summation of n numbers via stack.");
		int num = 50;
		// Stack S = new Stack(StackLimit);
		int ans = Stack.stackAdditionN(num);
		System.out.println("Sum of n number: " + ans);
		// Using Java:
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum Of " + num + "is" + sum);

		// 2. Get first and last element of linked list.
		System.out.println("2. Get first and last element of linked list.");
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("100");
		lList.add("200");
		lList.add("300");
		lList.add("400");
		lList.add("500");
		System.out.println("First element of LinkedList is : " + lList.getFirst());
		System.out.println("Last element of LinkedList is : " + lList.getLast());

		// 3. To add an element at first and last position of a linked list ?
		System.out.println("3. To add an element at first and last position of a linked list ?");
		System.out.println(lList);

		lList.addFirst("0");
		System.out.println(lList);

		lList.addLast("6");
		System.out.println(lList);

		// 4. To convert an infix expression to postfix expression?
		System.out.println("4. To convert an infix expression to postfix expression? -- yet to create");
		// 5. to implement Queue:
		System.out.println("5. to implement Queue:");
		GenQueue<Employee> empList = new GenQueue<Employee>();
		Employee emp1 = new Employee("Pujar", "Anil");
		Employee emp2 = new Employee("Pujar", "Ambi");
		empList.enqueue(emp1);
		empList.enqueue(emp2);
		System.out.println("The employees' names are:");

		while (empList.hasItems()) {
			Employee emp = empList.dequeue();
			System.out.println(emp.firstName + " " + emp.lastName);
		}

		// 6. to swap two elements in a vector
		System.out.println("6. to swap two elements in a vector");
		Vector<String> v = new Vector<String>();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		System.out.println(v);
		Collections.swap(v, 0, 4);
		System.out.println("After swapping");
		System.out.println(v);

		// 7. To update linked list.
		System.out.println("7. to update a linked list?");
		System.out.println("Original LinkedList contains : " + lList);
		System.out.println(lList);
		lList.set(2, "M");
		System.out.println("Updated LinkedList contains : " + lList);
		System.out.println(lList);

		// 8. to get the maximum element from a vector?
		System.out.println("8. to get the maximum element from a vector?");
		Object object1 = Collections.max(v);
		System.out.println("Maximum Element is : " + object1);

		// 9. to execute binary search on a vector
		System.out.println("9. to execute binary search on a vector");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "4");
		System.out.println("Element found at : " + index);

		// 10. to get elements of a LinkedList
		System.out.println("10. to get elements of a LinkedList");
		LinkedList list = new LinkedList();
		for (int i = 30; i < 40; i++)
			list.push(new Integer(i));
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());

		// 11. to delete many elements from a linkedList ?
		System.out.println("11. to delete many elements from a linkedList ?");
		System.out.println(lList);
		lList.subList(2, 4).clear();
		System.out.println(lList);
	}

}
