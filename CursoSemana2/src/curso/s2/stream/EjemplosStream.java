package curso.s2.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStream {
	
public static void main(String[]args) throws IOException {
	
//imprimir primeros 10 numeros
	Stream.iterate(0,n->n+1)
			.limit(10).forEach(x->System.out.println(x));
	
	
//crear 20 numeros menor que 100	
	Random rand = new Random();
	 Stream.generate(()->rand.nextInt(100))
            .limit(20)
            .forEach(System.out::println);
	 
//crear un stream con stream.of
	 Stream<String> s = Stream.of("hola","como");
	 s.forEach(System.out::println);
	 
//listar el path de los ficheros .java
	 Stream fichero = Files.walk(Paths.get("."));
	 		fichero.filter(o->o.toString().contains(".java"))
	 				.forEach(System.out:: println);


//IntStream 
	 IntStream numeros = IntStream.range(1, 20);
	 numeros.forEach(System.out::println);




}
}
