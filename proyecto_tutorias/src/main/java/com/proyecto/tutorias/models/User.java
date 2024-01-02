package com.proyecto.tutorias.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotBlank(message = "El nombre es requerido")
	private String first_name;

	@Column(nullable = false)
	@NotBlank(message = "El nombre es requerido")
	private String last_name;
	
	@Column(nullable = false)
	@NotBlank(message = "El email es requerido")
	private String email;

	@Column(nullable = false)
	@NotBlank(message = "La contrseña es requerida")
	@Size(min=8, message="La contraseña debe tener al menos 8 caracteres")
	private String password;

	@Transient
	@NotBlank(message = "Confirme su contraseña")
	private String passwordConfirmation;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private Date createdAt;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	
	/*-----------------------------------------RELACIONES--------------------------------------------------------------------------*/
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private Subscription subscription;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "ratings_has_users",
		joinColumns = @JoinColumn(name = "user_id"),
		inverseJoinColumns = @JoinColumn(name = "rating_id")
			)
	private List<RatingUser> ratings;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Tutor> tutorClass;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Comment> userComments;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Event> userEvents;
    
	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public List<RatingUser> getRatings() {
		return ratings;
	}

	public void setRatings(List<RatingUser> ratings) {
		this.ratings = ratings;
	}

	public List<Tutor> getTutorClass() {
		return tutorClass;
	}

	public void setTutorClass(List<Tutor> tutorClass) {
		this.tutorClass = tutorClass;
	}

	public List<Comment> getUserComments() {
		return userComments;
	}

	public void setUserComments(List<Comment> userComments) {
		this.userComments = userComments;
	}

	public List<Event> getUserEvents() {
		return userEvents;
	}

	public void setUserEvents(List<Event> userEvents) {
		this.userEvents = userEvents;
	}


	
    
    
	
	
	
	

}
