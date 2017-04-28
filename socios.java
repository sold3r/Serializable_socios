import java.io.*;

public class socios
{
	// metodo para leer el fichero socios.txt y escribirlo a socios.dat
	public void escrituraFichero()
	{
		File f=new File("socios.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(f));
		FileOutputStream fos=new FileOutputStream("socios.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		// separamos por atributos
		while(br.hasNext())
		{
			String linea=sc.nextLine();
		// crear a partir de la línea el StringTokenizer
			StringTokenizer st=new StringTokenizer(linea);
		// cada token será un parámetro para el constructor de socio
			String nombre=st.nextToken();
			String apellido1=st.nextToken();
			String apellido2=st.nextToken();
			String nif=st.nextToken();
			String fecha=st.nextToken();
			StringTokenizer stfecha=new StringTokenizer(fecha,"/");
			int dia=Integer.parseInt(stfecha.nextToken());
			int mes=Integer.parseInt(stfecha.nextToken())-1;
			int anyo=Integer.parseInt(stfecha.nextToken());
			GregorianCalendar gc=new GregorianCalendar(anyo,mes,dia);
			socio s=new socio(nombre,apellido1,apellido2,nif,gc);
			// serializo el socio
			oos.writeObject(s);
		}
		// lectura

		// escritura

	}
}
class serializablee
{
	System.out.println("TRABAJO GIT HUB");
}
