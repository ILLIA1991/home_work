package trenning.trening_lection_6.task_1;

public class UserClass {

     static final String text = "Hello from static";

    String name;
    Integer age;



    public UserClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserClass() {
        this.name = "Volodia";
        this.age = 93;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
