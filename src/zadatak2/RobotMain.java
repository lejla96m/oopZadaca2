package zadatak2;

import java.util.Arrays;

public class RobotMain {
    public static void main (String [] args) {

        Robot robot = new Robot(1, 1);

        robot.moveEast();
        robot.moveEast();
        robot.moveNorth();

        System.out.println(Arrays.toString(robot.getPosition()));

        System.out.println(robot.getMoves());

        robot.moveWest();

        robot.printLastPosition();

        System.out.println(robot.getDistance());

    }
}
