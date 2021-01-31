package f147;
import java.util.Scanner;
import java.util.ArrayList;
public class f147 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> couple = new ArrayList<Food>();
		couple.add(new Food(1, "Medium Wac", 4));
		couple.add(new Food(2, "WChicken Nugget", 8));
		couple.add(new Food(3, "Geez Burger", 7));
		couple.add(new Food(4, "ButtMilk Crispy Chicken", 6));
		couple.add(new Food(5, "Plastic Toy", 3));
		ArrayList<Food> single = new ArrayList<Food>();
		single.add(new Food(1, "German Fries", 2));
		single.add(new Food(2, "Durian Slices", 3));
		single.add(new Food(3, "WcFurry", 5));
		single.add(new Food(4, "Chocolate Sunday", 7));
		
		ArrayList<Food> order = new ArrayList<Food>();
		int id;
		boolean flag = true;
		while(flag) {
			int con = Integer.parseInt(scanner.nextLine());
			switch(con) {
			case 0:
				int total = 0;
				for(Food f : order) {
					System.out.printf("%s %d\n", f.name, f.price);
					total+=f.price;
				}
				System.out.println("Total: " + total);
				flag = false;
				break;
			case 1:
				id = Integer.parseInt(scanner.nextLine());
				order.add(couple.get(id-1));
				break;
			case 2:
				id = Integer.parseInt(scanner.nextLine());
				order.add(single.get(id-1));
				break;
			}
		}
	}

}

class Food{
	
	int id;
	String name;
	int price;
	
	public Food(int i, String s, int p) {
		id = i;
		name = s;
		price = p;
	}
	
}