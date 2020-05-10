
public class Main {

	public static void main(String[] args) {
		Phone phone1 = new onePlus();
		Phone phone2 = new IPhone();
		
		System.out.println("<-- One Plus Details -->");
		System.out.println("Operating System --> "+phone1.operatingSystem());
		System.out.println("Processor --> "+phone1.processor());
		System.out.println("Storage Capacity --> "+phone1.storageCapacity()+"\n");
		
		System.out.println("<-- iPhone Details -->");
		System.out.println("Operating System --> "+phone2.operatingSystem());
		System.out.println("Processor --> "+phone2.processor());
		System.out.println("Storage Capacity --> "+phone2.storageCapacity());
	}

}
