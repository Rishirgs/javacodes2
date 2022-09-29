import java.util.Arrays;
import java.util.Scanner;

public class oldmed {
	Scanner scan=new Scanner(System.in);
	public void mack(int[] billy) {
		for(int tim=0;tim<billy.length;tim++) {
			System.out.println("enter all the size");
			billy[tim]=scan.nextInt();
			for(int start=0,end=billy.length-1;start<end;start++,end--) {
				billy[start]^=billy[end];
				billy[end]^=billy[start];
				billy[start]^=billy[end];
				
			}
		}
		
			}
public static void main(String[] args) {
	int[] dutch=new int[7];
	oldmed med=new oldmed();
	med.mack(dutch);
	System.out.println(Arrays.toString(dutch));
}
}
