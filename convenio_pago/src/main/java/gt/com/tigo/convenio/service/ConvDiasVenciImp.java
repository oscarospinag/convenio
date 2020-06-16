package gt.com.tigo.convenio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.com.tigo.convenio.dtos.ConvDiasVenciDto;
import gt.com.tigo.convenio.entities.ConvDiasVenci;
import gt.com.tigo.convenio.repository.ConvDiasVenciRepository;

@Service
public class ConvDiasVenciImp implements ConvDiasVenciService{
	
	@Autowired
	private ConvDiasVenciRepository repository;

	@Override
	public List<ConvDiasVenci> Listar() {
		// TODO Auto-generated method stub
		return (List<ConvDiasVenci>)repository.findAll();
	}

	@Override
	public ConvDiasVenciDto agregar(ConvDiasVenciDto convDiasVenci) {
		// TODO Auto-generated method stub
		ConvDiasVenci entity = new ConvDiasVenci();
		entity.setDescripcion(convDiasVenci.getDescripcion());
		entity.setValor(convDiasVenci.getValor());
		
		ConvDiasVenci entityDB = repository.save(entity);
		
		ConvDiasVenciDto response = new ConvDiasVenciDto(entityDB.getId(), entityDB.getDescripcion(), entityDB.getValor());
		return response;
	}

	@Override
	public ConvDiasVenci Editar(ConvDiasVenci convDiasVenci) {
		// TODO Auto-generated method stub
		return repository.save(convDiasVenci);
	}

	@Override
	public void Eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public ConvDiasVenci ConvDiasVencifindById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
