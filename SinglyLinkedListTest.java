class SinglyLinkedListTest{
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.showData();

        list.removeLastNode();

        list.showData();


    }
}