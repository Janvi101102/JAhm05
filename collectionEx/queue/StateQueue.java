package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StateQueue {

    public static void main(String[] args) {
        
        Queue<String> statesQueue = new LinkedList<>();

       
        statesQueue.add("Gujarat");
        statesQueue.add("Rajasthan");
        statesQueue.add("Goa");
        statesQueue.add("Punjab");
        statesQueue.add("Kerala");

        
        System.out.println("Queue of states:");
        for (String state : statesQueue) {
            System.out.println(state);
        }

        
        System.out.println("\nDequeuing and printing states:");
        while (!statesQueue.isEmpty()) {
            System.out.println(statesQueue.poll());
        }
    }
}

