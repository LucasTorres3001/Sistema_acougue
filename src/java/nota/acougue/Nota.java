package nota.acougue;

import carnes.resposta.Alcatra;
import carnes.resposta.File;
import carnes.resposta.Picanha;


public class Nota {
    
    private String formaDePagamento, tipo;
    private double kgDeCarne;

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKgDeCarne() {
        return kgDeCarne;
    }

    public void setKgDeCarne(double kgDeCarne) {
        this.kgDeCarne = kgDeCarne;
    }
    
    public String resposta(){
        
        String msg = "";
        
        if(this.getTipo().equals("Alcatra")){ // --------------------------------------------------- * ALCATRA * ---------------------------------------------------
            if(this.getFormaDePagamento().equals("Pagamento a cartao")){
                if(this.getKgDeCarne() <= 3){
                    msg += Alcatra.simAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                }
                else{
                    if(this.getKgDeCarne() > 3){
                        msg += Alcatra.simAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                    }
                }
            }
            else{
                if(this.getFormaDePagamento().equals("Normal")){
                    if(this.getKgDeCarne() <= 3){
                        msg += Alcatra.naoAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                    }
                    else{
                        if(this.getKgDeCarne() > 3){
                            msg += Alcatra.naoAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                        }
                    }
                }
            }
        }
        else if(this.getTipo().equals("File")){ // --------------------------------------------------- * FILÉ DUPLO * ---------------------------------------------------
            if(this.getFormaDePagamento().equals("Pagamento a cartao")){
                if(this.getKgDeCarne() <= 3){
                    msg += File.simAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                }
                else{
                    if(this.getKgDeCarne() > 3){
                        msg += File.simAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                    }
                }
            }
            else{
                if(this.getFormaDePagamento().equals("Normal")){
                    if(this.getKgDeCarne() <= 3){
                        msg += File.naoAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                    }
                    else{
                        if(this.getKgDeCarne() > 3){
                            msg += File.naoAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                        }
                    }
                }
            }
        }
        else{
            if(this.getTipo().equals("Picanha")){ // --------------------------------------------------- * PICANHA * ---------------------------------------------------
                if(this.getFormaDePagamento().equals("Pagamento a cartao")){
                    if(this.getKgDeCarne() <= 3){
                        msg += Picanha.simAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                    }
                    else{
                        if(this.getKgDeCarne() > 3){
                            msg += Picanha.simAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                        }
                    }
                }
                else{
                    if(this.getFormaDePagamento().equals("Normal")){
                        if(this.getKgDeCarne() <= 3){
                            msg += Picanha.naoAbaixoOuIgualA3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                        }
                        else{
                            if(this.getKgDeCarne() > 3){
                                msg += Picanha.naoAcimaDe3Kg(this.getKgDeCarne(), this.getTipo(), this.getFormaDePagamento());
                            }
                        }
                    }
                }
            }
        }
        
        return msg;
    }
}
