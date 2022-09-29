import java.util.Arrays;

public class oopstry extends east{
 public static void main(String[] args) {
oopstry op=new oopstry();
op.med();      //(or) east e=new east() using extend in new class create that class new object all call
op.hij();
  }
}
class tom{
	int[] number= {99,44,32,56,11,2,35,89};
	public void med() {
		
//	int[] str=new int[number.length];
		for(int row=0;row<number.length;row++) {
for(int com=0;com<number.length;com++) {
				if(number[row]<number[com]) {
					number[row]=number[row]+number[com];
					number[com]=number[row]-number[com];
					number[row]=number[row]-number[com];
					
				}
			}
		}
	}
}
class east extends tom{
	public void hij() {
		System.out.println(Arrays.toString(number));
	}
}
