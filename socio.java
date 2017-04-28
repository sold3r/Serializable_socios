import java.util.*;
import java.io.*;

class socio implements Serializable
{
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private GregorianCalendar nacimiento;
	// constructor
	public socio(String nombre, String apellido1, String apellido2, String nif, GregorianCalendar nacimiento)
	{
		this.nombre= nombre;
		this.apellido1= apellido1;
		this.apellido2= apellido2;
		this.nif= nif;
		this.nacimiento= nacimiento;

	}
	public void muestra()
	{
		System.out.printf("\nNombre: %s\tDNI: %s\tFecha nacimiento:",nombre+" "+apellido1+" "+apellido2,nif); 
		System.out.println(nacimiento.get(Calendar.DAY_OF_MONTH)+"/"+(1+nacimiento.get(Calendar.MONTH))+"/"+nacimiento.get(Calendar.YEAR));		
	}
}
class serializable 
{
	System.out.println("LO SUBO A GIT HUB");	
}
}
