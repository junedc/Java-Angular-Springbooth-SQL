package be.g00glen00b.model;

public enum ItemType {

	YES("Y"), NO("N");

	private String value;

	ItemType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
