package com.company;

import javax.swing.text.StyledEditorKit;

public class Liste {
    Node head = null;
    Node tail = null;


    public boolean isEmpty(){
        if(head == null ){
            return true;
        }else
            return false;
    }
public Node InsertFromHead(String s)
{
    Node node = new Node(s);


    if(isEmpty()){
        head = node;
        tail = node;
        return head;
    }
    head.previous =node;
    node.next = head;
    head = node;

    return head;
}


}
