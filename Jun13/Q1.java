interface Animals{
    void speak();
    void eat();
}

class Dog implements Animals{
	public void speak() {
		System.out.println("Dogs bark!");
	}
	public void eat(){
		System.out.println("Dogs eat pedigree.");
	}
}

class Cat implements Animals{
	public void speak() {
		System.out.println("Cats meow!");
	}
	public void eat(){
		System.out.println("Cats eat fish.");
	}
}

public class Q1 {

	public static void main(String[] args) {
		Animals animal = new Cat();
		animal.speak();
		animal.eat();
		animal = new Dog();
		animal.speak();
		animal.eat();
	}

}