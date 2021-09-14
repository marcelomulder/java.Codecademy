public class Magic {
	public static void main(String[] args) {
    int myNumber = 98; // This is the original number.

    int magicNumber = myNumber * myNumber;

    magicNumber = magicNumber + myNumber;

    magicNumber = magicNumber / myNumber;

    magicNumber = magicNumber + 17;

    magicNumber = magicNumber - myNumber;

    magicNumber = magicNumber / 6;

    System.out.println(magicNumber); //always gonna show the same result.		

	}
}