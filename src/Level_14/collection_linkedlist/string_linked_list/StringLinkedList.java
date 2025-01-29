package Level_14.collection_linkedlist.string_linked_list;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList(){
        first.next = last;
        last.prev = first;
    }

    public void add(String string){
        Node node = new Node();
        node.value = string;

        Node prevLast = last.prev;
        prevLast.next = node;
        node.prev = prevLast;
        node.next = last;
        last.prev = node;

    }

    public void printAll(){
        Node currentElement = last.prev;
        while((currentElement != null) && (currentElement != first)){
            System.out.println(currentElement.value);
            currentElement = currentElement.prev;
        }
    }





    public class Node{
        private Node prev;
        private String value;
        private Node next;
    }
}
