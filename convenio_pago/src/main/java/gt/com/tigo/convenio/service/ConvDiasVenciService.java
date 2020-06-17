package gt.com.tigo.convenio.service;

import java.util.List;

import gt.com.tigo.convenio.dtos.ConvDiasVenciDto;
import gt.com.tigo.convenio.entities.ConvDiasVenci;

public interface ConvDiasVenciService {


	List<ConvDiasVenci> listar();
	
	ConvDiasVenciDto agregar(ConvDiasVenciDto convDiasVenci);
	
	ConvDiasVenciDto editar(ConvDiasVenciDto convDiasVenci);
	
	void eliminar (Long id);
	
	ConvDiasVenciDto ConvDiasVencifindById(Long id);
}
