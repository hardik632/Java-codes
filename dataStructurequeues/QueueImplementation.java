
class QueueImplementation{
    static int front = -1;
    static int rear = -1;
    static int arr[] = new int[5];
    public static void insert(int data){
        if(front == -1 || rear == -1){
            front = 0;
            rear = 0;
            arr[0] = data;
        }
        else if(rear < 5){
            rear ++;
            arr[rear] = data;
        }
        else{
            System.out.println("Queue overflow");
        }
    }
    public static void delete(){
        if(front == -1 || rear == -1){
            System.out.println("Queue underflow");
        }
        else{
            front ++;
        }
    }
    public static void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        QueueImplementation queue = new QueueImplementation();
        queue.insert(2);
        queue.insert(5);

        queue.delete();
        queue.display();

        queue.insert(6);
        queue.display();

        queue.insert(8);
        queue.insert(10);
        queue.display();
    }
}