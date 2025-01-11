class QueueDemo
{
    int queue[];
    int front, rear, size, capacity;

    QueueDemo(int n)
    {
        queue = new int[9999]; // create a queue of large memory.
        capacity = n; // number of elements queue can hold.
        front = -1; // start position of the queue
        rear = -1; // end position of the queue
        size = 0; // number of elements currently in the queue
    }

    void enqueue(int data) throws Exception
    {
        if(getSize() < capacity)
        {
            if(front == -1 && rear == -1)
            front=0;

            rear++;
            queue[rear] = data;
        }
        else
        {
            throw new Exception("Queue is full!");
        }
    }
    int getSize()
    {
        if(rear == -1 && front == -1)
        {
            size = 0;
        }
        else{
            size = rear - front + 1;
        }
        return size;
    }
}