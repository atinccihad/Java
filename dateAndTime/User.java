package Day_10_DateTime;

import java.time.LocalDateTime;

public class User {
	
String name;
LocalDateTime registerData;

public User(){
	
}


public User(String name, LocalDateTime registerData) {

	this.name = name;
	this.registerData = registerData;
}

}
