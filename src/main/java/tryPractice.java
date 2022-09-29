import java.util.Arrays;
import java.util.Scanner;

public class tryPractice {
	public void nick(String[][] jonas) {
			Scanner scan=new Scanner(System.in);
			jonas[0]=new String[3];
			jonas[1]=new String[4];
			jonas[2]=new String[5];
	for(int row=0;row<jonas.length;row++) {
		for(int col=0;col<jonas[row].length;col++) {
			System.out.println("enter the names");
			jonas[row][col]=scan.nextLine();
		}
	}
			
	}
	public void gun(String[][] alkey) {
		for(String[] tim:alkey) {
			System.out.println(Arrays.toString(tim));
		}
	}

	public static void main(String[] args) {
		String[][] name=new String[3][];
		tryPractice hhh=new tryPractice();
//		hhh.nick(name);
//		System.out.println(Arrays.toString(name));
		hhh.nick(name);
		hhh.gun(name);
	}
}
