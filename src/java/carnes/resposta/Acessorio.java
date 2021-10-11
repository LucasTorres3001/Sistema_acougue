package carnes.resposta;

import java.time.LocalDate;
import java.time.LocalTime;


public class Acessorio {
    
    public static double descontoDe5Porc(double a, float A){
        return (((a * A) * 95) / 100);
    }
    
    public static double valorDoDesconto(double a, float A){
        return (((a * A) * 5) / 100);
    }
    
    public static double valorLiquido(double a, float A){
        return (a * A);
    }
    
    public static String dataHourAndAuthor(){
        
        String msg = "";
        
        msg += "<p>" + LocalTime.now().getHour() + " h " + LocalTime.now().getMinute() + " min.</p>";
        msg += "<p>" + LocalDate.now().getDayOfMonth()  + " de " + LocalDate.now().getMonth() + " de " + LocalDate.now().getYear() + "</p>";
        msg += "<p>&copy; <em>by Lucas Torres</em></p>";
        
        return msg;
    }
}
