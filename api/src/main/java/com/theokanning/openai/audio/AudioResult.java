package com.theokanning.openai.audio;

import lombok.Data;

/**
 * An object containing a response from the answer api
 * <a href="https://platform.openai.com/docs/api-reference/audio">Audio api</a>
 */
@Data
public class AudioResult {

    /**
     * The text returned
     */
    private String text;

}
