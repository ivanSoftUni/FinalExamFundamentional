package FundFinalExam03042022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String regex = "(@+|#+)+(?<color>[a-z]{3,})(@+|#+)+[^\\w\\d]*?\\/+[0]?(?<amount>[0-9]+)\\/+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String color = matcher.group("color");
            String amountSt = matcher.group("amount");
            int amount = Integer.parseInt(amountSt);
            if (amount >0) {
                System.out.printf("You found %d %s eggs!%n", amount, color);
            }
        }
    }
}
