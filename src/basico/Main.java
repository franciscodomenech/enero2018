package basico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import basico.model.ComparaUtils;

public class Main {

	public static void main(String[] args) {
		double rd = ComparaUtils.compare(2.2, 2.1);
		String r = rd>0?"a > b":(rd<0?"a < b":"a = b");
		System.out.println(r);
		
		int rs = ComparaUtils.compare("A","a");
		r = rs>0?"a > b":(rs<0?"a < b":"a = b");
		System.out.println(r);
		
		int[] list = {6,2,3,7,3,1,9};
		int[] list2 = new int[7];
		for(int i=0;i<list2.length;i++)
			list2[i] = i;
		
		ArrayList<Integer> ld = new ArrayList<Integer>();
		for(int i=0;i<list.length;i++)
			ld.add(list[i]);
		ComparaUtils.removeValue(ld, 3);
		System.out.println(ld);
		
		HashMap<String,List<String>> cursos = new HashMap<String,List<String>>();
		for(int i=0;i<5;i++)
			ComparaUtils.rellenaCurso(cursos, "curso "+i);
		System.out.println(cursos);
		
		System.out.println(ComparaUtils.alumnosOfCurso(cursos, "curso 1"));
		
		System.out.println(ComparaUtils.alumnosOfCurso(cursos, "curso x"));
		
		ComparaUtils.encuentraAlumnos(cursos, "Alumno 2");
		
	}

}
