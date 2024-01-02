package inicio;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }
    
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
    	Node nodo = head;
    	while (nodo.next.next != null)
        {
    		nodo = nodo.next;
        }
    	nodo.next = null;
    }
    
    public void printValues() {
    	Node nodo = head;
    	while (nodo != null)
        {
            System.out.println(nodo.value);
            nodo = nodo.next;
        }
    }
}

