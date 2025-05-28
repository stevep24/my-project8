package gr.aueb.cf.ch15.quiz.quiz1;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog makes sound ");
    }
}
