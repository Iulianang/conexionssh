package buscador_patologia;

public class Consulta {

	
	public static final String BUSCAR_PATOLOGIAS_POR_NOMBRE 
	= "Select nom_patol From Patologias Where id_patol IN (Select id_patol from Patologias Where nom_patol = 'Queratocono')";

	public static final String TABLA_PATOLOGIAS 
	= "Select * From Patologias";
	
	public static final String TABLA_SINTOMAS 
	= "Select * From Sintomas";

	public static final String BUSCAR_PATOLOGIAS_POR_ID
	= "Select * From Patologias Where id_patol = '1'";
}
