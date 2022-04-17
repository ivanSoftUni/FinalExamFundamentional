package FundFinalExam03042022;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String commandParts = scanner.nextLine();
        while (!commandParts.equals("End")) {
            String[] data = commandParts.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Translate":
                    String charToRemove = data[1];
                    String replacement = data[2];
                    line = line.replaceAll(charToRemove, replacement);
                    System.out.println(line);
                    break;
                case "Includes":
                    String substring = data[1];
                    if (line.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    int indexOf = line.indexOf(data[1]);
                    if (indexOf == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    line = line.toLowerCase(Locale.ROOT);
                    System.out.println(line);
                    break;
                case "FindIndex":
                    String findChar = data[1];
                    int lastIndexOf = line.lastIndexOf(findChar);
                    System.out.println(lastIndexOf);
                    break;
                case "Remove":
                    StringBuilder sb = new StringBuilder(line);
                    int startIndex = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);
                    sb.delete(startIndex, startIndex + count);
                    line = sb.toString();
                    System.out.println(line);
                    break;
            }
            commandParts = scanner.nextLine();
        }
    }
}
