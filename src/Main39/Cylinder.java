package Main39;
class Cylinder{
    double lenght;
    double radius;

    Cylinder() {

    }

    Cylinder(double lenght, double radius) {
        this.lenght = lenght;
        this.radius = radius;
    }

    public void getArea() {
        double area = this.lenght * this.radius*this.radius * Math.PI;
        System.out.println("Area of cylindr is: "+ area);
    }

    public void setLength(double lenght){
        this.lenght = lenght;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getLength() {
        return this.lenght;
    }

    public double getRadius() {
        return this.radius;
    }
}