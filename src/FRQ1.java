class Invitation {
	private String hostName;
	private String address;

	public Invitation(String n, String a) {
		hostName = n;
		address = a;
	}
	/* (a) Write a method for the Invitation class that returns the name of the host. */
	public String GetHost() {
		return hostName;
	}

	/* (b) Write a method for the Invitation class that accepts a parameter and uses it to update the address for the event. */
	public void UpdateAddress(String NewAddress) {
		address = NewAddress;
	}

	/* (c) Write a method for the Invitation class that will accept the name of a person who will be invited as a string parameter and return a string consisting of the name of the person being invited along with name of the host and location of the event.
		For example, if the host name is "Karen", the party location is "1234 Walnut Street", and the person invited is "Cheryl", the method should return a string in the following format.
		Dear Cheryl, please attend my event at 1234 Walnut Street. See you then, Karen.
		Write the method below. Your implementation must conform to the example above.
	 */
	public String GetGreeting(String Name) {
		return "Dear " + Name + ", please attend my event at " + address + ". See you then, " + hostName + ".";
	}

	/* (d) A student has written the following one-parameter constructor to be included in the Invitation class. The method is intended to construct a new Invitation object that sets address to the value of the parameter and sets hostName to the default name "Host". The constructor does not work as intended.
		public Invitation(String address) {
			address = address;
			hostName = "Host";
		}
		Write a correct implementation of the one-parameter Invitation constructor that avoids the error in the student’s implementation.
		Write the method below.
	 */
	public Invitation(String address) {
		this.address = address;
		hostName = "Host";
	}
}

public class FRQ1 {
	public static void main(String[] args) {
		// Testing
		Invitation NewInv = new Invitation("Bob", "123 Hello St.");
		System.out.println(NewInv.GetGreeting("Jen"));
	}
}
