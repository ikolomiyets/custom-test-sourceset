package io.iktech.test.sourceset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationIntegrationTest {
    @Test
    public void testApplication() {
        String payload = "Test";
        assertEquals("Test", payload);
    }
}
