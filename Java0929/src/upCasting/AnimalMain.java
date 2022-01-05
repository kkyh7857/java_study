package upCasting;

public class AnimalMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		cry(dog);
		cry(cat);
		
//		
//		System.out.println(dog.leg);
//		dog.bark();
		
		// UpCasting: 
		// 하위클래스 타입을 --> 상위 클래스 타입으로 만드는 것!
		// Dog dog = new Dog();
		// Animal animal = god;
		// Animal animal = new Dog();
		// animal(상위클래스 타입) ==> 상위 클래스에 있는 필드와 메소드만 사용가능
		//		단! 오버라이딩 된 메소드는 하위 클래스에 있는 동작을 실행할 수 있다.
		// animal.bark; 

		Animal b = new Dog();
		b.bark();
		// 이걸 풀어쓰면, 
		// Animal b= new Animal();
		// Dog dog = new Dog();
		// Animal b= dog;
		// b.bark;
		
		// DownCasting
		// 상위클래스가 서브클래스로 강제 형변환하는 것;
		// 단! 업캐스팅 된 객체에 한해서만 다운 캐스팅 할 수 있다.
		// Animal animal = new Animal();
		// Dog dog = (Dog)animal;
		// Animal b = new Dog();
		// Dong dog2 = (Dog) b;
		// dog2.shield();
		Dog dog2 = (Dog) b;
		((Dog)b).shield();
	}
	public static void cry(Animal animal) {
		animal.bark();
	}
}
