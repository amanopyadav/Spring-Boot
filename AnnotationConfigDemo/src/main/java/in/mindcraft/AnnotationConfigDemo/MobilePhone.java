package in.mindcraft.AnnotationConfigDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class MobilePhone {
	private int mid;
	private String make;
	
	@Autowired
	private MemoryCard mcard;
	
	public MemoryCard getMcard() {
		return mcard;
	}
	
	public MobilePhone() {
		
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	
	

}
