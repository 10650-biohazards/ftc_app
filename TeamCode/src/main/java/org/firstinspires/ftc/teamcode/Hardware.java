package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {

    /**
     * Motor creation
     */
    DcMotor fright, fleft, bright, bleft, lift, extender, intake, flap, arm;
    /**
     * Servo creation
     */
    Servo marker;

    /**
     * @param OP initializing drive train motors
     */
    public Hardware(OpMode OP) {
        fright = OP.hardwareMap.get(DcMotor.class, "right");
        fleft = OP.hardwareMap.get(DcMotor.class, "left");
        bright = OP.hardwareMap.get(DcMotor.class, "rightB");
        bleft = OP.hardwareMap.get(DcMotor.class, "leftB");
        /**
         * reversing motors
         */
        bleft.setDirection(DcMotor.Direction.REVERSE);
        bright.setDirection(DcMotor.Direction.REVERSE);
        fright.setDirection(DcMotor.Direction.REVERSE);
        fleft.setDirection(DcMotor.Direction.REVERSE);


        /**
         * initializing mechanism motors & Servo
         */
        lift = OP.hardwareMap.get(DcMotor.class, "actuator");
        /*extender = hardwareMap.get(DcMotor.class, "extender");
        intake = hardwareMap.get(DcMotor.class, "intake");
        flap = hardwareMap.get(DcMotor.class, "flap");*/
        marker = OP.hardwareMap.get(Servo.class, "marker");
        //arm = OP.hardwareMap.get(DcMotor.class, "arm");
    }
}
