package javabasiccourse;

public class Bedroom {
	private String name;
	RoomWall wall1,wall2,wall3,wall4;
	Ceiling ceiling;
	Lamp lamp;
	Bed bed;
	public Bedroom(String name, RoomWall wall1, RoomWall wall2, RoomWall wall3, RoomWall wall4, Ceiling ceiling,
			Lamp lamp, Bed bed) {
		super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.lamp = lamp;
		this.bed = bed;
	}
	private Lamp getLamp() {
		return this.lamp;
	}
	private void makeBed() {
		System.out.println("BedRoom -> Making Bed | ");
		this.bed.make();
	}

}
