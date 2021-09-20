package kuharasample;

public class AnimalMain {
	public static void main(String[]args) {
		animal nake = new cat("にゃー");
		nake.naku();

		nake = new dog("わん");
		nake.naku();

		nake = new dag("ガー");
		nake.naku();
	}

}
