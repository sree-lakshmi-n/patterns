public class Main {
    void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        n = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int colNum = i <= (n / 2) + 1 ? i : n - i + 1;
            for (int j = 1; j <= colNum; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//     void pattern5(int n) {
//        n = 2 * n - 1;
//        for (int i = 1; i <= n; i++) {
//            if (i <= (n / 2) + 1) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int j = 1; j <= n - i + 1; j++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }

//    Another method - Substituting n with 2n-1
//     void pattern5(int n) {
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            if (i <= n + 1 / 2) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int j = 1; j <= 2 * n - i; j++) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//    }

    void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                String pattern = j <= n - i ? "  " : "* ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                String pattern = j <= i - 1 ? "  " : "* ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                String pattern = (j > (n - i) && j <= (n - 1 + i)) ? "*" : " ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                String pattern = (j > (i - 1) && j <= (2 * n - i)) ? "*" : " ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                String pattern = (j > (n - i) && j <= (n - 1 + i)) ? "* " : "  ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                String pattern = (j > (i - 1) && j <= (2 * n - i)) ? "* " : "  ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    void pattern12Variation(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                String pattern = (i <= n && (j > i - 1 && j <= 2 * n - i)) || (i > n && (j > 2 * n - 1 - i && j <= i)) ? "* " : "  ";
                System.out.print(pattern);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("--------------------");
        System.out.println("Pattern 1");
        m.pattern1(5);
        System.out.println("--------------------");
        System.out.println("Pattern 2");
        m.pattern2(5);
        System.out.println("--------------------");
        System.out.println("Pattern 3");
        m.pattern3(5);
        System.out.println("--------------------");
        System.out.println("Pattern 4");
        m.pattern4(5);
        System.out.println("--------------------");
        System.out.println("Pattern 5");
        m.pattern5(5);
        System.out.println("--------------------");
        System.out.println("Pattern 6");
        m.pattern6(5);
        System.out.println("--------------------");
        System.out.println("Pattern 7");
        m.pattern7(5);
        System.out.println("--------------------");
        System.out.println("Pattern 8");
        m.pattern8(5);
        System.out.println("--------------------");
        System.out.println("Pattern 9");
        m.pattern9(5);
        System.out.println("--------------------");
        System.out.println("Pattern 10");
        m.pattern10(5);
        System.out.println("--------------------");
        System.out.println("Pattern 11");
        m.pattern11(5);
        System.out.println("--------------------");
        System.out.println("Pattern 12 Variation");
        m.pattern12Variation(5);
        System.out.println("--------------------");
    }
}
