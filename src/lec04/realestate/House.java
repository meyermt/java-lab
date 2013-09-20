package lec04.realestate;
import java.util.Date;


public class House implements Cloneable {

	// ===============================================
	// ==INSTANCE VARIABLES
	// ===============================================	
	private String strAddress;
	private double dMarketValue;
	private char[][] cAsciis;
	private boolean bForeclosed;
	
	//this gets added later 
	private Date datInstantiated;
	
	
	// ===============================================
	// ==CONSTRUCTOR
	// ===============================================	
	public House(String address, double marketValue,
			char[][] asciis, boolean foreclosed) {
		this.strAddress = address;
		this.dMarketValue = marketValue;
		this.cAsciis = asciis;
		this.bForeclosed = foreclosed;
		
		//this gets added later
		datInstantiated = new Date();
	}

	// ===============================================
	// ==GETTERS AND SETTERS
	// ===============================================
	
	
	


	public String getAddress() {
		return this.strAddress;
	
		
	}



	public void setAddress(String address) {
		this.strAddress = address;
	}



	public double getMarketValue() {
		return this.dMarketValue;
	}

	public void setMarketValue(double marketValue) {
		this.dMarketValue = marketValue;
	}

	public char[][] getAsciis() {
		return this.cAsciis;
	}

	public void setAsciis(char[][] asciis) {
		this.cAsciis = asciis;
	}

	public boolean isForeclosed() {
		return this.bForeclosed;
	}

	public void setForeclosed(boolean foreclosed) {
		this.bForeclosed = foreclosed;
	}
	
	
	
	//these get added later
	public Date getDatInstantiated() {
		return this.datInstantiated;
	}

	public void setDatInstantiated(Date datInstantiated) {
		this.datInstantiated = datInstantiated;
	}

	//
	public void dispaly(){
		
		
		System.out.println(getLine(""));
		System.out.println(getLine(getDatInstantiated() + " : " + getDatInstantiated().getTime() + " : " + getAddress() + " : $" + getMarketValue() + (bForeclosed ? " >FORECLOSED" : "")));
		System.out.println(getLine(""));
		
		for (int nRow = 0; nRow < cAsciis.length; nRow++) {
			for (int nCol = 0; nCol < cAsciis[nRow].length; nCol++){ 
				System.out.print(cAsciis[nRow][nCol]);
			}
			System.out.println();
		}
		
	
	}
	
	
	
	
	private String getLine(String strText){
		
		int nImageWidth = cAsciis[0].length;
		int nTextWidth = strText.length();
		String strResult = strText;
		
		if (nImageWidth > nTextWidth){
			
			for (int nC = 0; nC < nImageWidth -nTextWidth ; nC++) {
				strResult += "#";
			}
			
		}
		
		return strResult;

	}
	
	
	//satisfies the Clonable interface
	 public House clone() throws CloneNotSupportedException {
		 	
		 
		     House houClone =  (House) super.clone();
		     
		     //no need to clone string because it is immutable
		     
		    // comment out below line and see if clone works. 
		     houClone.setDatInstantiated((Date)getDatInstantiated().clone());
		     houClone.setAsciis((char[][])getAsciis().clone());
		     
		     
		     return houClone;
	
		    
		  }
	
	
	
}