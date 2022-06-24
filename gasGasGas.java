public class gasGasGas{
    /*
     * TO DO
     * 
     * log functions (as in log CPG, cause users will just see it)
     * log CPG (users can write down price at the nearest gas station)
     * log MPG (users can google, calculate or search MPG (csv)
     * 
     */

    public static double calcCPG(double fuel_bill, double gals_filled){
        double CPG = fuel_bill/gals_filled;
        return CPG;
    }

    public static double calcCPM(double MPG, double CPG){
        // had to do some quick dimensional analysis..
        double CPM = CPG / MPG; // cost per mile (aka $0.27/mile)
        return CPM;

    }

    public static double calcTripCost(double CPM, double tripInMiles){
        double tripCost = CPM * tripInMiles;
        tripCost = Math.round(tripCost * 100.0)/100.0; 
        //rounding to the nearest two decimals
        return tripCost;
    }

    public static void main(String args[]){
        System.out.println("M: Can you drive me home?");
        double testCPG = calcCPG(80.0, 15.0);
        double testCPM = calcCPM(20, testCPG);
        double testTripCost = calcTripCost(testCPM, 10.0);

        System.out.println("A: Aight but you owe me $" + testTripCost);

        //System.out.println(test);
    }
}