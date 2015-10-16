package kr.ac.embedded.kookmin.exception.basicthread;

public class testMain extends Thread{

	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		Thread depositMan = new Thread() {
			public void run() {
				while (true) {
					account.add(10);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread withdrawMan = new Thread() {
			public void run() {
				while (true) {
					account.delete(10);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}
}
