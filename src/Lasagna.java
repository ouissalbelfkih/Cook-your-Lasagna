public class Lasagna {
    private static final int EXPECTED_OVEN_TIME = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME;
    }
    public int remainingMinutesInOven(int minutesInOven) {
        return EXPECTED_OVEN_TIME - minutesInOven;
    }
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * PREPARATION_TIME_PER_LAYER;
    }
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayers);
        return preparationTime + minutesInOven;
    }
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        int expectedOvenTime = lasagna.expectedMinutesInOven();
        System.out.println("Expected oven time: " + expectedOvenTime + " minutes");
        int remainingTime = lasagna.remainingMinutesInOven(30);
        System.out.println("Remaining oven time: " + remainingTime + " minutes");
        int preparationTime = lasagna.preparationTimeInMinutes(2);
        System.out.println("Preparation time: " + preparationTime + " minutes");
        int totalTime = lasagna.totalTimeInMinutes(3, 20);
        System.out.println("Total working time: " + totalTime + " minutes");
    }
}