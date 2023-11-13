public class PatternMaker {
    private void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private void jajarGenjang(int panjang, int lebar, int n) {
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < panjang - 1 - i; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < lebar; k++) {
                    System.out.print("* ");
                }
                for (int k = 0; k < 2; k++) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void majorLine() {
        System.out.println("O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O-O");
    }

    public PatternMaker() {
        pyramid(15);
        majorLine();

        jajarGenjang(5, 7, 2);
    }

    public static void main(String[] args) {
        new PatternMaker();
    }
}
