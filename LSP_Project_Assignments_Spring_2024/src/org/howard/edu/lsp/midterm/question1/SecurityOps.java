package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

    public static String encrypt(String text) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();
        // Remove all non-alphanumeric characters (including spaces and punctuation)
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < cleanedText.length(); i++) {
            if (i % 2 == 0) {
                evenChars.append(cleanedText.charAt(i));
            } else {
                oddChars.append(cleanedText.charAt(i));
            }
        }

        return evenChars.toString() + oddChars.toString();
    }

    public static void main(String[] args) {
        String result = encrypt("I love CSCI363");
        System.out.println(result);
    }
}
