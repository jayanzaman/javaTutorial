/**
 * Created by jzaman on 4/13/2017.
 */
public class Student extends Person {

    private int studentNumber;

    public Student(){
        super();
        studentNumber = 0;
    }

    public Student (String initialName, int initialStudentNumber){
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }
}
