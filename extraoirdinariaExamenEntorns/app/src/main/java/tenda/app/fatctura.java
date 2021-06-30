
import java.util.*;


/**
 * Class fatctura
 */
public class fatctura {

  //
  // Fields
  //

  private int numero;
  private Date fecha;
  private float importe;
  
  //
  // Constructors
  //
  public fatctura () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numero
   * @param newVar the new value of numero
   */
  public void setNumero (int newVar) {
    numero = newVar;
  }

  /**
   * Get the value of numero
   * @return the value of numero
   */
  public int getNumero () {
    return numero;
  }

  /**
   * Set the value of fecha
   * @param newVar the new value of fecha
   */
  public void setFecha (Date newVar) {
    fecha = newVar;
  }

  /**
   * Get the value of fecha
   * @return the value of fecha
   */
  public Date getFecha () {
    return fecha;
  }

  /**
   * Set the value of importe
   * @param newVar the new value of importe
   */
  public void setImporte (float newVar) {
    importe = newVar;
  }

  /**
   * Get the value of importe
   * @return the value of importe
   */
  public float getImporte () {
    return importe;
  }

  //
  // Other methods
  //

}
