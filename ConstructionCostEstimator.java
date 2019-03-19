/**
 * Estimates the Construction Cost, based on various materials
 * @author Siva Kanth
 *
 */
public class ConstructionCostEstimator {
	public int CalculateCost(int Area, String Standart) {
		/**
		 * HSFA--High Standard Fully Automated
		 * HS--High Standard
		 * AS--Above Standard
		 */
		if(Standart.contentEquals("HSFA")) {
			return Area*2500;
		}
		else if(Standart.contentEquals("HS")) {
			return Area*1800;
		}
		else if(Standart.contentEquals("AS")) {
			return Area*1500;
		}
		else {
			return Area*1200;    //Default will return the Standard area
		}
	}
	public static void main (String[] args) {
		ConstructionCostEstimator Estcost=new ConstructionCostEstimator();
		/**
		 * High Standard Fully Automated--HSFA
		 * High Standard--HS
		 * Above Standard--AS
		 * Standard--S
		 */
		System.out.println("Area = 4 ,Standard = High Standard Fully Automated\nCost = "+Estcost.CalculateCost(4, "HSFA"));
		System.out.println("\nArea = 4 ,Standard = High Standard\nCost = "+Estcost.CalculateCost(4, "HS"));
		System.out.println("\nArea = 4 ,Standard = Above Standard\nCost = "+Estcost.CalculateCost(4, "AS"));
		System.out.println("\nArea = 4 ,Standard = Standard\nCost = "+Estcost.CalculateCost(4, "S"));
	}
}