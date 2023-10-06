package trenning.trening_lection_6;

public class Junior {
    Integer age;
    String name;
    String surname;
    String email;

    public Junior(Integer age, String name, String surname, String email) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
