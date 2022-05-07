import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("AutoPassGen.txt"));

		writer.append("---Auto Pass Gen---");
		writer.newLine();

		writer.close();

	}

}
