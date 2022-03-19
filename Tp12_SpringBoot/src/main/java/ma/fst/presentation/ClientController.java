package ma.fst.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.fst.models.Client;
import ma.fst.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private IClientService service;
	
	@PostMapping("/create")
	public Client save(@RequestBody Client clt){
        return service.save(clt);
    }
	
	@PutMapping("/modify")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }
	
	@DeleteMapping("/{id}")
    public void removeById(@PathVariable("id") long idClt){
    	service.removeById(idClt);
    }

    @GetMapping("/{id}")
    public Client getById(@PathVariable("id") long idClt){
        return service.getById(idClt);
    }
    
    @GetMapping("/all")
    public List<Client> getAll(){
        return service.getAll();
    }
    
    @GetMapping("/all/{name}")
    public List<Client> getAllByMC(@PathVariable("name") String NomClient){
        return service.FindAllByName(NomClient);
    }
	
    
	

}
