class Animal{
    int legs=4;
    int ears=2;
    int eyes=2;
    int tail=1;
    void speak(){
        System.out.println("Animals Speak");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("Cats meow...!!");
    }
}

class Dog extends Animal{
    void speak(){
        System.out.println("Dogs bark...!!");
    }
}

public class Q2{
    public static void main(String args[]){
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.speak();
        dog.speak();
    }
}