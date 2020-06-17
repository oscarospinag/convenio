package gt.com.tigo.convenio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.tigo.convenio.dtos.ConvDiasVenciDto;
import gt.com.tigo.convenio.entities.ConvDiasVenci;
import gt.com.tigo.convenio.repository.ConvDiasVenciRepository;

@Service
public class ConvDiasVenciImp implements ConvDiasVenciService {

	@Autowired
	private ConvDiasVenciRepository repository;

	@Override
	public List<ConvDiasVenci> listar() {
		// TODO Auto-generated method stub
		return (List<ConvDiasVenci>) repository.findAll();
	}

	@Override
	public ConvDiasVenciDto agregar(ConvDiasVenciDto convDiasVenci) {
		// TODO Auto-generated method stub
		ConvDiasVenci entity = new ConvDiasVenci();
		entity.setDescripcion(convDiasVenci.getDescripcion());
		entity.setValor(convDiasVenci.getValor());
		ConvDiasVenci entityDB = repository.save(entity);
		ConvDiasVenciDto response = new ConvDiasVenciDto(entityDB.getId(), entityDB.getDescripcion(),
				entityDB.getValor());
		return response;
	}

	@Override
	public ConvDiasVenciDto editar(ConvDiasVenciDto convDiasVenci) {
		// TODO Auto-generated method stub
		ConvDiasVenci entity = new ConvDiasVenci();
		entity.setId(convDiasVenci.getId());
		entity.setDescripcion(convDiasVenci.getDescripcion());
		entity.setValor(convDiasVenci.getValor());
		ConvDiasVenci entityDB = repository.save(entity);
		ConvDiasVenciDto response = new ConvDiasVenciDto(entityDB.getId(), entityDB.getDescripcion(),
				entityDB.getValor());
		return response;
	}
	

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public ConvDiasVenciDto ConvDiasVencifindById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
