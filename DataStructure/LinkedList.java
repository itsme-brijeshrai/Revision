// import javax.lang.model.type.NullType;

// import org.omg.CORBA.Current;

public class LinkedList {
    static Node head;
    static class Node{

        Integer data;
        Node next;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node n = new Node(2);
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4=new Node(6);
        Node n5=new Node(7);
        Node n6=new Node(8);
        head = n;
        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        LinkedList ll=new LinkedList();
        // Print linkedList
        ll.printLinkedList();
// add at first
        ll.addAtFirst(500);
        // Add at last
        ll.addAtLast(100);

        // middle element
        ll.findMiddle();

        // add at position
        ll.addAtPosition(3,200);
        
    }

    // print linkedList
    public void printLinkedList(){
        Node current = head;
        System.out.println();
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
        System.out.println();
    }

    // add at first
    public void addAtFirst(Integer data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        printLinkedList();
    }

    // add at last
    public void addAtLast(Integer data){
        Node node=new Node(data);
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        printLinkedList();
    }

    // add at given position
    public void addAtPosition(Integer pos,Integer data){
        Node node=new Node(data);
        Node current=head;
        Integer count=0;
        while(current.next!=null && count==pos){
            // if(count==pos-1){
            //     break;
            // }
            count++;
            current=current.next;
        }
        node.next=current.next;
        current.next=node;
        // System.out.println(count+"***************");

        printLinkedList();
    }
    // find middle element
    public void findMiddle(){
        Node current=head;
        Node fastNode=head;
        while(fastNode.next!=null){
            current=current.next;
            fastNode=fastNode.next.next;
        }
        System.out.println(current.data);
    }
}
