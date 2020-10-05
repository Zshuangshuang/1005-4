package java10_05;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-05
 * Time:20:10
 **/class Node {
     private Node next;
     private int data;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
public Node head;

    public MyLinkedList() {
        this.head = head;
    }
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    public void display(){
        Node cur  = this.head;
        while(cur != null){
            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    public Node findToRemove(int toRemove){
        Node cur = this.head;
        while (cur.getNext() != null){
            if (cur.getNext().getData() == toRemove){
                return cur;
            }
            cur = cur.getNext();
        }
        return  null;
    }
    public void remove(int toRemove){
        if (this.head == null){
            return;
        }
        if (this.head.getData() == toRemove){
            this.head = this.head.getNext();
            return;
        }
        if (findToRemove(toRemove) == null){
            return;
        }
        Node prev = findToRemove(toRemove);
        Node del = prev.getNext();
        prev.setNext(del.getNext());
    }
    public void removeAllKey(int toRemove){
        Node prev = this.head;
        Node cur  = this.head.getNext();
        while(cur != null){
            if (cur.getData() == toRemove){
                prev.setNext(cur.getNext());
                cur = cur.getNext();
            }else {
                prev = cur;
                cur = cur.getNext();
            }
        }
        if (this.head.getData() == toRemove){
            this.head = this.head.getNext();
        }
    }
    public int size(){
        int count = 0;
        Node cur = this.head;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
    }
    private boolean checkPos(int pos){
        if (pos < 0  || pos > size()){
            return true;
        }
        return false;
    }
    public Node findPrev(int pos){
        Node cur  = this.head;
        while(pos-1 > 0){
            cur = cur.getNext();
            pos--;
        }
        return cur;
    }
    public void addIndex(int pos,int data){
        if (checkPos(pos)){
            return;
        }
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node prev = findPrev(pos);
        node.setNext(prev.getNext());
        prev.setNext(node);
    }

    public Node reverse(){
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while(cur != null){
            Node curNext = cur.getNext();
            if (curNext == null){
                newHead = cur;
            }
            cur.setNext(prev);
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display2(Node newHead){
        Node cur = newHead;
        while(cur != null){
            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    public Node middleNode(){
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }
    public Node findNum(int k){
        if (k < 0 || k > size()){
            return null;
        }
        if (this.head == null){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(k-1 > 0){
            fast = fast.getNext();
            k--;
        }
        while (fast.getNext() != null){
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;

    }
}
