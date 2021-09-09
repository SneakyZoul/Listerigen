package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void isEmpty()
    {
        assertEquals(true, liste.isEmpty());
        liste.InsertFromHead("Victor");
        assertEquals(false, liste.isEmpty());
    }


    @org.junit.jupiter.api.Test
    void insertFromHead()
    {
        assertEquals("1", liste.InsertFromHead("1").data);
    }

    @Test
    void printListFromHead()
    {
        liste.InsertFromHead("1");
        liste.InsertFromHead("2");
        liste.InsertFromHead("3");

        assertEquals("321", liste.printFromHead());
    }

    @Test
    void insertFromTail()
    {


        assertEquals("111", liste.insertFromTail("111").data);
    }

    @Test
    void printFromTail()
    {

        liste.insertFromTail("1");
        liste.insertFromTail("2");
        liste.insertFromTail("3");

        assertEquals("123", liste.printFromTail());
    }

    @Test
    void findMyNode()
    {
        Node node = new Node("1");
        liste.InsertFromHead(node.data);

        assertEquals(node.data, liste.fineMyNode("1").data);


    }

    @Test
    void removeNode()
    {
        Node node = new Node("1");

        liste.InsertFromHead("1");
        liste.InsertFromHead("2");
        liste.InsertFromHead("3");

        assertEquals("2",liste.removeFromNode("2").data);
        assertEquals("31",liste.printFromTail());



    }
}