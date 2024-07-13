package Stackss;

import java.util.Scanner;

import com.stack.StackOPS;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<>(5);

		int i, top =0;
		int ch;
		
		String data;
		while(true) {
			System.out.println("1. PUSH 2. POP 3. PEEK 4. Display 5.EXIT ");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println("Enter the data to insert :");
				data=sc.next();
				s.push(data);
				break;
			
			case 2:
				System.out.println(s.pop());
			
				break;
				
			case 3 : 
				System.out.println(s.peek());
			
				break;
				
			case 4 : 
					s.display();
				break;
			
			case 5:
				return;
			
			}
		}
		

	}

}
