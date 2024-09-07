package org.firstinspires.ftc.teamcode.robolib.util;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Motors {

    public static int getRunPos(double inches, DcMotorEx motor) {
        return (int) (motor.getCurrentPosition() + Conversions.inchesToTicks(inches));
    }
}
