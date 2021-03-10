package com.company.linkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFront(){
        if(!isEmpty()){
            EmployeeNode tempErasedNode = head;
            head = head.getNext();
            size--;
            return tempErasedNode;
        }
        return null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        while(current != null){
            System.out.print(current);
            System.out.print(" --- ");
            current = current.getNext();
        }
        System.out.println("Last");
    }
}
