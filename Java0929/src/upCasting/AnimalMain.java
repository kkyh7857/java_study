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
		// ����Ŭ���� Ÿ���� --> ���� Ŭ���� Ÿ������ ����� ��!
		// Dog dog = new Dog();
		// Animal animal = god;
		// Animal animal = new Dog();
		// animal(����Ŭ���� Ÿ��) ==> ���� Ŭ������ �ִ� �ʵ�� �޼ҵ常 ��밡��
		//		��! �������̵� �� �޼ҵ�� ���� Ŭ������ �ִ� ������ ������ �� �ִ�.
		// animal.bark; 

		Animal b = new Dog();
		b.bark();
		// �̰� Ǯ���, 
		// Animal b= new Animal();
		// Dog dog = new Dog();
		// Animal b= dog;
		// b.bark;
		
		// DownCasting
		// ����Ŭ������ ����Ŭ������ ���� ����ȯ�ϴ� ��;
		// ��! ��ĳ���� �� ��ü�� ���ؼ��� �ٿ� ĳ���� �� �� �ִ�.
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
