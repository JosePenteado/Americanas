#Author: your.email@your.domain.com


Feature: Buscar produtos
  Eu como usuario quero procurar produtos para realizar uma busca

  @positivo
  Scenario: Buscar produto
	Given que esteja no site "https://www.americanas.com.br"
	When acesso campo de busca
	And informo o produto desejado
	Then valido as opções disponiveis
 