public class main01 {

	public static void main(String[] args) {
//		house house = new house();
//		house.in();
//		house.out();
		House2 slideHouse = new House2(new SlideDoor2());	//미닫이 문을 가진 집
		House2 hingedHouse = new House2(new HingedDoor2());	//여닫이 문을 가진 집
		House2 revolvingHouse = new House2(new RevolvingDoor());	//회전 문을 가진 집
		
		IDoor.foo();
		System.out.println();
		slideHouse.in();
		slideHouse.out();
		System.out.println();
		hingedHouse.in();
		hingedHouse.out();
		System.out.println();
		revolvingHouse.in();
		revolvingHouse.out();
	}

}
