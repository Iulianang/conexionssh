package buscador_patologia;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		Conexion.conexion(Consulta.BUSCAR_PATOLOGIAS_POR_ID);
//		PatologiasDTO id = new PatologiasDTO();
//		Conexion.conexion(Consulta.TABLA_SINTOMAS);
		
//		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
//		hmap.put(arg0, arg1);
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
	

}
