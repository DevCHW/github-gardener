package org.devchw.gardener.infra.clients.chatgpt;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatGPTClient {

    private final OpenAiChatModel openAiChatModel;

    public String chat(String prompt) {
        return openAiChatModel.call(prompt);
    }

}
