package com.company;

import javax.swing.text.StyledEditorKit;

public class Liste
{
    Node head = null;
    Node tail = null;


    public boolean isEmpty()
    {
        if (head == null)
        {
            return true;
        } else
            return false;
    }

    public Node InsertFromHead(String s)
    {
        Node node = new Node(s);


        if (isEmpty())
        {
            head = node;
            tail = node;
            return head;
        }
        head.previous = node;
        node.next = head;
        head = node;

        return head;
    }


    public String printFromHead()
    {

        Node n = head;
        String res = "";

        while (n != null)
        {
            res = res + n.data;
            n = n.next;

        }
        return res;
    }

    public Node insertFromTail(String s)
    {

        Node node = new Node(s);

        if (isEmpty())
        {
            head = node;
            tail = node;
            return tail;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;

        return tail;
    }


    public String printFromTail()
    {

        Node n = tail;
        String res = "";

        while (n != null)
        {
            res = n.data + res;
            n = n.previous;

        }
        return res;
    }

    public Node fineMyNode(String s)
    {
        Node node = head;

        if (isEmpty())
        {
            return node;
        }
            while (node != null)
            {

                if (node.data == s)
                {
                    return node;
                }
                node = node.next;
            }
        return node;
        }
    }

