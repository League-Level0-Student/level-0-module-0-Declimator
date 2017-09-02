import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	// This recipe draws the first letter of your name using the Robot
	//
	// 1. Create a class called RobotGraffiti

	// 2. Use the Robot to draw the first letter of your name
	public static void main(String[] args) {
		Robot o = new Robot("mini");
		o.setSpeed(100);
		o.turn(-90);
		o.move(300);
		o.turn(90);
		o.penDown();
		//K
		o.setRandomPenColor();
		o.move(100);
		o.turn(45);
		o.setRandomPenColor();
		o.move(140);
		o.turn(180);
		o.move(140);
		o.turn(-90);
		o.setRandomPenColor();
		o.move(140);
		o.turn(180);
		o.move(140);
		o.turn(45);
		o.setRandomPenColor();
		o.move(100);
		o.turn(180);
		o.penUp();
		o.move(200);
		o.turn(-90);
		o.move(180);
		o.penDown();
		//Y
		o.setRandomPenColor();
		o.turn(-90);
		o.move(120);
		o.turn(45);
		o.setRandomPenColor();
		o.move(100);
		o.penUp();
		o.turn(180);
		o.move(100);
		o.turn(90);
		o.penDown();
		o.setRandomPenColor();
		o.move(100);
		o.penUp();
		o.turn(180);
		o.move(100);
		o.turn(45);
		o.move(120);
		o.turn(-90);
		o.move(100);
		o.penDown();
		//L
		o.move(80);
		o.turn(180);
		o.penUp();
		o.move(80);
		o.turn(90);
		o.penDown();
		o.setRandomPenColor();
		o.move(200);
		o.penUp();
		o.turn(180);
		o.move(200);
		o.turn(-90);
		o.move(100);
		o.penDown();
		o.setRandomPenColor();
		o.move(80);
		o.turn(180);
		o.penUp();
		o.move(80);
		o.turn(90);
		o.penDown();
		o.setRandomPenColor();
		o.move(100);
		o.turn(90);
		o.setRandomPenColor();
		o.move(80);
		o.turn(180);
		o.penUp();
		o.move(80);
		o.turn(90);
		o.penDown();
		o.setRandomPenColor();
		o.move(100);
		o.turn(90);
		o.setRandomPenColor();
		o.move(80);
	}
	// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
	// 3. BONUS: Write your entire first name using the Robot
}
