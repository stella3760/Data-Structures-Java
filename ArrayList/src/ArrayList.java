/* @author seunghyekim */

public class ArrayList {
    public String name;
    public int age;
    
    public ArrayList (String inName, int inAge){
        name = inName;
        age = inAge;
    }
    public void setName(String newname){
        name = newname;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newage){
        age = newage;
    }
    public int getAge(){
        return age;
    }
    public String printArrayList(){
        return (name+" "+age+"\n");
    }
}
