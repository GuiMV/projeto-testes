package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TesteGeral {
	private Apartamento ap1;
	private Casa casa;
	private Cliente cliente;
	private Locacao local;
	private PontoComercial comercio;
	private Sitio sitio;
	private Terreno terreno;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
		ap1 = new Apartamento("RuaX", 101, 10, 3, "B");//endereco, numero, tamanho, andar, bloco)
		casa = new Casa("RuaCasa", 31191, 100, 12); //endereco, numero, tamanho, comodos
		cliente = new Cliente("Guilherme", "123.456.789.00"); //nome, cpf
		local = new Locacao(2023, 2050, casa);//ano atual, vencimento, imovel
		comercio = new PontoComercial("Rua de Galante", 05, 20, "DuduPães&Bolos", "12345");//endereco, numero, tamanho, nome, cnpj)
		sitio = new Sitio("Rua Argentina", 07, 500);//endereco, numero, tamanho
		terreno = new Terreno("Rua Sergipe", 9, 689);//endereco, numero, tamanho
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
    void testGetEndereco() {
        assertEquals("RuaX", ap1.getEndereco());
        
        assertEquals("RuaCasa", casa.getEndereco());
        
        assertEquals("", cliente.getEndereco());
        
        assertEquals("Rua de Galante", comercio.getEndereco());
    
        assertEquals("Rua Argentina", sitio.getEndereco());
	
        assertEquals("Rua Sergipe", terreno.getEndereco());
	}
	
	@Test
    void testSetEndereco() {
        ap1.setEndereco("RuaY");
        assertEquals("RuaY", ap1.getEndereco());
        
        casa.setEndereco("Rua da Casa");
        assertEquals("Rua da Casa", casa.getEndereco());
        
        cliente.setEndereco("Galante");
        assertEquals("Galante", cliente.getEndereco());
        
        comercio.setEndereco("Rua da Caridade");
        assertEquals("Rua da Caridade", comercio.getEndereco());
        
        sitio.setEndereco("Rua Antônio Alves Pimentel");
        assertEquals("Rua Antônio Alves Pimentel", sitio.getEndereco());
        
        terreno.setEndereco("Rua Sampa");
        assertEquals("Rua Sampa", terreno.getEndereco());
    }
	
	@Test
    void testGetNumero() {
        assertEquals(101, ap1.getNumero());
        
        assertEquals(31191, casa.getNumero());
        
        assertEquals(05, comercio.getNumero());
        
        assertEquals(07, sitio.getNumero());
        
        assertEquals(9, terreno.getNumero());
    }
	
	@Test
    void testSetNumero() {
        ap1.setNumero(200);
        assertEquals(200, ap1.getNumero());
        
        casa.setNumero(675);
        assertEquals(675, casa.getNumero());
        
        comercio.setNumero(200);
        assertEquals(200, comercio.getNumero());
        
        sitio.setNumero(500);
        assertEquals(500, sitio.getNumero());
        
        terreno.setNumero(500);
        assertEquals(500, terreno.getNumero());
    }
	
	@Test
    void testGetTamanho() {
        assertEquals(10, ap1.getTamanho());
        
        assertEquals(100, casa.getTamanho());
        
        assertEquals(20, comercio.getTamanho());
        
        assertEquals(500, sitio.getTamanho());
        
        assertEquals(689, terreno.getTamanho());
    }
	
	@Test
    void testSetTamanho() {
        ap1.setTamanho(100);
        assertEquals(100, ap1.getTamanho());
        
        casa.setTamanho(200);
        assertEquals(200, casa.getTamanho());
        
        comercio.setTamanho(100);
        assertEquals(100, comercio.getTamanho());
        
        sitio.setTamanho(100);
        assertEquals(100, sitio.getTamanho());
        
        terreno.setTamanho(100);
        assertEquals(100, terreno.getTamanho());
    }

	@Test
    void testGetAndar() {
        assertEquals(3, ap1.getAndar());
    }
	
	@Test
    void testSetAndar() {
        ap1.setAndar(4);
        assertEquals(4, ap1.getAndar());
    }
	
	@Test
    void testGetComodos() {
        assertEquals(12, casa.getComodos());
    }
	
	@Test
    void testSetComodos() {
        casa.setComodos(15);
        assertEquals(15, casa.getComodos());
    }
	
	@Test
    void testGetBloco() {
        assertEquals("B", ap1.getBloco());
    }
	
	@Test
    void testSetBloco() {
        ap1.setBloco("C");
        assertEquals("C", ap1.getBloco());
    }
	
	@Test
    void testGetNome() {
        assertEquals("Guilherme", cliente.getNome());
        
        assertEquals("DuduPães&Bolos", comercio.getNome());
    }
	
	@Test
    void testSetNome() {
        cliente.setNome("Pedro");
        assertEquals("Pedro", cliente.getNome());
        
        comercio.setNome("Mercadinho Galante");
        assertEquals("Mercadinho Galante", comercio.getNome());
    }
	
	@Test
    void testGetCpf() {
        assertEquals("123.456.789.00", cliente.getCpf());
    }
	
	@Test
    void testSetCpf() {
        cliente.setCpf("098.765.432.11");
        assertEquals("098.765.432.11", cliente.getCpf());
    }
	
	@Test
    void testGetCnpj() {
        assertEquals("12345", comercio.getCnpj());
    }
	
	@Test
    void testSetCnpj() {
        comercio.setCnpj("15.2021.2023-00");
        assertEquals("15.2021.2023-00", comercio.getCnpj());
    }
	
	@Test
    void testGetTelefone() {
        assertEquals("", cliente.getTelefone());
    }
	
	@Test
    void testSetTelefone() {
        cliente.setTelefone("4002-8922");
        assertEquals("4002-8922", cliente.getTelefone());
    }
	
	@Test
    void testGetAno_atual() {
        assertEquals(2023, local.getAno_atual());
    }
	
	@Test
    void testSetAno_atual() {
        local.setAno_atual(2000);
		assertEquals(2000, local.getAno_atual());
    }
	
	@Test
    void testGetVencimento() {
		assertEquals(2050, local.getVencimento());
		
		assertEquals(27, local.getDuracao_locacao());
    }
	
	@Test
    void testSetVencimento() {
        local.setVencimento(2100);
		assertEquals(2100, local.getVencimento());
		
		local.setDuracao_locacao(30);
		assertEquals(30, local.getDuracao_locacao());
    }
	
	@Test
    void testGetImovel() {
		assertEquals(casa, local.getImovel());
    }
	
	@Test
    void testSetImovel() {
		Casa nova_casa = new Casa("Rua Sampa",11111, 10, 240);
        local.setImovel(nova_casa);
		assertEquals(nova_casa, local.getImovel());
    }
	
	@Test
    void testToStringCompleto() {
		String expectativa = "Endereço: RuaX\n" +
                     		 "Número: 101\n" +
                     		 "Tamanho: 10\n" +
                     		 "Andar: 3\n" +
                     		 "Bloco: B";
        assertEquals(expectativa, ap1.toString());
        
        expectativa = "Endereço: RuaCasa\n" +
        		 	  "Número: 31191\n" +
        		 	  "Tamanho: 100\n" +
        		 	  "Cômodos: 12";
        assertEquals(expectativa, casa.toString());
        
		cliente.setTelefone("4002-8922");
		cliente.setEndereco("Galante");
        expectativa = "Nome: Guilherme\n" +
                      "Cpf: 123.456.789.00\n" +
                      "Telefone: 4002-8922\n" +
                      "Endereço: Galante";
        assertEquals(expectativa, cliente.toString());
        
        expectativa = "Imóvel: Endereço: RuaCasa\n" +
				 	  "Número: 31191\n" +
				 	  "Tamanho: 100\n" +
				 	  "Cômodos: 12\n" +
				 	  "Duração da locação: 27\n" +
				 	  "Vencimento da locação: 2050";
        assertEquals(expectativa, local.toString());
        
        expectativa = "Endereço: Rua de Galante\n" +
                	  "Número: 5\n" +
                	  "Tamanho: 20\n" +
                	  "Nome: DuduPães&Bolos\n" +
                	  "Cnpj: 12345";
        assertEquals(expectativa, comercio.toString());
    }
	
	@Test
    void testToStringIncompleto() {
		cliente.setNome("");
		cliente.setCpf("");
		cliente.setTelefone("");
		cliente.setEndereco("");
        String expectativa = "";
        assertEquals(expectativa, cliente.toString());
    }
	
	@Test
    void testToStringEndereco() {
        ap1.setEndereco("");
        String expectativa = "Número: 101\n" +
                     		 "Tamanho: 10\n" +
                     		 "Andar: 3\n" +
                     		 "Bloco: B";
        assertEquals(expectativa, ap1.toString());
        
        comercio.setEndereco("");
        expectativa = "Número: 5\n" +
                	  "Tamanho: 20\n" +
                	  "Nome: DuduPães&Bolos\n" +
                	  "Cnpj: 12345";
        assertEquals(expectativa, comercio.toString());
    }
	
	@Test
    void testToStringBloco() {
        ap1.setBloco("");
        String ex3 = "Endereço: RuaX\n" +
                	 "Número: 101\n" +
                	 "Tamanho: 10\n" +
                	 "Andar: 3\n";                    
        assertEquals(ex3, ap1.toString());
    }
	
	@Test
    void testToStringNome() {
        comercio.setNome("");
        String ex3 = "Endereço: Rua de Galante\n" +
                	 "Número: 5\n" +
                	 "Tamanho: 20\n" +
                	 "Cnpj: 12345";                   
        assertEquals(ex3, comercio.toString());
    }
	
	@Test
	void testeToStringCnpj() {
		comercio.setCnpj("");
		String expectativa = "Endereço: Rua de Galante\n" +
                	 		 "Número: 5\n" +
                	 		 "Tamanho: 20\n" +
                	 		 "Nome: DuduPães&Bolos\n";
		assertEquals(expectativa, comercio.toString());
	}
	
	@Test
	public void testEqualsObj() {
		Object obj = new Object();
		
		Casa casa = new Casa(ap1.getEndereco(), ap1.getNumero(), ap1.getTamanho(), 12);
		assertTrue(ap1.equals(casa));
		assertFalse(ap1.equalsAp(casa));	    
	    assertFalse(ap1.equals(obj)); 
	    assertFalse(ap1.equalsAp(obj));
	    
	    class levomI extends Imovel {
	        public levomI(String endereco, int numero, int tamanho) {
	            super(endereco, numero, tamanho);
	        }
	    }	
		levomI imovel = new levomI(casa.getEndereco(), casa.getNumero(), casa.getTamanho());
		assertTrue(casa.equals(imovel));
		assertFalse(casa.equalsCasa(imovel));
	    assertFalse(casa.equals(obj)); 
	    assertFalse(casa.equalsCasa(obj));
	    
	    casa = new Casa("RuaCasa", 31191, 100, 12);
		assertFalse(cliente.equals(casa));
		
		assertFalse(comercio.equals(obj));
	}
	
	@Test
	public void testEqualsNumero() {
	    Apartamento diferenteNumero = new Apartamento("RuaX", 200, 10, 3, "B");
	    assertFalse(ap1.equals(diferenteNumero));
	    
	    Casa casaNumero = new Casa("RuaCasa", 555, 100, 12);
	    assertFalse(casa.equals(casaNumero));
	}
	
	@Test
	public void testEqualsTamanho() {
	    Apartamento diferenteTamanho = new Apartamento("RuaX", 101, 50, 3, "B");
	    assertFalse(ap1.equals(diferenteTamanho));
	    
	    Casa casaTamanho = new Casa("RuaCasa", 31191, 200, 12);
	    assertFalse(casa.equals(casaTamanho));
	}
	
	@Test
	public void testEqualsEndereco() {
	    Apartamento diferenteEndereco = new Apartamento("RuaY", 101, 10, 3, "B");
	    assertFalse(ap1.equals(diferenteEndereco));
	    
	    Casa casaEndereco = new Casa("Casa da Rua", 31191, 100, 12);
	    assertFalse(casa.equals(casaEndereco));
	}
	
	@Test
	public void testEqualsIgual() {
	    Apartamento igual = new Apartamento("RuaX", 101, 10, 3, "B");
	    assertTrue(ap1.equalsAp(igual));
	    
	    Casa casaIgual = new Casa("RuaCasa", 31191, 100, 12);
	    assertTrue(casa.equalsCasa(casaIgual));
	    
	    Cliente cliente1 = new Cliente("Guilherme", "123.456.789.00");
	    assertTrue(cliente.equals(cliente1));
	    
	    assertTrue(comercio.equals(comercio));
	}

	@Test
	public void testEqualsDiferente() {
		Cliente cliente2 = new Cliente("Wenderlanya", "111.222.333.44");
	    assertFalse(cliente.equals(cliente2));
	    
	    PontoComercial OutroPonto = new PontoComercial("Rua de Campina", 10, 50, "'Pra'daria", "55555");
		assertFalse(comercio.equals(OutroPonto));
	}
	
	@Test
	public void testEqualsAndar() {
	    Apartamento diferenteAndar = new Apartamento("RuaX", 101, 10, 10, "B");
	    assertFalse(ap1.equalsAp(diferenteAndar));
	}
	
	@Test
	public void testEqualsBloco() {
	    Apartamento diferenteBloco = new Apartamento("RuaX", 101, 10, 3, "C");
	    assertFalse(ap1.equalsAp(diferenteBloco));
	}

}