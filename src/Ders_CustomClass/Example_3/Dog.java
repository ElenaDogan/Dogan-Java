package Ders_CustomClass.Example_3;

public class Dog {
    String breed;
    int age;
    String color;
    String name;

    public Dog( ){
    }

    public Dog(String breed, int age, String color, String name  ){
        this.breed = breed;
        this.age = age;
        this.color=color;
        this.name=name;
    }

    public Dog(String breed, int age, String name  ){
        this.breed = breed;
        this.age = age;
        this.color=color;
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
