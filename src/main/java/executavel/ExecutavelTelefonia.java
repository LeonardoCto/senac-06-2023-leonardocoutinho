package executavel;

import java.util.ArrayList;
import java.util.List;

import model.dao.telefonia.EnderecoDAO;
import model.vo.telefonia.Cliente;
import model.vo.telefonia.Endereco;
import model.vo.telefonia.Telefone;

public class ExecutavelTelefonia {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("88000123", "Nereu Ramos", "10", "Centro", "Florian?polis", "SC");
		
		EnderecoDAO salvadorDeEnderecos = new EnderecoDAO();
		salvadorDeEnderecos.inserir(endereco1);
		
		if(endereco1.getId() != null) {
			System.out.println("Novo endere?o cadastrado");
		}else {
			System.out.println("Erro ao cadastrar endere?o");
		}
		
		List<Telefone> telefonesDoSocrates = new ArrayList<Telefone>();
		Telefone telefone1 = new Telefone("48", "32328888", true, false);
		telefonesDoSocrates.add(telefone1);
		telefonesDoSocrates.add(new Telefone("48", "98881234", true, false));
		
		
		Cliente pele = new Cliente ("Edson Arantes", "11122233344", null, true, endereco1);
		Cliente socrates = new Cliente ("S?crates Brasileiro", "33322233344", telefonesDoSocrates, true, endereco1);
		

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(pele);
		clientes.add(socrates);
		
		System.out.println("---------- Clientes da firma ----------");
		for(Cliente c: clientes) {  //FOR DESSA MANEIRA ARMAZENA CADA CLIENTE NA VARIAVEL C
			System.out.println(c.toString());
		}
		
		
	}

}
