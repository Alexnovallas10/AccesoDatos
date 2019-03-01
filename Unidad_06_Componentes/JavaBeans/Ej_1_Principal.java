package JavaBeans;

import java.beans.PropertyVetoException;

public class Ej_1_Principal{
		   public static void main(String[] args) throws PropertyVetoException{

			   Ej_1_Asalariado empleado = new Ej_1_Asalariado();
			   Ej_1_Hacienda funcionario1 = new Ej_1_Hacienda();    



		        System.out.println("-----PROPIEDADES LIGADAS----------------------");      
		        empleado.addPropertyChangeListener(funcionario1);
		        empleado.setSueldo(50);

		        System.out.println("-----PROPIEDADES RESTRINGIDA----------------------");
		        empleado.addVetoableChangeListener(funcionario1);
		        empleado.setHorasExtras(3);
		        System.out.println("Horas extra: " + empleado.getHorasExtras());
		        
		        /*Para crear el jar introuduces en el cmd-> C:\Users\ifc\git\AccesoDatos\bin\P01_Introduccion_JavaBean>
		        jar cvf ej_1_componentes.jar EJ_1_1_Asalariado.class EJ_1_2_Hacienda.class EJ_1_3_Principal.class
		        
		        Ejecutar el jar-> java -jar ej_1_componentes.jar*/

		        
		    }
		}