
/**
 * Contains 2 methods(getChargingCost) and (getChargeStartTime)
 * to determine the best time to charge your electric vehicle.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryCharger
{
    /**
     * rateTable has 24 entries representing the charging costs for hours 0 through 23.
     */
      private int[] rateTable;
      
     /** constructs a new battery charger object
      * 
      */
     public BatteryCharger(int[] table){
        this.rateTable = table;
     }
    
     /**
      * @param startHour the hour at which the harge period begins.
      * @param chargeTime - the number of hours the battery needs to be charged.
      * @Return the total cost to charge the battery 
      */ 
     private int getChargingCost(int startHour, int chargeTime)
     { 
         int time = 0;
         int cost = 0;
         
         for (int i = startHour; i < (startHour + chargeTime); i++) {
             time = i;
             while (time > 23) time -= 24;
             cost += rateTable[time];
         }
         
         return cost;
     }
     
    /** Determines start time to charge the battery at the lowest cost for the given charge time.
     * @param chargeTime the number of hours the battery needs to be charged
     * Precondition: chargeTime > 0
     * @return an optimal start time, with 0 ≤ returned value ≤ 23
     */
    
     public int getChargeStartTime(int chargeTime)
     { 
        int lowestCost = Integer.MAX_VALUE;
        int startCost = 0;
        
        for (int i = 0; i < rateTable.length; i++) {
            if (getChargingCost(i, chargeTime) < lowestCost) {
                lowestCost = getChargingCost(i, chargeTime);
                startCost = i;
            }
        }
        
        return startCost;
     }
} 


