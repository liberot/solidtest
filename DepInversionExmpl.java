// https://de.wikipedia.org/wiki/Dependency-Inversion-Prinzip

/* high ''module */ 
class Switch {
	private SwitchClient client;
	private boolean state;	

	public Switch ( SwitchClient client ) {
		this.client = client;
	}

	public void touch () {
		state = !state;	
		if( state ) {
			client.switchOn();
		}
		else {
			client.switchOff();
		}
	}
}

/* controls the interface */ 
interface SwitchClient {
	public void switchOn();
	public void switchOff();
}

/* of the low ''module */ 
class Lamp implements SwitchClient {
	private boolean state;
	
	public void switchOn () {
		this.state = true;
	}

	public void switchOff () {
		this.state = false;
	}
}






class DepInversionExmpl {

	public static void main ( String[] args ) {
		Lamp lamp = new Lamp();
		Switch s = new Switch( lamp );
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
		s.touch();
	}
}
