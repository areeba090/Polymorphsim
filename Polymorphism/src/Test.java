public class Test {
    public static void main(String[] args) {
        Gobj[] g=new Gobj[3];
        g[0]=new Gobj("pink");
        g[1]=new Circle("red",4.5);
        g[2]=new Square("brown",5);
        for (int i=0;i<g.length;i++)
        {

            System.out.println(""+g[i].toString());

            if (g[i] instanceof Circle)
            {
                Circle c1 =(Circle) g[i];
                System.out.println("circumference"+c1.getcircum());
            }
        }


    }
}
