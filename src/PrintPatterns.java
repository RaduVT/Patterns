public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(7);
        System.out.println();
        printPatternB(7);
        System.out.println();
        printPatternC(7);
        System.out.println();
        printPatternD(7);
        System.out.println();
        printPatternE(7);
        System.out.println();
        printPatternF(7);
        System.out.println();
        printPatternG(7);
        System.out.println();
        printPatternH(7);
        System.out.println();
        printPatternI(7);
        System.out.println();
        printPatternJ(7);
        System.out.println();
        printPatternK(7);
        System.out.println();
        printPatternL(7);
        System.out.println();
        printPatternM(7);
        System.out.println();
        printPatternN(7);
        System.out.println();
        printPatternO(7);
        System.out.println();
        printPatternP(7);
        System.out.println();
        printPatternQ(7);
        System.out.println();
        printPatternR(7);
        System.out.println();
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
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

    private static void printPatternE(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternF(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternG(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternH(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1 || col == row) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternI(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1 || col == row || col == 1 || col == size) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternJ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = size - 1; col >= row; col--) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternK(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            for (int rowi = size; rowi <= size; rowi++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternL(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#  ");
            }
            for (int rowi = size; rowi <= size; rowi++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print("#  ");
                }
            }

            System.out.println();
        }
        for (int rowi = 1; rowi <= size; rowi++) {
            for (int diff = 2; diff <= rowi + 1; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col > rowi + 1; col--) {
                System.out.print("#  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = size - 1; col >= rowi; col--) {
                    System.out.print("#  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternM(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternN(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
               int num = (size - col) + 1;
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternO(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print((row - col) + 1 + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternP(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= row; col--) {
                System.out.print((col - row) + 1 + "  ");
            }
            System.out.println();
        }
    }

    private static void printPatternQ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = size - 1; diff >= row; diff--) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + "  ");
            }
            for (int rowi = size; rowi <= size; rowi++) {
                for (int col = 2; col <= row; col++) {
                    System.out.print((row - col) + 1 + "  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPatternR(int size) {
        for (int row = 1; row <= size; row++) {
            for (int diff = 2; diff <= row; diff++) {
                System.out.print("   ");
            }
            for (int col = size; col >= row; col--) {
                int num = (size - col) + 1;
                System.out.print(num + "  ");
            }
            for (int i = size; i <= size; i++) {
                for (int col = size - 1; col >= row; col--) {
                    System.out.print((col - row) + 1 + "  ");
                }
            }
            System.out.println();
        }
    }

}
