import java.util.LinkedList;
import java.util.Arrays;

public class sumLists {
    public static LinkedList list;
    public static void main(String[] args) {
        
        LinkedList LL1 = new LinkedList();
        LinkedList LL2 = new LinkedList();
        LL1.add(7);
        LL1.add(1);
        LL1.add(6);
        LL2.add(5);
        LL2.add(9);
        LL2.add(2);
        
        //System.out.println(sumLists(LL1, LL2));
        LinkedList final = new LinkedList();
        final = sumLists(LL1, LL2);
        Node finalHead = final.head;
        while (finalHead != null) {
            System.out.print(finalHead.data);
            finalHead = finalHead.next;
        }

    }
    
    public static LinkedList sumLists(LinkedList LL1, LinkedList LL2) {
        int sum = LLToInt(LL1) + LLToInt(LL2);
        System.out.println(sum);
        return IntToLL(sum);
    }
    
    public static int LLToInt (LinkedList list) {
        int sum = 0;
        int count = 0; 
        
        Node n = list.head;
    
        while (n != null) { 
            
            sum += n.data * Math.pow(10, count);
            count++;
            n = n.next;
        }

        return sum; 
    }
    
    public static LinkedList IntToLL (int sum) {
        LinkedList list = new LinkedList();
        int r;
        
        while (sum!=0) {
            r = sum%10;
            list.add(r);
            sum /= 10;
        }

        Node head = list.head;
        /*while (head != null) {
            System.out.println(head.data);

            head = head.next;
        }*/
        return list;
    }

    public static class Node {
        public int data;
        public Node next; 

        public Node(int d) { 
            data = d; 
            next = null;
        }
        public Node() {
            next = null;

        }
    }

    public static class LinkedList {

        public Node head;
        public int data;

        public LinkedList() {
            head = null;
            data = 0; 
        }

        public void add(int d) {
            Node start = new Node();
            Node n = new Node(d);
            if (head == null) {
                n.next = null;
                head = n;
            } else {
                start = head;
               while (start.next != null) {
                    start = start.next;
                }
                start.next = n;
            }        
        }
    }
}