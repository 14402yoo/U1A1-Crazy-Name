import becker.robots.Robot;

/**
* RobotHelper class provides static methods helping robot writing letters on the map. 
*  This allows putting many methods apart from RobotTask.java into this helper class,
*  This way makes the code structure clearer and more accessible.
*/
public class RobotHelpers {
	/**
	 * Writes a capital letter S. 
	 * Robot ending position will be one block right from the letter, heading straight to its direction.
	 * @param r robot to move
	 */
	public static void write_S(Robot r) {
		move_and_put(r, 4);	
		turn_right(r);	
		r.move();
		turn_right(r);
		move(r, 5);
		r.turnLeft();
		move_and_put(r, 2);
		r.turnLeft();
		r.move();
		move_and_put(r, 4);
		turn_right(r);
		r.move();
		move_and_put(r, 2);
		turn_right(r);
		r.move();
		move_and_put(r, 4);
		r.turnLeft();
		r.turnLeft();
		move(r, 6);
	}

	/**
	 * Writes a capital letter A. 
	 * Robot ending position will be one block right from the letter, heading straight to its direction.
	 * @param r robot to move
	 */
	public static void write_A(Robot r) {
		r.turnLeft();
		move_and_put(r, 5);
		turn_right(r);
		move_and_put(r, 1);
		r.turnLeft();
		move_and_put(r, 1);
		turn_right(r);
		move_and_put(r, 3);
		turn_right(r);
		move_and_put(r, 1);
		r.turnLeft();
		move_and_put(r, 1);
		turn_right(r);
		move_and_put(r, 6);
		turn_right(r);
		move(r, 4);
		turn_right(r);
		move(r, 4);
		turn_right(r);
		move_and_put(r, 4);
		r.move();
		turn_right(r);
		move(r, 3);
		r.turnLeft();
	}

	/**
	 * Writes a capital letter R. 
	 * Robot ending position will be one block right from the letter, heading straight to its direction.
	 * @param r robot to move
	 */
	public static void write_R(Robot r) {
		r.turnLeft();
		move_and_put(r, 6);
		turn_right(r);
		move_and_put(r, 5);
		turn_right(r);
		r.move();
		r.turnLeft();
		turn_right(r);
		move_and_put(r, 2);
		turn_right(r);
		move_and_put(r, 5);
		turn_left(r, 2);
		move(r, 3);
		turn_right(r);
		move_and_put(r, 1);
		r.turnLeft();
		r.move();
		turn_right(r);
		move_and_put(r, 1);
		r.turnLeft();
		r.move();
		turn_right(r);
		move_and_put(r, 2);
		//for consistent start 
		repeat(() -> {
			r.turnLeft();
			r.move();
		}, 2);
		turn_right(r); 
	}

	/**
	 * Writes a capital letter H. 
	 * Robot ending position will be one block right from the letter, heading straight to its direction.
	 * @param r robot to move
	 */
   public static void write_H(Robot r) {
		r.turnLeft();
		move_and_put(r, 7);
		turn_right(r, 2);
		move(r, 4);
		r.turnLeft();
		move_and_put(r, 5);
		r.turnLeft();
		move(r, 3);
		turn_left(r, 2);
		move_and_put(r, 7);
		//for consistent start 
		repeat(() -> {
			r.turnLeft();
			r.move();
		}, 2);
		turn_right(r);  
	}

	/**
	 * Repeates a runnable function for t times.
	 * @param func function to run
	 * @param t the number of times to repeat the function.
	 */
	public static void repeat(Runnable func, int t) {
		for (int i = 0; i < t; ++i) {
			func.run();
		}
	}

	/**
	 * Moves the robot n blocks forward.
	 * @param robot Robot to move
	 * @param n the number of blocks to move
	 */
	public static void move(Robot robot, int n) {
		repeat(() -> {
			robot.move();
		}, n);	
	}
	
	/**
	 * Put a thing first and then move robot. Repeats this for n times.
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public static void move_and_put(Robot robot, int n) {
		repeat(() -> {
			robot.putThing();
			robot.move();
		}, n);	
	}

	/**
	 * Make robot turn left for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public static void turn_left(Robot robot, int n) {
		repeat(() -> {
			robot.turnLeft();
		}, n);
	}

	/**
	 * Make robot turn right for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public static void turn_right(Robot robot, int n) {
		repeat(() -> {
			turn_right(robot);
		}, n);
	}


	/**
	 * Make robot turn right for n times
	 * @param robot Robot to move
	 * @param n the number of times to perform this function.
	 */
	public static void turn_right(Robot robot) {
		robot.turnLeft();
		robot.turnLeft();
		robot.turnLeft();
	}
}
