import javax.sound.midi.ShortMessage;

public class MidiEvent
{


public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
 { 
	MidiEvent event = null;
	try {
		ShortMessage a = new ShortMessage();
		a.setMessage(comd, chan, one, two);
		//event = new MidiEvent(a, tick);
		event = new MidiEvent();
	}catch( Exception e) 
	{
		e.printStackTrace();
	}
	return event;
//public class MidiEvent {

 }
}