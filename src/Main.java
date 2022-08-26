import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kyrgyzstan kyrgyzstan= Kyrgyzstan.valueOf(scanner.nextLine());
        switch (kyrgyzstan){
            case OSH :
                System.out.println("Sulaiman TOO");
                break;
            case BATKEN:
                System.out.println("Aigul gul");
                break;
            case JALAL_ABAT:
                System.out.println("ArlanBab,Sary-Chelek");
                break;
            case NARYN:
                System.out.println("Naryn dariasy");
                break;
            case YSSYK_KOL:
                System.out.println("Yssyk-Kol");
                break;
            case CHUI:
                System.out.println("Bishkek");
                break;
            case TALAS:
                System.out.println("Manas");
                break;
        }

    }
}