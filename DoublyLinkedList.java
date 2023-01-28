
public class DoublyLinkedList {  
	    //A node class for doubly linked list
	    class Node{  
	        int item;
	        int item2;
	        int item3;
	        Node previous;  
	        Node next;
			Node prev;  
	        Node del;
	        public Node(int item) {  
	            this.item = item;  
	        }  
	    }  
	    //Initially, head and tail is set to null
	    static Node head;
		static Node tail = null;  
	   
	    //add a node to the list  
	    public void addNode(int item) {  
	        //Create a new node  
	        Node newNode = new Node(item);  
	   
	        //if list is empty, head and tail points to newNode  
	        if(head == null) {  
	            head = newNode;  
	            tail = newNode;
	            //head's previous will be null  
	            head.prev = null;  
	            //tail's next will be null  
	            tail.next = null;  
	        }  
	        else {  
	            //add newNode to the end of list. tail->next set to newNode  
	            tail.next = newNode;  
	            //newNode->previous set to tail  
	            newNode.prev = tail;  
	            //newNode becomes new tail  
	            tail = newNode;  
	            //tail's next point to null  
	            tail.next = null;  
	        }  
	    } 
	  
	 public void InsertFront(int item2) {
		 Node newnode2 = new Node(item2);
		 newnode2.item2= item2;
		 newnode2.next = head;
		 newnode2.prev = null;
		 if (head != null) {
			 head.prev = newnode2;
		 }

		 }
	 
	 
	 
	 public void InsertRear(int item3) {
		 Node newnode3 =  new Node(item3);
		 newnode3.item3=item3;
		 newnode3.next=tail;
		 newnode3.prev=null;
		 if(tail != null) {
			 tail.prev = newnode3;
		 }
		 
	 }
	  
	//print all the nodes of doubly linked list  
	    static void printNodes() {  
	        //Node current will point to head  
	        Node current = head;
	        
	        if(head == null) {  
	            System.out.println("Doubly linked list is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	           
	            System.out.print(current.item + " ");  
	            current = current.next;  
	        }  
	        System.out.println();
	        return;
	    }

	   
	    
	    static Node deleteNode(Node del)
	    {
	        // base case
	        if (head == null || del == null)
	            return null;
	 
	        // If node to be deleted is head node
	        if (head == del)
	            head = del.next;
	 
	        // Change next only if node to be
	        // deleted is NOT the last node
	        if (del.next != null)
	            del.next.prev = del.prev;
	 
	        // Change prev only if node to be
	        // deleted is NOT the first node
	        if (del.prev != null)
	            del.prev.next = del.next;
	 
	        del = null;
	 
	        return head;
	    }
	 
	    // Function to delete the node at the
	    // given position in the doubly linked list
	    static void deleteNodeAtGivenPos(int n)
	    {
	        /* if list in NULL or
	          invalid position is given */
	        if (head == null || n <= 0)
	            return;
	 
	        Node current = head;
	        int i;
	 
	        /*
	        * traverse up to the node at
	          position 'n' from the beginning
	        */
	        for (i = 1; current != null && i < n; i++)
	        {
	            current = current.next;
	        }
	         
	        // if 'n' is greater than the number of nodes
	        // in the doubly linked list
	        if (current == null)
	            return;
	 
	        // delete the node pointed to by 'current'
	        deleteNode(current);
	    }


static void printNodes2() {
	Node current = head; 
	if(head == null) {  
        System.out.println("Doubly linked list is empty");  
        return; 
	}
	 System.out.println("Nodes of doubly linked list instert at front: ");  
     while(current != null) {  
        
         System.out.print(current.item + " "  );  
         current = current.prev; 
         }
    
     
     System.out.println();
     }

	
	


static void printNode3() {
	
	Node current = tail;
	if(tail == null) {
		System.out.print("List is empty");
		return;
	}
	 System.out.println("Nodes of doubly linked list inserted at rear: ");  
     while(current != null) {  
        
         System.out.print(current.item + " ");  
         current = current.prev; 
     }
     System.out.println();
     }



public int countNodes() {
	Node temp = head;
	temp = DoublyLinkedList.head;
	
	int i = 0;
	
	while(temp!= null) {
		i++;
		temp = temp.next;
		
	}
	System.out.println("Number of current nodes:");
	return i;
    
}
		
	

	
public void searchNode(int value) {
	int i=1;
	boolean flag = false;
	Node current = head;
	
	
	if(head == null) {
		System.out.println("List is empty");
		return;
	}
	
	while(current != null) {
		if(current.item == value) {
			flag = true;
			break;
		}
		current = current.next;
		i++;
	}
	if(flag){
		System.out.println("Node is present in" + " " + i);
	}else
	{
		System.out.println("null");
	}
			
		}
}
		



	class Main{
	    public static void main(String[] args) { 
		    
	
	        //create a DoublyLinkedList object
	        DoublyLinkedList dl_List = new DoublyLinkedList();  
	        //Add nodes to the list  
	        dl_List.addNode(33);  
	        dl_List.addNode(57);  
	        dl_List.addNode(85);  
	        dl_List.addNode(95); 
	        dl_List.addNode(66);
	        dl_List.InsertFront(87);
	        dl_List.InsertRear(71);
	        
	       
	        //print the nodes of DoublyLinkedList  
	        DoublyLinkedList.printNodes2();
	        DoublyLinkedList.printNodes();
	        DoublyLinkedList.printNode3();
	        
	        System.out.println("Doubly linked list after head  insertion:");
	        
	        DoublyLinkedList.printNodes2();
	        
	        dl_List.countNodes();
	        
	        dl_List.searchNode(57);
	        dl_List.searchNode(33);
	        dl_List.searchNode(95);
	        
	        dl_List.InsertFront(22);
	        
	        DoublyLinkedList.printNodes2();
	        
	        DoublyLinkedList.deleteNodeAtGivenPos(57);
	        
	        DoublyLinkedList.printNodes();
	        
	        
	      
	        
	        
	    
	       
	    }
	}



	