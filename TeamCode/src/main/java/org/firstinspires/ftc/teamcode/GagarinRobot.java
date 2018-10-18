package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Subsystems.ArmSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.DriveSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.IntakeSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.LiftSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.MarkerSubsystem;

import FtcExplosivesPackage.ExplosiveAuto;
import FtcExplosivesPackage.ExplosiveNavX;

public class GagarinRobot {

    public DriveSubsystem drive;
    public IntakeSubsystem intake;
    public ArmSubsystem arm;
    public LiftSubsystem lift;
    public MarkerSubsystem mark;

    ExplosiveAuto op;
    public ExplosiveNavX gyro;

    public DcMotor bright, fright, bleft, fleft, liftMotor, intakeMotor;
    public Servo markServo, flapServo;

    public ModernRoboticsI2cRangeSensor ultra;

    public GagarinRobot(ExplosiveAuto op) {
        this.op = op;

        bright = op.hardwareMap.get(DcMotor.class, "rightB");
        fright = op.hardwareMap.get(DcMotor.class, "right");
        bleft = op.hardwareMap.get(DcMotor.class, "leftB");
        fleft = op.hardwareMap.get(DcMotor.class, "left");
        liftMotor = op.hardwareMap.get(DcMotor.class, "47");
        intakeMotor = op.hardwareMap.get(DcMotor.class,"48");

        markServo = op.hardwareMap.get(Servo.class, "46");
        flapServo = op.hardwareMap.get(Servo.class,"49");

        gyro = new ExplosiveNavX(op, "41", 45);
        ultra = op.hardwareMap.get(ModernRoboticsI2cRangeSensor.class, "50");
    }

    public void initSubsystems() {
        drive = new DriveSubsystem(op, fleft, fright, bleft, bright, gyro, ultra);
        intake = new IntakeSubsystem(op, flapServo, intakeMotor);
        arm = new ArmSubsystem(op);
        lift = new LiftSubsystem(op, liftMotor);
        mark = new MarkerSubsystem(op, markServo);
    }
}