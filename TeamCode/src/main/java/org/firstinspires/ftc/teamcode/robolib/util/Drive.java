package org.firstinspires.ftc.teamcode.robolib.util;

import org.firstinspires.ftc.teamcode.robolib.datatypes.Wheel;

public class Drive {

    // <!> USE MECANUM WHEELS <!> //

    public static double getWheelPower(Wheel wheel, double x, double y, double rx, boolean fieldCentric) {

        /*
        * Set rx to rotation from imu if in field centric mode
        * Otherwise set rx to the turn input from the gamepad
        */

        double frontLeftPower;
        double backLeftPower;
        double frontRightPower;
        double backRightPower;
        double denominator;

        // Rotate the movement direction counter to the bot's rotation
        double rotX = x * Math.cos(-rx) - y * Math.sin(-rx);
        double rotY = x * Math.sin(-rx) + y * Math.cos(-rx);

        rotX = rotX * 1.1;  // Counteract imperfect strafing

        if (fieldCentric) {
            y = rotY;
            x = rotX;
        }

        denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        frontLeftPower = (y + x + rx) / denominator;
        backLeftPower = (y - x + rx) / denominator;
        frontRightPower = (y - x - rx) / denominator;
        backRightPower = (y + x - rx) / denominator;

        switch (wheel) {
        case FR:
            return frontRightPower;
        case FL:
            return frontLeftPower;
        case BR:
            return backRightPower;
        case BL:
            return backLeftPower;
        }

        return 0;
    }

    public static double getFrontLeftPower(double x, double y, double rx, boolean fieldCentric) {
        /*
         * Set rx to rotation from imu if in field centric mode
         * Otherwise set rx to the turn input from the gamepad
         */

        return getWheelPower(Wheel.FL, x, y, rx, fieldCentric);
    }

    public static double getFrontRightPower(double x, double y, double rx, boolean fieldCentric) {
        /*
         * Set rx to rotation from imu if in field centric mode
         * Otherwise set rx to the turn input from the gamepad
         */

        return getWheelPower(Wheel.FR, x, y, rx, fieldCentric);
    }

    public static double getBackLeftPower(double x, double y, double rx, boolean fieldCentric) {
        /*
         * Set rx to rotation from imu if in field centric mode
         * Otherwise set rx to the turn input from the gamepad
         */

        return getWheelPower(Wheel.BL, x, y, rx, fieldCentric);
    }

    public static double getBackRightPower(double x, double y, double rx, boolean fieldCentric) {
        /*
         * Set rx to rotation from imu if in field centric mode
         * Otherwise set rx to the turn input from the gamepad
         */

        return getWheelPower(Wheel.BR, x, y, rx, fieldCentric);
    }
}
