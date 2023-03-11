package class17;

public class Student {

  String name;
   String id;
   int age;
   double weight;



     Student(String StudentName,String Studentid,int Studentage, double Studentweight){
        name=StudentName;
        id=Studentid;
        age=Studentage;
        weight=Studentweight;
    }
    void studentbio(){
        System.out.println("Student name:"+" " + name +" "+"Student id:" +" "+id+" "+"Student age:"+ " "+age+" " +"Student Weight"+" "+weight);
    }
}
