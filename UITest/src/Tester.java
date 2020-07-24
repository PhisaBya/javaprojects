import java.util.*;
public class Tester {

	public static void main(String[] args) {
		int cx = 99, cy = 99, w = 99, h =99;
		int tx, ty; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a title");
		String title = input.nextLine();
		System.out.println("Enter the width of the window:");
		int width = input.nextInt();
		System.out.println("Enter the lenth of the window:");
		int length = input.nextInt();
		Detector detector = new Detector(title,width,length);
		int i= -1;
		int shape=0;
		while(i%2< 0 && shape!=4){
		Random rand = new Random();
		System.out.println("What shape would you like?");
		System.out.println("1. Recangle");
		System.out.println("2. Square");
		System.out.println("3. Triangle");
		System.out.println("4. Exit");
		shape = input.nextInt();
		if (shape == 1){
		System.out.print("Enter two Integers between 100-400 for center: ");
		cx = input.nextInt();
		cy = input.nextInt();
		System.out.print("Enter the width and height of the View: ");
		w = input.nextInt();
		h = input.nextInt();
		tx = 100 +rand.nextInt(301);
		ty = 100 +rand.nextInt(301);
		System.out.println(tx + " , " + ty);
		detector.addPoint(tx, ty);
		detector.addShape(Detector.RECTANGLE, cx, cy, w, h);}
		else if (shape ==2){
			System.out.print("Enter two Integers between 100-400 for center: ");
			cx = input.nextInt();
			cy = input.nextInt();
			System.out.print("Enter the width and height of the View: ");
			w = input.nextInt();
			h = input.nextInt();
			tx = 100 +rand.nextInt(301);
			ty = 100 +rand.nextInt(301);
			System.out.println(tx + " , " + ty);
			detector.addPoint(tx, ty);
			detector.addShape(Detector.SQUARE, cx, cy, w, h);
		}
		else if (shape == 3){
			System.out.print("Enter two Integers between 100-400 for center: ");
			cx = input.nextInt();
			cy = input.nextInt();
			System.out.print("Enter the width and height of the View: ");
			w = input.nextInt();
			h = input.nextInt();
			tx = 100 +rand.nextInt(301);
			ty = 100 +rand.nextInt(301);
			System.out.println(tx + " , " + ty);
			detector.addPoint(tx, ty);
			detector.addShape(Detector.TRIANGLE, cx, cy, w, h);
		}
			
		}
		System.out.println("Done :)");
	}

}
