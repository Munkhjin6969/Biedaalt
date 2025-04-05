package org.example.flashcard;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Usage: flashcard <cards-file> [options]");
            return;
        }

        String filePath = args[0];
        CardOrganizer organizer = new RecentMistakesFirstSorter();
        FlashCardApp app = new FlashCardApp(organizer);

        app.loadCards(filePath);
        app.start();
    }
}