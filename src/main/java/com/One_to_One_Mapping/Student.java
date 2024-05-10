package One_to_One_Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_table")
public class Student {

	@Id
	private int id;
	private String name;
	private String roll;
	private String sem;
	private School_ids idCards;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

	public School_ids getIdCards() {
		return idCards;
	}

	public void setIdCards(School_ids idCards) {
		this.idCards = idCards;
	}

}
