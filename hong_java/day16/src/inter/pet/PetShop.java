package inter.pet;

public class PetShop {
	
	public void carePet(IPet pet) {
		
		if(pet instanceof Dog) {
			System.out.println("�������� �����ϴ�.");
		}else if(pet instanceof Cat) {
			System.out.println("����̸� �����ϴ�.");
		}else if(pet instanceof GoldFish) {
			System.out.println("�ݺؾ �����ϴ�.");
		}
	}
}
