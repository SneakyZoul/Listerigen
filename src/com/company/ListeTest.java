package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead() {

        assertEquals("1", liste.InsertFromHead(new Node("1")).data);

    }
}