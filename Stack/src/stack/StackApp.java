package stack;

/* @author seunghyekim */

public class StackApp {
    public static void main(String[] args) {
        StackInterface si;
        si = new MyStack();
        
        System.out.println(" Is the Stack empty? " + si.isEmpty());
        
        si.push("One String");
        si.push("Second String");
        si.push("Third String");
        System.out.println("Three items were added to the stack");
        
        System.out.println("Is the Stack empty? " + si.isEmpty());
        
        System.out.println("Stack size is " + si.size());
        
        String out;
        out = (String)si.pop();
        System.out.println("popped item: " + out);
        out = (String)si.pop();
        System.out.println("popped item: " + out);
        
        System.out.println("Is the Stack empty? " + si.isEmpty());
        
        out = (String)si.pop();
        System.out.println("popped: " + out);
        
        out = (String)si.pop();
        System.out.println("popped: " + out);
        
    }
}
