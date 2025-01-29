package Level_14.collection_linkedlist.string_linked_list_part_2;

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
        Node currentElement = first.next;
        while((currentElement != null) && (currentElement != last)){
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public String get(int index){
        Node currentElement = first.next;
        int currentIndex = 0;
        while ((currentElement != null) && (currentElement != last)){
            if(currentIndex == index){
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return  null;
    }





    public static class Node{
        private Node prev;
        private String value;
        private Node next;

    }
}
