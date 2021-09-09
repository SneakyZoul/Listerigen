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
            res = n.data + res;
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

    public Node removeFromNode(String s)
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

                node.previous.next = null;
                node.next.previous = null;

                node.previous.next = node.next;
                node.next.previous = node.previous;

                return node;

            }
            node = node.next;
        }
        return null;
    }

    public static Node getNode(String s)
    {
        return new Node(s);
    }

    public void addNode(String s, int num)
    {

        if (isEmpty())
        {
            head = new Node(s);
        } else
        {
            Node newNode = new Node(s);

            Node ptr = tail;
            Node ptr2 = head;
            int len = 0;

            while (ptr != null)  // get length of list
            {
                len++;
                ptr = ptr.previous;
            }

            ptr = tail;  // change ptr back to tail

            if (num > len + 1)
            {
                System.out.println("Placement is longer then the list");
                System.out.println("the number is put ind the end of the list ");
                num = len + 1;
            }
            if (num > 1)
            {
                System.out.println("Erro, too small of a number");
                num = 1;
            }

            while ((num--) - 1 > 1)
            {
                ptr = ptr.previous;
                ptr2 = ptr2.next;
            }

            newNode.previous = ptr.previous;
            ptr.previous = newNode;
            newNode.next = ptr2.next;
            ptr2.next = newNode;
        }

    }

}


