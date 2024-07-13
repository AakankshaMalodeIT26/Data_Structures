package com.Queues;

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.insert(10);
		q.insert(2);
		q.delete();
		System.out.println(q);
		
		
		 System.out.println(); System.out.println(q.insert(3));
		 System.out.println(q.insert(4)); System.out.println(q.insert(5));
		 System.out.println(q.insert(6));
		 
		 System.out.println(q.delete()); System.out.println(q.delete());
		 System.out.println(q.delete()); System.out.println(q.delete());
		 System.out.println(q.delete()); System.out.println(q.delete());
		 System.out.println(q);
		
		System.out.println(q.isEmpty() + " " +q.isFull());
	}

}
