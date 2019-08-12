
public class StudentTest {

    public static void main(String[] args) {
	
	Student nota1 = new Student("Polixenia", 100.0);
	Student nota2 = new Student("Jonathan", 6.0);
	
	System.out.printf("%s  letter grade is: %s%n", nota1.getName(), nota1.getLetterGrade());
	System.out.printf("%s letter grade is: %s%n", nota2.getName(), nota2.getLetterGrade());
	
    }

}
