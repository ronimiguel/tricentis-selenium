## Automatizar preenchimento de formulário



## Sobre o teste

O objetivo foi automatizar o preenchimento do formulário até o envio do email do site

http://sampleapp.tricentis.com/101/app.php

### Os testes foram desenvolvidos utilizando: 

- Selenium WebDriver ( para interação com a página )
- Junit ( para fazer as assertivas)

### Rodando os testes

Antes de tudo você precisar ter instalado na sua máquina.

- Java 11

- Maven 

- Chromedriver instalado e configurado em suas variáveis de ambiente.  

#### Para rodar os teste voce precisa estar na pasta principal do projeto e digitar:

```bash
mvn test
```

Ou clonar esse repositório abrir em sua IDE favorita Eclipse/ intellij etc... e rodar como projeto do junit.

Ao final do envio do formulario uma screenshot será salva na pasta:

```bash
src/test/resources/Evidencias/
```
