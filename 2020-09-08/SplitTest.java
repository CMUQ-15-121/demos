import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String bob = "Ryan	Irish	Little King";
		String[] arr = bob.split("\t");
		System.out.println(Arrays.toString(arr));
	}

}
