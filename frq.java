
/**
 * Write a description of class frq here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class frq
{
    /**
     * rateTable has 24 entries representing the chargin costs for hours 0 through 23.
     */
    private int[] rateTable = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 
        220, 220, 200, 200, 180, 180, 140, 100, 80, 60};

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


