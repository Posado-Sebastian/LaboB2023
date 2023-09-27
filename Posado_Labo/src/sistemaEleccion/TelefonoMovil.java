package sistemaEleccion;

public class TelefonoMovil implements Partidario{
    private int nroSerie;
    private String fabricante;
    private String modelo;
    private int nroCelular;
    private CompaniaTelefonica companiaTelefonica;
    private Boolean prendido;
    private int credito;


    public TelefonoMovil(int nroSerie, String fabricante, String modelo, int nroCelular, CompaniaTelefonica companiaTelefonica) {
        this.nroSerie = nroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.nroCelular = nroCelular;
        this.companiaTelefonica = companiaTelefonica;
    }

    public TelefonoMovil(Boolean prendido, int credito) {
        this.prendido = prendido;
        this.credito = credito;
    }

    public Boolean getPrendido() {
        return prendido;
    }

    public void setPrendido(Boolean prendido) {
        this.prendido = prendido;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public CompaniaTelefonica getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(CompaniaTelefonica companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }

    public int getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }

    @Override
    public void lema(String mensaje) throws NoDisponible{
        if (prendido && credito>0){
            System.out.println("Conectando con la antena más cercana " + mensaje);
        }else if(!prendido && credito>0){
            throw new NoDisponible("El telefono no esta prendido");
        }else if(prendido && credito<=0){
            throw new NoDisponible("El telefono no tiene credito");
        }else {
            throw new NoDisponible("El telefono no esta prendido ni tiene credito");
        }
    }
}
