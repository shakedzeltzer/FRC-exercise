package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CompressorSubsystem extends Subsystem {
	
	private Compressor robotCompressor;
	private AnalogInput compSensor;
	private static CompressorSubsystem instance;
	
	public static CompressorSubsystem getInstance() {
		if (instance==null)
			instance=new CompressorSubsystem();
		return instance;
	}
	
	private CompressorSubsystem() {
		robotCompressor=new Compressor();
		compSensor=new AnalogInput(RobotMap.COMP_ANALOG_SENSOR);
	}
	public boolean getCompressorState() {
		return robotCompressor.getClosedLoopControl();
	}
	
	public void setCompressorClosedLoop(boolean state) {
		robotCompressor.setClosedLoopControl(state);
	}
	
	public double getCompressorPressure() {
		return 250*(compSensor.getValue()/5)-25;	
		//convert the voltage value to PSI value;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}