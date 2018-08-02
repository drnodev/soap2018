package soap;


public class App 
{
    public static void main( String[] args )
    {
        ShapeService shapeService =  new ShapeServiceService().getShapeServicePort();
        System.out.println(shapeService.helloWord());
    }
}

