package Entidades;

public class administrativo extends empleado{
	private Integer hsExtra;
	private Integer hsMes;
	public Integer getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(Integer hsExtra) {
		this.hsExtra = hsExtra;
	}
	public Integer getHsMes() {
		return hsMes;
	}
	public void setHsMes(Integer hsMes) {
		this.hsMes = hsMes;
	}
	
	public Float getSueldo() {
		Float sueldo = super.getSueldoBase()*((hsExtra*1.5f)+hsMes)/hsMes;
		return sueldo;
	}
	
	public String getDetalle() {
		String detalle = super.getDetalle();
		detalle+=" ,sueldo: "+this.getSueldo();
		return detalle;
	}
	public administrativo(Integer dni, String nombre, String apellido, String email, Float sueldoBase, Integer hsExtra,
			Integer hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}
	
}
	

