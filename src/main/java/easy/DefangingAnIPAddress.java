package easy;

//1108. Defanging an IP Address (Easy)
public class DefangingAnIPAddress {

	public String defangIPaddr(String address) {
		return address.replaceAll("\\.", "[.]");
	}

}
