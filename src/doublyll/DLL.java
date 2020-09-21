package doublyll;

public class DLL {

	Node head;

	class Node {
		int data;
		Node next;
		Node prev;
	}

	public void insertfront(int data) {
		Node node = new Node();
		node.data = data;

		node.next = head;
		head = node;
	}

	public void append(int data) {

		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
			head.prev = null;
			head.next = null;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = node;
			node.prev = temp.next;
			node.next = null;
		}
	}

	public void inserAt(int index, int data) {
		Node node = new Node();
		node.data = data;

		if (index == 0) {
			node.next = head;
			head = node;
		}

		else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
				// top=temp.next.next;
			}
			node.next = temp.next;
			temp.next = node;
			node.prev = temp;
		}
	}

	public void delete(Node key) {

		if (head == null && key == null) {
			return;
		}

		if (head == key) {
			head = head.next;
		}

	}

	public void deleteAt(int index) {
		Node temp = head, prev = null;
		if (index == 0) {
			head = head.next;

		} else {
			for (int i = 0; i < index; i++) {
				prev = temp;
				temp = temp.next;
			}
			if (temp.next == null) {
				prev.next = null;
			} else {
				prev.next = temp.next;
				prev = temp.next.prev;
			}
		}
	}

	public int findLength() {
		Node temp = head;
		int l = 0;
		while (temp.next != null) {
			temp = temp.next;
			l++;
		}
		return l;

	}

	public void revere() {
		Node temp = head;
		System.out.println("head ::" + temp.data);

		while (temp.next != null) {
			temp = temp.next;
		}
		System.out.println("==" + temp.data);
//		while(temp.prev!=null) {
//			
//			System.out.println("reverse dll"+temp.data);
//			temp=temp.prev;
//		}

	}

	public void show() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		DLL dll = new DLL();
		dll.append(23);
		dll.append(27);
		dll.insertfront(234);
		dll.append(32);
		dll.insertfront(254);
		dll.show();
		// dll.delete(head);
		System.out.println("=========");
		dll.show();
		dll.inserAt(5, 33);
		System.out.println("=========");
		dll.show();
		System.out.println("=========");
		dll.inserAt(3, 44);
		dll.show();
		System.out.println("=========");
		dll.inserAt(0, 00);
		dll.show();
		System.out.println("=========");
		dll.deleteAt(6);
		dll.show();
		System.out.println("=======");
		System.out.println("length is ::" + dll.findLength());
		dll.revere();
		dll.show();

	}

}
