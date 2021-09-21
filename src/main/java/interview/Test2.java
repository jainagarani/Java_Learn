package interview;

public class Test2 {

    public void minimumCostToTravel(int[] arr, int costOfDailyPass, int costOf7DayPass, int costOfMonthlyPass){
        int totalCostDaily = totalCostByDailyPass(arr.length, costOfDailyPass);
         totalCostOf7DayPass(arr, costOf7DayPass, costOfMonthlyPass);





    }

    public int totalCostByDailyPass(int length, int costOfDailyPass ){
        return length * costOfDailyPass;
    }

    public void totalCostOf7DayPass(int[] arr, int costOf7DayPass, int costOfMonthlyPass){
        int maxDiff = 7;
        int count = 0;
        int passesNeeded = 1;
        for(int i =0 ; i< arr.length-1; i++){
            if(arr[i+1] - arr[i] <= maxDiff & count <7){
                count = count+1;
            } if(count == 7){
                count = 0;
                passesNeeded = passesNeeded+1;
            }
            if(maxDiff >7){
                count = 0;
                passesNeeded = passesNeeded+1;
            }
        }

        int totalCostOf7Day = passesNeeded * costOf7DayPass;
        if(totalCostOf7Day > costOfMonthlyPass){
            System.out.println("Go for monthly pass");
        }else {
           // passesNeeded * costOf7DayPass;
        }
    }

    public int remainingDays(int length, int i){
        return length -(i+1);
    }

    public boolean canBuy7DayPass(int[] arr, int i) {
        boolean result= false;
        int maxDiff = 7;
        for(  ; i< arr.length-1; i++) {
            if (arr[i + 1] - arr[i] <= maxDiff) {

            }
        }
        return result;

    }






    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,29};
        int costOfDailyPass = 2;
        int costOf7DayPass = 7;
        int costOfMonthlyPass = 24;

    }
}
