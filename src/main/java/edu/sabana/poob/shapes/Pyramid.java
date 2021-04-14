package edu.sabana.poob.shapes;

public class Pyramid extends Triangle implements GeometricShape3D{
    private double height;

    public Pyramid (){
        this.height=1.0;
    }
    public Pyramid(String color) {
        super(color);
    }
    public Pyramid(double side1,double side2, double side3, double height) {
        super(side1,side2,side3);
        this.height = height;
    }

    public Pyramid(double side1,double side2, double side3, double height,String color) {
        super(color,side1,side2,side3);
        this.height = height;
    }
    public double getPerimeter (){
        double perimeter=side1*4;
        return perimeter ;
    }
    public double getArea (){
        double areaBase= side1*side1;
        return areaBase;
    }

    @Override
    public double getVolume() {
        double areaBase= side1*side1;
        double volume = (areaBase*this.height)/3;
        return volume;
    }
    @Override
    public double getSuperficialArea(){
        double areaBase=side1*side1;
        double superAreaLateral=(getPerimeter()*height)/2;
        double areaTotal=areaBase+4*superAreaLateral;
        return areaTotal;
    }

    @Override
    public String toStringGeometricShape3D(){
        return super.toString()+"This is a Triangle";
    }
}
