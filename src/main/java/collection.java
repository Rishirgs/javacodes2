import java.util.LinkedList;
import java.util.Stack;

public class collection {
	public static void main(String[] args) {
//		LinkedList him=new LinkedList();
//		him.add("Rishi");
//		him.add("TRIPLE H");  using linked list output verified in order sequence
//		him.add(10.67);
//		him.add(true);
//		him.add(24);
//		System.out.println(him);   // given input are in sequence
//		System.out.println(him.peekLast());
//	
		Stack him=new Stack();
		him.push("brock lesnar");
		him.push("the rock");
		him.push(true);
		him.push(10.25);
		him.push("ro");
		him.pop();
		System.out.println(him);
		
	}

}
