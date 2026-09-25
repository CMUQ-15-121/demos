package lect3;

public class MyLinkedList<ListType>{
	
	private Node<ListType> head;
	private int size;
	
	public MyLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public void addToHead(ListType item) {
		
		Node<ListType> newNode = new Node<>(item);
		newNode.next = this.head;
		this.head= newNode;
		this.size+=1;
	}
	
	public void add(ListType item) {

		if(this.head == null) {
			addToHead(item);
			return;
		}
		
		Node<ListType> tmp = this.head;
		while(tmp.next != null) {
			tmp= tmp.next;
		}
		
		//I'm at the last node
		tmp.next = new Node(item);
		this.size+=1;
	}
	
	
	public int badSize() {
		
		int count = 0;		
		for(Node tmp=this.head; tmp!=null; tmp=tmp.next) {
			count+=1;
		}
		
		return count;
	}
	
	public int size() {
		return this.size;
	}
	
	public String toString() {
		
		String ret= "";
		
		for(Node tmp=this.head; tmp!=null; tmp=tmp.next) {
			ret+= tmp.toString()+"->";
		}
		ret+="<NULL>";
		
		return ret;
	}

}
