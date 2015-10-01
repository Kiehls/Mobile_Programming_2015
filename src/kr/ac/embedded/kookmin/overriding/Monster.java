package kr.ac.embedded.kookmin.overriding;

public class Monster {
	boolean frighten(int i) {
		System.out.println("arragh");
		return true;
	}
}

class Vampire extends Monster {
	boolean frighten(int i) {
		System.out.println("a bite?");
		return false;
	}
}

class Dragon extends Monster {
	boolean frighten(int degree) {
		System.out.println("breath fire");
		return true;
	}
}