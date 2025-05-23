package java018_collection.part14;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}

//public class HomeAgency implements Rentable{
//	
//	@Override
//	public Home rent() {
//	
//		return null;
//	}
//}
