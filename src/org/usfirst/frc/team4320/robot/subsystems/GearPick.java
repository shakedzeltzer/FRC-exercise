package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearPick extends Subsystem {
	private DoubleSolenoid gearPickSol;
	private static GearPick instance;
	
	public static GearPick getInstance() {
		if(instance==null)
			instance=new GearPick();
		return instance;
	}
	
	private GearPick() {
		gearPickSol=new DoubleSolenoid(RobotMap.GEAR_PICK_FORWARD, RobotMap.GEAR_PICK_REVERSE);
	}
	
	public void setPistonValue(DoubleSolenoid.Value PistonValue) {
		gearPickSol.set(PistonValue);
	}
	
	public DoubleSolenoid getDoubleSol() {
		return gearPickSol;
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
