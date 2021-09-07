package com.company;

public class Liste {
    Node head = null;
    Node tail = null;

public Node InsertFromHead(Node n)
{
    if(head == tail){
        head = n;
        tail =n ;
        return head;
    }
 head = n;
 tail = n;

 head.previous =n;
 n.next = head;
 head =n;

    return n;
}


}
