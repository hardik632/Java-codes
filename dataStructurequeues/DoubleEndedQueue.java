import java.util.*;

class DoubleEndedQueue {
    static int size = 100;
    static int rear = 0, front = 0;
    static int queue[] = new int[size];
    static Scanner sc = new Scanner(System.in);
    public static void enQueueRear(int value){
        char ch;
        if(front == size/2){
            System.out.println("Queue is full!! Ooops Insertion is not possible!");
            return;
        }
        do{
            System.out.println("Enter the value to be inserted : ");
            value = sc.nextInt();
            queue[front] = value;
            front ++;
            System.out.println("Do you want to continue insertion (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
    public static void enQueueFront(int value){
        char ch;
        if(front == size/2){
            System.out.println("Queue is full!! Ooops Insertion is not possible!");
            return;
        }
        do{
            System.out.println("Enter the value to be inserted : ");
            value = sc.nextInt();
            rear --;
            queue[rear] = value;
            System.out.println("Do you want to continue insertion (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
    public static int deQueueRear(){
        int deleted;
        if(front == rear){
            System.out.println("Ooops!! Queue is empty deletion isn't possible!");
            return 0;
        }
        front--;
        deleted = queue[front+1];
        return deleted;
    }
    public static int deQueueFront(){
        int deleted;
        if(front == rear){
            System.out.println("Ooops!! Queue is empty deletion isn't possible!");
            return 0;
        }
        rear++;
        deleted = queue[rear -1];
        return deleted;
    }
    public static void display(){
        if(front == rear){
            System.out.println("Oops !! Queue is empty!");
        }
        else{
            System.out.println("The Queue elements are : ");
            for(int i=rear;i<front;i++){
                System.out.print(queue[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int choice1, choice2, value = 0;
        System.out.println("Type of double ended queue : ");
        do {
            System.out.println("1. Input restricted deque ");
            System.out.println("2. Output restricted deque");
            choice1 = sc.nextInt();
            switch (choice1) {
            case 1:
                System.out.println("Select the operation ");
                System.out.println("1. Insert \n 2. Delete from rear \n 3. Delete from front \n 4. Display");
                do {
                    System.out.println("Enter your choice for the operation in deque ");
                    choice2 = sc.nextInt();
                    switch (choice2) {
                    case 1:
                        enQueueRear(value);
                        display();
                        break;
                    case 2:
                        value = deQueueRear();
                        System.out.println("The value deleted is " + value);
                        display();
                        break;
                    case 3:
                        value = deQueueFront();
                        System.out.println("The value deleted is " + value);
                        display();
                        break;
                    case 4:
                        display();
                        break;
                    default:
                        System.out.println("Wrong choice");
                    }
                    System.out.println("Do you want to perform another operation (Y/N) ");
                    ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');
                break;
            case 2:
                System.out.println("Select the operation ");
                System.out.println("1. Insert at rear \n 2. Insert at front  \n 3. Delete \n 4. Display");
                do {
                    System.out.println("Enter your choice for the operation in deque ");
                    choice2 = sc.nextInt();
                    switch (choice2) {
                    case 1:
                        enQueueRear(value);
                        display();
                        break;
                    case 2:
                        enQueueFront(value);
                        display();
                        break;
                    case 3:
                        value = deQueueFront();
                        System.out.println("The value deleted is " + value);
                        display();
                        break;
                    case 4:
                        display();
                        break;
                    default:
                        System.out.println("Wrong choice");
                    }
                    System.out.println("Do you want to perform another operation (Y/N) ");
                    ch = sc.next().charAt(0);
                } while (ch == 'y' || ch == 'Y');
                break;
            }
            System.out.println("Do you want to continue (y/n) : ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}