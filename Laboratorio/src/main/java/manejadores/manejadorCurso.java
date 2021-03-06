package manejadores;

import java.util.List;

import javax.persistence.EntityManager;

import clases.Curso;
import conexion.Conexion;

public class manejadorCurso {
	private static manejadorCurso instancia = null;
		
	private manejadorCurso() {}
	
	public static manejadorCurso getInstancia() {
		if(instancia == null) {
			instancia = new manejadorCurso();
		}
		return instancia;
	}
			
	public void agregarCurso(Curso curso) {
		Conexion con = Conexion.getInstancia();
		EntityManager em = con.getEntityManager();
		em.getTransaction().begin();
		em.persist(curso);
		em.getTransaction().commit();
	}
	
	public Curso buscarCurso(String nombre) {
		Conexion con = Conexion.getInstancia();
		EntityManager em = con.getEntityManager();
		return em.find(Curso.class, nombre);
	}
	
	public boolean existeCurso(String nombre) {
		return this.buscarCurso(nombre) instanceof Curso;
	}
	
	public List<Curso> getCursos(){
		Conexion con = Conexion.getInstancia();
		EntityManager em = con.getEntityManager();
		List<Curso> cursos = em.createQuery("SELECT u FROM Curso c", Curso.class).getResultList();
		return cursos;
	}
}
