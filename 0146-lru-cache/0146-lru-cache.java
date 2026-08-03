class LRUCache {
    Node head;
    Node tail;
    int capacity;
    HashMap<Integer,Node>map=new HashMap<>();
    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
        
    }
    public LRUCache(int capacity) {
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insert(node);
        }else{
            if(map.size()==capacity){
                Node lru=head.next;
                remove(lru);
                map.remove(lru.key);
            }
            Node node=new Node(key,value);
            insert(node);
            map.put(key,node);
        }
    }
    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insert(Node node){
        Node last=tail.prev;
        last.next=node;
        node.prev=last;
        node.next=tail;
        tail.prev=node;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */