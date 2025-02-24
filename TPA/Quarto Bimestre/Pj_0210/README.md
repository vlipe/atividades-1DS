## Atividade (Array)
 
Este projeto foi desenvolvido para a disciplina de **TPA**, dia 02/10/2024. Ele implementa 7 exercícios envolvendo **arrays**, utilizando a linguagem **Java**.
 
## Exercícios
 
1. Array que armazena 10 nomes e os organiza em ordem crescente.
2. Array que armazena 20 nomes e os organiza em ordem decrescente.
3. Array que armazena 50 números e os organiza em ordem crescente.
4. Array que armazena 50 números e os organiza em ordem decrescente.
5. Array que armazena 100 números e organiza os pares.
6. Array que armazena 100 números e organiza os ímpares.
7. Array que armazena a tabela de classificação do Campeonato Brasileiro.
 
---
 
## Explicação do exercício 1
 
Utilizei a classe `Scanner` para receber 10 nomes do usuário e a classe `Arrays` para organizá-los em ordem alfabética.
 
- `Classe Arrays`: Serve para fornecer métodos utilitários para manipulação de arrays.
- O método `Arrays.sort()` organiza o array em ordem crescente (alfabética para as strings).
 
Já o restante do código:
 
- Um array de `String` é declarado para armazenar 10 nomes.
 
- O primeiro loop `for` coleta os nomes através do `Scanner`.
 
- O método `Arrays.sort(nomes)` ordena os nomes em ordem alfabética.
 
- Um segundo loop serve para imprimir os nomes já ordenados.
 
---
 
## Explicação do exercício 2
 
Lógica utilizada para o código:
 
- `Classe Arrays`: Para manipular arrays, usando o método `Arrays.sort()` para ordenar os elementos.
 
- Um array de `String` declarado para armazenar 20 nomes.
 
- Um loop `for` para coletar os nomes através do `Scanner`.
 
- O método `Arrays.sort(nomes)` organiza os nomes em ordem crescente, e então, `Collections.reverseOrder()` para inverter a ordem.
 
- O segundo loop para imprimir no output os nomes na ordem decrescente.
 
---
 
## Explicação do exercício 3
 
Lógica utilizada para o Código:
 
- `Classe Array`: Para manipular as arrays.
 
- Um array de `int` é declarado para armazenar 50 números inteiros.
 
- Utilizei loop `for` para a coleta dos números através do Scanner.
 
- Método `Arrays.sort(numeros)` para organizar os números em ordem crescente.
 
- Um segundo loop para imprimir no output os números já ordenados.
 
---
 
## Explicação do exercício 4
 
Lógica utilizada para o Código:
 
- `Classe Array`: Para manipular as arrays.
 
- Declarei um array de `int` para armazenar 50 números inteiros.
 
- Utilizei loop `for` para a coleta dos números através do Scanner.
 
- Método `Arrays.sort(numeros)` para organizar os números em ordem crescente, e em seguida, `Collections.reverseOrder()` para inverter a ordem (decrescente).
 
- Um segundo loop para imprimir no output os números na ordem decrescente.
 
---
 
## Explicação do exercício 5
 
Lógica utilizada para o código:
 
- `Classe array`: para manipulação das arrays.
 
- Um array de `int` declarado para o armazenamento de 100 números pares.
 
- O primeiro loop for coleta os números através do `Scanner`.
 
- O segundo loop verifica se cada número é par e o adiciona ao array de números pares.
 
- O método `Arrays.sort(pares)` organiza os números pares em ordem crescente antes da impressão.
 
---
 
## Explicação do exercício 6
 
Lógica utilizada para o código:
 
- `Classe Arrays`: Para manipulação de arrays e organização de números.
 
- Um array de `int` é declarado para armazenar 100 números inteiros.
 
- Um segundo array é utilizado para armazenar 50 números ímpares.
 
- Um loop `while` coleta os 100 números através do `Scanner`, e verifica se o número é ímpar antes de adicioná-lo ao array de ímpares.
 
- O método `Arrays.sort(impares)` organiza os números ímpares em ordem crescente.
 
- O segundo loop imprime os números ímpares já organizados.
 
 
---
 
## Explicação do exercício 7
 
Lógica utilizada para o código:
 
- Fiz a definição de um array com a tabela de classificação do Campeonato Brasileiro.
- Impressão para a tabela de classificação com a posição de cada time.
 
---
 
## Execução do projeto
 
Para executar o projeto, clone o repositório e faça a compilação dos arquivos .java no NetBeans.
 
```bash
git clone https://github.com/vlipe/Atividades-1DS/Pj_0210
