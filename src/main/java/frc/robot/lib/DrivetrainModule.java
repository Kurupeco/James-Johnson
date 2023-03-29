package frc.robot.lib;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class DrivetrainModule {
    private VictorSP motor1;
    private VictorSP motor2;

    public DrivetrainModule(int motorport1, int motorport2) {
        this.motor1 = new VictorSP(motorport1);
        this.motor2 = new VictorSP(motorport2);
    }
}