import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunMotorCommand extends CommandBase {
  private final MyMotorSubsystem m_subsystem;

  public RunMotorCommand(MyMotorSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(m_subsystem);
  }

  @Override
  public void initialize() {
    m_subsystem.setSpeed(Constants.kMotorSpeed);
  }

  @Override
  public void end(boolean interrupted) {
    m_subsystem.stop();
  }
}