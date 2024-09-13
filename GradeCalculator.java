public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    int minsp = 75;
    int hours = minsp / 60;
    int minl = minsp % 60;
    int hw1 = 95;
    int hw2 = 75;
    int hw3 = 89;
    int hw4 = 96;
    double q1 = 90.3;
    double q2 = 97.4;
    double finale = 89.9;
    double avgh = (double)((hw1 + hw2 + hw3 + hw4) / 4);
    double avgq = ((q1 + q2) / 2);
    int finalg = (int)((avgh * 0.35) + (avgq * 0.15) + (finale * 0.50));

    System.out.println("Course name: " + course);
    System.out.println("Average time spent in a week for this course: " + minsp);
    System.out.println("Homework grades for this course:");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println(" ");
    System.out.println("Quiz grades for this course:");
    System.out.println(q1);
    System.out.println(q2);
    System.out.println(" ");
    System.out.println("Final exam grade for this course:");
    System.out.println(finale);
    System.out.println("Weekly time spent: " + hours + "h " + minl + "mins");
    System.out.println("Average homework grade: " + avgh);
    System.out.println("Average quiz grade: " +avgq);
    System.out.println("Final exam grade: " + finale);
    System.out.println("Overall grade: " +finalg);
  }
}
