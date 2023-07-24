package CA;

/**
 *
 * @author seunghyekim
 */
public class CarLLApp {
    public static void main(String[] args) {
        Car car1 = new Car("181-D-2002","Eugene", "0861234444", "this car has no engine");
        Car car2 = new Car("171-D-2001","Brian", "0861234444", "this car has no tyres");
        Car car3 = new Car("161-D-20044","Mary", "0861234444", "this car has no oil");
        Car car4 = new Car("151-D-1999","Sarah", "0861234444", "this car has no wheels");
        Car car5 = new Car("141-D-2333","Stuart", "0861234444", "this car has no lights");
        
        car1.setStatus(true);
        car1.setPrice(10.80);
        car2.setStatus(true);
        car2.setPrice(22.56);
        car3.setStatus(true);
        car3.setPrice(4.56);
        
        
       LinkedListCar myList = new LinkedListCar();
        myList.add(car1);
        myList.add(car2);
        myList.add(car3);
        myList.add(car4);
        myList.add(car5);
       


        System.out.println("Cars added");
        System.out.println(myList.toString());
        System.out.println("Average cost of fixing the cars :- " + myList.get_Average());
                
     System.out.println(myList.currentProblems());
     System.out.println("removed " + myList.remove(1));
     System.out.println("removed " + myList.remove("181-D-2002"));
    }
    
}
