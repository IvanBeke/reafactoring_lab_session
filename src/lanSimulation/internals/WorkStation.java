package lanSimulation.internals;

public class WorkStation extends Node {
	public WorkStation(String name) {
		super(name);
	}

	@Override
	public void printOn(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

	@Override
	public void printHTMLOn(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

	@Override
	public void printXMLOn(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}
}
