import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /* Крок 1: якщо o це той самий об'єкт, що й this, повернути true */
        if (o == this) {
            return true;
        }
        /* Крок 2: якщо o дорівнює null або класи різні, повернути false */
        else if (o == null || o.getClass() != getClass()) {
            return false;
        }
        /* Крок 3: привести o до Person і зберегти в нову змінну */
        Person student = (Person) o;
        /* Крок 4: повернути результат порівняння трьох полів */
        return Objects.equals(student.firstName, this.firstName) &&
                Objects.equals(student.lastName, this.lastName) &&
                student.age == this.age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}