import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){

        // EBOB ve EKOK bulma (while döngüsü ile)

        int n1, n2;
        int ebob = 1, ekok;
        Scanner inp = new Scanner(System.in);

        System.out.print("Brinici sayiyi giriniz : ");
        n1 = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        n2 = inp.nextInt();
        if (n1 <= n2){
            int i = n1;
            while (i <= n1) {
                if (n1%i==0 && n2%i==0){
                    ebob = i;
                    break;
                }
                i--;
            }
            ekok = (n1 * n2) / ebob;
            System.out.println("(EBOB,EKOK) : " + "(" + ebob + "," + ekok + ")");
        } else {
            int j = n2;
            while (j <= n2) {
                if (n1%j==0 && n2%j==0){
                    ebob = j;
                    break;
                }
                j--;
            }
            ekok = (n1 * n2) / ebob;
            System.out.println("(EBOB,EKOK) : " + "(" + ebob + "," + ekok + ")");
        }

    }
}
