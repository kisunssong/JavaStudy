package inter.pet;

public class MainClass {
	
	public static void main(String[] args) {
	Dog baduk = new Dog();
	Animal nabi = new Cat();
	Tiger hodol = new Tiger();
	
	Animal[] animals = {baduk, nabi, hodol};	
	for(Animal a : animals) {
		a.eat();
	}
	System.out.println("=======================");
	
	IPet[] pets = new IPet[3];
	
	pets[0] = baduk;
// Animal과IPet은 아무관계가없음, 그러므로 IPet[]배열에 넣을땐 IPet타입변환해야함
//	pets[1] = nabi; 
	pets[1] = (IPet)nabi;
//	pets[2] = (IPet)hodol; // 빨간줄없는에러 runtime error
//	pets[2] = new Shark(); //
	pets[2] = new GoldFish();
	
	for(IPet pet : pets) {
		pet.play();
	}
	
	System.out.println("=======================");
	
	PetShop shop = new PetShop();
	shop.carePet(baduk);
	// Animal과IPet은 아무관계가없음, 그러므로 IPet[]배열에 넣을땐 IPet타입변환해야함
	shop.carePet((IPet)nabi);
	shop.carePet(pets[2]);
	}	
}