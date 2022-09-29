import java.util.Arrays;
import java.util.Scanner;

public class ooptry {
public static void main(String[] args) {
	must mu=new must();
	mu.med();
	mu.clust();                                          //output verified
}
}                                             // using user input method
class dust{
	Scanner scan=new Scanner(System.in);
	int[] mam=new int[7];
	public void med() {
		for(int index=0;index<mam.length;index++) {
		System.out.println("enter the number");
		mam[index]=scan.nextInt();
		for(int start=0,end=mam.length-1;start<end;start++,end--) {
			mam[start]=mam[start]^mam[end];
			mam[end]=mam[start]^mam[end];
			mam[start]=mam[start]^mam[end];
			
		}
	}
}
}
class must extends dust{
	public void clust() {
		System.out.println(Arrays.toString(mam));
	}
}