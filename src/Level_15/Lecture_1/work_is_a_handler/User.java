package Level_15.Lecture_1.work_is_a_handler;

import java.util.Objects;

public class User {

        private String name;
        private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if(name == null)
            return -1;
        else if (name.isEmpty())
            return -2;
        else if(name.matches(".*\\d.*"))
            return -3;
        else
        this.name = name;
        return 0;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if(age < 0)
            return -1;
        else if(age > 200)
            return  -2;
        else
            this.age = age;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
