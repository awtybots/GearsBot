package org.usfirst.frc.team1114.robot.subsystems;

import org.usfirst.frc.team1114.robot.*;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
	
	private Victor leftFront, leftBack, rightBack, rightFront;
	
	public static RobotDrive woodDrive;
	
	public Drivetrain(){
		leftFront = new Victor(RobotMap.leftFront);
		leftBack = new Victor(RobotMap.leftBack);
		rightFront = new Victor(RobotMap.rightFront);
		rightBack = new Victor(RobotMap.rightBack);
		
		
		woodDrive = new RobotDrive(leftFront,leftBack,rightFront,rightBack);
	}

	protected void initDefaultCommand() {
		
	}
	
	public static void driveTank(double leftSide, double rightSide){
		woodDrive.tankDrive(leftSide, rightSide);
	}

}
