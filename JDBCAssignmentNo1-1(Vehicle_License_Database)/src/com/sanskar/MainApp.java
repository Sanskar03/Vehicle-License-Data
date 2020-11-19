package com.sanskar;

import java.sql.SQLException;
import java.util.Scanner;

import com.sanskar.entity.LicenseType;
import com.sanskar.entity.Person;
import com.sanskar.entity.Service;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add License \n2.Update License \n3.Delete License \n4.Add Person \n5.Update Person \n6.Delete Person\n7.Exit");
			
			System.out.println("\n Choose Your Choice : ");
			int choice = scan.nextInt();
			
			switch(choice)
			{
			case 1:
				
				LicenseType LT1 = new LicenseType(102,"MCWG");
				
				Service s1;
				s1 = new Service();
				s1.saveLicenseType(LT1);
				
				break;
				
			case 2:
				
				LicenseType LT2 = new LicenseType(101,"MCWG");
				
				Service s2 = new Service();
				s2.updateLicenseType(LT2);
				
				break;
				
			case 3:
				
				LicenseType LT3 = new LicenseType(101,"MCWG");
				Service s3 = new Service();
				s3.deleteLicenseType(LT3);
				
				break;
				
			case 4:
				
				Person P1 = new Person(2,"Ankit Abhaykumar Upadhye","Anand Park","Sangli","7498455854",102);
				Service s4 = new Service();
				s4.savePerson(P1);
				
				break;
				
			case 5:
				
				Person P2 = new Person(1,"Sanskar Ganpat Hake","Lovely Circle","Sangli","9999999999",101);
				Service s5 = new Service();
				s5.updatePerson(P2);
				
				break;
				
			case 6:
				
				Person P3 = new Person(1,"Sanskar Ganpat Hake","Lovely Circle","Sangli","9999999999",101);
				Service s6 = new Service();
				s6.deletePerson(P3);
				
				break;
				
			case 7:
				System.exit(0);
				
			default:
				System.out.println("        : INVALID CHOICE :        ");
					
			}
		
		}

	}

}
