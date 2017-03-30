package br.edu.unoesc;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	
	public void deveGerarNomeCompleto(){
		Pessoa pessoa = new Pessoa ("nome","sobrenome");
		Assert.assertEquals("nome sobrenome",pessoa.getNomeCompleto());
	}

	@Test
	public void deveGerarNomeCorretamente(){
		Pessoa pessoa = new Pessoa ("nome","sobrenome");
		Assert.assertEquals("nome",pessoa.getNome());
	}
	
	@Test
	public void deveGerarSobrenomeCorretamente(){
		Pessoa pessoa = new Pessoa ("nome","sobrenome");
		Assert.assertEquals("sobrenome",pessoa.getSobrenome());
	
}
}