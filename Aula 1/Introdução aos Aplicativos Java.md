# Introdução aos Aplicativos Java

![image](https://github.com/user-attachments/assets/23dc1a1d-ac7e-480b-bc28-14b0bf4e17f1)

O Java tornou-se a linguagem preferida para implementar aplicativos baseados na Internet e software para
dispositivos que se comunicam por uma rede. Equipamentos de som estéreo e outros dispositivos domésticos muitas
vezes são conectados em rede pela tecnologia Java. Atualmente, existem bilhões de celulares e dispositivos portáteis
compatíveis com Java! O Java é a linguagem preferida para atender às necessidades de programação de muitas
organizações.
<br><br><br>

***Java Standard Edition (Java SE)***

***Java Enterprise Edition (Java EE)*** é adequada para desenvolver aplicativos distribuídos em rede em larga escala e
aplicativos baseados na Web.

***Java Micro Edition (Java ME)*** é voltada para o desenvolvimento de aplicativos de pequenos dispositivos com
limitações de memória.
<br><br>

Em geral, programas Java passam por cinco fases - edição, compilação, carregamento, verificação e execução.

![image](https://github.com/user-attachments/assets/1a1f1110-0bfa-4fde-92f6-7c9e3df6b803)

A máquina virtual ***(Virtual Machine - VM)*** é um aplicativo de software que simula um computador, mas oculta o
sistema operacional e o hardware subjacentes dos programas que interagem com ela. A JVM é umas das máquinas
virtuais mais amplamente utilizadas.
Ao contrário da linguagem de máquina, que é dependente do hardware específico de computador, os bytecodes são
independentes de plataforma - eles não dependem de uma plataforma de hardware particular. Portanto, os bytecodes
do Java são portáteis - sem recompilar o código-fonte, os mesmos bytecodes podem executar em qualquer plataforma
Fonte: Deitel, Java: Como Programar.
Introdução aos Aplicativos Java 3
contendo uma JVM que entende a versão do Java em que os bytecodes foram compilados. A JVM é invocada pelo
comando java.

**Na Fase 5**, a JVM executa os bytecodes do programa, realizando assim as ações especificadas pelo programa. Nas
primeiras versões do Java, a JVM era simplesmente um interpretador para bytecodes Java. Isso fazia com que a
maioria dos programas Java executasse lentamente porque a JVM interpretava e executava um bytecode por vez. 

Em geral, as JVMs atuais executam bytecodes utilizando uma combinação de interpretação e a chamada ***compilação
Just-In-Time ( JIT)***. Nesse processo, a JVM analisa os bytecodes à medida que eles são interpretados, procurando
***hot spots (pontos ativos)*** — partes dos bytecodes que executam com frequência. Para essas partes, um ***compilador
Just-In-Time (JIT)*** — conhecido como ***compilador Java HotSpot*** — traduz os bytecodes para a linguagem de
máquina de um computador subjacente. Quando a JVM encontra novamente essas partes compiladas, o código de
linguagem de máquina mais rápido é executado. Portanto, os programas Java na realidade passam por duas fases de
compilação — uma em que código-fonte é traduzido em bytecodes (para a portabilidade entre JVMs em diferentes
plataformas de computador) e uma segunda em que, durante a execução, os bytecodes são traduzidos em linguagem
de máquina para o computador real em que o programa é executado.

<br><br>

# Nosso primeiro programa Java
## 1.Imprimindo uma linha de texto

Um aplicativo Java é uma programa de computador que é executado quando você utiliza o comando java para
carregar a Java Virtual Machine (JVM).

```
// Programa de impressão de texto
// Isso é um comentário
/*Isso também é um comentário
mas pode cobrir várias linhas*/

Introdução aos Aplicativos Java 4
public class Welcome{
// método principal inicia a execução do aplicativo Java
  public static void main(String[] args){
    System.out.println("Hello World!");
  } // fim do método main
} // fim da classe Welcome
```

<br>

### Declaração de classe:
- A palavra-chave class introduz uma declaração de classe;
- Os nomes de classes iniciam com uma letra maiúscula e apresentam a letra inicial de cada palavra que eles
incluem em maiúscula (ex.: ExemploNomeClasse);
- É um identificador, não inicia com um dígito e não contém espaços (ex.: BemVindo1, $valor, _valor, botao7);
- Distinção entre letras maiúsculas e minúsculas (a1 é diferente de A1).

### Declaração do Método:
- Um dos métodos deve ser chamado main e deve ser definido como está aqui. Caso contrário, a JVM não
executará o aplicativo;
- A palavra-chave void indica que esse método não devolverá nenhuma informação;
- ```String[] args``` entre parênteses é uma parte requerida da declaração do método main.
  
O objeto ```System.out``` é conhecido como o objeto de saída padrão. O método ```System.out.println``` exibe uma linha de
texto na janela de comando. A String entre parênteses é o argumento para o método.
<br><br>
Estamos agora pronto para compilar e executar o nosso programa. Abra uma janela de comando e vá para o diretório
onde o programa está armazenado. Se o programa não contiver nenhum erro de sintaxe, o comando anterior cria um
novo arquivo chama ***Welcome.class*** que contém os bytecodes Java independentes de plataforma que representam
nosso aplicativo. Quando utilizamos o comando java para executar o aplicativo em uma dada plataforma, esses
bytecodes serão traduzidos pela JVM em instruções que são entendidas pelo sistema operacional subjacente.

![image](https://github.com/user-attachments/assets/70f2244c-ae24-4da5-af06-1365b6eabc83)

<br>

## Exibindo uma linha de texto com múltiplas instruções
```
// Imprimindo uma linha de texto com múltiplas instruções
public class Welcome{
// método principal inicia a execução do aplicativo Java
  public static void main(String[] args){
    System.out.print("Hello World ");
    System.out.println("UnDF");
  } //fim do método main
} // fim da classe Welcome
```

<br>

## Exibindo múltiplas linhas de texto com uma única instrução
```
// Imprimndo múltiplas linhas de texto com uma única instrução
public class Welcome{
// método principal inicia a execução do aplicativo Java
  public static void main(String[] args){
    System.out.println(" Hello\n World\n e\n UnDF\n");
  } //fim do método main
} // fim da classe Welcome
```

![image](https://github.com/user-attachments/assets/78dfb708-f5a1-4ae2-a29e-47b4a544efd7)

## Entrada de dados pelo usuário
```
// Programa de adição que exibe a soma de dois números.
import java.util.Scanner; //programa utiliza a classe Scanner
public class Addition{
// método principal inicia a execução do aplicativo Java
  public static void main(String[] args){
    // cria um Scanner para obter entrada da janela de comando
    Scanner entrada = new Scanner(System.in);
    int num1;
    int num2;
    int soma;
    System.out.print("Entre com o primeiro número: ");
    num1 = entrada.nextInt(); //lê o primeiro o número fornecido pelo usuário
    System.out.print("Entre com o segundo número: ");
    num2 = entrada.nextInt(); //lê o segundo o número fornecido pelo usuário
    soma = num1 + num2;
    System.out.println("A soma é " + soma);
  } // fim do método main
} // fim da classe Addition
```

```Import java.util.Scanner;``` é uma declaração ***import** que ajuda o compilador a localizar uma classe utilizada nesse
programa. Indica que usa a classe ***Scanner*** predefinida do Java do pacote ***java.util.***

<br>

A declaração ```Scanner entra = new Scanner(System.in);``` especifica que a variável nomeada entrada seja do tipo
***Scanner***. Um ***Scanner*** permite a um programa ler os dados para utilização em um programa. O sinal de igual (=)
indica que a variável ***Scanner*** entrada deve ser inicializada na sua declaração com o resultado da expressão ***new
Scanner(System.in)*** à direita do sinal de igual. A expressão utiliza a palavra-chave new para cria um objeto Scanner
que lê caracteres digitados pelo usuário no teclado.

```num1 = entrada.nextInt();``` utiliza o método ***nextInt*** do valor de entrada do objeto ***Scanner*** para obter um inteiro
digitalizado pelo usuário.

Para cada nova classe da Java API que usamos, indicamos o pacote em que ela está localizada. Uma versão baseada
na Web dessa documentação pode ser obtida em:

```java.sun.com/javase/6/docs/api/```

## Aritmética
![image](https://github.com/user-attachments/assets/abd7b638-4b2c-43cd-a63d-dbd240363a11)

## Operador de igualdade e operadores relacionais
![image](https://github.com/user-attachments/assets/887bf117-58e8-4987-8b9a-e08567940fde)

```
// Programa que compara números entradas do usuário
public class Comparison
{
  public static void main(String[] args)
  {
  // cria um Scanner para obter entrada da janela de comando
  Scanner entrada = new Scanner(System.in);
  int num1;
  int num2;
  System.out.print("Entre com o primeiro número: ");
  num1 = entrada.nextInt(); //lê o primeiro o número fornecido pelo usuário
  System.out.print("Entre com o segundo número: ");
  num2 = entrada.nextInt(); //lê o segundo o número fornecido pelo usuário
    if (num1 > num2){
      System.out.println("O primeiro número é maior que o segundo.");
    }
    if (num1 < num2){
      System.out.println("O segundo número é maior que o primeiro.");
    }
    if (num1 == num2){
      System.out.println("O primeiro número é igual ao segundo.");
    }
  }
}
```
