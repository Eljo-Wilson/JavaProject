package oopconcept;

import java.util.Scanner;

public class PetshopApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		pet ob = new pet();
		
		System.out.println("What Service You Need");
		System.out.println(
				" 1. Pets\n 2. Pet Food \n 3. Pet Supplies \n 4. Pet Accessories \n 5. Health and Hygiene Products \n 6. Pet Care Services");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			ob.pets();
			break;
			
		case 2 :
			ob.petfood();
			break;
			
		case 3 :
			ob.pet_supply();
			break;
			
		case 4 :
			ob.pet_accessories();
			break;
			
		case 5 :
			ob.pet_products();
			break;
			
		default :
			System.out.println("Invalid Service");
		
		}
		
	}

}

interface petshop {
	public void pets();
	public void dog_breed();
	public void cat_breed();
	public void bird_breed();
	public void fish_breed();
	
	public void petfood();
	public void dog_food();
	public void cat_food();
	public void bird_food();
	public void fish_food();

	public void pet_supply();

	public void pet_accessories();

	public void pet_products();

}

class pet implements petshop {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void pets() {
		System.out.println("Which Pet Select Option");
		System.out.println(" 1. Dog\n 2. Cat\n 3. Bird\n 4. Fish");
		int ch = sc.nextInt();
		switch (ch) {
		case 1 :
			dog_breed();
			break;
			
		case 2 :
			cat_breed();
			break;
			
		case 3 :
			bird_breed();
			break;
			
		case 4 :
			fish_breed();
			break;
			
		default :
			System.out.println("Invalid Breed");
		}
		
	}
	
	@Override
	public void dog_breed() {
		System.out.println("Select Breed");
		System.out.println("1. Chihuahua\n 2. Pomeranian\n 3. Husky\n 4. Pug\n 5. German Shepherd\n");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}
	}
	
	@Override
	public void cat_breed() {
		System.out.println("Select Breed");
		System.out.println("1. Persian\n 2. Maine Coon\n 3. Ragdoll\n 4. Siberian\n 5. Norwegian Forest Cat\n");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}

	}
	
	@Override
	public void bird_breed() {
		System.out.println("Select Breed");
		System.out.println("1. Duck\n 2. Owl\n 3. Nightingale\n 4. Cockatiel\n 5. Amazon Parrot\n");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}
	}
	
	@Override
	public void fish_breed() {
		System.out.println("Select Species");
		System.out.println("1. Common Goldfish\n 2. Guppy\n 3. Molly\n 4. Clownfish\n 5. Corydoras Catfish\n");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}
	}

	@Override
	public void petfood() {
		System.out.println("Select Pet Type");
		System.out.println(" 1. Dog\n 2. Cat\n 3. Bird\n 4. Fish");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			dog_food();
			break;
			
		case 2 :
			cat_food();
			break;
			
		case 3 :
			bird_food();
			break;
		
		case 4 :
			fish_food();
			break;
			
		default :
			System.out.println("Invalid Selection");
		}

	}
	
	@Override
	public void dog_food() {
		System.out.println("Select Food ");
		System.out.println("1. Royal Canin Breed Health Nutrition Dry\n 2. Blue Buffalo Life Protection Formula Dry\n 3. Taste of the Wild High Prairie Grain-Free Dry\n 4. Wellness CORE Grain-Free Canned\n 5. Royal Canin Veterinary Diet Gastrointestinal");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}

	}
	
	@Override
	public void cat_food() {
		System.out.println("Select Food ");
		System.out.println("1. Purina ONE Indoor Advantage Adult Dry Cat Food\n 2. Royal Canin Feline Health Nutrition\n 3. Blue Buffalo Wilderness High Protein Grain-Free\n 4. Royal Canin Feline Health Nutrition Loaf in Sauce\n 5. Purina Pro Plan Focus Adult");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}

	}
	
	@Override
	public void bird_food() {
		System.out.println("Select Food ");
		System.out.println("1. Zupreem FruitBlend Pellets\n 2. Kaytee Forti-Diet Pro Health Bird Food\n 3. Harrison's Adult Lifetime Fine\n 4. Lafeber's Nutri-Berries\n 5. Roudybush Daily Maintenance Bird Food");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}

	}
	
	@Override
	public void fish_food() {
		System.out.println("Select Food ");
		System.out.println("1. Flake Foods\n 2. Pellet Foods\n 3. Granule Foods\n 4. Frozen Foods");
		int ch = sc.nextInt();
		System.out.println("Order Confirmed");
//		switch(ch) {
//		case 1 :
//			
//		}

	}

	@Override
	public void pet_supply() {
		System.out.println("Select Item");
		System.out.println("1. Leashes\n 2. Collars\n 3. Toys\n 4. Grooming Tools\n 5. Cages\n 6. Aquariums");
		System.out.println("Order Confirmed");
	
	}

	@Override
	public void pet_accessories() {
		System.out.println("Select Item");
		System.out.println("1. Beds\n 2. Blankets\n 3. Clothing\n 4. Bowls\n 5. Carriers\n 6. ID Tags");
		System.out.println("Order Confirmed");
	
	}

	@Override
	public void pet_products() {
		System.out.println("Select Item");
		System.out.println("1. Shampoos\n 2. Conditioners\n 3. Dental Care Products\n 4. Supplements");
		System.out.println("Order Confirmed");
	
	}

}
