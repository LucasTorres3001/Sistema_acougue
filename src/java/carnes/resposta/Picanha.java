package carnes.resposta;

import java.text.DecimalFormat;


public class Picanha {
    
    public static String simAbaixoOuIgualA3Kg(double kg, String nomeDaCarne, String tipoDePagamento){
        
        DecimalFormat df = new DecimalFormat();
        
        String msg = "";
        
        float kgAbaixoOuIgualA5Kg = 30.9f;
        
        msg += "<table>";
        msg += "    <th colspan='2'>" + nomeDaCarne + "</th>";
        msg += "    <tr>";
        msg += "        <th>qntd. de " + nomeDaCarne + "</th>";
        msg += "        <td>" + kg + " kg</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Preço total</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAbaixoOuIgualA5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Tipo de pagamento</th>";
        msg += "        <td>" + tipoDePagamento + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor do desconto</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorDoDesconto(kg, kgAbaixoOuIgualA5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor a ser pago</th>";
        msg += "        <td>R$ " + df.format(Acessorio.descontoDe5Porc(kg, kgAbaixoOuIgualA5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "</table>";
        
        return msg;
    }
    
    public static String simAcimaDe3Kg(double kg, String nomeDaCarne, String tipoDePagamento){
        
        DecimalFormat df = new DecimalFormat();
        
        String msg = "";
        
        float kgAcimaDe5Kg = 35.9f;
        
        msg += "<table>";
        msg += "    <th colspan='2'>" + nomeDaCarne + "</th>";
        msg += "    <tr>";
        msg += "        <th>qntd. de " + nomeDaCarne + "</th>";
        msg += "        <td>" + kg + " kg</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Preço total</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAcimaDe5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Tipo de pagamento</th>";
        msg += "        <td>" + tipoDePagamento + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor do desconto</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorDoDesconto(kg, kgAcimaDe5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor a ser pago</th>";
        msg += "        <td>R$ " + df.format(Acessorio.descontoDe5Porc(kg, kgAcimaDe5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "</table>";
        
        return msg;
    }
    
    public static String naoAbaixoOuIgualA3Kg(double kg, String nomeDaCarne, String tipoDePagamento){
        
        DecimalFormat df = new DecimalFormat();
        
        String msg = "";
        
        float kgAbaixoOuIgualA5Kg = 30.9f;
        
        msg += "<table>";
        msg += "    <th colspan='2'>" + nomeDaCarne + "</th>";
        msg += "    <tr>";
        msg += "        <th>qntd. de " + nomeDaCarne + "</th>";
        msg += "        <td>" + kg + " kg</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Preço total</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAbaixoOuIgualA5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Tipo de pagamento</th>";
        msg += "        <td>" + tipoDePagamento + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor do desconto</th>";
        msg += "        <td><em>null</em></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor a ser pago</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAbaixoOuIgualA5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "</table>";
        
        return msg;
    }
    
    public static String naoAcimaDe3Kg(double kg, String nomeDaCarne, String tipoDePagamento){
        
        DecimalFormat df = new DecimalFormat();
        
        String msg = "";
        
        float kgAcimaDe5Kg = 35.9f;
        
        msg += "<table>";
        msg += "    <th colspan='2'>" + nomeDaCarne + "</th>";
        msg += "    <tr>";
        msg += "        <th>qntd. de " + nomeDaCarne + "</th>";
        msg += "        <td>" + kg + " kg</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Preço total</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAcimaDe5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Tipo de pagamento</th>";
        msg += "        <td>" + tipoDePagamento + "</td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor do desconto</th>";
        msg += "        <td><em>null</em></td>";
        msg += "    </tr>";
        msg += "    <tr>";
        msg += "        <th>Valor a ser pago</th>";
        msg += "        <td>R$ " + df.format(Acessorio.valorLiquido(kg, kgAcimaDe5Kg)) + " reais</td>";
        msg += "    </tr>";
        msg += "</table>";
        
        return msg;
    }
}