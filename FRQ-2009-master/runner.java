
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    
         public static void main(String args[])
     {
       int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 
        220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
        
       BatteryCharger charger = new BatteryCharger(rateTable);
        
       /** To test charging cost
       System.out.println(charger.getChargingCost(2, 5));
       System.out.println(charger.getChargingCost(3, 7));
       System.out.println(charger.getChargingCost(5, 2));
       System.out.println(charger.getChargingCost(10, 11));
       */
       
       System.out.println(charger.getChargeStartTime(12));
       System.out.println(charger.getChargeStartTime(1));
       System.out.println(charger.getChargeStartTime(3)); 
       System.out.println(charger.getChargeStartTime(2));
      }
}
