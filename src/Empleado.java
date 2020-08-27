import javax.swing.JOptionPane;

public class Empleado extends EjercicioPoo {

double sueldo;
String telefono, direccion;
public Empleado(String nom, int ed, double suel,String tel, String dir) {
	super(nom,ed);
	this.direccion=dir;
	this.sueldo=suel;
	this.telefono=tel;
}
	@Override
	public void verDatos() {
		JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\nEdad:"+ edad + "\nSueldo: " +sueldo +"\nTelefono: "
	+ telefono + "\nDirreccion: " + direccion, "Datos del empleado",1 );
	}
}
