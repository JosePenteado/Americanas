#Author: your.email@your.domain.com

@tag
Feature: Ordenar produtos
  Eu como usuario quero ordenar produtos da minha busca para filtrar produtos

  @tag1
  Scenario: Ordenar por maiores preços
Given que esteja no site "https://www.americanas.com.br"
And realizo uma busca 
When seleciono a opção ordenar por maiores preços
Then site organiza as opções dispiníveis em ordem descrescente de preços
And valido as informações fornecidas

Scenario: Ordenar por mais avaliados
Given que esteja no site "https://www.americanas.com.br"
And realizado uma busca 
When seleciono a opção ordenar por mais avaliados
Then site organiza as opções dispiníveis em ordem dos mais avaliados para os menos avaliados

Scenario: Ordenar por mais relevantes
Given que esteja no site "https://www.americanas.com.br"
Given realizo uma busca 
When seleciono a opção ordenar por mais relevantes
Then site organiza as opções dispiníveis em ordem de relevancia imposta pela americanas

Scenario: Ordenar por mais vendidos
Given que esteja no site "https://www.americanas.com.br"
And realizado uma busca 
When seleciono a opção ordenar por mais vendidos
Then site organiza as opções dispiníveis em ordem dos mais vendidos para menos vendidos

Scenario: Ordenar por menores preços
Given que esteja no site "https://www.americanas.com.br"
And realizo uma busca 
When seleciono a opção ordenar por menores preços
Then site organiza as opções dispiníveis em ordem crescente de preços
