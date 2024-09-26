# Projeto iPhone

Projeto desenvolvido para modelar em diagrama de classes usando a notação UML e criar as classes desse projeto em Java com os conceitos de OOP.

Projeto desafio exposto no link:

[GitHub](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

## Ferramentas utilizadas

- Intellij

- Umbrello

- Mark Text



## Diagrama da solução

![diagraUML](https://github.com/andersonprovox/std-modelo-iphone/blob/main/diagrama%20de%20classe.png)

```plantuml
interface iPhone
class NavegadorInternet
class ReprodutorMultimedia
class AparelhoTelefonico
class ReprodutorMusica
class ReprodutorVideo

iPhone <|-- ReprodutorMultimedia
iPhone <|-- NavegadorInternet
iPhone <|-- AparelhoTelefonico
ReprodutorMultimedia *-- ReprodutorMusica
ReprodutorMultimedia *-- ReprodutorVideo
```
