
package constructor;

public class Student {

    int id;
    String name;
    Student(){System.out.println("default........");}
    Student(int id, String name){
        this();
        this.id=id;
        this.name=name;
        
    }
    void display(){System.out.println(id+" "+name);}
    
}
