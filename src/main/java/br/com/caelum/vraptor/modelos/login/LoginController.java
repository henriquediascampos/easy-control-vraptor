package br.com.caelum.vraptor.modelos.login;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class LoginController {

	@Inject
	private LoginDao loginDao;
	
	private final Result result;
	
	protected LoginController() {
		this(null);
	}
	
	@Inject
	public LoginController(Result result) {
		this.result = result;
	}
	
	@Path("/login")
	public void login() {
		result.include("variable", "login!");
	}
	
	@Get("/login/busca")
	public void busca() {
		List<Login> login = loginDao.lista();
		result.use(Results.json()).from(login).recursive().serialize();
	}
	
	@Get("/login/buscaId")
	public void buscaId(Long id) {
		Login login = loginDao.buscarPorId(id);
		result.use(Results.json()).from(login).recursive().serialize();
	}
	
	@Get("/login/salvar")
	public void salvar(String nome) {
		Login login = new Login();
		login.setNome(nome);
		loginDao.salvar(login);
		result.include("variable", "login!");
		result.use(Results.json()).from(login).recursive().serialize();
	}
	
	@Get("/login/bucarNome")
	public void buscarNome(String nome) {
		Login login = loginDao.buscarPorNome(nome);
		result.use(Results.json()).from(login).serialize();
	}
}
