
public class Student {

    String name;
    Double firstQuartersGrade;
    Double secondQuartersGrade;
    Double thirdQuartersGrade;
    Double finalQuartersGrade;
    Double missing;

    public double finalQuartersGrade() {
        return firstQuartersGrade + secondQuartersGrade + thirdQuartersGrade;
    }

    public double missingPoints() {
        if (finalQuartersGrade() < 60.0) {
            return 60.0 - finalQuartersGrade();
        } else {
            return 0.0;
        }
    }
}
