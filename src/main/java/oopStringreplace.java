import java.util.Arrays;
import java.util.Scanner;

public class oopStringreplace {
public static void main(String[] args) {
	
	String[][] name=new String[3][];
test te=new test();
te.goon(name);
	te.stip(name);
}
}
class test{	
	
	public void goon(String[][] all) {
		Scanner scan=new Scanner(System.in);
		all[0]=new String[3];
		all[1]=new String[4];
		all[2]=new String[5];
		for(int row=0;row<all.length;row++) {
			for(int col=0;col<all[row].length;col++) {
				System.out.println("enter the names");
				all[row][col]=scan.nextLine();
			}
		}
	}

public void stip(String[][] ask) {
	
	for(String[] tim:ask) {
		System.out.println(Arrays.toString(tim));
	}
}
}