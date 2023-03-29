// MotorSubsystem.java
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {
  private final TalonFX leftMotor = new TalonFX(Constants.kLeftMotorID);
  private final TalonFX rightMotor = new TalonFX(Constants.kRightMotorID);

  public MotorSubsystem() {
    leftMotor.setInverted(false);
    rightMotor.setInverted(false);
  }

  public void setMotorSpeed(double speed) {
    leftMotor.set(ControlMode.PercentOutput, speed);
    rightMotor.set(ControlMode.PercentOutput, speed);
  }

  public void stopMotors() {
    leftMotor.set(ControlMode.PercentOutput, 0);
    rightMotor.set(ControlMode.PercentOutput, 0);
  }
}
