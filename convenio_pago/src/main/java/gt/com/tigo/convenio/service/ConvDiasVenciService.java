package gt.com.tigo.convenio.service;

import java.util.List;

import gt.com.tigo.convenio.dtos.ConvDiasVenciDto;
import gt.com.tigo.convenio.entities.ConvDiasVenci;

public interface ConvDiasVenciService {


	List<ConvDiasVenci> Listar();
	
	ConvDiasVenciDto agregar(ConvDiasVenciDto convDiasVenci);
	
	ConvDiasVenci Editar(ConvDiasVenci convDiasVenci);
	
	void Eliminar (Long id);
	
	ConvDiasVenci ConvDiasVencifindById(Long id);
}
