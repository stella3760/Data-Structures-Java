package CA;

/**
 *
 * @author seunghyekim
 */
//this is going to be the class for our linked list
public class LinkedListCar {
    private Node first;
    private Node last;
    
   
public void add(Car elem){
    if(isEmpty()){
        Node insertion = new Node(elem);
        first = insertion;
        last = first;
    }
    else {
        last.next = new Node(elem);
        last = last.next;
    }
}
@Override
public String toString(){
    String rep = " Garage cars \n";
    Node current = first;
    while(current != null) {
        rep += current.toString()+ "\n";
        current = current.next;
        } rep += "----------------------------";
        return rep;
}


    //second method for remove id index based on the registration 47 minutes

public String remove(String target){
    Node current =  first   ;
    int index = 0;
    while(current != null  && !current.car.reg.equals(target)){
        current = current.next;
        index++;
    }
    if(current != null && current.car.reg.equals(target)){
        remove(index);
    }
    return target;
}

public int remove(int index){
    if(index < 0 || index >= size()){
        throw new IndexOutOfBoundsException();
    }    
    if(index == 0){
        first = first.next;
        if(first == null){
            last = null;
        }        
    }else{
        Node pred = first;
    for(int k = 1; k<= index-1 ; k++) {
        pred = pred.next;
    }
      // rooting over the node we are removing
      pred.next = pred.next.next;
      if (pred.next == null){
          last = pred;
        }
          } return index;
    }
    
    
public String  currentProblems(){
    String output = "the following cars are available for collection \n";
    Node current = first;
    while(current != null){
        if(!current.car.status){
            output += current.car.reg +"\n";
        }
            current = current.next;
        }
    return output;
    }

    public double get_Average(){
    double avg_cost = 0.0;
    int counter = 0;
    
    Node current = first;
    while(current != null){
        //check price added to the car object
        if(current.car.cost != 0){
            avg_cost += current.car.cost;
            counter++;
        }
            current = current.next;
        }
        avg_cost = avg_cost / counter;
        return avg_cost;
    }




    
public boolean isEmpty() {
    return first == null;
}    

/* 
 method sixe counts the number of objects in the linked list
*/
public int size(){
    int size = 0;
    Node current = first;
    while(current != null){
        size++;
        current = current.next;
    }
    return size;
    
}
  //like size plus extra condition checking status 
public int readySize(){
    int size = 0;
    Node current = first;
    while(current != null){
        if(current.car.status){
        size++;
            }
        current = current.next;
        }
    return size;
    }
}
