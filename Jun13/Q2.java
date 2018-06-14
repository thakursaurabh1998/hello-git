abstract class Animals{
    int legs;
    int tail;
    abstract void eat();
    void speak(){
        System.out.println("Animals Speak.");
    }
}

class Cat extends Animals{
    Cat(){
        this.legs = 4;
        this.tail = 1;
    }
    void eat(){
		System.out.println("Cats eat fish.");
    }
}

class Dog extends Animals{
    Dog(){
        this.legs = 4;
        this.tail = 1;
    }
    void eat(){
		System.out.println("Dogs eat pedigree.");
    }
}

public class Q2 {

	public static void main(String[] args) {
		Animals animal = new Cat();
		animal.speak();
		animal.eat();
		animal = new Dog();
		animal.speak();
		animal.eat();
	}

}