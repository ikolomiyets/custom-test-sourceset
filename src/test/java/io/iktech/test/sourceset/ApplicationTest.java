package io.iktech.test.sourceset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void simpleTest() {
        String payload = "Test";
        assertEquals("Test", payload);
    }
}
