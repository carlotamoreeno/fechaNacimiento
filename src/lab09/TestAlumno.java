package lab09;

import java.util.GregorianCalendar;

public class TestAlumno {

	public static void main(String[] args) {
		GregorianCalendar fechaNacimientoJuan = new GregorianCalendar(1985, 10, 23);

		Alumno alumnoJuan = new Alumno(19222031, "Juan", fechaNacimientoJuan);
		
		System.out.println(alumnoJuan.toString());
		
		
		

	}

}
