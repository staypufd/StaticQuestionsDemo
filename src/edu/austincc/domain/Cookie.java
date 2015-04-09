package edu.austincc.domain;

public class Cookie {
	
	String noseColor = "blankColor";
	String eyeColor = "blankColor";
	String mouthColor = "blankColor";
	int sizeInCm = 5;
	
	public Cookie(String eyeColor, String mouthColor) {
		super();
		this.eyeColor = eyeColor;
		this.mouthColor = mouthColor;
	}
	
	public Cookie(String noseColor, String eyeColor, String mouthColor) {
		super();
		this.noseColor = noseColor;
		this.eyeColor = eyeColor;
		this.mouthColor = mouthColor;
	}

	protected Cookie() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cookie c1 = new Cookie("blue", "orange");
		Cookie c2 = new Cookie("purple", "pink", "mauve");
		Cookie c3 = new Cookie();
		
		System.out.println(c1);
		
		System.out.println(c2);
		
		System.out.println(c3);
		
		System.out.println(0x0A_FF + 0_7);
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cookie [noseColor=").append(noseColor)
				.append(", eyeColor=").append(eyeColor).append(", mouthColor=")
				.append(mouthColor).append("]");
		return builder.toString();
	}
	
	
	

}
