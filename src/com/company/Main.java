package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle bestCircle = new Circle(234.67);
        System.out.println(bestCircle.circumference());

        Circle worstCircle = new Circle(15);
        double combined = worstCircle.area() + bestCircle.area();
        double sdf = worstCircle.radius;
        worstCircle.setRadius(930457834.98);
        Circle justACircle = new Circle();
        //Circle justACircle = new Circle(1);

    }
}
