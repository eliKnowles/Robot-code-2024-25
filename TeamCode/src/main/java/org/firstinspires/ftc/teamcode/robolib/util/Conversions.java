package org.firstinspires.ftc.teamcode.robolib.util;

import static org.firstinspires.ftc.teamcode.robolib.Constants.*;

public class Conversions {

    public static double ticksToInches(double ticks) {
        return WHEEL_RADIUS * GEAR_RATIO * PI * 2 * ticks / TICKS_PER_REVOLUTION;
    }

    public static double inchesToTicks(double inches) {
        return inches / (WHEEL_RADIUS * GEAR_RATIO * PI * 2) * TICKS_PER_REVOLUTION;
    }

    public static double ticksToCM(double ticks) {
        return ticksToInches(ticks) * 2.54;
    }

    public static double cmToTicks(double cm) {
        return inchesToTicks(cm / 2.54);
    }

    public static double velocityToRPM(double velocity) {
        return velocity / (GEAR_RATIO * 2 * Math.PI * WHEEL_RADIUS / 60.0);
    }

    public static double rpmToVelocity(double rpm) {
        return rpm * GEAR_RATIO * 2 * Math.PI * WHEEL_RADIUS / 60.0;
    }

    public static double directionToServoPosition(double direction) {
        return (direction + 180) / 360;
    }

    public static double servoPositionToDirection(double servoPosition) {
        return (servoPosition * 360) - 180;
    }

    public static double sinDegrees(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double cosDegrees(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double tanDegrees(double degrees) {
        return Math.tan(Math.toRadians(degrees));
    }

    public static double asinDegrees(double value) {
        return Math.toDegrees(Math.asin(value));
    }

    public static double acosDegrees(double value) {
        return Math.toDegrees(Math.acos(value));
    }

    public static double atanDegrees(double value) {
        return Math.toDegrees(Math.atan(value));
    }

    public static double atan2Degrees(double y, double x) {
        return Math.toDegrees(Math.atan2(y, x));
    }
}
