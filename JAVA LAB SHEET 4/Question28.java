class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();

        int wordCount;

        if (text.isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = text.split("\\s+").length;
        }

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        w.countWords("Java is an object oriented language");
    }
}