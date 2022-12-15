package design.pattern.state;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("hunman");
        Student sunghun = new Student("SungHun");
        sunghun.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);
        onlineCourse.addStudent(sunghun);
        System.out.println(onlineCourse.getStudents());
    }
}
