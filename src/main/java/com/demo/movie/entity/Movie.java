package com.demo.movie.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
import lombok.*;
//import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="movieid")
private Integer movieId;
@Column(name="moviename")
private String movieName;
@Column(name="releasedate")
private LocalDate releaseDate;
@Column(name="ticketprice")
private Integer ticketPrice;
private String genre;
}