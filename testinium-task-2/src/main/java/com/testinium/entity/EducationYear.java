/**
 * 
 */
package com.testinium.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name="educationyears")
public class EducationYear {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String year;
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private List<Lesson> lesson;
	/**
	 * 
	 */
	public EducationYear() {
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the lesson
	 */
	public List<Lesson> getLesson() {
		return lesson;
	}

	/**
	 * @param lesson the lesson to set
	 */
	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EducationYear other = (EducationYear) obj;
		return Objects.equals(id, other.id) && Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "EducationYear [id=" + id + ", year=" + year + ", lesson=" + lesson + "]";
	}

	
	
	
}