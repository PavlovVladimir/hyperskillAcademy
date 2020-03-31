package com.hyperskilldev.absractclasses;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        double result = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(result);
    }
}

class Rectangle extends Shape {
    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.println("CIRCLE:");
        System.out.println(area);
        System.out.println(perimeter);

        Rectangle rectangle = new Rectangle(5,10);
        area = rectangle.getArea();
        perimeter = rectangle.getPerimeter();
        System.out.println("RECTANGLE:");
        System.out.println(area);
        System.out.println(perimeter);

        Triangle triangle = new Triangle(3,4,5);
        area = triangle.getArea();
        perimeter = triangle.getPerimeter();
        System.out.println("TRIANGLE:");
        System.out.println(area);
        System.out.println(perimeter);
    }
}