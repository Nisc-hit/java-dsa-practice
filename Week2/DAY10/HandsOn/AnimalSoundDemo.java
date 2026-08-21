class Animal{
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}
public class AnimalSoundDemo{
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}