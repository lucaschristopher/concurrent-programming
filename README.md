### Concurrent Programming

_College subjects: Concurrent Programming_

_Period: 2018.2_

Repository directed to the practical activities of the discipline of Concurrent Programming, of the course of Computer Science, Federal University of Campina Grande - UFCG. The activities were divided into two parts: the first part dedicated to solving exercises in the Java language and the second part in the Go language.

#### List 1 - Java

***1)** Uma abstração bastante usada em programação concorrentes são os canais. Um
canal recebe mensagens enviadas por processos (threads) remetentes. Processos
recipientes lêem as mensagens enviadas no canal. Mensagens devem ser lidas na
ordem que entraram no canal. Uma vez lida, a mensagem não pode ser lida
novamente. O canal deve ter uma capacidade máxima, ou seja, ao atingir o limite,
novas mensagens não podem ser enviadas para o canal imediatamente.*

*Considere que o construtor do canal recebe um inteiro que indica sua capacidade máxima.
Mensagens não podem ser descartadas. Implemente a interface abaixo para o
canal, usando quaisquer mecanismos de coordenação e controle de concorrência da
linguagem Java, exceto as estruturas de dados de Concurrent Collections.
Considere tanto critérios de corretude quanto de eficiência (p.ex evite spin locks
quando possível).*

```
public interface Channel {
  public void putMessage(String message);
  public String takeMessage();
}
```

***2)** Considere um sistema que precisa consultar um site web através de uma requisição HTTP. A chamada HTTP é encapsulada por uma API com um único método:* **String request(String serverName)**. *Por motivos de tolerância à falhas, há três mirrors disponíveis com a mesma informação. Nesse sistema, escreva uma função que consulta os **três mirrors** (cujos
servernames são: **"mirror1.com"**, **"mirror2.br"** e **"mirror3.edu"**) e retorna a resposta
que chegar primeiro. A função deve implementar a seguinte assinatura: **String reliableRequest()**
Justifique as decisões importantes em sua implementação. Por exemplo, as
primitivas de concorrência usadas.*

***3)** Considere uma extensão ao sistema anterior em que você deve escrever uma nova
função que retorna o resultado da execução de **reliableRequest** ou um erro, se a
execução desta durar mais do que 2 segundos.*

***4)** Crie uma função que executa indefinidamente a função **reliableRequest**, definida
anteriormente, enquanto espera uma sinalização de parada enviada por outro fluxo
de execução.*

***5)** Realize uma comparação de desempenho entre os seguintes pares de estruturas de
dados alternativas. Sua resposta deve conter uma descrição dos experimentos
realizados, o código para executar os experimentos, bem como o código para
analisar os dados experimentais. Alem disso, uma breve descrição dos resultados
alcançados com plots que os ilustram.*

- *a. ConcurrentHashMap vs Collections.synchronizedMap*
- *b. CopyOnWriteArrayList vs Collections.synchronizedList*

***6)** Implemente em Java, um programa em que **uma thread gere valores aleatórios**,
enquanto uma segunda thread verifique se os valores recebidos são pares ou
ímpares, e os imprima na saída padrão, caso sejam pares. Os valores devem ser
recebidos e impressos na mesma ordem que foram gerados. Todo valor gerado
deve ser recebido e impresso, caso seja par (vide o exemplo 2 do material de
golang). **Não use os objetos do pacote java.util.concurrent.***

***7)** Construa um pipeline de threads em Java, em que uma thread gere strings
aleatórias, enquanto uma segunda filtre as strings que contém somente valores
alpha, e uma terceira escreva os valores filtrados na saída padrão. Tal como no
exemplo anterior, nenhum valor gerado pode ser ignorado pelo filtro, bem como
nenhum valor filtrado pode se ignorado para escrita. Geração, filtro e impressão
devem respeitar ordem (vide o exemplo 3 do material de golang). Não use os objetos
do pacote java.util.concurrent).*

#### List 2 - Go

*Same questions 2, 3 and 4 from previous list.*

***4)** Avalie experimentalmente quão leve goroutines em Go são em relação à threads em
Java. Em particular, você deve avaliar o consumo de memória de programas
equivalentes nas respectivas linguagens.*

##### _All honor and all glory, everything comes from him and everything is for him: JESUS!_
