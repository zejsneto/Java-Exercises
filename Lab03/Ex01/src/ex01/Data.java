
package ex01;

/**
 *
 * @author jose neto
 */
public class Data {
    private int mes; //MM
    private int dia; //DD
    private int ano; //YYYY
    private String mesEscrito; //Março
    private int dias; //DDD
    
    /*3 Saídas
    A.MM/DD/YYYY
    B.Março 02,2019
    C.DDD YYYY
    */
    
    //Get e Set p/ mes dia e ano
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMesEscrito() {
        return mesEscrito;
    }

    public void setMesEscrito(String mesEscrito) {
        this.mesEscrito = mesEscrito;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    //Sem argumentos com valores padrão
    public Data(){
        this.mes = 1;
        this.mesEscrito = "Janeiro";
        this.dia = 1;
        this.dias = 1;
        this.ano = 2019;
    }
    
    //Construtor sobrecarregado A -> MM/DD/YYYY
    public Data(int mes, int dia, int ano){
        this.setMes(mes);
        this.setDia(dia);
        this.setAno(ano);
    }
    
    //Construtor sobrecarregado B -> Marco 02,2019
    public Data(String mesEscrito, int dia, int ano){
        this.setMesEscrito(mesEscrito);
        this.setDia(dia);
        this.setAno(ano);
    }
    
    //Construtor sobrecarregado C -> 061 2019
    public Data(int dias, int ano){
        this.setDias(dias);
        this.setAno(ano);
    }
    
    //Imprime 0 se número dias <100
    public String returnDias (int dias) {
        if (dias < 100) {
            return ("0" + dias);
        } else {
            return Integer.toString(dias);
        }
    }
    
    public void imprimeD1(Data d1) {
        System.out.println("i. " + d1.getMes() + "/" + d1.getDia() + "/" + d1.getAno());
    }
    
    public void imprimeD2(Data d2) {
        System.out.println("ii. " + d2.getMesEscrito() + " " + d2.getDia() + ", " + d2.getAno());
    }
    
    public void imprimeD3(Data d3) {
        System.out.println("iii. " + d3.returnDias(d3.getDias()) + " " + d3.getAno());
    }
    
    //TESTE
    /*@Override
    public String toString() {
    return "Data{" + "mes=" + mes + ", dia=" + dia + ", ano=" + ano + ", mesEscrito=" + mesEscrito + ", dias=" + dias + '}';
    }
    
    public void imprime() {
    
    }*/ 
}
