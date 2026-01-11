package com.aicompanion.service;

import org.springframework.stereotype.Service;

@Service
public class AIService {

    public String analyzeSentiment(String text) {
        if (text.toLowerCase().contains("sad") || text.toLowerCase().contains("depressed")) {
            return "Negative";
        } else if (text.toLowerCase().contains("happy") || text.toLowerCase().contains("good")) {
            return "Positive";
        }
        return "Neutral";
    }

    public String generateReply(String sentiment) {
        switch (sentiment) {
            case "Negative":
                return "I'm really sorry you're feeling this way. You're not alone. Try taking deep breaths.";
            case "Positive":
                return "That's great to hear! Keep focusing on what makes you happy 😊";
            default:
                return "I’m here to listen. Tell me more about how you’re feeling.";
        }
    }
}
