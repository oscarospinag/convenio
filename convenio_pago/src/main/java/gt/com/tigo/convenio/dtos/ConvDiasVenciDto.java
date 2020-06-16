package gt.com.tigo.convenio.dtos;

import java.io.Serializable;

public class ConvDiasVenciDto implements Serializable{
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	 private String descripcion;
	 private Short valor;
	
	 
	 public ConvDiasVenciDto(Long id, String descripcion, Short valor) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Short getValor() {
		return valor;
	}


	public void setValor(Short valor) {
		this.valor = valor;
	}
	 
	 
}
