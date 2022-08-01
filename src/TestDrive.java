
public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r1= Rectangle.getInstance();
        Rectangle r2= Rectangle.getInstance();
        Rectangle r3= Rectangle.getInstance();
        Rectangle r4= Rectangle.getInstance();
        r2 =  r1;
        r3 =  r1;
        r4 =  r1;
        
       r1.setWidthHight(6,5);
        
        System.out.println("R1 areac: "+r1.getArea());
        System.out.println("R2 areac: "+r2.getArea());
        System.out.println("R3 areac: "+r3.getArea());
        System.out.println("R4 areac: "+r4.getArea());
        System.out.println("Test");
	}
	

}
