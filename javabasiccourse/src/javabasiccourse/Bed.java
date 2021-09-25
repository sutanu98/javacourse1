package javabasiccourse;

public class Bed {
	private String style;
	private int height,pillows,sheets,quilt;
	public Bed(String style, int height, int pillows, int sheets, int quilt) {
		super();
		this.style = style;
		this.height = height;
		this.pillows = pillows;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	public void make() {
		System.out.println("Bed -> Making | ");
	}
	private String getStyle() {
		return this.style;
	}
	private int getHeight() {
		return this.height;
	}
	private int getPillows() {
		return this.pillows;
	}
	private int getSheets() {
		return this.sheets;
	}
	private int getQuilt() {
		return this.quilt;
	}



}
