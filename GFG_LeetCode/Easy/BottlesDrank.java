package GFG.Easy;


class BottlesDrank {
    public int numWaterBottles(int numBottles, int numExchange) {
        int fullBottles = 0,emptyBottles = 0, bottlesDrank = 0;
        bottlesDrank=numBottles;
        emptyBottles = bottlesDrank;
        while(fullBottles<=0){
            bottlesDrank += emptyBottles/numExchange;
            fullBottles -=bottlesDrank;
            emptyBottles += emptyBottles% numExchange;
            if(emptyBottles >= numExchange){
                fullBottles += emptyBottles/numExchange;
            }
        }
        return bottlesDrank;
    }

    public static void main(String[] args) {
        System.out.println(new BottlesDrank().numWaterBottles(9,3));
    }
}
