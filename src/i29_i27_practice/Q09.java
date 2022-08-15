package i29_i27_practice;

public class Q09 {
    public static void main(String[] args) {
         /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        int numberOfBananas = 165, survialDays = 0;
        boolean monkeyAlive = true;

        do {
            System.out.println("maymunlar gunde 4 muz yer");
            numberOfBananas -= 4; // toplam muzdan 4 azalir
            survialDays++; // yasadigi gun sayisi 1 artir
            if (numberOfBananas < 4) { // 4 den az muz kalirsa
                monkeyAlive = false; // maymun hayatta degil
                System.out.println("bugun " + survialDays + ".gun muz kalmadi, maymun is killed..:(");
            } else {
                System.out.println("bugun " + survialDays + ".gun ,maymun hala hayatta..:)");
            }
        } while (monkeyAlive);
        System.out.println("toplam yasadigi gun sayisi: " + (survialDays - 1));
    }
}

