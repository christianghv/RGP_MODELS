package cl.mp.rgp.ingreso.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Denuncia implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private String idDenuncia;
	private java.util.Date fechaDelito;
	private java.lang.String relatoHecho;

	private java.lang.String tipoDenuncia;

	private cl.mp.rgp.common.model.ArquetipoPersona denunciante;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victima;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> testigo;

	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputado;

	private java.util.List<java.lang.String> tipoDelito;

	private java.lang.String observacion;

	private java.lang.String institucionDenuncia;

	private java.util.List<cl.mp.rgp.common.model.Documentacion> antecedente;

	private java.util.List<cl.mp.rgp.common.model.Especies> especies;

	private cl.mp.rgp.common.model.Direccion ubicacionDelictual;

	private java.lang.String idProcedimiento;

	private java.lang.Boolean existenFallecidos;

	private java.lang.Integer idInstitucionOrigen;

	private java.lang.String ruc;

	private java.lang.String caratula;

	private java.lang.String numeroDenuncia;

	private java.lang.Boolean existenLesionados;

	private java.lang.String alerta;

	private java.lang.Integer cantDocSolicitados;

	private java.lang.Integer cantDocFaltantes;

	private java.lang.Integer cantDocAsociados;

	private java.lang.String idCausa;

	private java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos;

	public Denuncia() {
	}

	public java.util.Date getFechaDelito() {
		return this.fechaDelito;
	}

	public void setFechaDelito(java.util.Date fechaDelito) {
		this.fechaDelito = fechaDelito;
	}

	public java.lang.String getRelatoHecho() {
		return this.relatoHecho;
	}

	public void setRelatoHecho(java.lang.String relatoHecho) {
		this.relatoHecho = relatoHecho;
	}

	public java.lang.String getTipoDenuncia() {
		return this.tipoDenuncia;
	}

	public void setTipoDenuncia(java.lang.String tipoDenuncia) {
		this.tipoDenuncia = tipoDenuncia;
	}

	public cl.mp.rgp.common.model.ArquetipoPersona getDenunciante() {
		return this.denunciante;
	}

	public void setDenunciante(
			cl.mp.rgp.common.model.ArquetipoPersona denunciante) {
		this.denunciante = denunciante;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getVictima() {
		return this.victima;
	}

	public void setVictima(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victima) {
		this.victima = victima;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getTestigo() {
		return this.testigo;
	}

	public void setTestigo(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> testigo) {
		this.testigo = testigo;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getImputado() {
		return this.imputado;
	}

	public void setImputado(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputado) {
		this.imputado = imputado;
	}

	public java.util.List<java.lang.String> getTipoDelito() {
		return this.tipoDelito;
	}

	public void setTipoDelito(java.util.List<java.lang.String> tipoDelito) {
		this.tipoDelito = tipoDelito;
	}

	public java.lang.String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(java.lang.String observacion) {
		this.observacion = observacion;
	}

	public java.lang.String getInstitucionDenuncia() {
		return this.institucionDenuncia;
	}

	public void setInstitucionDenuncia(java.lang.String institucionDenuncia) {
		this.institucionDenuncia = institucionDenuncia;
	}

	public java.util.List<cl.mp.rgp.common.model.Documentacion> getAntecedente() {
		return this.antecedente;
	}

	public void setAntecedente(
			java.util.List<cl.mp.rgp.common.model.Documentacion> antecedente) {
		this.antecedente = antecedente;
	}

	public java.util.List<cl.mp.rgp.common.model.Especies> getEspecies() {
		return this.especies;
	}

	public void setEspecies(
			java.util.List<cl.mp.rgp.common.model.Especies> especies) {
		this.especies = especies;
	}

	public cl.mp.rgp.common.model.Direccion getUbicacionDelictual() {
		return this.ubicacionDelictual;
	}

	public void setUbicacionDelictual(
			cl.mp.rgp.common.model.Direccion ubicacionDelictual) {
		this.ubicacionDelictual = ubicacionDelictual;
	}

	public java.lang.String getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.String idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public java.lang.String getIdDenuncia() {
		return this.idDenuncia;
	}

	public void setIdDenuncia(java.lang.String idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public java.lang.Boolean getExistenFallecidos() {
		return this.existenFallecidos;
	}

	public void setExistenFallecidos(java.lang.Boolean existenFallecidos) {
		this.existenFallecidos = existenFallecidos;
	}

	public java.lang.Integer getIdInstitucionOrigen() {
		return this.idInstitucionOrigen;
	}

	public void setIdInstitucionOrigen(java.lang.Integer idInstitucionOrigen) {
		this.idInstitucionOrigen = idInstitucionOrigen;
	}

	public java.lang.String getRuc() {
		return this.ruc;
	}

	public void setRuc(java.lang.String ruc) {
		this.ruc = ruc;
	}

	public java.lang.String getCaratula() {
		return this.caratula;
	}

	public void setCaratula(java.lang.String caratula) {
		this.caratula = caratula;
	}

	public java.lang.String getNumeroDenuncia() {
		return this.numeroDenuncia;
	}

	public void setNumeroDenuncia(java.lang.String numeroDenuncia) {
		this.numeroDenuncia = numeroDenuncia;
	}

	public java.lang.Boolean getExistenLesionados() {
		return this.existenLesionados;
	}

	public void setExistenLesionados(java.lang.Boolean existenLesionados) {
		this.existenLesionados = existenLesionados;
	}

	public java.lang.String getAlerta() {
		return this.alerta;
	}

	public void setAlerta(java.lang.String alerta) {
		this.alerta = alerta;
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

	public java.lang.Integer getCantDocSolicitados() {
		return this.cantDocSolicitados;
	}

	public void setCantDocSolicitados(java.lang.Integer cantDocSolicitados) {
		this.cantDocSolicitados = cantDocSolicitados;
	}

	public java.lang.Integer getCantDocFaltantes() {
		return this.cantDocFaltantes;
	}

	public void setCantDocFaltantes(java.lang.Integer cantDocFaltantes) {
		this.cantDocFaltantes = cantDocFaltantes;
	}

	public java.lang.Integer getCantDocAsociados() {
		return this.cantDocAsociados;
	}

	public void setCantDocAsociados(java.lang.Integer cantDocAsociados) {
		this.cantDocAsociados = cantDocAsociados;
	}

	public java.lang.String getIdCausa() {
		return this.idCausa;
	}

	public void setIdCausa(java.lang.String idCausa) {
		this.idCausa = idCausa;
	}

	public java.util.List<cl.mp.rgp.flagrancia.model.Delito> getDelitos() {
		return this.delitos;
	}

	public void setDelitos(java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos) {
		this.delitos = delitos;
	}

	public Denuncia(java.lang.String idDenuncia, java.util.Date fechaDelito,
			java.lang.String relatoHecho, java.lang.String tipoDenuncia,
			cl.mp.rgp.common.model.ArquetipoPersona denunciante,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> victima,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> testigo,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> imputado,
			java.util.List<java.lang.String> tipoDelito,
			java.lang.String observacion, java.lang.String institucionDenuncia,
			java.util.List<cl.mp.rgp.common.model.Documentacion> antecedente,
			java.util.List<cl.mp.rgp.common.model.Especies> especies,
			cl.mp.rgp.common.model.Direccion ubicacionDelictual,
			java.lang.String idProcedimiento,
			java.lang.Boolean existenFallecidos,
			java.lang.Integer idInstitucionOrigen, java.lang.String ruc,
			java.lang.String caratula, java.lang.String numeroDenuncia,
			java.lang.Boolean existenLesionados, java.lang.String alerta,
			java.lang.Integer cantDocSolicitados,
			java.lang.Integer cantDocFaltantes,
			java.lang.Integer cantDocAsociados, java.lang.String idCausa,
			java.util.List<cl.mp.rgp.flagrancia.model.Delito> delitos) {
		this.idDenuncia = idDenuncia;
		this.fechaDelito = fechaDelito;
		this.relatoHecho = relatoHecho;
		this.tipoDenuncia = tipoDenuncia;
		this.denunciante = denunciante;
		this.victima = victima;
		this.testigo = testigo;
		this.imputado = imputado;
		this.tipoDelito = tipoDelito;
		this.observacion = observacion;
		this.institucionDenuncia = institucionDenuncia;
		this.antecedente = antecedente;
		this.especies = especies;
		this.ubicacionDelictual = ubicacionDelictual;
		this.idProcedimiento = idProcedimiento;
		this.existenFallecidos = existenFallecidos;
		this.idInstitucionOrigen = idInstitucionOrigen;
		this.ruc = ruc;
		this.caratula = caratula;
		this.numeroDenuncia = numeroDenuncia;
		this.existenLesionados = existenLesionados;
		this.alerta = alerta;
		this.cantDocSolicitados = cantDocSolicitados;
		this.cantDocFaltantes = cantDocFaltantes;
		this.cantDocAsociados = cantDocAsociados;
		this.idCausa = idCausa;
		this.delitos = delitos;
	}
}
