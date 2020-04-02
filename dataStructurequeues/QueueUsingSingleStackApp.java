// recursion
import java.util.Stack;

class QueueUsingSingleStackApp {
    public static void main(String[] args) {
        QueueUsingSingleStackApp queue = new QueueUsingSingleStackApp();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
    }
}

class QueueUsingSingleStackApp {
    Stack<Integer> stack = new Stack<>();

    public void enQueue(int data) {
        stack.push(data);
    }

    public void deQueue() {
        if (stack.size() < 1) {
            System.out.println("Nothing to deQueue");
            return;
        }

        if (stack.size() == 1) {
            System.out.println(stack.pop());
            return;
        }

        int data = stack.pop();
        deQueue();
        stack.push(data);
    }
}