package manejadores;

import java.util.List;
import java.util.ArrayList;

import clases.Instituto;
import clases.ProgramaFormacion;

public class manejadorInstitutoYProgForm {
private static manejadorInstitutoYProgForm instancia = null;
	
	private List<Instituto> institutos = new ArrayList<>();

	private List<ProgramaFormacion> programas = new ArrayList<>();
	
	private manejadorInstitutoYProgForm() {}
	
	public static manejadorInstitutoYProgForm getInstancia() {
		if(instancia == null) {
			instancia = new manejadorInstitutoYProgForm();
		}
		return instancia;
	}
	
	//Metodos Instituto
	
	public void addInsituto(Instituto i) {
		institutos.add(i);
	}
	
	public Instituto findInstituto(String nombre) {
		Instituto iEnc = null;
		for(Instituto i : institutos) {
			if(i.getNombre().equals(nombre)) {
				iEnc = i;
			}
		}
		return iEnc;
	}
	
	public boolean existeInstituto(String nombre) {
		boolean existe = false;
		for(Instituto i : institutos) {
			if(i.getNombre().equals(nombre)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public void deleteInstituto(String nombre) {
		Instituto aBorrar = null;
		for(Instituto i : institutos) {
			if(i.getNombre().equals(nombre)) {
				aBorrar = i;
			}
		}
		if(aBorrar != null) {
			aBorrar = null;
			System.gc();
		}
	}
	
	//Metodos Programa de Formacion
	
	public void addProgramaFormacion(ProgramaFormacion pg) {
		programas.add(pg);
	}
	
	public ProgramaFormacion findPrograma(String nombre) {
		ProgramaFormacion pgEnc = null;
		for(ProgramaFormacion pg : programas) {
			if(pg.getNombre().equals(nombre)) {
				pgEnc = pg;
			}
		}
		return pgEnc;
	}
	
	public boolean existePrograma(String nombre) {
		boolean existe = false;
		for(ProgramaFormacion pg : programas) {
			if(pg.getNombre().equals(nombre)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public void deletePrograma(String nombre) {
		ProgramaFormacion aBorrar = null;
		for(ProgramaFormacion pg : programas) {
			if(pg.getNombre().equals(nombre)) {
				aBorrar = pg;
			}
		}
		if(aBorrar != null) {
			aBorrar = null;
			System.gc();
		}
	}

}
