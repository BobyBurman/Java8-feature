package TestCode;

public class Mythread {

	public static void main(String arr[]) {

		Thread t = new Thread(() -> {
			for (int i = 0; i < 9; i++) {
				System.out.println("fghjkl");
			}

		}

		);
		t.start();
		for (int j = 0; j < 9; j++) {
			System.out.println("fghhrewhghg");
		}

	}

}
