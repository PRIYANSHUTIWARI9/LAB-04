package lab04;

public class Person {
    private String Name;
    private int Age;
    private char Gender;

    public Person(String Name, int Age, char Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Name" + getName());
        response.append("Age" + getAge());
        response.append("Gender" + getGender());
        return response.toString();
    }
}

class test {
    public static void main(String[] args) {
        Person a = new Person("PRIYANSHU", 20, 'M');
    }
}
