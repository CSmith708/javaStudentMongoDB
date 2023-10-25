//https://www.mongodb.com/try/download/community
//Make sure to install compass
public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        student.setCourse("Computer Science");

        dbManager.addStudent(student);
        dbManager.close();
    }
}

