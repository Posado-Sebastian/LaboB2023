package pedidoPlato;

public enum Color {
    ROJO("#FF0000"),AZUL("#0000FF"),VERDE("#00FF00"),AMARILLO("#FFFF00"),VIOLETA("#8000FF"),NEGRO("#000000"),BLANCO("#FFFFFF");

    private String codigo;
    private Color(String codigo) {
        this.codigo = codigo;
    }
    private Color() {
        this.codigo = null;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
