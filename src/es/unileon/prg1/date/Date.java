package es.unileon.prg1.date;


/**
 * Clase realizada a partir de los ejercicios propuestos en las diapositivas.
 * @author Iván Sánchez Revuelta
 * @version Inicial
 *   
 */

 public class Date{
/**
 * Atributo que establece el día
 */
    private int day;

/**
 * Atributo que establece el mes
 */
    private int month;

/**
 * Atributo que establece el año
 */
    private int year;
/**
 * Constructor de la clase Date
 * @param day Establece el día
 * @param month Establece el mes
 * @param year Establece el año
 * @throws DateException Lanza la excepción de fecha
 */
public Date(int day, int month, int year) throws DateException{
    this.year = year;
    if (month < 1 || month > 12) {
        throw new DateException("Mes " + month + " no valido" +
                " Valores posibles entre 1 y 12.");
    } else {
        this.month = month;
    }
    if(day<1||day>daysOfMonth(month)){
        throw new DateException("Día "+day+"no válido " +
                "Valores posibles entre 1 y 31.");
    }else{
        this.day=day;
    }
}

@Override
public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
}


/**
 * Método que nos autoriza a utilizar el atributo year
 * @return Devuelve el año 
 */
    public int getYear(){
        return year;
    }

/**
 * Método que nos autoriza a usar el atributo month
 * @return Devuelve el mes
 */
    public int getMonth(){
        return month;
    }

/**
 * Método que nos autoriza a usar el atributo day
 * @return Devuelve el día
 */
    public int getDay(){
        return day;
    }

  /**
     * Método que establece el día    
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Método que establece el mes
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Método que establece el año
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
/**
 * Método que nos devuelve el resultado de comparar el año de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintas
 * @param anotherDate Otra fecha
 */

    public boolean isSameYear(Date anotherDate){
        if(this.year==anotherDate.getYear()){
            return true;
        }else{
            return false;
        }
    }

/**
 * Método que nos devueve el resultado de comparar el mes de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintas
 * @param anotherDate Otra fecha
 */
    public boolean isSameMonth(Date anotherDate){
        if(this.month==anotherDate.getMonth()){
            return true;
        }else{
            return false;
        }
    }

/**
 * Método que nos devuelve el resultado de comparar el día de las fechas dadas
 * @return Devuelve true en caso de ser igual y false en caso de ser distintos
 * @param anotherDate Otra fecha
 */
    public boolean isSameDay(Date anotherDate){
        if(this.day==anotherDate.getDay()){
            return true;
        }else{
            return false;
        }
    }

 /**
  * Método que nos devuelve el resultado de comparar las dos fechas completas
  * @return Devuelve true en caso de ser igual y false en caso de ser distintas
  * @param anotherDate Otra fecha
  */
    public boolean isSame(Date anotherDate){
        if(this.year==anotherDate.getYear()&&this.day==anotherDate.getDay()&&this.month==anotherDate.getMonth()){
            return true;
        }else{
            return false;
        }
    }

/**
* Método que imprime el nombre del mes
* @return Devuelve el nombre del mes
*/

   public String isMonthName(){
        String nombreMes="";

       switch(month){
        case 1:
            nombreMes="Enero";
        break;
        case 2:
            nombreMes="Febrero";
        break;
        case 3:
            nombreMes="Marzo";
        break;
        case 4:
            nombreMes="Abril";
        break;
        case 5:
            nombreMes="Mayo";
        break;
        case 6:
            nombreMes="Junio";
        break;
        case 7:
            nombreMes="Julio";
        break;
        case 8:
            nombreMes="Agosto";
        break;
        case 9:
            nombreMes="Septiembre";
        break;
        case 10:
            nombreMes="Octubre";
        break;
        case 11:
            nombreMes="Noviembre";
        break;
        case 12:
            nombreMes="Diciembre";
        break;
    }
    return nombreMes;
    

    }

/**
 * Método que adjunta una estación a un mes
 * @return Devuelve el nombre de la estación a la que corresponde cada mes
 */
   public String isSeason(){

        String season="";

        switch(month){
            case 12:
            case 1:
            case 2:
                season="invierno";
            break;
            
            case 3:
            case 4:
            case 5:
                season="primavera";
            break;

            case 6:
            case 7:
            case 8:
                season="verano";
            break;
            
            case 9:
            case 10:
            case 11:
                season="otoño";
            break;
        }
        return season;
    }
/**
 * Método que establece el número de días que tiene cada año
 * @return Devuelve el número de días de cada mes
 * @param month Número del mes
 */
    private int daysOfMonth(int month){
        int number=0;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                number=31;
            break;

            case 2:
                number=28;
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                number=30;
            break;            
        }

        return number;

    }

/**
 * Método que comprueba que el número de días es correcto
 * @return Devuelve true si el número de días es correcto y false si no
 */
    public boolean isDayRight(){
        boolean right=true;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day<1||day>31){
                    right=false;
                }
            break;

            case 2:
                if(day<1||day>28){
                    right=false;
                }
            break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(day<1||day>30){
                    right=false;
                }
            break;            
        }

        return right;
    }
/**
 * Método que calcula el número de meses que quedan para que acabe el año
 * @return Devuelve el número de meses que quedan hasta diciembre
 */
    public int isMonthLeft(){
        int left=0;
        switch(month){
            case 1:
                left=11;
            break;

            case 2:
                left=10;
            break;

            case 3:
                left=9;
            break;

            case 4:
                left=8;
            break;

            case 5:
                left=7;
            break;

            case 6:
                left=6;
            break;

            case 7:
                left=5;
            break;

            case 8:
                left=4;
            break;

            case 9:
                left=3;
            break;

            case 10:
                left=2;
            break;

            case 11:
                left=1;
            break;

            case 12:
                left=0;
            break;


        }
        return left;

    }

/**
 * Método que imprime las fechas hasta final de mes
 *
 */
    public void isDateLeft(){
        int i;
        String mensaje="";

        for(i=this.day;i<daysOfMonth(month);i++){
            mensaje=i+"/"+month+"/"+year;
            System.out.println(mensaje+"\n");
        }
    } 

    /**
     * Método que busca los meses que tiene los mismos días que la fecha dada
     * @return Devuelve el nombre de los meses que tienen los mismos días
     */

    public String isMonthSameDays(){
        String months="";
        
        switch(month){
           case 1: 
                months="Marzo, Mayo, Julio, Agosto, Octubre, Diciembre";
            break;

            case 2:
                months="Ninguno";
            break;

            case 3:
                months="Enero, Mayo, Julio, Agosto, Octubre, Diciembre";
            break;

            case 4:
                months="Junio, Septiembre, Noviembre";
            break;

            case 5:
                months="Enero, Marzo, Julio, Agosto, Octubre, Diciembre";
            break;

            case 6:
                months="Abril, Septiembre, Noviembre";
            break;

            case 7:
                months="Enero, Marzo, Mayo, Agosto, Octubre, Diciembre";
            break;

            case 8:
                months="Enero, Marzo, Mayo, Junio, Octubre, Diciembre";
            break;

            case 9:
                months="Abril, Junio, Noviembre";
            break;
        }
        return months;
    }



 }











 



 