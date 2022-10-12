import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String kalimat = input.nextLine();
            int upper = 0, lower = 0, number = 0, special = 0;

            for (int i = 0; i < kalimat.length(); i++) {
                char karakter = kalimat.charAt(i);
                if (karakter >= 'A' && karakter <= 'Z')
                    upper++;
                else if (karakter >= 'a' && karakter <= 'z')
                    lower++;
                else if (karakter >= '0' && karakter <= '9')
                    number++;
                else
                    special++;
            }

            System.out.println("Lower case : " + lower);
            System.out.println("Upper case : " + upper);
            System.out.println("Angka : " + number);
            System.out.println("Simbol : " + special);
        }
    }
