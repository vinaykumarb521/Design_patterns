package protoTypeDesignPattern;

public class StudentOne implements ProtoTypePattern {

	private int id;
	public String name;

	public StudentOne(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public ProtoTypePattern clone() throws CloneNotSupportedException {

		return (ProtoTypePattern) super.clone();
	}

}
