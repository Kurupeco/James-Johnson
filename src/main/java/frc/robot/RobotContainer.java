// RobotContainer.java
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.MotorCommand;
import frc.robot.subsystems.MotorSubsystem;

public class RobotContainer {
  private final MotorSubsystem motorSubsystem = new MotorSubsystem();
  private final MotorCommand motorCommand = new MotorCommand(motorSubsystem);

  public RobotContainer() {
    motorSubsystem.setDefaultCommand(motorCommand);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
