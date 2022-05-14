package Day_10_DateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	ArrayList<User>kullanicilar=new ArrayList<>();
	public List<User> register(){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi girin");
		String isim=scan.nextLine();
		User user=new User(isim,LocalDateTime.now());
		kullanicilar.add(user);
		return kullanicilar;
	}
	public void  printHappyUsers(ArrayList<User>users) {
		for(User each :users ) {
			if (each.registerData.getSecond()<10) {
				System.out.println("sanslisin "+each.name+" 5 kilo bal ");
			}else {
				System.out.println("maaleseff "+each.name+" hamama");
			}
		}
	}
	public void listele(ArrayList<User>users) {
		for (User each : users) {
			System.out.println("adi: "+each.name+" kayit zamani "+each.registerData);
		}
	}
}
