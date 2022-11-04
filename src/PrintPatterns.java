public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(8);
        System.out.println();
        printPatternB(8);
        System.out.println();
        printPatternC(8);
    }

    private static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }


    private static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternC(int size) {
        for (int row = size; row >= 1; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}
