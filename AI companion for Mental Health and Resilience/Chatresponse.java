package com.aicompanion.model;

public class ChatResponse {
    private String reply;
    private String sentiment;

    public ChatResponse(String reply, String sentiment) {
        this.reply = reply;
        this.sentiment = sentiment;
    }

    public String getReply() {
        return reply;
    }

    public String getSentiment() {
        return sentiment;
    }
}
