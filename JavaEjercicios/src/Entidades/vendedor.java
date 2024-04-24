package Entidades;

public class vendedor extends empleado{
	private Float porcenComisiones;
	private Integer totalVentas;
	public Float getPorcenComisiones() {
		return porcenComisiones;
	}
	public void setPorcenComisiones(Float porcenComisiones) {
		this.porcenComisiones = porcenComisiones;
	}
	public Integer getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(Integer totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public Float getSueldo() {
		Float sueldo = super.getSueldoBase()+(porcenComisiones*totalVentas/100);
		return sueldo;
	}
	
	public String getDetalle() {
		String detalle = super.getDetalle();
		detalle+=" ,sueldo: "+this.getSueldo();
		return detalle;
		}
	public vendedor(Integer dni, String nombre, String apellido, String email, Float sueldoBase, Float porcenComisiones,
			Integer totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComisiones = porcenComisiones;
		this.totalVentas = totalVentas;
	}
	
}
