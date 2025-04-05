package org.example.flashcard;


public class Card {
    private final String question;
    private final String answer;

    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return question + " | " + answer;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        return question.equals(other.question) && answer.equals(other.answer);
    }

    @Override
    public int hashCode() {
        return question.hashCode() + answer.hashCode();
    }
}
