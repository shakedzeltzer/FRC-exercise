package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	//gets the compressor state (forward/backward/off)
	public boolean getCompressorState() {
		return robotCompressor.getClosedLoopControl(); 
	}
	
	//put the compressor in closed loop mode
	public void setCompressorClosedLoop(boolean state) {
		robotCompressor.setClosedLoopControl(state); 
	}
	
	public double getCompressorPressure() {
		return 250*(compSensor.getValue()/5)-25;	
		//convert the voltage value to PSI value;
	}
	//put the pressure status on the smartDashboard
	public void updatePressureStatus() {
		SmartDashboard.putNumber("CompressorPrussure",getCompressorPressure());
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
