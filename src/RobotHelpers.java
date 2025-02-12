import becker.robots.Robot;
/**
* creates a helper class that contains public static functions. 
*  This allows putting many methods apart from RobotTask.java into this helper class,
*  This way makes the code structure clearer and more accessible.
*  
*/
public class RobotHelpers {
	//writes a capital letter S
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

	//writes a capital letter A
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

	//wrties a capital letter R
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

	//writes a capital letter H
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

	//runs a runnable function func for t times.
	public static void repeat(Runnable func, int t) {
		for (int i = 0; i < t; ++i) {
			func.run();
		}
	}

	//moves robot to n number of blocks.
	public static void move(Robot robot, int n) {
		repeat(() -> {
			robot.move();
		}, n);	
	}

	//put a thing first and then move robot. Repeats this for n times.
	public static void move_and_put(Robot robot, int n) {
		repeat(() -> {
			robot.putThing();
			robot.move();
		}, n);	
	}

	//make robot turn left for n times
	public static void turn_left(Robot robot, int n) {
		repeat(() -> {
			robot.turnLeft();
		}, n);
	}

	//make robot turn right for n times
	public static void turn_right(Robot robot, int n) {
		repeat(() -> {
			turn_right(robot);
		}, n);
	}

	//make robot turn right by repeating turning left 3 times
	public static void turn_right(Robot robot) {
		robot.turnLeft();
		robot.turnLeft();
		robot.turnLeft();
	}
}
