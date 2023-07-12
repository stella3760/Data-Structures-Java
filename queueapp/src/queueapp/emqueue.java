package queueapp;

import java.util.*;

/* @author seunghyekim */

public class emqueue {
    
    public static void main(String[] args) {
        Queue<String> str_queue = new LinkedList<>();
        str_queue.add("one");
        str_queue.add("two");
        str_queue.add("three");
        str_queue.add("four");
        while (!str_queue.isEmpty()){
            System.out.println(str_queue.remove() + "  dequeued: ");
            System.out.println("size is: "+str_queue.size());
        }
        
        Sustem.out.println("The Queue contents: "+str_queue);
    }
    
}
