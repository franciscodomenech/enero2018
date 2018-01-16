package basico.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ComparaUtils {
	public static double compare(double a,double b) {
		return a-b;
	}
	public static int compare(String a,String b) {
		return a.compareTo(b);
	}
	public static ArrayList<Integer> search(int[] l,int v) {
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i=0;i<l.length;i++) {
			if(l[i]==v) {
				r.add(i);
			}
		}
		/*do {
			r++;
		}while(r<l.length && l[r]!=v);
		if(r==l.length) r=-1;*/
		return r;
	}
	
	public static void removeValue(List<Integer> list,int value) {
		/*Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			if(it.next().equals(value)) it.remove();*/
		int i=0;
		while(i<list.size()) {
			if(list.get(i).equals(value))
				list.remove(i);
			else
				i++;
		}
	}
	
	public static void rellenaCurso(HashMap<String,List<String>> cursos,String curso) {
		ArrayList<String> alumnos = new ArrayList<String>();
		for(int i=0;i<10;i++)
			alumnos.add("Alumno "+i);
		cursos.put(curso, alumnos);
	}
	
	public static List<String> alumnosOfCurso(HashMap<String,List<String>> cursos,String curso) {
		return cursos.get(curso);
	}
	
	public static void matricula(HashMap<String,List<String>> cursos,String curso,String alumno) {
		List<String> alumnos = cursos.get(curso);
		if(alumnos==null) {
			ArrayList<String> nuevo = new ArrayList<String>();
			nuevo.add(alumno);
			cursos.put(curso, nuevo);
		}else
			alumnos.add(alumno);
	}
	
	public static List<String> encuentraAlumnos(HashMap<String,List<String>> cursos,String alumno){
		ArrayList<String> cursosOut = new ArrayList<String>();
		Iterator<String> it = cursos.keySet().iterator();
		while(it.hasNext()) {
			String cursoActual = it.next();
			List<String> alumnos = cursos.get(cursoActual);
			if(existeElemento(alumnos,alumno))
				cursosOut.add(cursoActual);
		}
		
		return cursosOut;
	}
	
	private static boolean existeElemento(List<String> elementos,String elemento) {
		//return elementos.indexOf(elemento)!=-1;
		boolean contiene = false;
		for(int i=0;i<elementos.size();i++) {
			if(elementos.get(i).contains(elemento)) {
				contiene = true;
				break;
			}
		}
		return contiene;
	}
	
}
