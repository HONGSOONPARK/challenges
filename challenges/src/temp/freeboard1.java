package temp;

public class freeboard1 {

	public static void main (String arg[]) {

		tiger t = new tiger("호랑이");
		t.color();
		t.cry();
//		System.out.println(t.an);
		dog d = new dog();

		System.out.println(d.leg(1, 2));
		System.out.println(d.leg(1, 2, 3));

		d.color("개색깔");
		siba s = new siba();

		System.out.println(s.leg(1, 4));
		System.out.println(s.leg(3, 6, 9));
		s.color("똥색");

		spider man = new spider();

		man.eyes();
		man.fly();
	}
}


abstract class animal{

	String an;
	public animal(String name) {
		an = name;
	}

	public abstract void cry();
	public abstract void color();
}

class tiger extends animal {

	public tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cry(){
		System.out.println("어흥");
	}

	@Override
	public void color() {
		System.out.println("얼룩덜룩");

	}

}


class dog{
	public int leg(int a, int b){
		return a+b;
	}
	public int leg(int a, int b, int c){
		return a+b+c;
	}

	public void color(String color){
		System.out.println("이것저것 : "+color);
	}
}

class siba extends dog{

	@Override
	public int leg(int a, int b) {
		return super.leg(a, b);
	}

	@Override
	public int leg(int a, int b, int c) {
		// TODO Auto-generated method stub
		return super.leg(a, b, c);
	}

	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		System.out.println("시바견은 똥색 :"+color);
	}

}




interface insect{

	public void fly();
	public void eyes();

}


class spider implements insect{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("거미는 못날쥬");
	}

	@Override
	public void eyes() {
		// TODO Auto-generated method stub
		System.out.println("거미는 눈이 많아유");

	}

}




