import java.util.HashMap;
public class HashMapExample{
    public static void main(String[]args){
        //Creating a HashMap
        HashMap<Integer,String> students=new HashMap<>();
        //Adding key-value pairs
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
        //Displaying the map
        System.out.println("HashMap:" + students);
        //Accessing a value using key
        System.out.println("student 101:" + students.get(101));
        //Updating a value
        students.put(102, "Peter");
        //Removing a key value pair
        students.remove(103);
        //Checking a key
        System.out.println("Contains key 101:" + students.containsKey(101));
        //Checking a value
        System.out.println("Contains value John:" + students.containsValue("John"));
        //Size of HashMap
        System.out.println("Size:" + students.size());

    }
} 