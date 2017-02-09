package Fourth;

import java.util.ArrayList;

public class Human {

    private String name;

    private int age;

    private int birthYear;

    private ArrayList<String> skills;

    private int salary;

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public ArrayList<String> getSkils() {
        return skills;
    }

    public void setSkils(ArrayList<String> skills) {
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = skills.size()*100+age;
    }

    public void addSkill(String skill){
        this.skills.add(skill);
        this.setSalary();
    }

    public void count(int money){
        System.out.println("It takes "+money/this.getSalary()+" months to earn "+money+" dollars");
    }

    public Human(String name, int age, int birthYear, ArrayList<String> skills) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        this.skills = skills;
        this.salary = skills.size()*100+age;
    }

    public Human(){}

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }
}
