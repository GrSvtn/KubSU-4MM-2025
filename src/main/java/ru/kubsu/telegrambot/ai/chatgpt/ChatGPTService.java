package ru.kubsu.telegrambot.ai.chatgpt;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import ru.kubsu.telegrambot.ai.AIService;

@Service
public class ChatGPTService implements AIService {

    @Override
    public String ask(final String question) {
        throw new NotImplementedException("ChatGPT is not implemented yet");
    }
}
