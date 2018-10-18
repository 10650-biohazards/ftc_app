package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Utility {

    OpMode op;
    long startTime;
    int millis;

    public Utility(OpMode op) {
        this.op = op;
    }

    public void startTimer(int millis) {
        this.millis = millis;
        startTime = System.currentTimeMillis();
    }

    public boolean timerDone() {
        return startTime + millis < System.currentTimeMillis();
    }

    public void waitMS(int millis) {
        long startTime = System.currentTimeMillis();

        while (startTime + millis >= System.currentTimeMillis()){}
    }
}