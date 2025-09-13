public class Student {
    int id;
    String name;
    int attendence;

    public Student(int id,String name,int attendence){
        this.id=id;
        this.name=name;
        this.attendence=attendence;
    }
    public Student(){
    }
    public Student(Student student2){
        this.id=student2.id;
        this.name=student2.name;
        this.attendence=student2.attendence;

    }
}
