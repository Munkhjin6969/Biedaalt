package org.example.flashcard;

import java.util.*;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<Card> organize(List<Card> cards, Map<Card, Boolean> history) {
        List<Card> mistakes = new ArrayList<>();
        List<Card> corrects = new ArrayList<>();
        for (Card card : cards) {
            if (Boolean.FALSE.equals(history.get(card))) {
                mistakes.add(card);
            } else {
                corrects.add(card);
            }
        }
        List<Card> result = new ArrayList<>();
        result.addAll(mistakes);
        result.addAll(corrects);
        return result;
    }
}
