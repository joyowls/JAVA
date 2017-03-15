
public class gugudan {

	public static void main(String[] args) {
		for (int h = 2; h <= 9; h += 3) {
			for (int i = 1; i <= 9; i++) {
				for (int j = h; j <= h + 2 && j < 10; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}
				System.out.println();
			}
		}
	}

}
