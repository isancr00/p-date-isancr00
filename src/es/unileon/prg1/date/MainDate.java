package es.unileon.prg1.date;


/**
 * Clase que contiene el main de la clase Date.
 * @author Iván Sánchez Revuelta
 * @version Inicial
 *   
 */

 public class MainDate{
/**
 * Método principal de la clase Date
 * @param args Argumentos del main
 */
     public static void main(String args[]){
        Date fecha,otra;
        
        try{
            fecha=new Date(6,8,2018);
            otra= new Date (6,3,2018);

            System.out.println("¿Coincide el año? "+ fecha.isSameYear(otra)+"\n");
            System.out.println("¿Coincide el mes? "+fecha.isSameMonth(otra)+"\n");
            System.out.println("¿Coincide el día? "+fecha.isSameDay(otra)+"\n");
            System.out.println("¿Coincide la fecha? "+fecha.isSame(otra)+"\n");
            System.out.println("El nombre del mes es "+fecha.isMonthName(fecha)+"\n");
            System.out.println("La estación es "+fecha.isSeason(fecha)+"\n");
            System.out.println("¿Es correcto el día? "+fecha.isDayRight(fecha)+"\n");
            System.out.println("Los meses que quedan hasta que acabe el año son "+fecha.isMonthLeft(fecha)+"\n");
            
        }catch(DateException e){
            System.out.println(e.getMessage());
        }

    }      
    
 }