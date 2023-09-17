# Desafio - Regras Para Dimensionamento de Infraestrutura com EKS

## Descrição
Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo de nodes e servidores necessários para suportar seus aplicativos no cluster do EKS..

### Regras Básicas:

- Cada node pode suportar até 10 pods.
- Cada servidor (EC2) pode suportar até 4 pods.

Seu objetivo é desenvolver um programa em Java que permita ao usuário fazer uma consulta de dimensionamento. O programa deve receber o número total de pods do aplicativo e calcular o número mínimo de nodes e servidores necessários com base nas regras de dimensionamento.

### Aqui estão as etapas que você deve seguir:

1. **Inicialização**:
    - Defina as regras básicas de dimensionamento, ou seja, a capacidade de pods por node e pods por servidor.

2. **Recebendo as informações**:
    - Solicite ao usuário que digite o número total de pods do aplicativo (utilize a função Scanner).

3. **Cálculo**:
    - Calcule o número mínimo de nodes necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por node.
    - Calcule o número mínimo de servidores necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por servidor.

4. **Recomendações**:
    - Se o número mínimo de nodes for menor ou igual a 1, exiba a recomendação de usar um único node.
    - Se o número mínimo de servidores for menor ou igual a 1, exiba a recomendação de usar um único servidor.


## Entrada
O programa solicitará ao usuário que digite o número total de pods do aplicativo que deseja implantar no cluster do EKS.
O usuário deverá inserir um número inteiro que represente o total de pods do aplicativo.

## Saída
Para cada consulta de dimensionamento, o programa exibirá as seguintes informações:
- O número mínimo de nodes necessário para suportar o número total de pods do aplicativo.
- O número mínimo de servidores necessário para suportar o número total de pods do aplicativo.
- Se o número mínimo de nodes for menor ou igual a 1, o programa exibirá a recomendação de usar um único node.
- Se o número mínimo de servidores for menor ou igual a 1, o programa exibirá a recomendação de usar um único servidor.

## Código Para Resolver

[Ver Código](../Codigo_04/RegrasEKS.java)
