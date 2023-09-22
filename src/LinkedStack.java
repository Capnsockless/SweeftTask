public class LinkedStack<T> {
    private Node<T> firstNode = null;

    public LinkedStack(){ }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNext(firstNode);
        firstNode = newNode;
    }

    //O(1)
    public void remove(){
        Node<T> next = firstNode.getNext();
        firstNode.clear();
        firstNode = next;
    }

    public void clear(){
        Node<T> currentNode = firstNode;
        Node<T> previousNode;

        firstNode = null;
        while(currentNode != null){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            previousNode.clear();
        }
    }

    public String toString(){
        if (firstNode == null){
            return "Stack is Empty";
        }

        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = firstNode;

        sb.append(currentNode.data);
        currentNode = currentNode.getNext();
        while(currentNode != null){
            sb.append("->");
            sb.append(currentNode.data);
            currentNode = currentNode.getNext();
        }

        return sb.toString();
    }

    private class Node<K>{
        private Node<K> next = null;
        public K data;

        public Node(K data){
            this.data = data;
        }

        public void setNext(Node<K> next) {
            this.next = next;
        }

        public void clear(){
            next = null;
            data = null;
        }

        public Node<K> getNext() {
            return next;
        }
    }
}
