package PRUEB;

public class Array_egit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array = new int[20];
		int contar = 0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (int) (Math.random() * 10);
			contar++;
			System.out.print("[");
			System.out.print(Array[i] + " ");
			System.out.print("]");
			System.out.println();
			System.out.print(contar);
		}

		System.out.println();
		

	}

}
