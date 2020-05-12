package domain;

import java.io.Serializable;

public class Person implements Serializable {
	private int idPerson;
	private String namePerson;
	private String emailPerson;

	public Person(int idPerson, String namePerson, String emailPerson) {
		super();
		this.idPerson = idPerson;
		this.namePerson = namePerson;
		this.emailPerson = emailPerson;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", namePerson=" + namePerson + ", emailPerson=" + emailPerson + "]";
	}

}
