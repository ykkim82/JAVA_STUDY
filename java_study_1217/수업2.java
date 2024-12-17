package java_study_1217;

class Food{
	String name;
	int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public void eat()
	{
		System.out.println("Eating : " + this.name);
	}
	
	public int getCalories()
	{
		return this.calories;
	}
}

class Pizza extends Food{
	String[] toppings;
	
	public Pizza(String name, int calories, String[] topping)
	{
		super(name, calories);
		this.toppings = topping;
	}
	@Override
	public void eat()
	{
		System.out.println("Eating a slice of "  + super.name + " pizza");
	}
	
	public void showToppings()
	{
		System.out.println("Toppings : ");
		for (String s : toppings)
		{
			System.out.println(s + ",");
		}
		System.out.println("");
	}
}

class Sushi extends Food{
	String fishType;
	
	public Sushi(String name, int calories, String fishType)
	{
		super(name, calories);
		this.fishType = fishType;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating " + super.name + " sushi");
	}
	
	public void showFishType()
	{
		System.out.println("FishType : " + this.fishType);
	}
}

public class 수업2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food = new Food("Food", 100);
		
		String[] toppings = {"Tomato", "Mozzarella", "Basil"};
		Pizza margherita = new Pizza("margherita", 300, toppings);
		
		Sushi salmonRoll = new Sushi("salmon Roll", 250, "Salmon");
		
		food.eat();
		margherita.eat();
		salmonRoll.eat();
		
		margherita.showToppings();
		salmonRoll.showFishType();
				
				
		/*
		 * 코드설명
		 * Food 클래스 : 기본 음식 클래스, 모든 음식의 공통 속성인
		 * name과 calories
		 * 
		 * 핵심 : Pizza와 Sushi 클래스는 Food 클래스의 속성과 메서드를 상속받아 재사용할 수 있다.
		 */
				
	}

}
