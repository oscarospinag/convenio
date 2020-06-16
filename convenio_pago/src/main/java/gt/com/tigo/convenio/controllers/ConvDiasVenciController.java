package gt.com.tigo.convenio.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import gt.com.tigo.convenio.entities.ConvDiasVenci;
import gt.com.tigo.convenio.service.ConvDiasVenciService;
import gt.com.tigo.convenio.dtos.ConvDiasVenciDto;

@Controller
@RequestMapping("/api")
public class ConvDiasVenciController {
	
	@Autowired
	private ConvDiasVenciService  convDiasVenciService;
	
	@GetMapping("/all")	
	public @ResponseBody List<ConvDiasVenciDto> listar(){
		List<ConvDiasVenci> lista = convDiasVenciService.Listar();
		List<ConvDiasVenciDto> response = new ArrayList<>();
		for (ConvDiasVenci convenio : lista) {
			ConvDiasVenciDto dto = new ConvDiasVenciDto(convenio.getId(), convenio.getDescripcion(),convenio.getValor());
					response.add(dto);
		}		
		
		return response;		
	}	
	
	@PostMapping("/diasVencidos")
	public ConvDiasVenciDto add(@RequestBody ConvDiasVenciDto convDiasVenciDto) {
		ConvDiasVenciDto dto = convDiasVenciService.agregar(convDiasVenciDto);
		return dto;
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") Long id) {

		convDiasVenciService.Eliminar(id);
	}
	
	@PutMapping("/editar/{id}")
	public ConvDiasVenci editar(@PathVariable Long id, @RequestBody ConvDiasVenci convDiasVenci) {

		convDiasVenci.setId(id);

		return convDiasVenciService.Editar(convDiasVenci);

	}


}
