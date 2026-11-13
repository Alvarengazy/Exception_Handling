 <div align="center">

# ☕ Java — Exception Handling

**A practical Java study exploring exception handling, error control, program reliability, and custom exception creation.**

![Java](https://img.shields.io/badge/Java-Exception%20Handling-orange?logo=openjdk)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Level](https://img.shields.io/badge/Level-Beginner%20%2F%20Intermediate-blue)

**· [🇺🇸 English](#-english) · [🇧🇷 Português](#-português) · [🧭 Learning Roadmap](#-learning-roadmap--roteiro-de-estudos) ·**

</div>

---

<details open>
<summary><strong>🇺🇸 English</strong></summary>

### 📖 About

This project explores Java Exception Handling and its importance in developing reliable applications.

The study covers exception detection, error handling, execution flow, exception propagation, Checked and Unchecked Exceptions, and custom exception creation.

Practical examples demonstrate how to handle errors using `try`, `catch`, and `finally`, as well as how to throw exceptions with `throw` and declare them with `throws`.

### 🎯 Topics Covered

**Exception Handling Fundamentals**
- **try:** Defining a block of code where exceptions may occur.
- **catch:** Handling exceptions and defining recovery actions.
- **Multiple catch:** Handling different exception types separately.
- **finally:** Executing cleanup or finalization code after exception handling.

**Throwing and Declaring Exceptions**
- **throw:** Explicitly throwing an exception.
- **throws:** Declaring exceptions that a method may throw.
- **Exception Propagation:** Understanding how exceptions move through method calls.

**Checked and Unchecked Exceptions**
- **Checked Exceptions:** Exceptions that must be caught or declared at compile time.
- **Unchecked Exceptions:** Exceptions that do not require mandatory handling or declaration.
- **Exception Hierarchy:** Understanding the relationship between `Throwable`, `Exception`, and `RuntimeException`.

**Custom Exceptions**
- **Custom Exception Classes:** Creating application-specific exceptions.
- **extends Exception:** Creating a custom Checked Exception.
- **Constructors:** Defining custom exception constructors.
- **super():** Passing messages to the parent exception constructor.
- **getMessage():** Retrieving exception messages.

### 💻 Practical Examples

**Using try and catch**

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

The `try` block contains code that may throw an exception. The `catch` block handles the specific error.

**Handling Multiple Exceptions**

```java
try {
    // Code that may throw exceptions
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error!");
} catch (NullPointerException e) {
    System.out.println("Null reference!");
}
```

Different `catch` blocks allow specific handling for different exception types. Only the first compatible block is executed.

**Using finally**

```java
try {
    System.out.println("Executing operation...");
} catch (Exception e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Execution finished.");
}
```

The `finally` block normally executes whether an exception occurs or not.

**Using throw and throws**

```java
public static void verifyAge(int age)
        throws IllegalArgumentException {

    if (age < 18) {
        throw new IllegalArgumentException("Age not allowed!");
    }
}
```

`throw` explicitly launches an exception, while `throws` declares that a method may throw it.

**Creating a Custom Exception**

```java
public class QuantidadeInvalidaException extends Exception {

    public QuantidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

This class defines a custom Checked Exception. The constructor passes its message to the parent `Exception` class.

**Throwing and Handling a Custom Exception**

```java
public static void verificarQuantidade(int quantidade)
        throws QuantidadeInvalidaException {

    if (quantidade < 0) {
        throw new QuantidadeInvalidaException(
            "Quantity cannot be negative!"
        );
    }

    System.out.println("Valid quantity!");
}
```

The method validates the quantity and throws a custom exception when the value is negative.

### 🧠 Key Concepts

**Exception Handling**

Exception handling allows applications to respond to unexpected situations without relying exclusively on normal execution flow.

**Recovery Logic**

A `catch` block can do more than display an error message. It can also execute recovery actions, depending on the application logic.

**Exception Declaration vs. Throwing**

`throws` declares the possibility of an exception, while `throw` performs the actual throwing operation.

**Checked vs. Unchecked**

Checked Exceptions require compile-time handling or declaration. Unchecked Exceptions do not impose this requirement.

**Custom Exceptions**

Custom exceptions allow developers to represent application-specific validation failures and other exceptional situations.

</details>

---

<details>
<summary><strong>🇧🇷 Português</strong></summary>

### 📖 Sobre

Este projeto explora o Tratamento de Exceções em Java e sua importância no desenvolvimento de aplicações confiáveis.

O estudo aborda identificação de exceções, tratamento de erros, fluxo de execução, propagação de exceções, Checked e Unchecked Exceptions e criação de exceções personalizadas.

Os exemplos práticos demonstram como tratar erros utilizando `try`, `catch` e `finally`, além de lançar exceções com `throw` e declará-las com `throws`.

### 🎯 Conteúdos Estudados

**Fundamentos do Tratamento de Exceções**
- **try:** Definição de um bloco de código onde podem ocorrer exceções.
- **catch:** Tratamento de exceções e definição de ações de recuperação.
- **Múltiplos catch:** Tratamento separado de diferentes tipos de exceções.
- **finally:** Execução de código de finalização após o tratamento de exceções.

**Lançamento e Declaração de Exceções**
- **throw:** Lançamento explícito de uma exceção.
- **throws:** Declaração de exceções que um método pode lançar.
- **Propagação de Exceções:** Compreensão de como as exceções percorrem as chamadas de métodos.

**Checked e Unchecked Exceptions**
- **Checked Exceptions:** Exceções que precisam ser capturadas ou declaradas durante a compilação.
- **Unchecked Exceptions:** Exceções que não exigem tratamento ou declaração obrigatória.
- **Hierarquia de Exceções:** Compreensão da relação entre `Throwable`, `Exception` e `RuntimeException`.

**Exceções Personalizadas**
- **Classes de Exceção Personalizadas:** Criação de exceções específicas para a aplicação.
- **extends Exception:** Criação de uma exceção personalizada do tipo Checked.
- **Construtores:** Definição de construtores para exceções personalizadas.
- **super():** Envio de mensagens ao construtor da classe pai.
- **getMessage():** Recuperação das mensagens das exceções.

### 💻 Exemplos Práticos

**Utilizando try e catch**

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Não é possível dividir por zero!");
}
```

O bloco `try` contém o código onde pode ocorrer uma exceção. O `catch` trata o erro específico.

**Tratando Múltiplas Exceções**

```java
try {
    // Código que pode lançar exceções
} catch (ArithmeticException e) {
    System.out.println("Erro aritmético!");
} catch (NullPointerException e) {
    System.out.println("Referência nula!");
}
```

Diferentes blocos `catch` permitem tratamentos específicos para diferentes tipos de exceções. Apenas o primeiro bloco compatível é executado.

**Utilizando finally**

```java
try {
    System.out.println("Executando operação...");
} catch (Exception e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Execução finalizada.");
}
```

O bloco `finally` normalmente é executado independentemente de ocorrer uma exceção.

**Utilizando throw e throws**

```java
public static void verificarIdade(int idade)
        throws IllegalArgumentException {

    if (idade < 18) {
        throw new IllegalArgumentException("Idade não permitida!");
    }
}
```

O `throw` lança explicitamente uma exceção, enquanto o `throws` declara que um método pode lançá-la.

**Criando uma Exceção Personalizada**

```java
public class QuantidadeInvalidaException extends Exception {

    public QuantidadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

Essa classe define uma exceção personalizada do tipo Checked. O construtor envia sua mensagem para a classe pai `Exception`.

**Lançando e Tratando uma Exceção Personalizada**

```java
public static void verificarQuantidade(int quantidade)
        throws QuantidadeInvalidaException {

    if (quantidade < 0) {
        throw new QuantidadeInvalidaException(
            "Quantidade não pode ser negativa!"
        );
    }

    System.out.println("Quantidade válida!");
}
```

O método valida a quantidade e lança uma exceção personalizada quando o valor é negativo.

### 🧠 Conceitos Importantes

**Tratamento de Exceções**

O tratamento de exceções permite que aplicações respondam a situações inesperadas sem depender exclusivamente do fluxo normal de execução.

**Lógica de Recuperação**

Um bloco `catch` pode fazer mais do que exibir uma mensagem de erro. Ele também pode executar ações de recuperação, dependendo da lógica da aplicação.

**Declaração vs. Lançamento**

O `throws` declara a possibilidade de uma exceção, enquanto o `throw` realiza o lançamento efetivo.

**Checked vs. Unchecked**

Checked Exceptions exigem tratamento ou declaração durante a compilação. Unchecked Exceptions não possuem essa obrigatoriedade.

**Exceções Personalizadas**

Exceções personalizadas permitem representar falhas de validação e outras situações excepcionais específicas da aplicação.

</details>

---

## 🛣️ Learning Roadmap / Roteiro de Estudos

### Exception Handling Fundamentals

- [x] Understand the purpose of exception handling / Compreender a finalidade do tratamento de exceções.
- [x] Use `try` and `catch` / Utilizar `try` e `catch`.
- [x] Handle multiple exceptions / Tratar múltiplas exceções.
- [x] Understand exception recovery logic / Compreender a lógica de recuperação.
- [x] Use `finally` / Utilizar `finally`.

### Throwing and Declaring Exceptions

- [x] Understand `throw` / Compreender `throw`.
- [x] Understand `throws` / Compreender `throws`.
- [x] Distinguish declaration from throwing / Diferenciar declaração de lançamento.

### Exception Types

- [x] Understand Checked Exceptions / Compreender Checked Exceptions.
- [x] Understand Unchecked Exceptions / Compreender Unchecked Exceptions.
- [x] Explore the exception hierarchy / Explorar a hierarquia de exceções.

### Custom Exceptions

- [x] Create a custom exception class / Criar uma classe de exceção personalizada.
- [x] Use `extends Exception` / Utilizar `extends Exception`.
- [x] Define a custom constructor / Definir um construtor personalizado.
- [x] Use `super()` and `getMessage()` / Utilizar `super()` e `getMessage()`.
- [x] Throw and handle a custom exception / Lançar e tratar uma exceção personalizada.

---

<div align="center">

## 🚀 Next Steps / Próximos Passos

**English**

Continue developing Java knowledge by exploring interfaces, abstract classes, generics, and project organization before moving into Spring Boot and REST API development.

**Português**

Continuar desenvolvendo os conhecimentos em Java explorando interfaces, classes abstratas, Generics e organização de projetos antes de avançar para Spring Boot e desenvolvimento de APIs REST.

## 📚 Repository / Repositório

Part of the **Java-Learning-Library**, a collection of practical projects documenting the learning process from Java fundamentals to more advanced concepts.

Parte da **Java-Learning-Library**, uma coleção de projetos práticos que documentam o processo de aprendizagem, desde os fundamentos de Java até conceitos mais avançados.

**Made with ☕, curiosity, and consistency.**

**Feito com ☕, curiosidade e consistência.**

</div>
