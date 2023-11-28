public class two_dimensional_array {
    public static void main(String[] args) {
        /*2d array (matrix??)
            ex: 1  2  3
                4  5  6
            3x2 matrix
            array form: [ [1,4], [2,5], [3,6] ]

            Process: Create method to calculate lowest and highest
                values of the matrix, multiply them, and return the
                value. Test on main method.
         */

        int[][] arrayOne = { {2,1}, {1,2}, {3,4}, {5,6} };
        int[][] arrayTwo = { {4,5,6}, {4,5,6}, {4,5,6}, {4,5,6} };

        System.out.printf("arrayOne: %d%n%n", calculate(arrayOne));
        System.out.printf("arrayOne: %d%n%n", calculate(arrayTwo));

    }

    public static int calculate(int[][] array) {
        int highest = array[0][0];
        int lowest = array[0][0];

        for (int[] ints : array) {
//            System.out.println("Pass");
            for (int anInt : ints) {
//                System.out.printf("%d >? %d%n", ints[j], highest);
                if (anInt > highest) {
                    highest = anInt;
                }

                if (anInt < lowest) {
                    lowest = anInt;
                }
            }
        }
        System.out.printf("Highest: %d.   |   Lowest: %d.%n" +
                "Together: %d%n", highest, lowest, highest*lowest);
        return highest*lowest;
    }
}
