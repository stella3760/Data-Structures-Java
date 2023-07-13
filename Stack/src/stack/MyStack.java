package stack;

import java.util.*;

/* @author seunghyekim */

public class MyStack implements StackInterface {
    private ArrayList<String> theStack;
    
    public MyStack(){
        theStack = new ArrayList<String>();
    }
    
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    public boolean isFull(){
        return false;
    }
    
    public Object pop(){
        if (!(theStack.isEmpty())){
            return theStack.remove(0);
        } else
            return null;
    }
    
    public void push(Object newItem){
        theStack.add(0,(String)newItem);
    }
    
    public int size(){
        return theStack.size();
    }
}
