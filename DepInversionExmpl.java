// https://de.wikipedia.org/wiki/Dependency-Inversion-Prinzip
// https://de.m.wikipedia.org/wiki/Prinzipien_objektorientierten_Designs#SOLID-Prinzipien

/* high ''module */ 
class Switch {
	private SwitchClient client;

	public Switch ( SwitchClient client ) {
		this.client = client;
	}

	public void touch () {
		client.switchOn();
	}

	public void release () {
		client.switchOff();
	}
}

/* controls the low module via the implemented interface */ 
interface SwitchClient {
	public void switchOn();
	public void switchOff();
}

/* of the low ''module - low module which is detailed in draft and charcteristica and is about to change all the time */ 
class Lamp implements SwitchClient {
	private byte state = 0x01;
	
	public void switchOn () {
		this.state <<= 1;
	}

	public void switchOff () {
		this.state >>= 1;
	}
}

class DepInversionExmpl {
	public static void main ( String[] args ) {
		Lamp lamp = new Lamp();
		Switch s = new Switch( lamp );
		s.touch();
		s.release();
	}
}
