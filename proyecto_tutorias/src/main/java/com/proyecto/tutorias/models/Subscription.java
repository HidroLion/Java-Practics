package com.proyecto.tutorias.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "subscriptions")
public class Subscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private Date start_date;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(nullable = false)
	private Date end_date;
	
	@Column(nullable = false)
    private Double price;
	
	@PrePersist
	protected void onCreate() {
		this.start_date = new Date();
	}
	
	/*-----------------------------------------RELACIONES--------------------------------------------------------------------------*/

	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

	public Subscription() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
