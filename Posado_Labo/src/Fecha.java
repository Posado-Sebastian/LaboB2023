import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    public Fecha(){
        this.dia=1;
        this.mes=1;
        this.año=1900;
    }
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
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

    public void valida(){
        if(dia>31 || dia<1){
            dia=1;
        }
        if(mes>12 || mes<1){
            mes=1;
        }
        if(año<1000 || año>9999){
            año=1900;
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
    public String larga(){
        String meS;
        String diA;
        Calendar c = Calendar.getInstance();
        Calendar date= Calendar.getInstance();
        date.set(año, mes-1, dia);
        Date date1= date.getTime();
        c.setTime(date1);
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
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
        switch (dayOfWeek){
            case 1:
                diA="Domingo";
                break;
            case 2:
                diA="Lunes";
                break;
            case 3:
                diA="Martes";
                break;
            case 4:
                diA="Miercoles";
                break;
            case 5:
                diA="Jueves";
                break;
            case 6:
                diA="Viernes";
                break;
            case 7:
                diA="Sabado";
                break;
            default:
                diA="N/A";
                break;
        }
        String fechaLarga=diA+ " "+dia +" de "+meS+" del "+ año;
        return fechaLarga;
    }
    public void siguiente(){
        if(mes == 1 || mes == 3 || mes == 5 ||mes == 7 || mes == 8 || mes == 10 && dia ==31) {
            dia = 1;
            mes = mes+1;
        }else if(mes == 12 && dia ==31){
            mes=1;
            dia=1;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia ==30){
            mes= mes +1;
            dia=1;
        } else if (dia==28) {
            dia=1;
            mes= mes+1;
        }else{
            dia=dia++;
        }
    }
    public void anterior(){
        if(mes == 1 || mes==    2 || mes == 5 ||mes == 7 || mes == 10 || mes == 12 && dia ==1) {
            dia = 1;
            mes = mes+1;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia ==1){
            mes= mes -1;
            dia=31;
        } else if ( mes == 3  && dia==1) {
            mes= mes-1;
            dia=28;
        }else {
            dia=dia-1;
        }
    }

    public void igualQue(Fecha fecha1){
        if(fecha1.dia == dia && fecha1.mes == mes && fecha1.año == año){
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("Las fechas NO son iguales");
        }
    }
    public int menorQue(Fecha fecha1){
        if(fecha1.dia == dia && fecha1.mes == mes && fecha1.año == año) {
            return 3;
        }else if(fecha1.año >= año){
            if(fecha1.mes>=mes){
                if(fecha1.dia>=dia){
                    return 1;
                }else{
                    return 2;
                }
            }else{
                return 2;
            }
        }else{
            return 2;
        }
    }//uso numeros en vez de un boolean porque hay una tercera opcion que es si las fechas son iguales
    public void mayorQue(Fecha fecha1){
        if(fecha1.dia == dia && fecha1.mes == mes && fecha1.año == año) {
            System.out.println("las fechas son iguales");
        }else if(fecha1.año <= año){
            if(fecha1.mes<=mes){
                if(fecha1.dia<=dia){
                    System.out.println("la fecha es mayor");
                }else{
                    System.out.println("La fecha No es mayor");
                }
            }else{
                System.out.println("La fecha No es mayor");
            }
        }else{
            System.out.println("La fecha No es mayor");
        }
    }
}
