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

    public Pyramid(double side1,double side2, double side3,String color, double height) {
        super(color,side1,side2,side3);
        this.height = height;
    }
    public double getPerimeter (){
        return 0;
    }


    @Override
    public double getVolume() {
        double volume = 1/3*getSuperficialArea()*this.height;
        return volume;
    }
    @Override
    public double getSuperficialArea(){
        double aereaBase=height*height;
        double superFicialArea=aereaBase+getArea();
        return superFicialArea;
    }

    @Override
    public String toStringGeometricShape3D(){
        return super.toString()+"This is a Triangle";
    }
}
