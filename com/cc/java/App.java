package com.cc.java;

import java.io.PrintStream;

import org.w3c.dom.css.Rect;

public class App {
    
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0, 10.0);

        output("------ Flächen ------"); 
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());

        output("------  Differenzen ------");
        output("Diff. Rechteck-Dreieck: " + areaDiff(rectangle, triangle));
        output("Diff. Rechteck-Kreis: " + areaDiff(rectangle, circle));
        output("Diff. Kreis-Rechteck: " + areaDiff(circle, rectangle));
        output("Diff. Kreis-Dreieck: " + areaDiff(circle, triangle));
        output("Diff. Dreieck-Dreieck: " + areaDiff(triangle, triangle));


    }

    public static void output(String outputStr){
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.out.println(outputStr);
    }

    /* 1. Iteration : ggf. 1000x überladen */ 
    // private static double areaDiff(Rectangle r, Triangle t){
    //     return r.area() - t.area();
    // }
    // private static double areaDiff(Rectangle r, Circle c){
    //     return r.area() - c.area();
    // }

    /* 2. Iteration: Polymorphie - besser! */  
    private static double areaDiff(Shape s1, Shape s2){
        return s1.area() - s2.area();
    }


}

