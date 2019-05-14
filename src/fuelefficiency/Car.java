package fuelefficiency;
/**
 *
 * @author michellewojdak
 */
public class Car extends Vehicle{
    public Car() {
    //Call Vehicle constructor
    super();
  }

    //override the Vehicle getDistance method
    /**
     * 
     * @param l
     * @return distance in km car can travel
     */
    public double getDistance(double l){
        double distance = l * 100 /9.4;
        System.out.println("Car = " + distance);
        return distance;
    }
}
