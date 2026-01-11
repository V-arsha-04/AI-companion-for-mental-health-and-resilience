package com.aicompanion.controller;

import com.aicompanion.model.ChatRequest;
import com.aicompanion.model.ChatResponse;
import com.aicompanion.service.AIService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/chat")
public class ChatController {

    private final AIService aiService;

    public ChatController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        String sentiment = aiService.analyzeSentiment(request.getMessage());
        String reply = aiService.generateReply(sentiment);
        return new ChatResponse(reply, sentiment);
    }
}
