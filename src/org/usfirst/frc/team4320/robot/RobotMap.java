package org.usfirst.frc.team4320.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	//ANALOG
	//ANALOG PORTS FOR THE COMPRESSOR SENSOR 
	public static final int COMP_ANALOG_SENSOR=0;
	
	//Controller ports:
	public static final int XBOX_CONTROLLER=0;
	
	//solenoid ports:
	public static final int GEAR_LIFT_FORWARD=0;
	public static final int GEAR_LEFT_REVERSE=1;
	
	public static final int GEAR_PICK_FORWARD=2;
	public static final int GEAR_PICK_REVERSE=3;


	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
