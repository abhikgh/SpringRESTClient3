package com.example.SpringRESTClient3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor //for deserialization
public class Movie {

	@JsonProperty
	private Integer movieId;
	@JsonProperty
	private String movieName;
	@JsonProperty
	private String director;
	@JsonProperty
	private String genre;
	@JsonProperty
	private String hero;
	@JsonProperty
	private String year;
	@JsonProperty
	private Boolean nationalAward;
}
