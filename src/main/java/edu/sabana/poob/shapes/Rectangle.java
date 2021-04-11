package edu.sabana.poob.shapes;

public class Rectangle extends  Shape implements GeometricShape2D {
    private double width;
    private double lenght;

    public Rectangle() {
        this.width = 1.0;
        this.lenght = 1.0;

    }
    public Rectangle(String color, double width, double lenght) {
        super(color);
        this.width = width;
        this.lenght = lenght;

    }

    public double getDiagonal() {
        double diagonalAlCuadrado = this.width + this.lenght;
        double diagonal = Math.sqrt(diagonalAlCuadrado);
        return diagonal;
    }


    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        double area = this.width * this.lenght;
        return area;
    }


    @Override
    public double getPerimeter() {
        double perimeter = 2 * (this.width + this.lenght);
        return perimeter;
    }

    @Override
    public double getDiameter() {
        return 0;
    }

    public String toString() {
        return super.toString() + " and width " + this.width + " and lenght " + this.lenght;
    }
    @Override
    public String toStringGeometricShape2D() {
        return super.toString()+"This is a Rectangle";
    }
 }
