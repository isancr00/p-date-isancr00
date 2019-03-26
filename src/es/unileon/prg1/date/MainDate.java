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

            int i;
            System.out.println(fecha.toString());
            System.out.println(otra.toString());
                      
            
            do{
               
                System.out.println("\nEscriba lo que quiere hacer: "+"\n"+"0-Salir"+"\n"+
                "1-¿Coincide el año?"+"\n"+"2-¿Coincide el mes?"+"\n"
                +"3-¿Coincide el día?"+"\n"+"4-¿Coincide la fecha?"+"\n"+"5-Nombre mes"+"\n"+"6-Estación"+"\n"+"7-¿Es correcto el día?"+
                "\n"+"8-Meses que faltan hasta fin año"+"\n"+"9-Días que quedan fin mes"+"\n"+"10-Mes mismos días"+"\n"+"11-Intentos fecha aleatoria"+
                "\n"
                );
                
                i=Teclado.readInteger();
            
                switch(i){
                    case 0:
                        System.out.println("Saliendo del programa");
                    break;

                    case 1:
                        System.out.println(fecha.isSameYear(otra)+"\n");
                    break;

                    case 2:
                        System.out.println(fecha.isSameMonth(otra)+"\n");
                    break;

                    case 3:
                        System.out.println(fecha.isSameDay(otra)+"\n");
                    break;

                    case 4:
                        System.out.println(fecha.isSame(otra)+"\n");
                    break;

                    case 5:
                        System.out.println("El nombre del mes es "+fecha.isMonthName()+"\n");
                    break;

                    case 6:
                        System.out.println("La estación es "+fecha.isSeason()+"\n");
                    break;

                    case 7:
                        System.out.println(fecha.isDayRight()+"\n");
                    break;

                    case 8:
                        System.out.println("Los meses que quedan hasta que acabe el año son "+fecha.isMonthLeft()+"\n");
                    break;

                    case 9:
                        System.out.println("Los días que quedan hasta que acabe el mes son: ");
                        fecha.isDateLeft();
                        System.out.println("\n");
                    break;

                    case 10:
                        System.out.println("Los meses que tienen los mismos días que el mes introducido son "+fecha.isMonthSameDays());
                    break;

                    case 11:
                        System.out.println("Los intentos son: "+fecha.israndomDate()+"\n");
                    break;

                    case 12:
                        System.out.println("Los intentos son: "+fecha.israndomDateDo()+"\n");
                    break;

                    default:
                        System.out.println("ERROR. Lea la primera instrucción\n");

                }

            }while(i!=0);
                
            

            
        }catch(DateException e){
            System.out.println(e.getMessage());
        }

    }
 }      
    
 