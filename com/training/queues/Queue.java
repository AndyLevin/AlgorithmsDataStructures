import java.util.Random;

//Queue
class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nCustomers;


    public Queue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nCustomers = 0;
    }

    public void insert(int m) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = m;
        nCustomers++;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nCustomers--;
        return temp;

    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nCustomers == 0);
    }

    public boolean isFull() {
        return (nCustomers == maxSize);

    }

    public static int random(int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - 1) + 1) + 1;
        return randomNum;

    }

    public int size() {
        return nCustomers;
    }

    public void display() {
        if (nCustomers == 0) {
            System.out.print("null ");
            return;
        }


        if (nCustomers == 1)
            System.out.print(queArray[front] + "_ ");

        else if (front > rear)

        {
            for (int i = front; i < maxSize; i++) {
                System.out.print(queArray[i] + "_ ");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(queArray[i] + "_ ");
            }

        } else if (front < rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queArray[i] + "_ ");

            }
        }

    }
}