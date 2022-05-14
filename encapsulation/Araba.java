package Day_11_Encapsulation;

public class Araba  {

	
		private String model;
		private String renk;
		private int motor;
		private int yil;
		
		public Araba() {
			
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getRenk() {
			return renk;
		}

		public void setRenk(String renk) {
			this.renk = renk;
		}

		public int getMotor() {
			return motor;
		}

		public void setMotor(int motor) {
			  if (motor>=100) {
				this.motor=motor;
				System.out.println("tekere tas degmesin");
		}else System.out.println("100 beygir asagisi olmaz");
		}
		public int getYil() {
			return yil;
		}

		public void setYil(int yil) {
			if (yil<0) {
				 	System.out.println("negatif yil giremezsiniz");
				 	this.yil=(-1)*yil;
			}else  this.yil=yil;{
				
			}
			
		}
		
		public Araba(String model,String renk,int motor,int yil) {
			this.model=model;
			this.renk=renk;
			//this.motor=motor;
			//this.yil=yil;
			setYil(yil);
			//setModel(model);
			setMotor(motor);
			//setRenk(renk);
			
		}
	
		
		
	

}
