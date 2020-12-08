package main;

import java.util.stream.IntStream;

public class Student extends Person implements StudentInteface{
	
	private String lecture;
	private String courseNameString;
	private int sks;
	private String room;
	private int cardIdentitas;
	private int totalSks;

	
	public Student(String firstName, String lastName, String domisili) {
		super(firstName, lastName, domisili);
	}
	

	@Override
	public void studentRegistration(String fullName, int cardIdentitas) {
		// TODO Auto-generated method stub
		System.out.println("Nama: " + fullName);
		System.out.println("NIM: " + cardIdentitas);
	}

	@Override
	public void learningPlan(String courseName, int sks, String room) {
		// TODO Auto-generated method stub
		System.out.println("Mata Kuliah: " + courseName + ", SKS: " + sks + ", Ruangan: " + room);
	}
	
	public void calculateTotalSks(int[] sks, String fullName) {
		int sum = IntStream.of(sks).sum();
		if(sum < 144) {
			System.out.println("Nama Anda: " + fullName);
		} else {
			System.out.println("Nama Anda: " + fullName + ", S. Kom");
		}
		System.out.println("Total Perolehan SKS: " + sum);
	}

}
