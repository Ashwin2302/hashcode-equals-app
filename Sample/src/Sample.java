public class Sample {
    public static void main(String[] args) {
        Student student1 = new Student(156,80);
        Student student2 = new Student(156,90);
        isEqual(student1,student2);
    }


    private static void isEqual(Student student1, Student student2) {
        int result = (student1.equals(student2)) ? (student1.getScore() + student2.getScore()):0;
        System.out.println("hashcode of student1 = " + student1.hashCode());
        System.out.println("hashcode of student2 = " + student2.hashCode());
        System.out.println("Total Score ="+result);
    }
}

