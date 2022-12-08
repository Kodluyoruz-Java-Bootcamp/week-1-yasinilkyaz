package soru2;

public class Main {

    /**
     * Sol.
     * İç içe döngü ile yıldız ve boşluklar ayarlanıp println ile alt satıra geçişi yapılıyor
     * @param j the j
     */
    public static void sol(int j){
        int n=j;
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            for (int k = 0; k < (n - i); k++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /**
     * Sag.
     * İç içe döngü ile yıldız ve boşluklar ayarlanıp println ile alt satıra geçişi yapılıyor
     * @param j the j
     */
    public static void sag(int j){
        int n=j;
        for (int i = 0; i <= n; i++) {

            for (int h = 0; h < (n - i); h++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=5;
        sag(n);
        System.out.println();
        sol(n);



    }
}
