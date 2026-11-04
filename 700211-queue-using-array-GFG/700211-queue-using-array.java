class myQueue {

    private int[] arr;
    private int cap;
    private int front;  
    private int size;   

    public myQueue(int n) {
        arr = new int[n];
        cap = n;
        front = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == cap;
    }

    public void enqueue(int x) {
        if (isFull()) return;
        int rear = (front + size) % cap;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        front = (front + 1) % cap;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[(front + size - 1) % cap];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna