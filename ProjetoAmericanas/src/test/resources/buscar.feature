#Author: your.email@your.domain.com

@tag
Feature: Buscar produtos
  Eu como usuario quero procurar produtos para realizar uma busca

  @tag1
  Scenario: Buscar produto
	Given que esteja no site "https://www.americanas.com.br"
	When acesso campo de busca
	And informo o produto desejado
	Then visualizo as opções disponiveis do produto
	And valido as opções disponiveis
 