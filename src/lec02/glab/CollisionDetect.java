package lec02.glab;


import java.awt.*;
import java.util.Scanner;

/**
Given two circles in the 1st quad of a cartesian 2D plane, determine if they are colliding or not.
This belongs in lec02
 */
public class CollisionDetect {

    public static void main(String[] args) {
        Circle cirOne = null;
        Circle cirTwo = null;


        //determine the x delta and y delta
        //determine size of hypotenuse
        //if hypot < (rad1 + rad2)
            //no collision
        //else
            //collision


        Scanner scan = new Scanner(System.in);
        System.out.println("Type the center point coordinates and radius of your first circle separated by commas e.g. 5,12,3.5: ");
        String[] strSplits1 = scan.nextLine().split(",");

        System.out.println("Type the center point coordinates and radius of your second circle separated by commas e.g. 5,12,3.5: ");
        String[] strSplits2 = scan.nextLine().split(",");


        try {
            for (int nC = 0; nC <strSplits1.length ; nC++) {
                cirOne = new Circle(
                        Integer.parseInt(strSplits1[0]),
                        Integer.parseInt(strSplits1[1]),
                        Double.parseDouble(strSplits1[2])
                );
            }

            for (int nC = 0; nC <strSplits2.length ; nC++) {
                cirTwo = new Circle(
                        Integer.parseInt(strSplits2[0]),
                        Integer.parseInt(strSplits2[1]),
                        Double.parseDouble(strSplits2[2])
                );
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input " + e.getMessage());
            return;
        }


        double dDeltaX = Math.abs(cirOne.getCenter().getX() -  cirTwo.getCenter().getX() );
        double dDeltaY = Math.abs(cirOne.getCenter().getX() -  cirTwo.getCenter().getX() );
        double dHypot = Math.sqrt((dDeltaX * dDeltaX ) + (dDeltaY * dDeltaY));
        if (dHypot < cirOne.getRad() + cirTwo.getRad()){
            System.out.println("No collision");
        } else {
            System.out.println("Collision");
        }
    }


    private static class Circle {
        private Point mCenter;
        private double mRad;

        private Circle(Point center, double rad) {
            mCenter = center;
            mRad = rad;
        }

        private Circle(int nX, int nY, double rad) {
            mCenter = new Point(nX, nY);
            mRad = rad;
        }

        private Point getCenter() {
            return mCenter;
        }

        private void setCenter(Point center) {
            mCenter = center;
        }

        private double getRad() {
            return mRad;
        }

        private void setRad(double rad) {
            mRad = rad;
        }
    }

}
