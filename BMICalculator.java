package be.vdab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class BMICalculator {

    // main method
    public static void main(String[] args) {
        int gewicht = geefGewicht();
        int lengte = geefLengte();
        double bmi = bmi(gewicht, lengte);
        evaluatie(bmi);
    }

    // method om gewicht in te geven en te controleren
    public static int geefGewicht()  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gewicht in kg?");
        int gewicht = scan.nextInt();
        while (gewicht < 0 || gewicht > 300) {
            System.out.println("Foutieve waarde!");
            System.out.println("Gewicht in kg?");
            gewicht = scan.nextInt();
        }
        return gewicht;
    }

    // method om lengte in te geven en te controleren
    public static int geefLengte() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lengte in cm?");
        int lengte = scan.nextInt();
        while (lengte < 0 || lengte > 250) {
            System.out.println("Foutieve waarde!");
            System.out.println("Lengte in cm?");
            lengte = scan.nextInt();
        }
        return lengte;
    }



    // method om bmi te berekenen
    public static double bmi(double gewicht, double lengte) {
        double bmi = 10000*gewicht/(lengte * lengte);
        System.out.printf("Jouw bmi is %.2f", bmi);
        return bmi;
    }

    // method om bmi te evalueren
    public static void evaluatie(double bmi)    {
        if (bmi<18) System.out.println("\nJe hebt ondergewicht");
        else if (bmi>=18 && bmi <25) System.out.println("\nJe hebt een gezond normaal gewicht");
        else if (bmi>=25 && bmi <30) System.out.println("\nJe hebt overgewicht");
        else System.out.println("\nJe hebt obesitas");
    }
}

/*
gegevenstype invoer controleren? bv. String ipv double, komma ipv punt
*/