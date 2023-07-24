package CA;

/**
 *
 * @author seunghyekim
 */
public class Car {
    public String reg;
    public String name;
    public String contactNum;
    public String problem;
    public boolean status;
    public double cost;
    
    public Car(String reg, String name, String contactNum, String problem) {
        /* we decide what we want to do when the object is created */
        this.reg = reg;
        this.name = name;
        this.contactNum = contactNum;
        this.problem = problem;
        this.status = false;
        this.cost = 0.00;
    }
    
    /* we want java to print the car details in the following format
    Car Details
    Registration: 19-D-21
    Owners Name: "Keith Maycock"
    Contact Number: 08X 8736271
    Problem Description: "The car only had 3 wheels"
    Cost of Fixing the Problem: €100
    Car Status: "Ready for Collection"
    */
    @Override
    public String toString() {
        String output = "carDetails from Car.java... \n";
        output += "Registration        : " + this.reg + "\n";
        output += "Name                : " + this.name + "\n";
        output += "Contact Number      : " + this.contactNum + "\n";
        output += "Problem             : " + this.problem + "\n";
        output += "Cost of the problem : " + this.cost + "\n";
        String carStat = "";
        if(this.status) {
            carStat = "Ready for Collection";
        } else {
            carStat = "Not ready for collection";
        }
        
        output += "Car Status : " + carStat;
        return output;
    }
    
    //this sets the status of the car
    public void setStatus (boolean ready){
        this.status = ready;
    }
    //this sets the price of fixing the car
    public void setPrice (double cost) {
        this.cost = cost;
    }
    public static void main(String[] args){
        Car car1 = new Car("181-D-2002", "Stella", "0861223333", "this car has no engine");
        System.out.println(car1);
    }
}
