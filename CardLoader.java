package Java;

import java.io.*;
import java.util.*;

public class CardLoader {
    public static List<Card> loadFromFile(String filePath) throws IOException {
        List<Card> cards = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty() || !line.contains("|")) continue;
            String[] parts = line.split("\\|", 2);
            cards.add(new Card(parts[0].trim(), parts[1].trim()));
        }

        reader.close();
        return cards;
    }
}
