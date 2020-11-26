package se.bigjohanna.uploadmovies.uploadmovies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import se.bigjohanna.uploadmovies.uploadmovies.properties.FileUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileUploadProperties.class
})
public class UploadmoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadmoviesApplication.class, args);
	}

}
