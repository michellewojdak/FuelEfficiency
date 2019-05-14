package fuelefficiency;
/**
 *
 * @author michellewojdak
 */
public class Truck extends Vehicle{
    public Truck() {
    //Call Vehicle constructor
    super();
  }
    //override the Vehicle getDistance method
    /**
    * 
    * @param l
    * @return distance in Km truck can drive
    */
    public double getDistance(double l){
        double distance = l * 100 /14.1;
        System.out.println("Trcuk = " + distance);
        return distance;
    }   
}