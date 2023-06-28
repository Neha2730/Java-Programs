package testing;

public class Countdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int d = 124364482;
		
		while (d>0) {
			d = d/10;
			count++;
			}
		System.out.println(count);
	}

}
