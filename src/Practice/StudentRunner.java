package Practice;

import java.math.BigDecimal;

public class StudentRunner{

    public static void main(String[] args) {
        Student student = new Student("Harry Potter", 100, 67, 89, 75, 90);

        System.out.println(student.name);
        Integer number = student.getNumberOfMarks();
        System.out.println(number);
        Integer sum = student.getTotalSumOfMarks();
        System.out.println(sum);
        Integer max = student.getMaximumMark();
        System.out.println(max);
        Integer min = student.getMinimumMark();
        System.out.println(min);
        BigDecimal average = student.getAverageMarks();
        System.out.println(average);

        System.out.println(student);
        student.addNewMark(35);
        System.out.println(student);
        student.removeMarkAtIndex(3);
        System.out.println(student);
    }
}
