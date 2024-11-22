package org.devchw.gardener.infra.clients;

import org.devchw.gardener.infra.clients.chatgpt.ChatGPTClient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ai.openai.OpenAiChatModel;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.*;

class ChatGPTClientTest {
    private OpenAiChatModel openAiChatModel = Mockito.mock(OpenAiChatModel.class);
    private ChatGPTClient chatGPTClient = new ChatGPTClient(openAiChatModel);

    @Test
    @DisplayName("프롬프트를 받아 ChatGPT의 답변을 리턴한다.")
    void chat() {
        // given
        String prompt = "hello GPT";
        String answer = "hi";
        given(openAiChatModel.call(anyString()))
                .willReturn(answer);

        // when
        String result = chatGPTClient.chat(prompt);

        // then
        assertThat(result).isEqualTo(answer);
    }
}
