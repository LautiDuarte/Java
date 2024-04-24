package Entidades;

public abstract class empleado {
	private Integer dni;
	private String nombre;
	private String apellido;
	private String email;
	private Float sueldoBase;
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(Float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public String getDetalle() {
		String detalle = "DNI: "+this.getDni()+" ,Nombre: "+this.getNombre()+" ,Apellido: "+this.getApellido();
		return detalle;
	}
	public empleado(Integer dni, String nombre, String apellido, String email, Float sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.sueldoBase = sueldoBase;
	}
	
}
