package com.logic.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class TransportadoraController {	
	
	List<Transportadora> transportadoras = new ArrayList<>(Arrays.asList(
		new Transportadora(1, 200.00, 0.30),
		new Transportadora(2, 75.00, 0.59),
		new Transportadora(1, 180.00, 0.33),
		new Transportadora(2, 55.00, 1.05),
		new Transportadora(1, 175.00, 0.30)
	));
	
	@RequestMapping("/service/transportadora/")
	public String transportadora() {
		Gson gson = new Gson();		
		return gson.toJson(transportadoras);
	}
	
	@RequestMapping("/service/transportadora")
	public String transportadoraPorTipoTransporte(@RequestParam(value="tipoTransporte", defaultValue="0") String tipoTransporte) {
		List<Transportadora> filtro = transportadoras;
		Gson gson = new Gson();
		if(tipoTransporte != "0") {
			filtro = filtro.stream().filter(item -> item.getTipoTransporte() == Integer.parseInt(tipoTransporte)).collect(Collectors.toList());
		}
		return gson.toJson(filtro);
		
	}
}
