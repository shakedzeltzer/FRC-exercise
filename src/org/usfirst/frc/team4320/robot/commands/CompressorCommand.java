package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CompressorCommand extends Command{
	public CompressorCommand() {
		requires(Robot.compressorSubsystem);
	}
	protected void initialize() {
	}

	//put the compressor state in the opposite state
	@Override
	protected void execute() {
		Robot.compressorSubsystem.setCompressorClosedLoop(!Robot.compressorSubsystem.getCompressorState());
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
	}
}
