package ma.fst.tps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ma.fst.tps.models.Client;

@Controller
public class ClientController {

	@Value("${api.url}")
	private String apiUrl;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = { "/", "/clients" })
	public String home(Model model, @ModelAttribute("client") Client clt) {
		//model.addAttribute("client", new Client());
		List<Client> clients = restTemplate.getForObject(apiUrl + "/client/all", List.class);
		model.addAttribute("clients", clients);
		if(clt == null) new Client();
		return "index-client";
	}

	@PostMapping(value = "/add-client", params = "add")
	public String addClient(Model model, @ModelAttribute("client") Client client, RedirectAttributes redirAttrs) {
		System.out.println("client === "+client.getName()+" ******  "+model);
		if(client.getName()=="" ) {
			redirAttrs.addFlashAttribute("error", "Merci de remplir le nom du client !");
		}else { 
			restTemplate.postForObject(apiUrl + "/client/create", client, Client.class);
			redirAttrs.addFlashAttribute("success", "Le client a été bien enregistré !");
		}
		return "redirect:/clients";
	}
	
	@PostMapping(value = "/add-client", params = "update")
	public String updateClient(Model model, @ModelAttribute("client") Client client, RedirectAttributes redirAttrs) {
		if(client.getName()=="" ) {
			redirAttrs.addFlashAttribute("error", "Merci de remplir le nom du client !");
		}else {
			restTemplate.put(apiUrl + "/client/modify", client, Client.class);
			redirAttrs.addFlashAttribute("success", "la modification a été effectuée avec succès !");
		}
		return "redirect:/clients";
	}

	@GetMapping(value = { "/delete-client/{id}" })
	public String deleteClientById(Model model, @PathVariable long id, RedirectAttributes redirAttrs) {
		restTemplate.delete(apiUrl + "/client/" + id);
		redirAttrs.addFlashAttribute("error", "Le client a été bien supprimé !");
		return "redirect:/clients";
	}
	
	@GetMapping(value = { "/show-client/{id}" })
	public String show(@PathVariable long id, RedirectAttributes ra) {
		Client clt = restTemplate.getForObject(apiUrl + "/client/"+id, Client.class);
		//model.addAttribute("client", clt);
		ra.addFlashAttribute("client", clt);
		return "redirect:/clients";
	}
	
	@RequestMapping("/accessdenied")
	public String accessdenied(RedirectAttributes redirAttrs) {
		redirAttrs.addFlashAttribute("msgDenied", "vous n'êtes pas autorisé ");
		return "redirect:/clients";
	}
	


}
