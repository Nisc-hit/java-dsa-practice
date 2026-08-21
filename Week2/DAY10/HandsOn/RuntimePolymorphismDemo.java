class Animal{
    void makeSound(){
        System.out.println("Generic sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){ System.out.println("Bark");}
}
class Cat extends Animal{
    @Override
    void makeSound(){ System.out.println("Meow");}
}


public class RuntimePolymorphismDemo {
    public static void main(String[]  args){
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1]= new Cat();
        animals[2]= new Dog();
        for(Animal a: animals){
            a.makeSound();
        }
    }
    
}
