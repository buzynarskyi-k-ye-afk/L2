import com.google.gson.Gson;
public class Main {

    public static void main(String[] args) {
        Person testStudent = new Person("Kyrylo", "Buzynarskyi", 19);
        Person testStudent2 = new Person("Oleksandr","Bohachov", 19);
        Person copyStudent = new Person("Kyrylo", "Buzynarskyi", 19);

        System.out.printf("student 1: %s%nstudent 2: %s%n", testStudent, testStudent2);
        System.out.println("1 equals 2 -> " + testStudent.equals(testStudent2));
        System.out.println("1 == 2 -> " + (testStudent == testStudent2));
        System.out.println("1 equals copy -> " + testStudent.equals(copyStudent));
        System.out.println("1 == copy -> " + (testStudent == copyStudent));

        Gson jsonObj = new Gson();
        String tojson = jsonObj.toJson(testStudent);

        System.out.println("JSONstudent: " + tojson);

        Person fromjson = jsonObj.fromJson(tojson, Person.class);

        System.out.println("JSONstudent after: " +fromjson);

        System.out.printf("before equals after: %s;%nbefore == after: %s", testStudent.equals(fromjson), testStudent == fromjson);
    }
}