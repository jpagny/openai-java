package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * A request for OpenAi to generate a transcription audio for a prompt.
 * <a href="https://platform.openai.com/docs/api-reference/audio/create">Audio transcription API</a>
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTranscriptionRequest {

    /**
     * ID of the model to use. Only whisper-1 is currently available.
     */
    @NonNull
    private String model;

    /**
     * An optional text to guide the model's style or continue a previous audio segment
     * The prompt should match the audio language.
     */
    private String prompt;

    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
     */
    @JsonProperty("response_format")
    private String responseFormat;

    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more
     * random, while lower values like 0.2 will make it more focused and deterministic. If set to 0,
     * the model will use log probability to automatically increase the temperature until certain thresholds are hit.
     */
    private int temperature;

    /**
     * The language of the input audio. Supplying the input language in ISO-639-1 format will improve accuracy and latency.
     */
    private String language;

}
