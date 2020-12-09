package main;

import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("========Pendaftaran Mahasiswa=======");
		System.out.print("Masukkan Nama Depan: ");
		String firstNameString = myScanner.next();
		System.out.print("Masukkan Nama Belakang: ");
		String lastNameString = myScanner.next();
		System.out.print("Masukkan Domisili: ");
		String domisiliString = myScanner.next();
		
		System.out.println();
		System.out.println("=======Data Mahasiswa=======");
		System.out.print("Masukkan NIM: ");
		int cardIdentitas = myScanner.nextInt();
		
		Student student = new Student(firstNameString, lastNameString, domisiliString);
		
		System.out.println();
		System.out.println("=======Informasi Anda=======");
		student.studentRegistration(student.getFullName(), cardIdentitas);	
		System.out.println(student.getDomisili());
		
		System.out.println();
		System.out.print("Jumlah mata kuliah yang Anda ambil: ");
		int ambilMatKul = myScanner.nextInt();
		
		String[] courseNameStrings = new String[ambilMatKul];
		int[] sks = new int[ambilMatKul];
		String[] roomStrings = new String[ambilMatKul];
		String[] lectureStrings = new String[ambilMatKul];
		
		for (int i = 0; i < ambilMatKul; i++) {
			System.out.println();
			System.out.println("======== Data Mata Kuliah =======");
			System.out.print("Nama Mata Kuliah: ");
			courseNameStrings[i] = myScanner.next();
			
			System.out.print("Jumlah SKS: ");
			sks[i] = myScanner.nextInt();
			
			System.out.print("Ruangan: ");
			roomStrings[i] = myScanner.next(); 
			
			System.out.print("Lecturer: " );
			lectureStrings[i] = myScanner.next();
		}
		
		System.out.println();
		System.out.println();
		
		student.calculateTotalSks(sks, student.getFullName());
		
		System.out.println("================ Pengambilan Mata Kuliah ================");
		for(int i = 0; i < ambilMatKul; i++) {
			student.learningPlan(courseNameStrings[i], sks[i], roomStrings[i], lectureStrings[i]);
		}
		System.out.println("=========================================================");
		
		myScanner.close();
		
	}
}	
