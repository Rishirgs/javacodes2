
public class threading extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("welcome to threading");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws Exception {
		threading th=new threading();
		th.start();
		water wa=new water();
		wa.start();
		th.join();
		System.out.println("hi rishi");
	}
}
class water extends Thread{
	public void run() {
		for(int k=0;k<5;k++) {
			System.out.println(k);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
