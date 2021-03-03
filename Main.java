import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    student1.print();

    student2.setName("Kayla Nehus");
    student2.setGPA(4.3);
    student2.setMajor("Marketing and Information Systems");
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double gpaSum = 0;
    for (double i : gpas) {
      gpaSum += i;
    }
    double avgGPA = gpaSum / gpas.size();
    System.out.println("The average GPA is:" + avgGPA);
  }
}