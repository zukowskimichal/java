package pl.dev.java.essentials.hackerrank.days30challenge.day4;

public class Person {

    int age;

    public Person(int initialAge) {
        setAge(initialAge);
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

}
