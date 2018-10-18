package org.firstinspires.ftc.teamcode;

public class PID {

    int resetTime;
    double P, I, D, tol, tarVal, e, t = 0;

    public PID (){

    }

    public void setup(double P, double I, double D, double tol, double tarVal){

        this.P = P;
        this.I = I;
        this.D = D;
        this.tol = tol;
        this.tarVal = tarVal;
    }

    public double status(double inputValue) {
        e = tarVal - inputValue;
        return (P * e) + (I * t) + D;
     }

    public boolean done() {return Math.abs(e)< tol;}
}