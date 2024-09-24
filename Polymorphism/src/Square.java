public class Square extends Gobj {
    private int length;
    public Square(String color,int length )
    {
        super(color);
        this.length=length;

    }
    public  int getarea()
    {
        return length*length;
    }
    public String toString()
    {
        return "length   "+length+"    "+super.toString()+"   Area of square  "+getarea();
    }
}

