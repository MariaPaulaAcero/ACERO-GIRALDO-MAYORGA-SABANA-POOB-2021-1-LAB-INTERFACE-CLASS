package edu.sabana.poob.shapes;

public class Cube extends RectangleSolid{
    private double side1;


    public Cube() {
        side1 =1.0;
    }
    public Cube (String color){
        super(color);
    }
    public Cube (double side1){
        this.side1= side1;
    }
    public Cube (String color,double side1){
        super(color);
        this.side1=side1;
    }

    public double getArea (){ ;
        double area= side1*side1;
        return  area;
    }

    public double getDiagonal(){
        double side1 = super.getWidth();
        double diagonal=Math.sqrt(2)*side1;
        return diagonal;
    }
    @Override
    public double getVolume() {
        double volume =side1*side1*side1;
        return volume;
    }
    @Override
    public double getPerimeter() {
        double perimeter = side1*12;
        return perimeter;
    }

    @Override
    public double getSuperficialArea() {
        // double superficialArea= 2*(getLenght()*this.depth+getLenght()*getWidth()+this.depth*getWidth());
        double superficialArea=side1*6;
        return superficialArea;
    }

//NO PUSE EL TOSTRING

}
