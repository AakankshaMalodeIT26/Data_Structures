package Stackss;

import java.util.Arrays;
public class Stack<T> {
	
	T[] arr;
	int top ;
	int size;
	
	public Stack(int size) {
		arr = (T [] ) new Object[size];
		top = -1;
		this.size = size;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public boolean isFull()
	{
		return top ==(size -1);
	}
	
	public boolean push(T data)
	{
		if(isFull())
		{
			return false;
		}
		arr[++top]= data;
		return true;
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			return null;
		}
		return arr[top --];
		
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			return null;
		}
		return arr[top];
		
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty ! ");
		}
		for (int i=0;i<=top;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	

}
