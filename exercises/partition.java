class partition {
    
    public static void main (LinkedListNode node, int x) {
     LinkedListNode list = partition(node, x);   
    }
    
    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode a = null; 
        LinkedListNode b = null;
        LinkedListNode startA = a;
        LinkedListNode startB = b;
        LinkedListNode temp = node;
        
        while (temp != null) {
            (temp.data < 5) ? a.next = temp : b.next = temp;
            temp = temp.next();
        }
        
        a.next = startB;
        return startA;
    }
}