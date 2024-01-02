package com.proyecto.tutorias.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "Ingrese un rating")
    private Double rating;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private Date createdAt;
    
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	/*-----------------------------------------RELACIONES--------------------------------------------------------------------------*/
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "ratings_has_users",
		joinColumns = @JoinColumn(name = "rating_id"),
		inverseJoinColumns = @JoinColumn(name = "user_id")
			)
	private List<User> users;
	
	public Rating() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	



}
