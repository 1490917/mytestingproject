package PRAC.TQS;

import PRAC.TQS.Modelo.CasillaAux;
import PRAC.TQS.Modelo.Tablero;

public class CasillaAuxMock implements CasillaAux{

	@Override
	public int[] pasarCoordenadas() {
		int []Coordenadas= {1,2};
		return Coordenadas;
	}

	@Override
	public int prueba(int a, int b) {
		int c=5;
		return c;
	}

}