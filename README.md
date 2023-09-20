# Desafio de Modelagem e Implementação - iPhone

Este é um desafio de modelagem e implementação que envolve a criação de um sistema simples para representar um iPhone com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Descrição do Desafio

Você deve criar um sistema que representa um iPhone com as seguintes funcionalidades:

### Reprodutor Musical

- Tocar música
- Pausar música
- Selecionar uma música

### Aparelho Telefônico

- Ligar
- Atender chamadas
- Iniciar correio de voz

### Navegador na Internet

- Exibir uma página web
- Adicionar uma nova aba
- Atualizar a página

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src`
  - `main`
    - `java`
      - `entities`: Contém a classe `Iphone` que representa o iPhone.
      - `interfaces`: Contém as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.

## Como Usar

Você pode criar uma instância do `Iphone` e usar os métodos das interfaces para testar as funcionalidades do iPhone.

Exemplo de uso:

```java
Iphone meuIphone = new Iphone("iPhone X", "123-456-7890");

// Reprodutor Musical
meuIphone.tocar();
meuIphone.pausar();
meuIphone.selecionarMusica("Minha Música Favorita");

// Aparelho Telefônico
meuIphone.ligar();
meuIphone.atender();
meuIphone.iniciarCorreioVoz();

// Navegador na Internet
meuIphone.exibirPagina("https://www.example.com");
meuIphone.adicionarNovaAba();
meuIphone.atualizarPagina();
