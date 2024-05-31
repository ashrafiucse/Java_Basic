package advance;

public class Person {
    private String name;
    private int age;

    //constructor added
    Person() {
        System.out.println("Printing from Person Class");
    }
    Person(String name) {
        System.out.println("Hello! "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void greeting() {
        System.out.println("From Parent Class");
    }
}
