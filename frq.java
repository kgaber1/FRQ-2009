
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

    /**
     * Constructor for objects of class frq
     */
     private int getChargingCost(int startHour, int chargeTime) {
       int cost = 0;
       int i = 0;
       int hour = startHour;
       while(i < chargeTime) {
           cost += rateTable[hour];
           hour--;
           i++;
       }
       return cost;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getChargeStartingTime(int chargeTime)
    {
        int i = 0;
        int start = 0;
        int cost = getChargingCost(i, chargeTime);
        while (i <= chargeTime) {
        if (getChargingCost(i,chargeTime) < (cost))
        start++;
    }
    return start;
}
}

