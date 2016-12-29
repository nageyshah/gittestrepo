
package com.example.gittest.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.gittest.util.HibernateUtil;
import com.example.gittest.entity.Guide;
import com.example.gittest.entity.Student;

public class HelloWorldClient {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin();

			Guide guide1 = new Guide("2000MO10789", "Mike Lawson", 1000);
			Guide guide2 = new Guide("2000IM10901", "Ian Lamb", 2000);

			Student student1 = new Student("2014JT50123", "John Smith", guide1);
			Student student2 = new Student("2014AL50456", "Amy Gill", guide1);

			guide1.getStudents().add(student1);
			guide1.getStudents().add(student2);

			session.persist(guide1);
			session.persist(guide2);

			// Updating inverse end
			/*
			 * Guide guide = (Guide) session.get(Guide.class, 2L); Student
			 * student = (Student) session.get(Student.class, 2L);
			 * guide.getStudents().add(student);
			 */

			// Updating owner
			/*
			 * Guide guide = (Guide) session.get(Guide.class, 2L); Student
			 * student = (Student) session.get(Student.class, 2L);
			 * student.setGuide(guide);
			 */

			// Updating inverse end (after adding addStudent(Student) in Guide
			// entity)
			/*
			 * Guide guide = (Guide) session.get(Guide.class, 2L); Student
			 * student = (Student) session.get(Student.class, 1L);
			 * guide.addStudent(student);
			 */

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public void testFunctionAddedforGIT() {

		Integer addedforGITLP;

		for (int i = 0; i < 5; i++) {
			// added as a function from latop..
		}

	}

	public void branchmergeFunctionAddedforGIT() {

		Integer addedforGITLP;

		for (int i = 0; i < 5; i++) {
			// added as a function from latop..
		}

	}

	public void stillgoingwithTest1() {

		Integer addedforGITLP;

		for (int i = 0; i < 5; i++) {
			// added as a function from latop..
		}

	}
	
	public void testbrachmergetomasterAddedforGIT(){
		
		Integer addedforGITLP;
		
		for(int i=0;i<5;i++){
			// added as a function from latop..
		}
		
		
	}
	
	public void test2brachmergetomasterAddedforGIT(){
		
		Integer addedforGITLP;
		
		for(int i=0;i<5;i++){
			// added as a function from latop..
		}
		
		
	}
	
	public void rebasetestfromVB(){
		
		Integer addedforGITLP;
		
		for(int i=0;i<5;i++){
			// added as a function from latop..
		}
		
		
	}
}
