package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongAgeException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongGradesException;
import ro.ase.csie.cts.g1094.testing.models.Student;

public class TestStudentNewTest {

	//test fixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoGrades;
	
	static ArrayList<Integer> performanceGrades;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		initialName="Johanna Doe";
		initialAge=Student.MIN_AGE+1;
		initialNoGrades=3;
		grades=new ArrayList<>();
		Random random=new Random();
		
		for(int i=0;i<initialNoGrades;i++)
		{
			grades.add(random.nextInt(Student.MAX_GRADE)+1);
		}
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student=new Student(initialName,initialAge,grades);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test(expected=WrongAgeException.class)
	public void testSetAgeRangeMaxValue() throws WrongAgeException {
		int newAge=Integer.MAX_VALUE;
		student.setAge(newAge);
		
	}
	
	@Test(expected=WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException
	{
		int newAge=200;
		student.setAge(newAge);
		
	}
	
	@Test(expected=WrongAgeException.class)
	public void testSetAgeBoundaryLowLimit() throws WrongAgeException
	{
		int newAge=student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age lower limit", newAge,student.getAge());
		
	}
	
	
	@Test(expected=WrongAgeException.class)
	public void testSetAgeBoundaryUpperLimit() throws WrongAgeException
	{
		int newAge=student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Testing with the age upper limit", newAge,student.getAge());
		
	}
	
	
	@Test(expected=WrongGradesException.class)
	public void testSetGradesReferenceDeepCopy() throws WrongGradesException {
		int[] grades=new int[] {9,9,10};
		ArrayList<Integer> refGrades=new ArrayList<Integer>();
		for(int grade:grades)
			refGrades.add(grade);
		
		
		student.setGrades(refGrades);
		refGrades.set(0, 5);
		
		int[] studentGrades=new int[student.getNoGrades()];
		for(int i=0;i<student.getNoGrades();i++)
		{
			studentGrades[i]=student.getGrade(i);
		}
		assertArrayEquals("We do shallowe-copy", grades,studentGrades);
	}
	
	
	@Test(expected=WrongGradesException.class)
	public void testGetGradesAveragePerformance() throws WrongGradesException {
		ArrayList<Integer> grades=new ArrayList<>();
		int noGrades=(int)1e6;
		Random random=new Random();
		for(int i=0;i<noGrades;)
		{
			grades.add(random.nextInt(Student.MAX_GRADE)+1);
		}
		
		student.setGrades(grades);
		
		long tStart=System.currentTimeMillis();
		student.getGradesAverage();
		long tFinal=System.currentTimeMillis();
		
		long delta=tFinal-tStart;
		long performanceLimit=10;
		if(delta<=performanceLimit)
		{
			assertTrue(true);
		}
		else
		{
			fail("Takes too long");
		}
	}
	
	@Test(timeout=12)
	public static void testGradesAveragePerformance2() throws WrongGradesException
	{
		student.setGrades(performanceGrades);
		student.getGradesAverage();
	}
	
	
	
	
	
	
	
	
	
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
