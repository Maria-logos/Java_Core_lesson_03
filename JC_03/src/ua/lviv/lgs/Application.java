package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.work();
		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();
		RobotCoocker robotCoocker = new RobotCoocker();
		robotCoocker.work();
		CoffeRobot coffeRobot = new CoffeRobot();
		coffeRobot.work();
		System.out.println(" ---------");
		Robot [] array = {new Robot() , new RobotDancer(), new CoffeRobot(), new RobotCoocker()};
		for (int i = 0; i < array.length; i++)
		{
			array[i].work();
		}
		
		System.out.println(" ---------");
		
		Animal animal = new Animal("Cat", 15.2, 10);
		System.out.println("Animal name = " + animal.getName() + ", Animal speed = " + 
		        animal.getSpeed() +" km/h, Animal age = " + animal.getAge() + " years -------------------------");
		
		animal.setAge(8);
		animal.setName("Dog");
		animal.setSpeed(12);
		
		System.out.println("Animal name = " + animal.getName() + ", Animal speed = " + 
		        animal.getSpeed() +" km/h, Animal age = " + animal.getAge() + " years ");

	}

}
