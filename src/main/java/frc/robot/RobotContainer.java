package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class RobotContainer {
    private final XboxController m_controller = new XboxController(0);
    private final Drivetrain m_swerve = new Drivetrain();
    
    public RobotContainer()
    {

    }

    private void ConfigureBindings(){

    }

    public Command getAutonomousCommand(){
        return new SequentialCommandGroup() {
            
        };
    }

    public void setDriveMode(){

    }

}
