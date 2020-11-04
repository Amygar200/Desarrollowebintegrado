package tare3;
import java.io.Serializable; 
import javax.faces.bean.ManagedBean; 
import javax.faces.bean.RequestScoped; 
@ManagedBean 
@RequestScoped
public class navegador implements Serializable {
	public String metodo2 () {
		return "sonrisa";} 
public String metodo3 () {
	return "ejemplo";}
public String metodo4 () {
	return "facelet";} 
}
