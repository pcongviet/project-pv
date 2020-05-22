package javapart4;

public class Student {
    private String name;
    private int age;
    private Float point;
    private String gender;

    public Student(String name, int age, Float point, String gender) {
        this.name = name;
        this.age = age;
        this.point = point;
        this.gender = gender;
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

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
