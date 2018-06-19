package br.com.caelum.vraptor.modelos.cadastro;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class CadastroController {

	@Inject
	private CadastroDao cadastroDao;
	
	private final Result result;
	
	protected CadastroController() {
		this(null);
	}
	
	@Inject
	public CadastroController(Result result) {
		this.result = result;
	}
	
	@Path("/cadastro.jsp")
	public void cadastro() {
		result.include("variable", "cadastro!");
	}
	
	@Get("/cadastro/busca")
	public void busca() {
		List<Cadastro> cadastro = cadastroDao.lista();
		result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	@Get("/cadastro/buscaId")
	public void buscaId(Long id) {
		Cadastro cadastro = cadastroDao.buscarPorId(id);
		result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	@Get("/cadastro/salvar")
	public void salvar(String nome) {
		Cadastro cadastro = new Cadastro();
		cadastro.setNome(nome);
		cadastroDao.salvar(cadastro);
		result.include("variable", "cadastro!");
		result.use(Results.json()).from(cadastro).recursive().serialize();
	}
	
	@Get("/cadastro/bucarNome")
	public void buscarNome(String nome) {
		Cadastro cadastro = cadastroDao.buscarPorNome(nome);
		result.use(Results.json()).from(cadastro).serialize();
	}
}
