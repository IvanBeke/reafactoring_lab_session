package lanSimulation.internals;

public class Printer extends Node {
	public Printer(String name) {
		super(name);
	}

	@Override
	public void printOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}

	@Override
	public void printHTMLOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}

	@Override
	public void printXMLOn(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
}
