package Day_11_Encapsulation;

public class ArabaMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Araba honda= new Araba();
		//honda.setMotor(1300);
		//honda.setModel("Civic");
		//honda.setYil(2021);
		//System.out.println(honda.getYil());
		Araba volvo=new Araba("xc90","beyaz",2000,2020);
		
		//volvo.setModel("xc90");
		//volvo.setRenk("beyaz");
		//volvo.setMotor(2000);
		//volvo.setYil(2020);
		Araba ww=new Araba("passat","kýrmýzý",1600,2021);
		
		//ww.setModel("passat");
		//ww.setRenk("kýrmýzý");
		//ww.setMotor(1600);
		//ww.setYil(2021);
		
		System.out.println("sectiginiz volvo nun model yili"+volvo.getYil()+" rengi "+volvo.getRenk()+" silindir hacmi "+volvo.getMotor()+"  "+volvo.getModel());
		System.out.println("sectiginiz ww nin model yili "+ww.getYil()+" rengi "+ww.getRenk()+" silindir hacmi "+ww.getMotor()+" "+ww.getModel());
	}

}
