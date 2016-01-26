package org.usfirst.frc.team1114.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;

import org.usfirst.frc.team1114.robot.RobotMap;
import org.usfirst.frc.team1114.robot.commands.ClawDoNothing;

import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class Claw extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	SpeedController motor = new Victor(RobotMap.clawMotor);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ClawDoNothing());
    }
    
    public void open() {
    	motor.set(1);
    }
    public void close() {
    	motor.set(-1);
    }
    public void doNothing() {
    	motor.set(0);
    }
}

