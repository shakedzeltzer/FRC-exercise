package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearLift extends Subsystem {
	
	private DoubleSolenoid gearLiftSol;
	private static GearLift instance;
	
	public static GearLift getInstance() {
		if(instance==null)
			instance=new GearLift();
		return instance;
	}
	
	private GearLift() {
		gearLiftSol=new DoubleSolenoid(RobotMap.GEAR_LIFT_FORWARD, RobotMap.GEAR_LEFT_REVERSE);
	}
	
	public void setPistonValue(DoubleSolenoid.Value PistonValue) {
		gearLiftSol.set(PistonValue);
	}
	
	public DoubleSolenoid getDoubleSol() {
		return gearLiftSol;
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
