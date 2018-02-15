package linkedlist;

public class LengthLinkedList {

	static int length = 0;

	public static int findLengthRecursive(Node head) {

		if (head == null || head.getNext() == null) {
			return length;
		} else {
			length++;
			return findLengthRecursive(head.getNext());

		}

	}

	public static int findLengthIterative(Node head) {

		int count = 0;

		while (head.getNext() != null) {
			head = head.getNext();
			count++;

		}
		return count;

	}

	public static void main(String[] args) {

		Node n1 = new Node();
		Node n2 = new Node();

		n1.setData(1);
		n2.setData(2);
		n1.setNext(n2);
		n2.setNext(null);

		System.out.println(findLengthIterative(n1));

	}

}
