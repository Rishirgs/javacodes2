
public class getterandSetter {
	public static void main(String[] args) {
		games g=new games();
		g.setName("SMACKDOWN HERE COMES THE PAIN");
		g.setVersion("Playstation 2");
		g.setMode("Arcade + Story");
		g.setRelYear(2003);
		System.out.println("\ngame names :"+g.getName()+ "\ngame version :"+g.getVersion()+"\nmode :"+g.getMode()+"\nyear :"+g.getRelYear());
	}

}
class games{
	private String name="";
	private String version="";
	private String mode="";
	private int relYear=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getRelYear() {
		return relYear;
	}
	public void setRelYear(int relYear) {
		this.relYear = relYear;
	}
}