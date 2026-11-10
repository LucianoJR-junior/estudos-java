# Aula 01: Primeiros passos com Java

**Módulo 01** · Criando a sua primeira aplicação
**Duração:** 3h (2h de aula + 1h de exercícios)

**Ao final você vai saber:**
- Como o Java funciona por baixo (JDK, JVM, bytecode)
- Escrever, compilar e rodar um programa
- Usar variáveis, os tipos principais e operadores
- Fazer o primeiro commit no GitHub

---

## Parte 1 · Preparar o ambiente (30 min)

Você **já tem o Java 26 e o Git instalados** (conferi no seu computador). Falta o seguinte:

### 1.1 Editor
Use o **VS Code**, que você já tem aberto. Instale a extensão **"Extension Pack for Java"** (da Microsoft) pela aba de extensões (`Ctrl+Shift+X`).

> Mais para frente, quando chegarmos no Spring, vou te mostrar o IntelliJ IDEA, que é o mais usado no mercado. Para começar, o VS Code é suficiente.

### 1.2 Configurar o Git (só uma vez)
No terminal do VS Code (`Ctrl+'`):

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu-email@exemplo.com"
```

Use o **mesmo e-mail da sua conta do GitHub**, assim os commits aparecem no seu perfil.

### 1.3 Criar o repositório
1. Crie uma conta em [github.com](https://github.com), se ainda não tiver
2. Clique em **New repository**, dê o nome `estudos-java`, marque **Public** e **não** marque nenhuma opção de README
3. No terminal, dentro da pasta `Estudo JAVA`:

```bash
git init
git add .
git commit -m "Início da trilha Java"
git branch -M main
git remote add origin https://github.com/SEU-USUARIO/estudos-java.git
git push -u origin main
```

> Se pedir login, o Git abre uma janela do navegador para você autorizar. É normal.

---

## Parte 2 · Como o Java funciona (15 min)

```
 Você escreve        O compilador (javac)        A JVM executa
 OlaMundo.java  ──►  gera OlaMundo.class    ──►  em qualquer sistema
 (código-fonte)      (bytecode)                  (Windows, Linux, Mac)
```

| Sigla | O que é |
|---|---|
| **JDK** | Kit de desenvolvimento: compilador (`javac`) + ferramentas + JVM. É o que você instala para programar. |
| **JVM** | Máquina Virtual Java: o programa que **executa** o bytecode. |
| **Bytecode** | O arquivo `.class`. Não é código de máquina; é um código intermediário que qualquer JVM entende. |

Por isso o lema do Java é *"escreva uma vez, rode em qualquer lugar"*: o mesmo `.class` roda em qualquer sistema que tenha JVM.

**Pergunta clássica de entrevista:** *"Qual a diferença entre JDK, JRE e JVM?"*
JVM executa. JRE = JVM + bibliotecas para rodar programas. JDK = JRE + ferramentas para desenvolver.

---

## Parte 3 · O primeiro programa (20 min)

Crie a pasta `exercicios/aula-01/` e, dentro dela, o arquivo `OlaMundo.java`:

```java
public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, mundo! Começando minha jornada em Java.");
    }
}
```

**Rodando pelo terminal** (dentro de `exercicios/aula-01`):

```bash
javac OlaMundo.java     # compila e gera OlaMundo.class
java OlaMundo           # executa
```

Ou, mais rápido, rodando direto sem gerar o `.class`:

```bash
java OlaMundo.java
```

Ou clique em **Run**, que aparece acima do `main` no VS Code.

### Entendendo cada parte

| Trecho | Significado |
|---|---|
| `public class OlaMundo` | Define uma classe. **O nome tem que ser igual ao do arquivo** (`OlaMundo.java`). |
| `public static void main(String[] args)` | O ponto de entrada: é por aqui que o programa começa. Por enquanto, decore; vamos entender cada palavra no módulo de OO. |
| `System.out.println(...)` | Imprime um texto e pula uma linha. (`print` sem `ln` não pula.) |
| `;` | Toda instrução termina com ponto e vírgula. |
| `{ }` | Delimitam blocos (da classe, do método). |

> **Curiosidade:** nas versões mais novas do Java dá para escrever um `void main()` mais curto. Mas o código que você vai encontrar nas empresas usa a forma acima, então é ela que vamos usar.

**Teste:** apague um `;` e rode de novo. Leia a mensagem de erro com calma. **Ler erros é metade do trabalho de um dev.**

---

## Parte 4 · Variáveis e tipos (35 min)

Uma variável é um espaço com **nome** e **tipo** que guarda um valor.

```java
tipo nome = valor;
```

### Os tipos que você mais vai usar

| Tipo | Guarda | Exemplo |
|---|---|---|
| `int` | número inteiro | `int idade = 28;` |
| `long` | inteiro muito grande | `long populacao = 8_000_000_000L;` |
| `double` | número com casas decimais | `double salario = 3500.00;` |
| `boolean` | verdadeiro ou falso | `boolean ativo = true;` |
| `char` | **um** caractere (aspas simples) | `char categoria = 'B';` |
| `String` | texto (aspas duplas) | `String nome = "Ana";` |

> `String` começa com letra maiúscula porque **não é um tipo primitivo**: é uma classe. Isso vai fazer sentido no módulo de OO.

### Exemplo: orçamento do mês

Crie `exercicios/aula-01/Orcamento.java`:

```java
public class Orcamento {
    public static void main(String[] args) {
        String nome = "Ana";
        double salario = 3500.00;
        double aluguel = 1200.00;
        double mercado = 800.50;
        boolean temReserva = false;

        double totalGastos = aluguel + mercado;
        double sobra = salario - totalGastos;

        System.out.println("Orçamento de " + nome);
        System.out.println("Total de gastos: " + totalGastos);
        System.out.println("Sobra no mês: " + sobra);
        System.out.printf("Sobra formatada: R$ %.2f%n", sobra);
        System.out.println("Tem reserva? " + temReserva);
    }
}
```

**Saída esperada:**
```
Orçamento de Ana
Total de gastos: 2000.5
Sobra no mês: 1499.5
Sobra formatada: R$ 1499,50
Tem reserva? false
```

> **Os acentos saíram estranhos (`Or�amento`)?** É o terminal do Windows, não o seu código. Rode isto uma vez no terminal do VS Code e execute de novo:
> ```powershell
> [Console]::OutputEncoding = [System.Text.Encoding]::UTF8
> java -Dstdout.encoding=UTF-8 Orcamento.java
> ```

- `printf` formata a saída: `%.2f` = número com 2 casas decimais, `%n` = quebra de linha. Usa vírgula ou ponto conforme o idioma do Windows.
- `+` entre textos **concatena** (junta).

### Regras de nome
- Use **camelCase**: `totalGastos`, `valorDoAluguel`
- Comece com letra minúscula; nada de espaço ou acento
- Nomes que explicam o conteúdo: `sobra` é melhor que `s` ou `x`

### `var`
O Java também deixa o compilador descobrir o tipo sozinho:
```java
var cidade = "Curitiba";   // o compilador entende que é String
```
Mas o tipo continua fixo: depois disso, `cidade = 10;` dá erro.

---

## Parte 5 · Operadores (30 min)

### Aritméticos
```java
int a = 7;
int b = 2;

