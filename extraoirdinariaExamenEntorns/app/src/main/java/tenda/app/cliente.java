
import java.util.*;






/**
 * Class cliente
 */



public class cliente {

  

//
  // Fields
  //

 


 private int identificador;
  private String nombre;
  private String apellidos;
  private String dni;
  private String telefono;
  
  




//
  // Constructors
  //
 



 public cliente () { };
  
  



//
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of identificador
   * @param newVar the new value of identificador
   */
  



public void setIdentificador (int newVar) {
    identificador = newVar;
  }

  






/**
   * Get the value of identificador
   * @return the value of identificador
   */
  


public int getIdentificador () {
    return identificador;
  }

  





/**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
 


 public void setNombre (String newVar) {
    nombre = newVar;
  }

 





 /**
   * Get the value of nombre
   * @return the value of nombre
   */
 



 public String getNombre () {
    return nombre;
  }





  /**
   * Set the value of apellidos
   * @param newVar the new value of apellidos
   */
  public void setApellidos (String newVar) {
    apellidos = newVar;
  }

  /**
   * Get the value of apellidos
   * @return the value of apellidos
   */
  public String getApellidos () {
    return apellidos;
  }

  /**
   * Set the value of dni
   * @param newVar the new value of dni
   */
  public void setDni (String newVar) {
    dni = newVar;
  }

  /**
   * Get the value of dni
   * @return the value of dni
   */
  public String getDni () {
    return dni;
  }

  /**
   * Set the value of telefono
   * @param newVar the new value of telefono
   */
  public void setTelefono (String newVar) {
    telefono = newVar;
  }

  /**
   * Get the value of telefono
   * @return the value of telefono
   */
  public String getTelefono () {
    return telefono;
  }

  //
  // Other methods
  //

}














