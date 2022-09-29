
public class stringbuffer {
public static void main(String[] args) {
	int number=0,vowel=0,upper=0,lower=0,space=0;
	StringBuilder b=new StringBuilder("rishigowtham0601@gmail.com RISHI");
	for(int r=0;r<b.length();r++) {
		if(b.charAt(r)>=97&&b.charAt(r)<=122) {
			lower++;
		}
		if(b.charAt(r)>=65&&b.charAt(r)<=90) {
			upper++;                                                 //String builder project
		}
		else if(b.charAt(r)==32) {
			space++;
		}
		else if(b.charAt(r)>=48&&b.charAt(r)<=57) {
			number++;
		}
		else if(b.charAt(r)=='a'||b.charAt(r)=='e'||b.charAt(r)=='i'||b.charAt(r)=='o'||b.charAt(r)=='u'&&b.charAt(r)=='A'||b.charAt(r)=='E'||b.charAt(r)=='I'||b.charAt(r)=='O'||b.charAt(r)=='U'){
vowel++;			
		}
	}
System.out.println("upper ="+upper);
System.out.println("lower ="+lower);
System.out.println("vowel ="+vowel);
System.out.println("number ="+number);
System.out.println("space ="+space);

}
}
