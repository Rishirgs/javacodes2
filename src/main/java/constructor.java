
public class constructor {
	int length,breath,width;


public constructor(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	length=i;breath=j;width=k;
	}


public constructor() {
	// TODO Auto-generated constructor stub
	length=20;
	breath=100;
}


public constructor(int i) {
	// TODO Auto-generated constructor stub
	length=i;
}


public constructor(int i, int j) {
length=i;
breath=j;
	// TODO Auto-generated constructor stub
}

int add() {
	return length+breath;
}
int mul() {
	return length*breath*width;
}
int div() {
	return length/2;
}
int sub() {
	return length-breath;
}

public static void main(String[] args) {
	constructor c=new constructor();
	System.out.println(c.sub());
	constructor c2=new constructor(10,20);
	System.out.println(c2.add());
	constructor c3=new constructor(100);
	System.out.println(c3.div());
	constructor c4=new constructor(10,20,30);
	System.out.println(c4.mul());
}
}
