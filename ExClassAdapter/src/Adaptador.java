import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Adaptador extends SomadorExistente implements SomadorEsperado {

	public Adaptador() {}

	@Override
	public int somaVetor(int[] vetor) {
		
		ArrayList<Integer> listInt = IntStream.of(vetor).boxed().collect(Collectors.toCollection(ArrayList::new)); 				
		int listSoma = somaLista((List<java.lang.Integer>) listInt);		
		return listSoma;
	}

	

	 
	

}
