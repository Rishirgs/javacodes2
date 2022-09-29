import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
//	String name="AMMA";
//	String butch="";
//	for(int row=name.length()-1;row>=0;row--) {
//		butch=butch+name.charAt(row);
//	}
//	System.out.println(butch);                                  ///IT IS PALINDROME PROGRAM OUTPUT VERIFIED
// 	if(name.equalsIgnoreCase(butch)) {
//		System.out.println("it is palindrone");
//	}
//	else {
//		System.out.println("it is not a palindrome");
//	}
//}
//}
	int t1=0,t2=1,t3=0,t=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length");
	t=scan.nextInt();
	for(int row=0;row<t;row++) {
		System.out.println(t1);
		t3=t1+t2;
		t1=t2;
		t2=t3;
		
	}
}
}