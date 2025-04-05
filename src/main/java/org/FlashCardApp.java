package org.example.flashcard;

public class FlashCardApp {
    private List<Card> cards;
    private final CardOrganizer organizer;

    public FlashCardApp(CardOrganizer organizer) {
        this.organizer = organizer;
    }

    public void loadCards(String filePath) throws IOException {
        this.cards = CardLoader.loadFromFile(filePath);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Map<Card, Boolean> history = new HashMap<>();
        for (Card card : cards) {
            history.put(card, false);
        }

        for (Card card : organizer.organize(cards, history)) {
            System.out.println("Question: " + card.getQuestion());
            String answer = scanner.nextLine();
            if (answer.trim().equalsIgnoreCase(card.getAnswer())) {
                System.out.println("Correct!");
                history.put(card, true);
            } else {
                System.out.println("Incorrect. The correct answer is: " + card.getAnswer());
                history.put(card, false);
            }
        }
    }
}
