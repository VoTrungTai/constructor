
package baitap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    String id;
    String Fullname;
    float GPA;
    Date DateOfBirth;
    String major;
    Student(){}
    Student(String id, String Fullname, float GPA, Date DateOfBirth, String major){
        
        this.id=id;
        this.Fullname=Fullname;
        this.GPA=GPA;
        this.DateOfBirth=DateOfBirth;
        this.major=major;
    }
    Student enterStudentInfo(Student student){
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyy");
        System.out.println("Enter student ID: ");
        this.id = scanner.nextLine();
        System.out.println("Enter student FullName: ");
        this.Fullname= scanner.nextLine();
        System.out.println("Enter student GPA: ");
        this.GPA= scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter student Date Of Birth: ");
        String DateOfBirthString = scanner.nextLine();
        try{
        this.DateOfBirth=sdf.parse(DateOfBirthString);}
        catch (Exception e){
                System.out.println("wrong format");
                }
    
        System.out.println("Enter major: ");
        this.major= scanner.nextLine();
        student =new Student(id, Fullname, GPA, DateOfBirth, major);
        return this;
    
    }
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyy");
        return "Student id: "+ this.id+"\n"+
                "Student FullName: "+ this.Fullname+"\n"+
                "Student GPA: "+ this.GPA+"\n"+
                "Date Of Birth: "+ this.DateOfBirth+ "\n"+
                "Major: "+ this.major+"\n";
    }
}
    
    
    
    

