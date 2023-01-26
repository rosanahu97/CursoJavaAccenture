package curso.s2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxMinStream {

	public static void main(String[] args) {
		List<Integer> entrada = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		long max = entrada
					.stream()
					.mapToLong(x->x)
					.max().orElseThrow(NoSuchElementException :: new);
		long min = entrada
					.stream()
					.mapToLong(x->x)
					.min().orElseThrow(NoSuchElementException :: new);				
	
		System.out.println("Max: "+max+ ", "+"Min: "+min);
	
	}

}
