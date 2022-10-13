package cl.mp.rgp.common.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CDD implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long idCDD;

	private java.lang.Integer idFolio;

	private java.lang.String idDenuncia;

	private java.lang.String idProcedimiento;

	@org.kie.api.definition.type.Label(value = "Indicación relativa al acceso y disposición para consulta del Catálogo Documental Digital (Reservado, No Reservado)")
	private java.lang.Boolean nivelAcceso;

	@org.kie.api.definition.type.Label(value = "Indicación relativa a la disponibilidad para ser consultado.(Disponible, No Disponible)")
	private java.lang.Boolean disponibilidad;

	private java.util.Date fechaCreacion;

	private java.util.Date fechaEliminacion;

	private java.lang.String solicitanteCreacion;

	private java.lang.String solicitanteEliminacion;

	public CDD() {
	}

	public java.lang.Long getIdCDD() {
		return this.idCDD;
	}

	public void setIdCDD(java.lang.Long idCDD) {
		this.idCDD = idCDD;
	}

	public java.lang.Integer getIdFolio() {
		return this.idFolio;
	}

	public void setIdFolio(java.lang.Integer idFolio) {
		this.idFolio = idFolio;
	}

	public java.lang.String getIdDenuncia() {
		return this.idDenuncia;
	}

	public void setIdDenuncia(java.lang.String idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public java.lang.String getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.String idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public java.lang.Boolean getNivelAcceso() {
		return this.nivelAcceso;
	}

	public void setNivelAcceso(java.lang.Boolean nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}

	public java.lang.Boolean getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(java.lang.Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public java.util.Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public java.util.Date getFechaEliminacion() {
		return this.fechaEliminacion;
	}

	public void setFechaEliminacion(java.util.Date fechaEliminacion) {
		this.fechaEliminacion = fechaEliminacion;
	}

	public java.lang.String getSolicitanteCreacion() {
		return this.solicitanteCreacion;
	}

	public void setSolicitanteCreacion(java.lang.String solicitanteCreacion) {
		this.solicitanteCreacion = solicitanteCreacion;
	}

	public java.lang.String getSolicitanteEliminacion() {
		return this.solicitanteEliminacion;
	}

	public void setSolicitanteEliminacion(
			java.lang.String solicitanteEliminacion) {
		this.solicitanteEliminacion = solicitanteEliminacion;
	}

	public CDD(java.lang.Long idCDD, java.lang.Integer idFolio,
			java.lang.String idDenuncia, java.lang.String idProcedimiento,
			java.lang.Boolean nivelAcceso, java.lang.Boolean disponibilidad,
			java.util.Date fechaCreacion, java.util.Date fechaEliminacion,
			java.lang.String solicitanteCreacion,
			java.lang.String solicitanteEliminacion) {
		this.idCDD = idCDD;
		this.idFolio = idFolio;
		this.idDenuncia = idDenuncia;
		this.idProcedimiento = idProcedimiento;
		this.nivelAcceso = nivelAcceso;
		this.disponibilidad = disponibilidad;
		this.fechaCreacion = fechaCreacion;
		this.fechaEliminacion = fechaEliminacion;
		this.solicitanteCreacion = solicitanteCreacion;
		this.solicitanteEliminacion = solicitanteEliminacion;
	}

}