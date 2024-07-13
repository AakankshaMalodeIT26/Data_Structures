package com.SinglyLinkedList;

public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = null;
	}
	
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode == null)
		{
			return false;
		}
		if(head == null ) {
			head = newNode;
			return true;
		}
		Node temp = head;
		if(head.getData()==data)
		{
			return false;
		}
		while(temp.getNext()!=null) {
			temp = temp.getNext();
			if(temp.getData()==data)
			{
				return false;
			}
		}
		
		temp.setNext(newNode);
		return true;	
	}
	
	
	public boolean insert(int data, int position)
	{
		if(position <= 0 || (head == null && position > 1)) {
            return false;
        }
		
		Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }
     //doubt   
        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }
        
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;
    }
	 public void displayReverse(Node temp) {
	        if(temp == null) {
	            System.out.println();
	            return;
	        }
	        displayReverse(temp.getNext());
	        System.out.print(temp.getData() + " ");
	    }

	    public void display() {
	        Node temp = head;

	        while(temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	
	

	}
	
	
	
}

