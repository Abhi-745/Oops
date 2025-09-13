public class Client {
    public static void main(String[] args) {
            Student student=new Student();
            Student student2=new Student(1,"JAmes",10);
            Student student3=new Student(student2);/*copy*/
        System.out.println(student3.name);
    }
}
/*Signature must be diff there can be any no of constructorsss*/


