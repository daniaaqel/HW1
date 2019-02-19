package hw;

public class function {

	public onlinecard nobook(onlinecard b) {
		
		b.setbooks(0,0);
		return b;
	}
	public onlinecard onebook(onlinecard d) {
		
		d.setbooks(1, 127);
		return d;
	}
	public onlinecard twobooks(onlinecard q) {
		
		q.setbooks(2, 227);
		return q;
	}
}
