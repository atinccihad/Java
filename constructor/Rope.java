package day27_28_constructor_constructorCall_staticKeyWord;

public class Rope {
	 public static void swing(){
	        System.out.print("swing");
	    }
	    public void climb(){
	        System.out.print("climb");
	    }
	    public static void play(){
	        swing();
	        // climb();
	    }
	    @SuppressWarnings("static-access")
		public static void main(String[] args) {
	        Rope rope = new Rope();
	        rope.play();
	        Rope rope2 = null;
	        rope2.play();
	    }
}
