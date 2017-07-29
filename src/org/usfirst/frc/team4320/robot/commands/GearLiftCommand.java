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
	
	//switch the sides of the DoubleSolenoid
	@Override
	protected void execute() {
		
		if(Robot.gearLift.getDoubleSol().get()==DoubleSolenoid.Value.kForward)
			Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kReverse);
		else
			Robot.gearLift.setPistonValue(DoubleSolenoid.Value.kForward);
			
	}
		
	//when the pressure is below 40 PSI, it stops
	@Override
	protected boolean isFinished() {
		if(Robot.compressorSubsystem.getCompressorPressure()<=40)
			return true;
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
