// RobotContainer.java
package frc.robot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.ExampleSubsystem;




public class RobotContainer {
  //private final MotorSubsystem motorSubsystem = new MotorSubsystem();
  //private final MotorCommand motorCommand = new MotorCommand(motorSubsystem);

  public RobotContainer() {
    //motorSubsystem.setDefaultCommand(motorCommand);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
