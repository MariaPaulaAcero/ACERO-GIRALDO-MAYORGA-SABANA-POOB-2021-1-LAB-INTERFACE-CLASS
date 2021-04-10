package edu.sabana.poob.shapes;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;


    public Cylinder() {
        super();
        this.height =1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        double volume= PI*radius*radius*height;
        return  volume;
    }
    @Override
    public double getPerimeter () {
        double perimeter = 2 * PI * radius;
        return perimeter;
    }
    @Override
    public double getSuperficialArea() {
        double area= 2*PI*radius*height+2*PI*radius*radius;
        System.out.println(area);
        return  area;
    }

    @Override
    public String toStringGeometricShape2D() {
        return super.toString()+"This is a Cylinder";

    }
    @Override
    public String toStringGeometricShape3D() {
        return super.toString()+"This is a Cylinder";

    }
}
