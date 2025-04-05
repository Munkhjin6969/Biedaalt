package org.example.flashcard;

import java.util.List;
import java.util.Map;
import javax.smartcardio.Card;

public interface CardOrganizer {
    List<Card> organize(List<Card> cards, Map<Card, Boolean> history);
}
