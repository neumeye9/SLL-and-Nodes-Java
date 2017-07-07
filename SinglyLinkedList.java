import java.util.*;

public class SinglyLinkedList{
    SinglyLinkedNode head;
    int size;

    //constructors
    public SinglyLinkedList(){
        size = 0;
    }

    public SinglyLinkedList(SinglyLinkedNode head){
        this.head = head;
        size = 0;
    }

    public SinglyLinkedList(Object headData){
        head = new SinglyLinkedNode(headData);
        size = 0;
    }

    //methods

    public void add(Object data){
        addFirst(data);
    }

    public void addFirst(Object data){
        SinglyLinkedNode e = new SinglyLinkedNode(data);
        e.next = head;

        head = e;
        size ++;
    }

    public void addLast(Object data){
        if(head == null){
            addFirst(data);
        }
        else{
            SinglyLinkedNode x = head;

            while(x.next != null){
                x = x.next;
            }
            x.next = new SinglyLinkedNode(data);
            size++;
        }
    }

    public void showData(){
        if(head == null){
            System.out.println("SLL is empty");
        }
        else{
            System.out.println(head.showNodeVal());
            SinglyLinkedNode pointer = head;
            while(pointer.nextVal() != null){
                pointer = pointer.nextVal();
                System.out.println(pointer.showNodeVal());
            }
        }
    }

    public Object removeFirstNode(){
        Object temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public Object removeLastNode(){
        if(size <= 1){
            return removeFirstNode();
        }
        else{
            SinglyLinkedNode x = head;
            while(x.next.next != null ){
                x = x.next;
            }

            Object temp = x.next.data;
            x.next = null;
            size--;
            return temp;
        }
    }


}