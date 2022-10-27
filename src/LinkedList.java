
public class LinkedList {
	private Node head;
	private Node tail;
	
	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void Append(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
		}
	}
	
	public void Display() {
		Node currentNode = head;
		String str = "";
		while(currentNode != null) {
			str += String.valueOf(currentNode.getData()) +", ";
			currentNode = currentNode.getNext();
		}
		if(str !="") {
			str = str.substring(0,str.length() -2);
		}
		System.out.println(str);
	}
}
