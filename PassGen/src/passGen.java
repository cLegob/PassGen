import java.io.IOException;
import java.util.Scanner;

public class passGen {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", };

		String agp = " ";

		System.out.print("Enter what this password is for: ");
		String userInput = sc.nextLine();

		System.out.println(userInput + " - ");

		for (int i = 0; i < 20; i++) {

			if (i % 5 == 0 && i != 0) {
				agp += "-";
			}

			if (Math.floor(Math.random() * 2) == 1) { // Random number

				agp += (int) Math.floor(Math.random() * 10) + 1;

			} else { // Random letter

				agp += letters[(int) (Math.floor(Math.random() * 51) + 0)];

			}

		}

		System.out.println(agp);

	}

}
