package org.example.flashcard;

import java.util.Map;

public class CardStats {
    public static void printStats(Map<Card, Boolean> history) {
        long correctCount = history.values().stream().filter(Boolean::booleanValue).count();
        long totalCount = history.size();
        System.out.println("Correct Answers: " + correctCount + "/" + totalCount);
    }
}
