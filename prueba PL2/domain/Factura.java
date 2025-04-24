package domain;

import java.io.Serializable;
import java.util.Date;

public class Factura implements Serializable {
    private String detallesReserva;
    private Date fecha;
    private double importeTotal;

    public Factura(String detallesReserva, Date fecha, double importeTotal) {
        this.detallesReserva = detallesReserva;
        this.fecha = fecha;
        this.importeTotal = importeTotal;
    }

    public String getDetallesReserva() {
        return detallesReserva;
    }

    public void setDetallesReserva(String detallesReserva) {
        this.detallesReserva = detallesReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "detallesReserva='" + detallesReserva + '\'' +
                ", fecha=" + fecha +
                ", importeTotal=" + importeTotal +
                '}';
    }
}