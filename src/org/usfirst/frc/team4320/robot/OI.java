package org.usfirst.frc.team4320.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4320.robot.commands.CompressorCommand;
import org.usfirst.frc.team4320.robot.commands.ExampleCommand;
import org.usfirst.frc.team4320.robot.commands.GearLiftCommand;
import org.usfirst.frc.team4320.robot.commands.GearPickCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	private XboxController xboxControler;
	private JoystickButton CompressorButton;
	private JoystickButton gearLiftButton;
	private JoystickButton gearPickButton;
	public OI() {
		xboxControler=new XboxController(RobotMap.XBOX_CONTROLLER);
		CompressorButton=new JoystickButton(xboxControler,1); //A button
		gearLiftButton=new JoystickButton(xboxControler,4); //Y button
		gearPickButton=new JoystickButton(xboxControler,3); //X button
		
		CompressorButton.toggleWhenPressed(new CompressorCommand()); //compressor toggle closed loop
		gearLiftButton.toggleWhenPressed(new GearLiftCommand());
		gearPickButton.toggleWhenPressed(new GearPickCommand());
	}
	
	public XboxController getController() {
		return xboxControler;
	}

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
