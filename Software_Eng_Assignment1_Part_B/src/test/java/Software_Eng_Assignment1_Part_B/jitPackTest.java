package Software_Eng_Assignment1_Part_B;

import static org.junit.Assert.*;

import org.junit.Test;

import Software_Eng_Assignment1_Part_A.*;
import Software_Eng_Assignment1_Part_A.Module;



public class jitPackTest {
	Course_Programme compSci;
	Course_Programme english;
    Module softwareEng;
    Module gameDev;
    Module classicLit;
    Lecturer michael;
    Lecturer dave;
    Lecturer sam;
    Student philip;
    Student simon;
    Student frank;
    String lecturerOutput;
    String moduleOutput;
    String courseOutput;
    String studentOutput;

	@Test
	public void test() {
		michael=new Lecturer("Michael", "38", "20/01/98", "123987");
		dave=new Lecturer("Dave", "196", "29/02/64", "243637");
		sam=new Lecturer("Sam", "25", "02/04/97","34567");
		gameDev=new Module("Game Development", "CT321", sam);
		classicLit=new Module("Classic Literature", "AC401", dave);
        softwareEng=new Module("Software Engineering", "CT417",michael);
        Module[] compSciModules={softwareEng, gameDev};
        Module[] englishModules= {classicLit};
        compSci=new Course_Programme("Computer Science and Information Technology", "01/09/22", "28/05/23", compSciModules);
        english=new Course_Programme("English and Literature", "01/09/22", "28/05/23", englishModules);
        philip=new Student("Philip", "22", "24/05/00", "19328231", compSci);
        simon=new Student("Simon", "27", "11/05/95", "132456", english);
        
        System.out.println(michael);
        System.out.println(dave);
        System.out.println(sam);
        System.out.println(softwareEng);
        System.out.println(gameDev);
        System.out.println(classicLit);
        System.out.println(compSci);
        System.out.println(english);
        System.out.println(philip);
        System.out.println(simon);
		//fail("Not yet implemented");
	}
	
	public static void main(String args[])
	{
		jitPackTest test=new jitPackTest(); 
	}

}
