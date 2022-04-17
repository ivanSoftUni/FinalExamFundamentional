package FundFinalExam03042022;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" \\| ");
        Map<String, List<String>> dictionary = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split(": ");
            String word = data[0];
            String definition = data[1];
            if (dictionary.containsKey(word)) {
                dictionary.get(word).add(definition);
            } else {
                dictionary.put(word, new ArrayList<>());
                dictionary.get(word).add(definition);
            }
        }
        String[] teacherWords = scanner.nextLine().split(" \\| ");
        String command = scanner.nextLine();
        List<String > storeDefinition = new ArrayList<>();
        switch (command) {
            case "Test":
                for (int i = 0; i < teacherWords.length; i++) {
                    String teacherWord = teacherWords[i];
                    if (dictionary.containsKey(teacherWord)) {
                        System.out.printf("%s:%n", teacherWord);
                        for (Map.Entry<String, List<String>> listEntry : dictionary.entrySet()) {
                            if (listEntry.getKey().equals(teacherWord)){
                                for (int j = 0; j < listEntry.getValue().size(); j++) {
                                    System.out.printf(" -%s%n",listEntry.getValue().get(j));
                                }
                            }
                        }
                    }
                }
                break;
            case "Hand Over":
                dictionary.entrySet().forEach(k -> System.out.printf("%s ", String.join(" ", k.getKey())));

                break;
        }
    }
}
