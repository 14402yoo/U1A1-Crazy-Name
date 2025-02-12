import becker.robots.*;

public class RobotTask {

	public void run() {
		// build a random city called waterloo
		City waterloo = new City(100, 100);

		// build a robot in the city waterloo starting at street 4, avenue 1, starts in east direction holding 99999 things that can be put on the city.
		Robot r = new Robot(waterloo, 4, 1, Direction.EAST, 99999);
		r.setSpeed(20); //sets robot speed
		//starts writing name: S A R A H
		RobotHelpers.write_S(r); //calls static function defined in RobotHelpers.java
		r.move(); //adds spacing between letters
		RobotHelpers.write_A(r);
		r.move();
		RobotHelpers.write_R(r);
		r.move();
		RobotHelpers.write_A(r);
		r.move();
		RobotHelpers.write_H(r);
	}
}
