package PRUEB;

public class Array_egit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array = new int[20];

		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 10);
			System.out.print("[");
			System.out.print(Array[i] + " ");
			System.out.print("]");
		}

		System.out.println();
		

	}

}
