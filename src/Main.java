import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kyrgyzstan[] kyrgyzstan= {
             Kyrgyzstan.BATKEN,
             Kyrgyzstan.OSH,
             Kyrgyzstan.CHUI,
             Kyrgyzstan.NARYN,
             Kyrgyzstan.TALAS,
             Kyrgyzstan.YSSYK_KOL,
             Kyrgyzstan.JALAL_ABAT
        };
        for (Kyrgyzstan kyrgyz:kyrgyzstan) {
            System.out.println(kyrgyz.getOzgocho());
        }


        }

    }
