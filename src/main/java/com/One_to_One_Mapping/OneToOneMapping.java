package One_to_One_Mapping;

import org.hibernate.Session;

import com.railworld.hibernate.FactoryProvider;

public class OneToOneMapping {

	public static void main(String[] args) {
		Session session = FactoryProvider.getFactory().openSession();
		session.beginTransaction();

		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Student1");
		s1.setRoll("191CS201064");
		s1.setSem("7th");

		School_ids id1 = new School_ids();
		id1.setAadhar("940263980203");
		s1.setIdCards(id1);
   
		session.persist(id1);
		session.persist(s1);
		session.getTransaction().commit();
		session.close();
		
	}
}
