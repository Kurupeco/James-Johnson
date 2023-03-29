package frc.robot.lib;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class DriveModule {
    /* Prevents human error and gear obliteration in later programming,
     * PLEASE USE THIS CLASS INSTEAD OF A VICTOR SP
     * dont kill my boy 🙏🙏🙏 */

    private VictorSP gearboxMotor1;
    private VictorSP gearboxMotor2;

    public DriveModule(int motorport1, int motorport2) {
        this.gearboxMotor1 = new VictorSP(motorport1);
        this.gearboxMotor2 = new VictorSP(motorport2);
    }

    public void set(double speed) {
        // prevent gear obliteration, one motor must run opposite to the other
        gearboxMotor1.set(0);
        gearboxMotor2.set((speed * -1)); // invert
    }
}
