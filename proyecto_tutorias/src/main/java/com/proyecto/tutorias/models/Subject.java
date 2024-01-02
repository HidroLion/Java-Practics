package com.proyecto.tutorias.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Name must be present")
    @Size(min=2, max=45, message="Name must be more than 2 characters!")
    private String name;
    
    /*-----------------------------------------RELACIONES--------------------------------------------------------------------------*/
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tutorships_id")
    private Tutor tutor;

	public Subject() {
	}

	public Long getId() {	
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
}
