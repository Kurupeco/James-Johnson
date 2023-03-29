package frc.robot.subsystems;
import frc.robot.lib.DriveModule;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class Drivetrain extends SubsystemBase {
    /* Drivetrain subsystem responsible for the movement of the robot
     * contains only setup and basic control */
    public Drivetrain() {}

    private DriveModule leftMotors = new DriveModule(DRIVETRAIN_LEFT_BACK_GEARBOX_VICTORSP, DRIVETRAIN_LEFT_FRONT_GEARBOX_VICTORSP); 
    private DriveModule rightMotors = new DriveModule(DRIVETRAIN_RIGHT_BACK_GEARBOX_VICTORSP, DRIVETRAIN_RIGHT_FRONT_GEARBOX_VICTORSP); 

@Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
    
    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
