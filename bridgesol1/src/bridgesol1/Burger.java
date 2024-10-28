package bridgesol1;

//Abstraction
public abstract class Burger {
	/*
	 * Burger is superclass for
	 *   PlainRoll_meatBurger
	 */


	 BurgerStyle style;
	 BurgerFilling filling;

	public Burger(BurgerStyle style, BurgerFilling filling) {
		this.style = style;
		this.filling = filling;
	}

	public abstract String getName();
}
