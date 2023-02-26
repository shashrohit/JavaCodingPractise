package org.shashank.problems.misc;

public class MinuteHourHandsAngel {

    public static int findAngle(int hr, int min){

        int minAngle, hrAngle, anglesBetween;

        if(min == 60){
            hr += 1;
            min = 0;
        }

        if(hr > 12){
            hr = hr -12;
        }
        if(hr == 12){
            hr = 0;
        }

        minAngle = min * 6;
        hrAngle = (hr*60 + min)/2;
        anglesBetween = Math.abs(minAngle-hrAngle);
        return Math.min(anglesBetween, 360-anglesBetween);
    }

    public static void main(String[] args) {
        System.out.println(MinuteHourHandsAngel.findAngle(14, 45));
    }
}
