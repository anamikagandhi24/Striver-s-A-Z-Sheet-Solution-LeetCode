class MyCircularQueue {
    int front;
    int rear;
    int size;
    int c;
    int []arr;
    public MyCircularQueue(int k) {
        arr=new int[k];
        front=0;
        rear=-1;
        size=0;
        c=k;
    }
    
    public boolean enQueue(int value) {
        if(size!=c){ 
            rear=(rear+1)%c;
            arr[rear]=value;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(size!=0){
            front=(front+1)%c;
            size--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(size==0){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(size==0){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(size==c){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */