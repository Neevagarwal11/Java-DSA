package OOPs.Generics.Comparing;

public class Student implements Comparable<Student> {
 int rollno;
 float marks;

 public Student(int roll , float marks){
    this.rollno = roll;
    this.marks = marks;
 }

 @Override
 public int compareTo(Student o){
   int diff = (int)(this.marks - o.marks);
   return diff;
   //this means that if diff == 0 then both are equal , diff < 0 = means o is bigger else o is smaller

 } 

}
