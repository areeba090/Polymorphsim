public class Circle extends Gobj {
    private double radius;
    public Circle(String color,double radius )
    {
        super(color);
        this.radius=radius;

    }
    public  double getarea()
    {
        return  Math.PI*radius*radius;
    }
    public String toString()
    {
        return "Radius   "+radius+"  "+super.toString()+"   Area of circle  "+getarea();
    }
    public double getcircum()
    {
        return radius*radius;
    }
}
