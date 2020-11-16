package lab09;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Alumno {
 private int dni;
 private String nombre;
 private GregorianCalendar fechaNacimiento;
 
 
 Alumno (int parDni, String parNombre, GregorianCalendar parFechaNacimiento){
	 
	 dni= parDni;
	 nombre= parNombre;
	 fechaNacimiento = parFechaNacimiento;
	 
 }
 
 public int getDni() {
	 return dni; 
 }
 public String nombre() {
	 return nombre;
 }
 public GregorianCalendar getfechaNacimiento() {
	 return fechaNacimiento;
 }
 public void setDni (int parDni) {
	 dni= parDni;
 
 }
 public void setNombre (String parNombre) {
	 nombre= parNombre;	 
}
 public void setFechaNacimiento(GregorianCalendar parFechaNacimiento) {
	 fechaNacimiento= parFechaNacimiento;
 }
 public String toString () {
	 SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	 String fechaNacFormateada= sdf.format(fechaNacimiento.getTime());
	 
	 String alumno= "Dni;"+ dni+ "\n"+ "Nombre; "+ nombre+ "\n"+ "Fecha nacimiento; "+ fechaNacFormateada+ "\n";
	 
	 return alumno;
 }
}
