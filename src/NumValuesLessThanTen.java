public class NumValuesLessThanTen {

    public static void main(String[] args) {
        int[] testArray = {23, 5, 17, 98, 19, 10, 62, 13, 4, -10, -3, 14, 20};
        int[] border = {10, 20};

        int betweenBordersCounter = countNumbersBetweenBorder(testArray, border);
        System.out.println(betweenBordersCounter + " numbers are between " + border[0] + " and " + border[1] + ".");

    }

    public static int countNumbersBetweenBorder(int[] values, int[] border) {
        int counter = 0;
        for(int value : values){
            if(isBetween(value, border)){
                counter++;
            }
        }
        return counter;
    }

    public static boolean isBetween(int value, int[] border) {
        return (value >= border[0] && value <= border[1]);
    }

}
