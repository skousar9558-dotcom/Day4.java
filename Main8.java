import java.util.*;

class Main {
public static void main(String[]args){

    LinkedHashMap<Integer,String>student=new LinkedHashMap<>();

    student.put(101,"John");
    student.put(102,"Ali");
    student.put(103,"Ram");
    student.put(104,"Sara");
    student.put(105,"Ravi");

    System.out.println(student);
    System.out.println("ID 102:" + student.get(102));

    student.put(103,"Rani");
    student.remove(105);

    System.out.println("ID 101 exists:" + student.containsKey(101));
    System.out.println("John exists:" + student.containsKey("John"));

    System.out.println("IDs:"+student.keySet());
    System.out.println("Names:"+student.values());
    }
}
