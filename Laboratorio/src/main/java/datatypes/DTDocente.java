package datatypes;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import datatypes.DTCurso;
import datatypes.DTEdicionCurso;
import datatypes.DTProgramaFormacion;

public class DTDocente extends DTUsuario{
	private List<DTCurso> cursos = new ArrayList<>();
	private List<DTEdicionCurso> ediciones = new ArrayList<>();
	private List<DTProgramaFormacion> programas = new ArrayList<>();	
	
	public DTDocente() {
		super();
	}
	
	public DTDocente(String nick, String nombre, String apellido, String correo, Date fechaNac) {
		super(nick,nombre,apellido,correo,fechaNac);
	}
	
	public void agregarCurso(DTCurso curso) {
		cursos.add(curso);
	}
	public List<DTCurso> getCursos(){
		return cursos;
	}
	
	public void agregarEdicion(DTEdicionCurso edicion) {
		ediciones.add(edicion);
	}
	public List<DTEdicionCurso> getEdiciones(){
		return ediciones;
	}
	
	public void agregarPrograma(DTProgramaFormacion programa) {
		programas.add(programa);
	}
	public List<DTProgramaFormacion> getProgramas(){
		return programas;
	}
}
