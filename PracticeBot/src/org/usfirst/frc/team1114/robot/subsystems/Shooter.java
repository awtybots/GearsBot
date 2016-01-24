package org.usfirst.frc.team1114.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team1114.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 */
public class Shooter extends Subsystem {
    
    private Victor leftShooter, rightShooter;
    
    public Shooter(){
    	leftShooter = new Victor(RobotMap.leftShooter);
    	rightShooter = new Victor(RobotMap.rightShooter);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double input){
    	leftShooter.set(input);
    	rightShooter.set(input);
    }
}

