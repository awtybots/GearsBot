package org.usfirst.frc.team1114.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1114.robot.Robot;


/**
 *
 */
public class OpenClaw extends Command {

    public OpenClaw() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.claw);
    	setTimeout(0.8);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.claw.open();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
