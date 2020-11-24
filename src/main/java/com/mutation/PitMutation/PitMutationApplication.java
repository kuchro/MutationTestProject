package com.mutation.PitMutation;

import com.mutation.PitMutation.core.BoyerMooreHorspoolAlgorithm;
import com.mutation.PitMutation.core.Quicksort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PitMutationApplication {

	//private static final Logger LOG = Logger.getLogger(String.valueOf(MutationPitApplication.class));

	public static void main(String[] args) {
		SpringApplication
				.run(PitMutationApplication.class)
				.close();
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Quicksort qs = new Quicksort();
			List<Integer> integers = qs.sort(Arrays.asList(7, 4, 78, 109, 21, 19, 57));
			//	LOG.info((Supplier<String>) integers);

			BoyerMooreHorspoolAlgorithm bmha = new BoyerMooreHorspoolAlgorithm();
			char[] pattern = "sed".toCharArray();
			char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
					+ "elitr, sed diam nonumy eirmod tempor").toCharArray();
			int index = bmha.find(pattern, text);

			//	LOG.info("Found text at index: " + index);
		};
	}

}
