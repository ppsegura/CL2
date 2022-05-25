package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.repository.IRutasRepository;
import com.cibertec.repository.IBusesRepository;
import com.cibertec.repository.IChoferesRepository;
import com.cibertec.model.Bus;

@Controller
public class BusesController {

	@Autowired
	private IRutasRepository repoc;
	
	@Autowired
	private IChoferesRepository repoc1;
	
	
	@Autowired
	private IBusesRepository repo2;
	
		
	@GetMapping("buses/cargar")
	public String abrirPag(Model model) {
		model.addAttribute("bus", new Bus());
		
		model.addAttribute("lstRutas", repoc.findAll());
		model.addAttribute("lstChoferes", repoc1.findAll());
		
		return "actualiza-psegura";
	}
	
	@GetMapping("buses/listar")
	public String listarPag(Model model) {
		model.addAttribute("lstBuses", repo2.findAll());
		return "consulta-psegura";
	}
	
	
	@PostMapping("buses/grabar")
	public String grabarPag(@ModelAttribute Bus bus, Model model) {
		System.out.println(bus);
		
		try {
			Bus b = repo2.findById(bus.getId_bus()).get();
			System.out.println(b);
			repo2.save(bus);
			model.addAttribute("mensaje","Bus Actualizado");
		} catch (Exception e) {
			model.addAttribute("mensaje","Bus No existe");
		}
			
		model.addAttribute("lstRutas", repoc.findAll());
		model.addAttribute("lstChoferes", repoc1.findAll());
		return "actualiza-psegura";
	}
	
	@PostMapping("buses/editar")
	public String buscarPag(@ModelAttribute Bus bus, Model model) {
		System.out.println("leyendo: "+bus);
		model.addAttribute("bus", repo2.findById(bus.getId_bus()));
		model.addAttribute("lstRutas", repoc.findAll());
		model.addAttribute("lstChoferes", repoc1.findAll());
		
		return "actualiza-psegura";
	}
	
}
