package com.company;

public class Liste {
    Node head = null;
    Node tail = null;

public Node InsertFromHead(Node n)
{
 head = n;
 tail = n;

 head.previous =n;
 n.next = head;
 head =n;

    return n;
}


}
