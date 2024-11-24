package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade grade : authGrades) {
            printResults(grade);
        }
    }

    private static void printResults(AuthGrade grade) {
        System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription() );
    }
}
