package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class GearLiftCommand extends Command {
	
	public GearLiftCommand() {
		requires(Robot.gearLift);
	}
	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}
	
	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		if(Robot.gearLift.getDoubleSol().get()==DoubleSolenoid.Value.kForward)
			Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kReverse);
		
		else if (Robot.gearLift.getDoubleSol().get()==DoubleSolenoid.Value.kReverse)
			Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kForward);
		
		else if (Robot.gearLift.getDoubleSol().get()==DoubleSolenoid.Value.kOff)
			Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kForward);
			
	}
		
	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kOff);
	}

}
