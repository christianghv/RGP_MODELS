package cl.mp.rgp.common.model;

import org.kie.api.remote.Remotable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@org.kie.api.remote.Remotable
public class EventMetadata implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String idProcedimiento;

	@org.kie.api.definition.type.Label("Causa")
	private cl.mp.rgp.ingreso.model.Causa causa;

	@org.kie.api.definition.type.Label("Usuario")
	private cl.mp.rgp.common.model.PerfilamientoUsuarios usuario;

	private cl.mp.rgp.common.model.Preclasificacion preclasificacion;

	private cl.mp.rgp.flagrancia.model.Procedimiento procedimiento;

	private cl.mp.rgp.common.model.Solicitud solicitud;

	public EventMetadata() {
	}

	public java.lang.String getIdProcedimiento() {
		return this.idProcedimiento;
	}

	public void setIdProcedimiento(java.lang.String idProcedimiento) {
		this.idProcedimiento = idProcedimiento;
	}

	public cl.mp.rgp.ingreso.model.Causa getCausa() {
		return this.causa;
	}

	public void setCausa(cl.mp.rgp.ingreso.model.Causa causa) {
		this.causa = causa;
	}

	public cl.mp.rgp.common.model.PerfilamientoUsuarios getUsuario() {
		return this.usuario;
	}

	public void setUsuario(cl.mp.rgp.common.model.PerfilamientoUsuarios usuario) {
		this.usuario = usuario;
	}

	public cl.mp.rgp.common.model.Preclasificacion getPreclasificacion() {
		return this.preclasificacion;
	}

	public void setPreclasificacion(
			cl.mp.rgp.common.model.Preclasificacion preclasificacion) {
		this.preclasificacion = preclasificacion;
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

	public cl.mp.rgp.flagrancia.model.Procedimiento getProcedimiento() {
		return this.procedimiento;
	}

	public void setProcedimiento(
			cl.mp.rgp.flagrancia.model.Procedimiento procedimiento) {
		this.procedimiento = procedimiento;
	}

	public cl.mp.rgp.common.model.Solicitud getSolicitud() {
		return this.solicitud;
	}

	public void setSolicitud(cl.mp.rgp.common.model.Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public EventMetadata(java.lang.String idProcedimiento,
			cl.mp.rgp.ingreso.model.Causa causa,
			cl.mp.rgp.common.model.PerfilamientoUsuarios usuario,
			cl.mp.rgp.common.model.Preclasificacion preclasificacion,
			cl.mp.rgp.flagrancia.model.Procedimiento procedimiento,
			cl.mp.rgp.common.model.Solicitud solicitud) {
		this.idProcedimiento = idProcedimiento;
		this.causa = causa;
		this.usuario = usuario;
		this.preclasificacion = preclasificacion;
		this.procedimiento = procedimiento;
		this.solicitud = solicitud;
	}

}