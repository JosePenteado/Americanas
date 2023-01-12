#Author: your.email@your.domain.com



Feature: Filtrar produtos
	Eu como usuario quero selecionar filtros para filtrar produtos com sucesso.
 


  Scenario: Filtrar produtos
Given que esteja no site "https://www.americanas.com.br"
And realizo uma busca
When escolho as opções desejadas na coluna de filtros
Then pagina atualiza lista de produtos de acordo com os critérios estabelecidos no filtro
And valido os produtos selecionados no filtro