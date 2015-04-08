
public class Exercise_06_01 {

	public static void main(String[] args) {
		for(int nr = 1; nr <= 100; nr++ ){
			System.out.printf("%5d ", getPentagonalNumber(nr));
			if(nr % 10 == 0)
				System.out.println("");
		}
	}
	
	public static int getPentagonalNumber(int n) {
		return n*(3 * n - 1) / 2;
	}

}
