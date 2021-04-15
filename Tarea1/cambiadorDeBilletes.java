
/**
 * Write a description of class cambiadorDeBilletes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cambiadorDeBilletes
{
    private String nombre;
    private  Edad edadActual;
    private double billetes;
    private String fechaNacimiento;
   cambiadorDeBilletes(String nombre,int edad,double billetes,String fechaNacimiento){
      this.nombre = nombre;
      this.billetes = billetes;
      this.fechaNacimiento =  fechaNacimiento;
      Edad  eda = new Edad(edad);
    }
   public String saludar(){
       String saludo;
       return saludo = "hola buenos dias mi  nombre es "+nombre;
    }
   public String cambiarBilletes(){
         String cambiarBillete;
         return cambiarBillete = "cuantos billetes quiere cambiar "+billetes;
        }
   public void modificarEdadActual(int edad){
       edadActual.setEdad(edad);
        }
}
