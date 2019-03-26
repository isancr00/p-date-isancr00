package es.unileon.prg1.date;
/**
 * Clase que lanza una excepción
 * @version 1.0
 *  @author Iván Sánchez Revuelta
 */
 @SuppressWarnings("serial")
public class DateException extends Exception{
    /**
     * Método que lanza el error
     * @param message ERROR
     */
    public DateException(String message){
         super(message);
     }
 }