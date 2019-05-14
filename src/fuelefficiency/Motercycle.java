package fuelefficiency;
/**
 *
 * @author michellewojdak
 */
public class Motercycle extends Vehicle{
    public Motercycle() {
    //Call Vehicle constructor
    super();
  }
    //override the Vehicle getDistance method
    /**
     * 
     * @param l
     * @return distance in km motorcycle can travel
     */
    public double getDistance(double l){
        double distance = l * 100 /6.3;
        System.out.println("Motorcycle = " + distance);
        return distance;
    }
}
