package VisualApp.Manipulator.Elements;

public class Hinge extends Element{
    private double angle;

    public Hinge(double angle, int connection) {
        super(connection);
        if(angle < -359 || angle > 359) {
            try {
                throw new Exception("Angle is out of range [-359,359]!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.angle = convertAngleToRad(angle);
    }

    public double getAngle() {
        return angle;
    }

    private double convertAngleToRad(double angle) {
        return angle * Math.PI / 180.0;
    }
}
