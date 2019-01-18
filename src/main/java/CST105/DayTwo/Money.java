package CST105.DayTwo;

public class Money {
	
	// Attributes/variables/fields for the class
	public String type;
	public double denomination;
	public String color;
	public String country;
	
	// Methods and behaviors for the class
	public void earn() {
		System.out.println("When is my next paycheck?");
	}
	public void spend() {
		System.out.println("I am buying a Tesla!");	
	}
	public void save() {
		System.out.println("A penny saved is a penny I can spend tomorrow!");
	}
	public void invest() {
		System.out.println("Do I get a 401K match?");		
	}
	// Display all object attributes/variables/field
	public void showMoney() {
		System.out.println("Type = " + type);
		System.out.println("Denomination = " + denomination);
		System.out.println("Color = " + color);
		System.out.println("Country = " + country);
		System.out.println("====================");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money m = new Money();
		m.type="Paper";
		m.denomination=100;
		m.color="blue";
		m.country="RMB";
		m.showMoney();
		m.spend();
		m.earn();
		Money e = new Money();
		e.type = "Coin";
		e.denomination=.34;
		e.color = "green";
		e.country = "China";
		e.showMoney();
		e.spend();
		

	}

}
