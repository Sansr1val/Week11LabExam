
public class LinkedList {
	private Node head;
	private Node tail;
	
	//setters and getters
	private Node getTail() {
		return tail;
	}

	private void setTail(Node tail) {
		this.tail = tail;
	}

	private Node getHead() {
		return head;
	}

	private void setHead(Node head) {
		this.head = head;
	}
	
	//Adds the new node at the end of the list.
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
	
	
	/*
	 * Deletes all the integers that is a duplicate of the data input
	 * Traverses through the list to find the duplicates and unlinks them from the link
	 * If the head is equal to the data input, we move the head pointer to the next node
	 * to unlink the previous head node.
	 * The same goes for the tail node.
	 */
	public void DeleteAll(int data) {
		
		while(head != null && head.getData() == data) {
			head = head.getNext();
		}
		while(tail != null && tail.getData() == data) {
			tail = tail.getPrevious();
		}
		Node currentNode = head;
		
		while(currentNode.getNext() != null && currentNode != null) {
			if(currentNode.getNext().getData() == data) {
				Node nodeToDelete = currentNode.getNext();
				Node nextNode = currentNode.getNext().getNext();
				currentNode.setNext(nextNode);
				nextNode.setPrevious(currentNode);
				nodeToDelete.setNext(null);
				nodeToDelete.setPrevious(null);
			}else {
				currentNode = currentNode.getNext();
			}
		}
	}
	//Displays the contents of the list
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
		System.out.println("The values in the linked list are: "+str);
	}
}
