public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(){
        this.dia=1;
        this.mes=1;
        this.año=1900;
    }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    public void setAño(int año) {
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Fecha(int dia, int mes, int año){
        dia=31;
        mes=8;
        año=2005;
    }
    public void valida(){
        if(dia>31 || dia<1){

        }
        if(mes>12 || mes<1){

        }
        if(año<0){

        }

    }
    public int diasMes(int mes){
        int i;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                i=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                i=30;
                break;
            case 2:
                i=28;
                break;
            default:
                i=0;
                break;
        }
        return i;
    }
    public void corto(){
        System.out.println(dia+"-"+mes+"-"+año);
    }
    public void larga(){
        String diA;
        String meS;
        String añO;
        switch (mes) {
            case 1:
                meS="enero";
                break;
            case 3:
                meS="marzo";
                break;
            case 5:
                meS="mayo";
                break;
            case 7:
                meS="julio";
                break;
            case 8:
                meS="agosto";
                break;
            case 10:
                meS="octubre";
                break;
            case 12:
                meS="diciembre";
                break;
            case 4:
                meS="abril";
                break;
            case 6:
                meS="junio";
                break;
            case 9:
                meS="septiembre";
                break;
            case 11:
                meS="noviembre";
                break;
            case 2:
                meS="febrero";
                break;
            default:
                meS="ninguno";
                break;
        }
    }
    public void siguiente(){
        dia = dia + 1;
    }
    public void anterior(){
        dia = dia - 1;
    }

    public void igualQue(Fecha fecha1){

    }
}
