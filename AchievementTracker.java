package Java;

import java.util.Map;

public class AchievementTracker {
    private int correctStreak = 0;
    private int repeatCount = 0;
    private int confidentCount = 0;

    public void trackAchievements(Map<Card, Boolean> history) {
        history.forEach((card, isCorrect) -> {
            if (isCorrect) {
                correctStreak++;
            } else {
                correctStreak = 0;
            }
            if (correctStreak >= 3) {
                confidentCount++;
            }
            if (repeatCount > 5) {
                repeatCount++;
            }
        });

        System.out.println("Achievements:");
        if (correctStreak == history.size()) {
            System.out.println("CORRECT: All answers correct!");
        }
        if (repeatCount > 5) {
            System.out.println("REPEAT: More than 5 attempts on one card!");
        }
        if (confidentCount >= 3) {
            System.out.println("CONFIDENT: Answered correctly 3 times on one card!");
        }
    }
}
