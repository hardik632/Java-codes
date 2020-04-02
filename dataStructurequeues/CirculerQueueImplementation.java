class Main
{
  static int SIZE=10;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];

  void enqueue(int item)
  {
    if ((front == 0 && rear == SIZE-1) || (rear == (front-1)%(SIZE-1))) { 
      System.out.println("Queue is FULL.");
      return;
    }
    if(front == -1) 
    front = rear = 0;
  else if (rear == SIZE-1 && front != 0)
    rear = 0;
  else		
    rear++;

    array[rear] = item;
    System.out.println(item+" enqueued to queue.");
  }
  
  public void display()
  {
      for(int i=0;i<10;i++)
      {
          System.out.println(array[i]);
      }
  }

  public static void main(String args[])
  {
    Main ob1=new Main();
    ob1.enqueue(10);
    ob1.enqueue(20);
    ob1.enqueue(30);
    ob1.enqueue(40);
    ob1.display();
   
  }
}