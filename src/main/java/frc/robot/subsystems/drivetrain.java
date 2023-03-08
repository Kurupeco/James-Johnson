package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class MyMotorSubsystem extends SubsystemBase {
  private final CANSparkMax m_motor;

  public MyMotorSubsystem() {
    kmotor = new CANSparkMax(Constants.kTalonFXID, MotorType.kBrushless);
  }

  public void setSpeed(double speed) {
    kmotor.set(speed);
  }

  public void stop() {
    kmotor.set(0);
  }
}


