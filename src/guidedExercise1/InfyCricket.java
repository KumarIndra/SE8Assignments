package guidedExercise1;

public class InfyCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
		int amount = 0; 
		int total_cost = 0;
		double discount =0;
		double final_amount = 0;
		for(String item:cart) {
			switch(item) {
			case "round-neck":
				amount = 200;break;
			case "collared":
				amount = 250;break;
			case "hooded":
				amount = 300;break;
			}
			total_cost+=amount;
		}
		System.out.println(total_cost);
		if(cart.length<5) {
			discount = 0;
		}else if(cart.length>=5 && cart.length<=10) {
			discount = 10;
		}
		else if(cart.length>10) {
			discount = 20;
		}
		final_amount = total_cost - (total_cost * (discount/100));
		System.out.println("The Final Price is "+final_amount);
	}
	
}
