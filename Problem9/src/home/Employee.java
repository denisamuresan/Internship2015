package home;

public class Employee {

	String familyName, firstName;
	public int hasReceivedFlag, hasGaveFlag;

	public Employee() {
		hasReceivedFlag = 0;
		hasGaveFlag = 0;
	}

	public void setFamilyName(String name) {
		this.familyName = name;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setReceivedFlag(int flag) {
		this.hasReceivedFlag = flag;
	}

	public void setGaveFlag(int flag) {
		this.hasGaveFlag = flag;
	}

	public int getReceivedFlag() {
		return this.hasReceivedFlag;
	}

	public int getGaveFlag() {
		return this.hasGaveFlag;
	}
}
