# Programa de Cálculo de Salário - README

Este repositório contém um programa simples projetado para calcular o salário líquido a ser transferido com base no salário bruto fornecido e nos benefícios adicionais. O programa utiliza faixas de imposto predefinidas para determinar as deduções apropriadas para fins fiscais.

## Método de Cálculo

O salário líquido a ser transferido é calculado usando a seguinte fórmula:

```
salário líquido = (salário bruto - percentual de imposto aplicável) + benefícios adicionais
```

## Faixas de Imposto

O programa aplica taxas de imposto específicas com base na faixa salarial:

- Faixa Salarial: R\$0,00 a R\$1100,00 => Taxa de Imposto: 5,00%
- Faixa Salarial: R\$1100,01 a R\$2500,00 => Taxa de Imposto: 10,00%
- Salário Maior que R\$2500,00 => Taxa de Imposto: 15,00%

## Entrada

A entrada consiste em vários arquivos de teste, cada um contendo o valor do salário bruto e os benefícios adicionais. Cada arquivo de entrada segue o formato:

```
<valor do salário bruto>
<benefícios adicionais>
```

## Saída

Para cada arquivo de entrada, o programa gera um arquivo de saída correspondente. O arquivo de saída conterá uma única linha com um número representando o salário líquido após considerar o percentual de imposto aplicável de acordo com a faixa salarial e adicionar os benefícios adicionais. Consulte o exemplo abaixo para entender melhor a saída esperada.

### Exemplo

Entrada:
```
2000
250
```

Saída:
```
2050.00
```
