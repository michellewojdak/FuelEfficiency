package fuelefficiency;
/**
 *
 * @author michellewojdak
 */
public class HybridCar extends Vehicle{
    public HybridCar() {
    //Call Vehicle constructor
    super();
  }
    //override the Vehicle getDistance method
    /**
     * 
     * @param l
     * @return distance in km hybrid car can travel
     */
    public double getDistance(double l){
        double distance = l * 100 /3.8;
        System.out.println("Hybrid Car = " + distance);
        return distance;
    }
}