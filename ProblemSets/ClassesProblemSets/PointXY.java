
// Begin the definition of the Point class. This class allows us to store 2 ints (x and y location) in a single
// variable of type Point
public class PointXY{


    // Instance variables are declared inside the class definition and outside any methods
    // Private variables cannot be access from outside the class
    private double x;
    private double y;


    // The default constructor creates a point on the origin
    public PointXY(){
        this.x = 0;
        this.y = 0;
    }


    // A constructor that sets the initial position of the point
    public PointXY(double x, double y){
        this.x = x;
        this.y = y;
    }


    // public getter, or accessor, methods to allow access the private instance variables from other classes/objects
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }


    // public setter, or mutator, methods to allow other classes/objects to change the private instance variables
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }


    // Define how an object of this type is printed (We will cover Overrides on Friday)
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }


} // End the definition of the Point class
