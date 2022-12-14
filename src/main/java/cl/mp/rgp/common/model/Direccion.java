package cl.mp.rgp.common.model;

/**
 * This class was automatically generated by the data modeler tool.
 */
 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Direccion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long idDireccion;
	private java.lang.String calle;
	private java.lang.String comuna;
	private java.lang.String region;
	private java.lang.String numero;

	public Direccion() {
	}

	public java.lang.Long getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(java.lang.Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public java.lang.String getCalle() {
		return this.calle;
	}

	public void setCalle(java.lang.String calle) {
		this.calle = calle;
	}

	public java.lang.String getComuna() {
		return this.comuna;
	}

	public void setComuna(java.lang.String comuna) {
		this.comuna = comuna;
	}

	public java.lang.String getRegion() {
		return this.region;
	}

	public void setRegion(java.lang.String region) {
		this.region = region;
	}

	public java.lang.String getNumero() {
		return this.numero;
	}

	public void setNumero(java.lang.String numero) {
		this.numero = numero;
	}

	public Direccion(java.lang.Long idDireccion, java.lang.String calle,
			java.lang.String comuna, java.lang.String region,
			java.lang.String numero) {
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.comuna = comuna;
		this.region = region;
		this.numero = numero;
	}
	
    @Override
    public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return json;
    }

}
