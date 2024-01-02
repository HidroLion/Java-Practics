package com.proyecto.tutorias.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="tutors")
public class Tutor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Name must be present")
	@Column(columnDefinition = "TEXT")
    private String description;
    
    @NotEmpty(message = "Date must be present")
    private Date schedule;
    
    /*-----------------------------------------RELACIONES--------------------------------------------------------------------------*/
    
    @OneToMany(mappedBy="tutor", fetch = FetchType.LAZY)
    private List<Subject> subjects;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tutor_id")
    private User user;

	public Tutor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSchedule() {
		return schedule;
	}

	public void setSchedule(Date schedule) {
		this.schedule = schedule;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
