
public class interfaceThreading{
	
	public static void main(String[] args) {
		vest ve=new vest();
		Thread t=new Thread(ve);
	t.start();
	}
}
class vest implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("triple h");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}