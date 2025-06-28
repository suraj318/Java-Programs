package Coding;

class bbb {
	public static void method() {
		System.out.println("Static bbb");
	}
}

class aaa extends bbb {

}

public class Test {

	public static void main(String[] args) {

		bbb b = new aaa();
		b.method();
	}
}
