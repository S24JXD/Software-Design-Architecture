package bridgesol1;

// Abstract the style and filling from the implementations of BurgerFilling and BurgerStyle
public class BurgerMaker extends Burger {

 public BurgerMaker(BurgerStyle style, BurgerFilling filling) {
     super(style, filling);
 }

 public String getName() {
    // return style.getStyle() + " with " + filling.getFilling() + " filling";
	 String burgerName = style.getStyle() + " with " + filling.getFilling() + " filling";
     System.out.println("Order received for " + style.getStyle() + " with " + filling.getFilling());
     return burgerName;
 }
}