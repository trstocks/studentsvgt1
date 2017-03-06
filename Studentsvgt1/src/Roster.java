import java.util.ArrayList;
/**
 * Created by tstocks on 9/25/16.
 */
public class Roster {
    static ArrayList<Student> myStudents = new ArrayList<>();

    public static void main(String[] args) {
        boolean a = true;
        boolean x = (a && !a) && a;
        System.out.println(x);
        //Add Student data
       Roster.
        add("1","John","Smith","John1989@gmail.com",20,88,79,59);
        add("2","Suzan","Erickson","Erickson_1990@gmailcom",19,91,72,85);
        add("3","Jack","Napoli","The_lawyer99yahoo.com",19,85,84,87);
        add("4","Erin", "Black","Erin.black@comcast.net",22,91,98,82);
        add("5","Troy", "Stocks","tstocks@wgu.edu",30,22,86,94);
        //Print out the student data
         // printAllStudents();
        //Print Average Grades
         // printAverageGrades();

        //find student
        //findInvalidEmails();

        //remove student
        //Roster.remove("3");
        //System.out.println(myStudents);
        print_all();
        print_invalid_emails();
    //loop through the ArrayList and for each element:
        print_average_grade("5");
        remove("3");
        remove("3");
    //expected: this should print a message saying such a student with this ID was not found.

    }



    public static void add(String studentId, String firstName, String lastName, String emailAddress, int age, int grades1, int grades2, int grades3)
    {
        //create array for grades
        int[] grades = {grades1, grades2, grades3};
        Student newStudent = new Student(studentId, firstName,lastName, emailAddress, age, grades);
        myStudents.add(newStudent);

    }

    public static void remove(String studentId)
    {
        //find match for student

        boolean matchId = false;
        for(Student s : myStudents)
        {

            if(s.getStudentId().equals(studentId)) {
                myStudents.remove(s);
                System.out.println("Removed the following:\n " + s);
                matchId = true;
                return;
            }
        }
        if(!matchId)
        {
            System.out.println("No match found for Student ID " + studentId + ".");
        }
    }


    //updated method names to match what's specified in taskstream.
    public static void print_all/*printAllStudents*/()
    {
        //loop through myStudents
        for(int i=0;i<myStudents.size();i++)
        {
            //get each book and print
            myStudents.get(i).print();
        }

    }
    public static void print_average_grade/*printAverageGrades*/(String studentId)
    {
        //loop through grades
        for(Student s : myStudents)
        {
            if(s.getStudentId().equals(studentId))
            {
                //Average
                double average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2]) / 3.0;
                System.out.println( s.getStudentId() + "\tFirst Name: " + s.getFirstName() + "\tLast Name: \t" + s.getLastName() + "\tAverage:\t" + average);
            }
        }

    }
    public static void print_invalid_emails/*findInvalidEmails*/()
    {

        for(Student s : myStudents)
        {
            //find match for bad email
            if(!s.getEmailAddress().contains("@") || !s.getEmailAddress().contains(".") || s.getEmailAddress().contains(" "))
                {
                    System.out.println(s.getEmailAddress() + " is an invalid email address");
                }

        }
    }

}
