package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void main() {

    }

    @Test
    void getString() {
        assertEquals(true,urinals.getString());
    }

    @Test
    void openFile() {
        assertEquals("Should be implemented",urinals.openFile());
    }

    @Test
    void countUrinals() {
        assertEquals(1,urinals.countUrinals());
    }
}