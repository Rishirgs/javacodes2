import java.util.Arrays;
import java.util.Scanner;

public class interfaceoop{
	public static void main(String[] args) {
//		String name="RISHI";
//		String dutch="";
//		for(int row=name.length()-1;row>=0;row--) {
//		dutch=dutch+name.charAt(row);
//		}
//		System.out.println(dutch);
//		if(name.equalsIgnoreCase(dutch))
//		{System.out.println();                          //palindrome number output verified
//		
//			System.out.println("it is palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//	}
//	}
		int t1=0,t2=1,t3=0,num=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length");   //fibonnaci series
		num=scan.nextInt();
		for(int row=0;row<num;row++) {
			System.out.println(t1);
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		
	}
}