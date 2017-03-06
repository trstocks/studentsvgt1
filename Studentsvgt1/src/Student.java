import java.util.Arrays;

/**
 * Created by tstocks on 9/25/16.
 */
public class Student {
    private String id;
    private int[] grades;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;

    public Student(String id, String firstName, String lastName, String emailAddress,int age, int[] grades) {
        setId(id);
        setAge(age);
        setGrades(grades);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grades=" + Arrays.toString(grades) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }



    public String getStudentId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }



    public void print(){
        System.out.println(
                "Id:\t" + getStudentId() +
                "\tFirst Name:\t" + getFirstName() +
                "\tLast Name:\t " + getLastName() +
                "\tEmail Address:\t" + getEmailAddress() +
                "\tAge:\t" + getAge()+
                "\tGrades: {" + getGrades()[0] + "," + getGrades()[1] + "," + getGrades()[2] + "}"
        );
    }

}
