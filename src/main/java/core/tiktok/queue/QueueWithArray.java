package core.tiktok.queue;

public class QueueWithArray {
    int front, rear, size, capacity;
    int[] arr;

    public QueueWithArray(int capacity){
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity -1;
    }

    public boolean isFull(){
        return capacity == size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int val){
        if(isFull())
            return;



    }
}
