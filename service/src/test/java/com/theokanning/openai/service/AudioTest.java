package com.theokanning.openai.service;

import com.theokanning.openai.audio.AudioResult;
import com.theokanning.openai.audio.CreateTranscriptionRequest;
import com.theokanning.openai.audio.CreateTranslationRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AudioTest {

    String token = System.getenv("OPENAI_TOKEN");
    OpenAiService service = new OpenAiService(token);

    @Test
    void createTransactionAudio() {
        String audioPath = "src/test/resources/audio.mp3";

        CreateTranscriptionRequest request = CreateTranscriptionRequest
                .builder()
                .model("whisper-1")
                .responseFormat("json")
                .language("en")
                .build();

        AudioResult result = service.createTranscription(request, audioPath);

        assertNotNull(result.getText());
    }

    @Test
    void createTranslationAudio() {
        String audioPath = "src/test/resources/audio.mp3";

        CreateTranslationRequest request = CreateTranslationRequest
                .builder()
                .model("whisper-1")
                .responseFormat("json")
                .build();

        AudioResult result = service.createTranslation(request, audioPath);

        assertNotNull(result.getText());
    }

}
