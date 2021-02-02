
public class TasquesUD5_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int ext;
		ext = b;
		
		System.out.println("a= " + a + "\nb= " + b + "\nc= " + c + "\nd= " + d );
		
		b = c;
		c = a;
		a = d;
		d = ext;
		System.out.println("Cambiados\na= " + a + "\nb= " + b + "\nc= " + c + "\nd= " + d );
	}
}
