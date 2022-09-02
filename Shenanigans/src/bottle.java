
public class bottle {
	static String type = "metal";
	static String color = "red";
	static boolean openLid = false;
	
	public static void unscrew() {
		openLid = true;
		System.out.println("You unscrewed the bottle");
	}
	public static void screw() {
		openLid = false;
		System.out.println("You screwed the bottle tight");

	}
	public static void bottleInfo() {
		System.out.println("Water Bottle Type: "+type);
		System.out.println("Water Bottle Color: "+color);
		if(openLid == true) {
			System.out.println("The lid is open");
		}
		else {
			System.out.println("The lid is closed");
		}

	}
}
