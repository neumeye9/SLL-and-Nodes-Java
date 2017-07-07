import java.util.*;

public class SinglyLinkedNode{
    Object data;
    SinglyLinkedNode next;

    //constructor
    
    public SinglyLinkedNode(Object data){
        this.data = data;
    }

    public SinglyLinkedNode(Object data, SinglyLinkedNode next){
        this.data = data;
        this.next = next;
    }

    public Object showNodeVal(){
        return data;
    }

    public SinglyLinkedNode nextVal(){
        return next;
    }
    
    public String toNodeString(){
        String stringView = "";

        stringView += '[';
        stringView += toString();
        stringView += ']';

        if( next != null){
            stringView += '-';
        }

        return stringView;
    }

    public String toString(){
        return data.toString();
    }
}