System.out.println(a + b);   // 9
System.out.println(a - b);   // 5
System.out.println(a * b);   // 14
System.out.println(a / b);   // 3   ← ATENÇÃO!
System.out.println(a % b);   // 1   (resto da divisão)
```

### ⚠️ A pegadinha da divisão inteira
**`int` dividido por `int` dá `int`: a parte decimal é jogada fora.**

```java
System.out.println(7 / 2);       // 3
System.out.println(7 / 2.0);     // 3.5  (basta um dos lados ser double)
System.out.println((double) 7 / 2); // 3.5  (conversão, o "casting")
```

E o contrário também existe:
```java
int inteiro = (int) 9.99;   // 9 (corta, não arredonda!)
```

### O `%` (resto) é muito útil
```java
10 % 2   // 0 → número par
7 % 2    // 1 → número ímpar
125 % 60 // 5 → 125 segundos = 2 minutos e 5 segundos
```

### Atalhos
```java
int contador = 0;
contador += 5;   // contador = contador + 5
contador++;      // contador = contador + 1
contador--;      // contador = contador - 1
```

### Comparação e lógica (resultado é sempre `boolean`)
```java
double sobra = 1499.5;
boolean temReserva = false;

boolean sobrouBem = sobra > 1000;               // true
boolean podeInvestir = sobra > 500 && !temReserva; // true

// ==  igual       !=  diferente
// >   >=   <   <=
// &&  E (as duas precisam ser verdadeiras)
// ||  OU (basta uma ser verdadeira)
// !   NÃO (inverte)
```

### ⚠️ Pegadinha da concatenação
```java
System.out.println("Total: " + 10 + 5);    // Total: 105
System.out.println("Total: " + (10 + 5));  // Total: 15
```
Depois de um texto, o `+` vira "juntar texto". Use parênteses para fazer a conta antes.

---

## Parte 6 · Exercícios (1h)

Crie um arquivo para cada um em `exercicios/aula-01/`. **Tente sem olhar a aula primeiro**; consulte só se travar.

### 1. `FichaPessoal.java`
Crie variáveis para nome, idade, altura (ex.: 1.75), cidade e se está empregado. Imprima uma ficha organizada, uma informação por linha.

### 2. `ConversorTemperatura.java`
Converta uma temperatura em Celsius para Fahrenheit: **F = C × 9 / 5 + 32**.
- Teste com 25°C (deve dar 77.0)
- Depois, escreva a fórmula como `celsius * (9 / 5) + 32` e veja o resultado. **Explique num comentário por que deu errado.**

### 3. `MediaNotas.java`
Guarde 3 notas **como `int`** (ex.: 7, 8, 8). Calcule a média **com casas decimais** (deve dar 7.666…) e imprima com 2 casas usando `printf`. Imprima também `Aprovado: true/false` (aprovado se média ≥ 7).

### 4. `ParOuImpar.java`
Dado um número, imprima `É par? true` ou `É par? false`. Dica: `%`.

### 5. 🏆 Desafio: `OrcamentoMensal.java`
Com um salário e **4 gastos** (aluguel, mercado, transporte, lazer), imprima:
- o total de gastos
- quanto sobrou
- **quantos % do salário** foram gastos, com 2 casas decimais
- `Estourou o orçamento? true/false`

### 6. 🏆 Desafio extra: `ConversorSegundos.java`
Converta `10000` segundos em horas, minutos e segundos usando só `/` e `%`.
Saída esperada: `10000 segundos = 2h 46min 40s`

---

## ✅ Checklist de fim de aula

- [ ] Extensão Java instalada no VS Code
- [ ] Git configurado e repositório `estudos-java` no GitHub
- [ ] `OlaMundo` e `Orcamento` rodando
- [ ] Exercícios 1 a 4 feitos
- [ ] Desafios 5 e 6 tentados (mesmo que não tenha conseguido)
- [ ] Commit e push:

```bash
git add .
git commit -m "Aula 01: variáveis, tipos e operadores"
git push
```

- [ ] Me mandar: **"Corrige a aula 01"** (e as dúvidas que anotou)
