package bridgesol1;

//Client
public class Kiosk {
	/* 
     * Kiosk creates one or more Burgers via BurgerMaker
     * Burger has a breadStyle (PlainRoll, GranaryRoll, WhiteBreadSandwich)
     *   and a filling (meat, spicyMeat, fish, veggie, vegan)
     */
	
	public static void main(String[] args) {
	// make 4 different Burger(breadStyle, filling)

     Burger b1 = new BurgerMaker(new PlainRollStyle(), new MeatFilling());
     Burger b2 = new BurgerMaker(new PlainRollStyle(), new SpicyMeatFilling());
     Burger b3 = new BurgerMaker(new GranaryRollStyle(), new VeggieFilling());
     Burger b4 = new BurgerMaker(new WhiteBreadSandwichStyle(), new VeganFilling());

 	// check what's cookin
    // System.out.println("Order received:\n" + b1.getName() + "\n" + b2.getName() + "\n" + b3.getName() + "\n" + b4.getName() + "\n");

     System.out.println("Order ready:\n" + b1.getName() + "\n" + b2.getName() + "\n" + b3.getName() + "\n" + b4.getName() + "\n");

     System.out.println("Normally terminating...");
 }
}