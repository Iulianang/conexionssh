package buscador_patologia;

import java.util.List;

public class SintomasDTO {


	public class SintomaDTO extends SintomasDTO{
		
		private int id_sintoma;
		private String nombre_sintoma;
		private List<PatologiasDTO> lista_patologias;
		
		public SintomaDTO(int id_sintoma, String nombre_sintoma)
		{
			super();
			this.id_sintoma = id_sintoma;
			this.nombre_sintoma = nombre_sintoma;
		}

		public SintomaDTO(){
			
		}
		
		public SintomaDTO(String nombre_sintoma) {
			this.nombre_sintoma = nombre_sintoma;
		}

		public int getId_sintoma() {
			return id_sintoma;
		}
		public void setId_sintoma(int id_sintoma) {
			this.id_sintoma = id_sintoma;
		}
		public String getNombre_sintoma() {
			return nombre_sintoma;
		}
		public void setNombre_sintoma(String nombre_sintoma) {
			this.nombre_sintoma = nombre_sintoma;
		}
		
	}
}
