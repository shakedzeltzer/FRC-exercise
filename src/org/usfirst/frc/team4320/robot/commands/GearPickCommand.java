package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class GearPickCommand extends Command {
	public GearPickCommand() {
		requires(Robot.gearPick);
	}
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(Robot.gearPick.getDoubleSol().get()==DoubleSolenoid.Value.kForward)
			Robot.gearPick.setPistonValue(DoubleSolenoid.Value.kReverse);
		
		else if (Robot.gearPick.getDoubleSol().get()==DoubleSolenoid.Value.kReverse)
			Robot.gearPick.setPistonValue(DoubleSolenoid.Value.kForward);
		
		else if (Robot.gearPick.getDoubleSol().get()==DoubleSolenoid.Value.kOff)
			Robot.gearPick.setPistonValue(DoubleSolenoid.Value.kForward);
			
	}

	// Make this return true when this Command no longer needs to run execute()
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
		Robot.gearPick.setPistonValue(DoubleSolenoid.Value.kOff);

	}
}
