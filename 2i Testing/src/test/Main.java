package test;

public class Main {

	public static void main(String[] args) {
		multiples();
	}
	
	public static void multiples() {
		for(int i = 0; i <= 300; i++) {
			if (i<=100 && i%7==0) {
				System.out.println(i);
			} else if (i>=100 && i<=200 && i%8==0) {
				System.out.println(i);
			} else if (i>=200 && i<=300 && i%9==0){
				System.out.println(i);
			}
		}
	}
}
