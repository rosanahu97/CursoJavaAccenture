package curso.s2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class numPares {

	public static void main(String[] args) {
		//Ejercicio: listar los numeros pares 
		//List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		int[] array1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] res1 = Arrays.stream(array1)
				.filter(x->x%2==0)
				.toArray();
		/*
		 * List<Integer> numPares = numeros .stream() .filter(x->x%2==0)
		 * .collect(Collectors.toList());
		 * numPares.stream().forEach(System.out::println);

		 */
		Arrays.stream(res1).forEach(System.out::println);
	}

}
