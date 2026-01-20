package practice_homework9.task9;

public class WordCounter {
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }
}
