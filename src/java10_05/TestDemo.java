package java10_05;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-05
 * Time:20:19
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(15);
        myLinkedList.addLast(23);
        myLinkedList.addLast(17);
        myLinkedList.addLast(19);
        myLinkedList.addLast(20);
        myLinkedList.display();
       /* myLinkedList.remove(20);
        myLinkedList.display();*/
      /* myLinkedList.removeAllKey(20);
       myLinkedList.display();*/

      /*myLinkedList.addIndex(5,99);
      myLinkedList.display();*/
      /*myLinkedList.removeAllKey(10);
      myLinkedList.display();*/
     /* Node newHead = myLinkedList.reverse();
      myLinkedList.display2(newHead);*/
        System.out.println(myLinkedList.middleNode().getData());
    }
}
