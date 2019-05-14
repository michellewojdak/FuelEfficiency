/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import javax.swing.JOptionPane;

/**
 *
 * @author michellewojdak
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle vehicles[] = new Vehicle[4];
        vehicles[0] = new Car();
        vehicles[1] = new Truck();
        vehicles[2] = new HybridCar();
        vehicles[3] = new Motercycle();
        
        String l;
        l = JOptionPane.showInputDialog("How many litres of gas do you have?");
        double litres = Double.parseDouble(l);
        System.out.println("On " + litres + "L of gas the vehicle can drive:");
        
        //Get all 4 vehicle distances
        for (int i = 0; i < 4; i++) {
            vehicles[i].getDistance(litres);
        }
    }
}

    

