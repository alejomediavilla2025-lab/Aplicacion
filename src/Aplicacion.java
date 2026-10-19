public class Aplicacion {


    private String nombre;
    private String categoria;
    private double tamano;
    private double precio ;
    private int licenciaDisponible;
    private int licenciaVendidad;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
    }

    public Aplicacion(String nombre, String categoria, double tamano, double precio, int licenciaDisponible, int licenciaVendidad){
        this.nombre=nombre;
        this.categoria=categoria;
        this.tamano=tamano;
        this.precio=precio;
        this.licenciaDisponible=licenciaDisponible;
        this.licenciaVendidad=licenciaVendidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String  nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLicenciaDisponible() {
        return licenciaDisponible;
    }

    public void setLicenciaDisponible(int licenciaDisponible) {
        this.licenciaDisponible = licenciaDisponible;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getLicenciaVendidad() {
        return licenciaVendidad;
    }

    public void setLicenciaVendidad(int licenciaVendidad) {
        this.licenciaVendidad = licenciaVendidad;
    }
}
