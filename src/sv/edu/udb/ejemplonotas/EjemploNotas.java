package sv.edu.udb.ejemplonotas;
import javax.swing.*;

public class EjemploNotas {
	public static void main(String[] args) {
		
		//Declaramos los arreglos
		String[] Lista = new String[5];
		float[][] Notas = new float[5][4];
		float[] Promedios = new float[5];
		
		JOptionPane.showMessageDialog(null,
				"Bienvenidos al sistema de notas");
		
		//Solicitamos los nombres con un while
		int l=0;		
		while(l<Lista.length) {
			Lista[l] = JOptionPane.showInputDialog(null,
					"Ingrese el nombre del alumno "+(l+1));
			l++;
		}
		
		//Solicitamos las notas
		for(int f=0;f<5;f++) {
			for(int c=0;c<4;c++) {
				Notas[f][c] = Float.parseFloat(
						JOptionPane.showInputDialog(null,
						"Ingrese la nota "+(c+1)+
						"del alumno "+Lista[f]));
				
				Promedios[f] =Promedios[f] + Notas[f][c];  
			}
		}
		
		//Calculamos los promedios
		l=0;
		while(l<Promedios.length) {
			Promedios[l] = Promedios[l]/4;
			l++;			
		}
		
		//Declarado con Foreach lo veremos mas adelante
		for(float p : Promedios) {
			p = p/4;
		}
			
//		for(int p=0; p<Promedios.length;p++) {
//			Promedios[p] = Promedios[p]/4;
//		}
		
		//Mostramos los nombres
		for(int m=0;m<Lista.length;m++) {
			JOptionPane.showMessageDialog(null,
				  "Boleta de notas\n"
				+ "Alumno: "+Lista[m]+"\n"
				+ "Nota 1: "+Notas[m][0]+"\n"
				+ "Nota 2: "+Notas[m][1]+"\n"
				+ "Nota 3: "+Notas[m][2]+"\n"
				+ "Nota 4: "+Notas[m][3]+"\n"
				+ "Promedio: "+Promedios[m]);
		}
	}
}
