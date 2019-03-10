package com.curso.jpa.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.curso.jpa.domain.Categoria;
import com.curso.jpa.domain.Cidade;
import com.curso.jpa.domain.Cliente;
import com.curso.jpa.domain.Endereco;
import com.curso.jpa.domain.Estado;
import com.curso.jpa.domain.ItemPedido;
import com.curso.jpa.domain.Pagamento;
import com.curso.jpa.domain.PagamentoComBoleto;
import com.curso.jpa.domain.PagamentoComCartao;
import com.curso.jpa.domain.Pedido;
import com.curso.jpa.domain.Produto;
import com.curso.jpa.domain.enums.EstadoPagamento;
import com.curso.jpa.domain.enums.Perfil;
import com.curso.jpa.domain.enums.TipoCliente;
import com.curso.jpa.repositories.CategoriaRepository;
import com.curso.jpa.repositories.CidadeRepository;
import com.curso.jpa.repositories.ClienteRepository;
import com.curso.jpa.repositories.EnderecoRepository;
import com.curso.jpa.repositories.EstadoRepository;
import com.curso.jpa.repositories.ItemPedidoRepository;
import com.curso.jpa.repositories.PagamentoRepository;
import com.curso.jpa.repositories.PedidoRepository;
import com.curso.jpa.repositories.ProdutoRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;	
	@Autowired
	private ProdutoRepository produtoRepository;	
	@Autowired
	private EstadoRepository estadoRepository;	
	@Autowired
	private CidadeRepository cidadeRepository;	
	@Autowired 
	private ClienteRepository clienteRepository;	
	@Autowired 
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired 
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	@Autowired
	private BCryptPasswordEncoder pe;


	public void instantiateDatabase () throws ParseException {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Perfumaria");
		Categoria cat4 = new Categoria(null, "Casa");
		Categoria cat5 = new Categoria(null, "Cozinha");
		Categoria cat6 = new Categoria(null, "Musica");
		Categoria cat7 = new Categoria(null, "Decoração");				
				
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Liquidificador", 80.00 );
		Produto p4 = new Produto(null, "Mesa", 300.00 );
		Produto p5 = new Produto(null, "Toalha", 40.00 );
		Produto p6 = new Produto(null, "Pasta de Dente", 12.00 );
		Produto p7 = new Produto(null, "Televisao", 1200.00 );
		Produto p8 = new Produto(null, "Shampoo", 15.00 );
		Produto p9 = new Produto(null, "Perfume", 200.00 );
		Produto p10 = new Produto(null, "Quadro", 500.00 );
		Produto p11 = new Produto(null, "Guitarra", 80.00 );
		Produto p12 = new Produto(null, "Produto 12", 10.00 );
		Produto p13 = new Produto(null, "Produto 13", 10.00 );
		Produto p14 = new Produto(null, "Produto 14", 10.00 );
		Produto p15 = new Produto(null, "Produto 15", 10.00 );
		Produto p16 = new Produto(null, "Produto 16", 10.00 );
		Produto p17 = new Produto(null, "Produto 17", 10.00 );
		Produto p18 = new Produto(null, "Produto 18", 10.00 );
		Produto p19 = new Produto(null, "Produto 19", 10.00 );
		Produto p20 = new Produto(null, "Produto 20", 10.00 );
		Produto p21 = new Produto(null, "Produto 21", 10.00 );
		Produto p22 = new Produto(null, "Produto 22", 10.00 );
		Produto p23 = new Produto(null, "Produto 23", 10.00 );
		Produto p24 = new Produto(null, "Produto 24", 10.00 );
		Produto p25 = new Produto(null, "Produto 25", 10.00 );
		Produto p26 = new Produto(null, "Produto 26", 10.00 );
		Produto p27 = new Produto(null, "Produto 27", 10.00 );
		Produto p28 = new Produto(null, "Produto 28", 10.00 );
		Produto p29 = new Produto(null, "Produto 29", 10.00 );
		Produto p30 = new Produto(null, "Produto 30", 10.00 );
		Produto p31 = new Produto(null, "Produto 31", 10.00 );
		Produto p32 = new Produto(null, "Produto 32", 10.00 );
		Produto p33 = new Produto(null, "Produto 33", 10.00 );
		Produto p34 = new Produto(null, "Produto 34", 10.00 );
		Produto p35 = new Produto(null, "Produto 35", 10.00 );
		Produto p36 = new Produto(null, "Produto 36", 10.00 );
		Produto p37 = new Produto(null, "Produto 37", 10.00 );
		Produto p38 = new Produto(null, "Produto 38", 10.00 );
		Produto p39 = new Produto(null, "Produto 39", 10.00 );
		Produto p40 = new Produto(null, "Produto 40", 10.00 );
		Produto p41 = new Produto(null, "Produto 41", 10.00 );
		Produto p42 = new Produto(null, "Produto 42", 10.00 );
		Produto p43 = new Produto(null, "Produto 43", 10.00 );
		Produto p44 = new Produto(null, "Produto 44", 10.00 );
		Produto p45 = new Produto(null, "Produto 45", 10.00 );
		Produto p46 = new Produto(null, "Produto 46", 10.00 );
		Produto p47 = new Produto(null, "Produto 47", 10.00 );
		Produto p48 = new Produto(null, "Produto 48", 10.00 );
		Produto p49 = new Produto(null, "Produto 49", 10.00 );
		Produto p50 = new Produto(null, "Produto 50", 10.00 );
	
		cat1.getProdutos().addAll(Arrays.asList(p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30
				,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,p41,p42,p43,p44,p45,p46,p47,p48,p49,p50));
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p4));
		cat2.getProdutos().addAll(Arrays.asList(p4, p2));
		cat3.getProdutos().addAll(Arrays.asList(p9, p6, p8));
		cat4.getProdutos().addAll(Arrays.asList(p3, p5, p7, p10));
		cat5.getProdutos().addAll(Arrays.asList(p3));
		cat6.getProdutos().addAll(Arrays.asList(p11));
		cat7.getProdutos().addAll(Arrays.asList(p10));
		
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat3, cat5));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat4));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat3));
		p9.getCategorias().addAll(Arrays.asList(cat3));
		p10.getCategorias().addAll(Arrays.asList(cat4, cat7));
		p11.getCategorias().addAll(Arrays.asList(cat6));
		
		p12.getCategorias().addAll(Arrays.asList(cat1));
		p13.getCategorias().addAll(Arrays.asList(cat1));
		p14.getCategorias().addAll(Arrays.asList(cat1));
		p13.getCategorias().addAll(Arrays.asList(cat1));
		p14.getCategorias().addAll(Arrays.asList(cat1));
		p15.getCategorias().addAll(Arrays.asList(cat1));
		p16.getCategorias().addAll(Arrays.asList(cat1));
		p17.getCategorias().addAll(Arrays.asList(cat1));
		p18.getCategorias().addAll(Arrays.asList(cat1));
		p19.getCategorias().addAll(Arrays.asList(cat1));
		p20.getCategorias().addAll(Arrays.asList(cat1));
		p21.getCategorias().addAll(Arrays.asList(cat1));
		p22.getCategorias().addAll(Arrays.asList(cat1));
		p23.getCategorias().addAll(Arrays.asList(cat1));
		p24.getCategorias().addAll(Arrays.asList(cat1));
		p25.getCategorias().addAll(Arrays.asList(cat1));
		p26.getCategorias().addAll(Arrays.asList(cat1));
		p27.getCategorias().addAll(Arrays.asList(cat1));
		p28.getCategorias().addAll(Arrays.asList(cat1));
		p29.getCategorias().addAll(Arrays.asList(cat1));
		p30.getCategorias().addAll(Arrays.asList(cat1));
		p31.getCategorias().addAll(Arrays.asList(cat1));
		p32.getCategorias().addAll(Arrays.asList(cat1));
		p33.getCategorias().addAll(Arrays.asList(cat1));
		p34.getCategorias().addAll(Arrays.asList(cat1));
		p35.getCategorias().addAll(Arrays.asList(cat1));
		p36.getCategorias().addAll(Arrays.asList(cat1));
		p37.getCategorias().addAll(Arrays.asList(cat1));
		p38.getCategorias().addAll(Arrays.asList(cat1));
		p39.getCategorias().addAll(Arrays.asList(cat1));
		p40.getCategorias().addAll(Arrays.asList(cat1));
		p41.getCategorias().addAll(Arrays.asList(cat1));
		p42.getCategorias().addAll(Arrays.asList(cat1));
		p43.getCategorias().addAll(Arrays.asList(cat1));
		p44.getCategorias().addAll(Arrays.asList(cat1));
		p45.getCategorias().addAll(Arrays.asList(cat1));
		p46.getCategorias().addAll(Arrays.asList(cat1));
		p47.getCategorias().addAll(Arrays.asList(cat1));
		p48.getCategorias().addAll(Arrays.asList(cat1));
		p49.getCategorias().addAll(Arrays.asList(cat1));
		p50.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
		
		produtoRepository.saveAll(Arrays.asList(p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30
				,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,p41,p42,p43,p44,p45,p46,p47,p48,p49,p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);		
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "cliente", "cliente@gmail.com", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("cliente"));
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		Cliente cli2 = new Cliente(null, "admin", "gfmnatalia@gmail.com", "12685306706", TipoCliente.PESSOAFISICA, pe.encode("admin"));
		cli2.getTelefones().addAll(Arrays.asList("27548523", "996854754"));
		cli2.addPerfil(Perfil.ADMIN);
		
		Endereco e1 = new Endereco(null, "Rua das Flores", "300", "Apto 203", "Jardim", "38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		Endereco e3 = new Endereco(null, "Avenida Maracana", "544", "Apto 702", "Tijuca", "20510060", cli2, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		cli2.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(e1,e2,e3));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2019 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2019 13:34"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2019 00:00"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
	}
}
