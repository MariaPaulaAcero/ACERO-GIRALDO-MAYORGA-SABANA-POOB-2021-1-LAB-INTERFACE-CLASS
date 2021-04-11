package edu.sabana.poob.shapes;

public class RectangleSolid extends Rectangle implements GeometricShape3D{
    private double depth;

    public RectangleSolid (){
        this.depth=1.0;
    }
    public RectangleSolid(String color) {
        super(color);
    }
    public RectangleSolid(double width, double lenght,double depth) {
        super(width,lenght);
        this.depth = depth;
    }

    public RectangleSolid(double width, double lenght,String color, double depth) {
        super(color,width,lenght);
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        double volume = this.depth*getLenght()+getLenght();
        return volume;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * (getWidth()+ getLenght());
        return perimeter;
    }

    @Override
    public double getSuperficialArea() {
       // double superficialArea= 2*(getLenght()*this.depth+getLenght()*getWidth()+this.depth*getWidth());
        double superficialArea=getPerimeter()*getWidth();
        return superficialArea;
    }

    @Override
    public String toStringGeometricShape3D() {
        return super.toString()+"This is a Triangle";
    }
}
