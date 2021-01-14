class PasswordGenerator {
	private static int PasswordsGenerated = 0;
	private String Prefix = "A";
	private int NumberOfDigits;

	public PasswordGenerator(int NumberOfDigits, String Prefix) {
		this.NumberOfDigits = NumberOfDigits;
		this.Prefix = Prefix;
	}
	public PasswordGenerator(int NumberOfDigits) {
		this.NumberOfDigits = NumberOfDigits;
	}
	public String pwGen() {
		String Password = Prefix + ".";
		for (int i = 0; i < NumberOfDigits; ++i) {
			Password += (int)(Math.random() * 10);
		}
		++PasswordsGenerated;
		return Password;
	}
	public int pwCount() {
		return PasswordsGenerated;
	}
}

public class FRQ2 {
	public static void main(String[] args) {
		// Testing
		
		PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
		System.out.println(pw1.pwCount());
		System.out.println(pw1.pwGen());
		System.out.println(pw1.pwGen());
		System.out.println(pw1.pwCount());

		PasswordGenerator pw2 = new PasswordGenerator(6);
		System.out.println(pw2.pwCount());
		System.out.println(pw2.pwGen());
		System.out.println(pw2.pwCount());
		System.out.println(pw1.pwCount());
	}
}
