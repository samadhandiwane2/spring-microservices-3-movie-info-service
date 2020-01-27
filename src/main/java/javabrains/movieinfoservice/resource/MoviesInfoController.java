package javabrains.movieinfoservice.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javabrains.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MoviesInfoController {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Value("${api.key")
	private String apikey;
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		/* MovieSummary movieSummary = restTemplate.getForObject(
				"https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apikey, 
				MovieSummary.class); */
		return new Movie(movieId, "Movie Name", "Movie Description");
	}

}
