package Level_14.collection_linkedlist.string_linked_list_part_2;

import Level_14.collection_linkedlist.string_linked_list_part_2.StringLinkedList;

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.add("10");
        stringLinkedList.add("11");

        stringLinkedList.printAll();

        int index = 0;
        String text = stringLinkedList.get(index);
        System.out.println("Text = " + text + " index = " + index);
    }
}
