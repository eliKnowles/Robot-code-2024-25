package org.firstinspires.ftc.teamcode.robolib.util;

import static org.firstinspires.ftc.teamcode.robolib.util.Conversions.directionToServoPosition;

import com.qualcomm.robotcore.hardware.Servo;

public class Servos {

    double getServoPosition(Servo servo, double degrees) {
        return servo.getPosition() + directionToServoPosition(degrees);
    }
}
