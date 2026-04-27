public class Factura {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {

        if (numeroPieza == null || numeroPieza.trim().isEmpty()) {
            this.numeroPieza = "Sin código";
        } else {
            this.numeroPieza = numeroPieza;
        }

        if (descripcionPieza == null || descripcionPieza.trim().isEmpty()) {
            this.descripcionPieza = "Sin descripción";
        } else {
            this.descripcionPieza = descripcionPieza;
        }

        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        if (precioPorArticulo > 0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }


    public void setNumeroPieza(String numeroPieza) {
        if (numeroPieza != null && !numeroPieza.trim().isEmpty()) {
            this.numeroPieza = numeroPieza;
        }
    }

    public void setDescripcionPieza(String descripcionPieza) {
        if (descripcionPieza != null && !descripcionPieza.trim().isEmpty()) {
            this.descripcionPieza = descripcionPieza;
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }


    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}
