package ex03;

/**
 *
 * @author @zejsneto
 */
public class Data {
    private int mes;
    private int dia;
    private int ano;
    
    public Data(){
        
    }
    
    public Data(int mes, int dia, int ano){
        this.setMes(mes);
        this.setDia(dia);
        this.setAno(ano);
        
    }
    
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >=1 && mes <=12) {
            this.mes = mes;
        } 
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibeData(){
        System.out.printf("%d/%d/%d",this.getMes(),this.dia,this.getAno());
    }
}
