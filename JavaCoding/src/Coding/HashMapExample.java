package Coding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

public class HashMapExample {
	
	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30, "P123");
		Person person2 = new Person("Bob", 40, "P124");

		Car car1 = new Car("Toyota", "Camry", "ABC123");
		Car car2 = new Car("Honda", "Civic", "XYZ789");

		Map<Person, Car> personCarMap = new HashMap<>();
		personCarMap.put(person1, car1);
		personCarMap.put(person2, car2);
		
		List<String> list = personCarMap.values().stream()
							.map(Car::getBrand).toList();	
		System.out.println(list);
		
		List<Entry<Person, Car>> list2 = personCarMap.entrySet().stream()
				.filter(a-> a.getKey().getAge()==30).toList();
		System.out.println(list2);
		
		long count = personCarMap.entrySet().stream().count();
		System.out.println(count);
		
		Map<String, String> collect = personCarMap.entrySet().stream()
					.collect(Collectors.toMap(e->e.getKey().getName(), e->e.getValue().getModel()));
		System.out.println(collect);
	}
}

// ---------------- Car Class ----------------
class Car {
	private String brand;
	private String model;
	private String licensePlate;

	public Car(String brand, String model, String licensePlate) {
		this.brand = brand;
		this.model = model;
		this.licensePlate = licensePlate;
	}

	public String getBrand() { return brand; }
	public String getModel() { return model; }
	public String getLicensePlate() { return licensePlate; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Car)) return false;
		Car car = (Car) o;
		return Objects.equals(licensePlate, car.licensePlate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(licensePlate);
	}

	@Override
	public String toString() {
		return brand + " " + model + " (" + licensePlate + ")";
	}
}

// ---------------- Person Class ----------------
class Person {
	private String name;
	private int age;
	private String id;

	public Person(String name, int age, String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public String getId() { return id; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return Objects.equals(id, person.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return name + " (" + id + ")";
	}

}
