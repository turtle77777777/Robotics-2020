package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/**
 * Simp version of what could've been a really cool file
 */

public class AutoAimLimelightSimp extends CommandBase {

    private double rotInput;
    private double goalMax;
    private double goalMin;
    private double errorMargin;

    @Override
    public void initialize() {
        goalMax = 0;
        goalMin = 0;
    }

    @Override
    public void execute() {
        if (!Robot.Container.sensors.limelightHasTarget()) {
            

        } else {
            Robot.Container.driveTrain.cappedMecanumDrive(0, 0, rotInput, 0.6);
        }
    }

    @Override
    public void end(boolean interrupted) {
        if (!interrupted) {
            System.out.println("Limelight aimed.");
        }
    }
}