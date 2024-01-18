public class MyLinkedList<E> implements MyList<E>{
      private int size=0;
      private Node<E> head = null;
      private Node<E> tail = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (head==null){
            return null;
        }
        return getNodeByIndex(index).object;
    }

    private Node<E> getNodeByIndex(int index){
        if(index==0){
            return head;
        }
        if (index==size-1){
            return tail;
        }

        Node<E> currentNode = head;
        while (index-- != 0 || currentNode.next == null ){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element,null, null);
        if(tail==null){
            head = newNode;
            tail = newNode;
        } else {
           tail.next = newNode;
           newNode.prev = tail;
           tail = newNode;

        }

        size++;
    }


    class Node<E>{
        private E object;
        private Node<E> prev;
        private Node<E> next;

        public Node(E object, Node<E> prev, Node<E> next) {
            this.object = object;
            this.prev = prev;
            this.next = next;
        }

        public E getObject() {
            return object;
        }

        public void setObject(E object) {
            this.object = object;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}
