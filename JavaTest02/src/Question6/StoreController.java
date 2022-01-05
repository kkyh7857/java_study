package Question6;

import java.util.ArrayList;

public class StoreController {
	ArrayList<Store> store = new ArrayList<Store>();
	Restaurant R;
	Salon S;

	public StoreController() {
		store.add(new Restaurant("해정식당", "음식점", 75, 75, 75, 75));
		store.add(new Restaurant("정림이네", "음식점", 92, 92, 92, 92));
		store.add(new Restaurant("왕뼈사랑", "음식점", 76, 76, 76, 76));
		store.add(new Salon("박승철", "미용실", 89, 89, 89));
		store.add(new Salon("이가자", "미용실", 90, 90, 90));
		store.add(new Salon("리안", "미용실", 80, 80, 80));
	}

	public void printRest() {

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "." + store.get(i).getName() + "\t평점" + store.get(i).grade());
		}
		System.out.println();
	}

	public void printSal() {
		for (int i = 3, j = 1; i < 6; i++, j++) {
			System.out.println(j + "." + store.get(i).getName() + "평정: " + store.get(i).grade());
		}
		System.out.println();
	}

	public void getStore(String name) {
		for (int i = 0; i < store.size(); i++) {
			if (name.equals(store.get(i).getName())) {
				System.out.println("가게명: " + store.get(i).getName());

				for (int j = 10; j <= 100; j += 10) {
					System.out.print(j + "  ");

				}
				System.out.println();
				int num = (int) (store.get(i).grade()/10);
			
				for (int k = 1; k < num; k++) {
					System.out.print("*   ");
				}
				System.out.println();
				System.out.println("평점: " + store.get(i).grade());
			}
		}

	}

	public void getGrade() {
		String[][] arr = new String[10][7];

		int count = 100;
		for (int j = 0; j < arr.length; j++) {
			for(int i=0; i<arr[0].length; i++) {
				if(i==0) {
					arr[j][i] = count+"";
					System.out.print(arr[j][i]+"\t");
					count -= 10;
				} else {
					int num = (int) (store.get(i-1).grade()/10);
					if(j<(arr.length - num)) {
						arr[j][i] = " \t";
						System.out.print(arr[j][i]);						
					}else {
						arr[j][i] = "* \t";
						System.out.print(arr[j][i]);					
					}			
				}
			}System.out.println();
				
			
		}
		System.out.print("\t");
		for (int j = 0; j < store.size(); j++) {
			System.out.print(store.get(j).getName() + "\t");
		}

		System.out.println();
	}

}
