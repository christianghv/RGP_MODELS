package cl.mp.rgp.flagrancia.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Nomina implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Nominados")
	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> nominados;

	@org.kie.api.definition.type.Label("Procedimientos")
	private java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientos;

	@org.kie.api.definition.type.Label("Id Nomina")
	private java.lang.Integer idNomina;

	@org.kie.api.definition.type.Label("Apercibidos")
	private java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> apercibidos;

	@org.kie.api.definition.type.Label(value = "Procedimientos a Causa")
	private java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientosCausa;

	public Nomina() {
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getNominados() {
		return this.nominados;
	}

	public void setNominados(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> nominados) {
		this.nominados = nominados;
	}

	public java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> getProcedimientos() {
		return this.procedimientos;
	}

	public void setProcedimientos(
			java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}


	public java.lang.Integer getIdNomina() {
		return this.idNomina;
	}

	public void setIdNomina(java.lang.Integer idNomina) {
		this.idNomina = idNomina;
	}

	public java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> getApercibidos() {
		return this.apercibidos;
	}

	public void setApercibidos(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> apercibidos) {
		this.apercibidos = apercibidos;
	}

	public java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> getProcedimientosCausa() {
		return this.procedimientosCausa;
	}

	public void setProcedimientosCausa(
			java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientosCausa) {
		this.procedimientosCausa = procedimientosCausa;
	}

	public Nomina(
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> nominados,
			java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientos,
			java.lang.Integer idNomina,
			java.util.List<cl.mp.rgp.common.model.ArquetipoPersona> apercibidos,
			java.util.List<cl.mp.rgp.flagrancia.model.Procedimiento> procedimientosCausa) {
		this.nominados = nominados;
		this.procedimientos = procedimientos;
		this.idNomina = idNomina;
		this.apercibidos = apercibidos;
		this.procedimientosCausa = procedimientosCausa;
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