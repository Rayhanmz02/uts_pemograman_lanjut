import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int[] angka = angkarandom();
        boolean hasil = resetangka(angka);
        System.out.println("HASIL :  " + hasil);
    }

    public static int[] angkarandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tolong input 20 angka:");
        int[] angka1 = new int[20];
        for (int i = 0; i < 20; i++) {
            angka1[i] = scanner.nextInt();
        }
        return angka1;
    }

    public static boolean resetangka(int[] angka1) {
        for (int i = 0; i < angka1.length; i++) {
            for (int j = i + 1; j < angka1.length; j++) {
                if (angka1[i] == angka1[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}