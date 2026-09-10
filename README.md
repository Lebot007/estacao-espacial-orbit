# estacao-espacial-orbit
Exercício de Garantia da Qualidade de Software: módulo de monitoramento de suporte de vida com fluxo develop, stage e main.
# Estação Espacial Orbit

Módulo de monitoramento dos níveis do ambiente da estação espacial para o
exercício de Garantia da Qualidade de Software.

## Fluxo de ambientes

- **develop**: desenvolvimento e validação inicial do código.
- **stage**: homologação e execução dos testes antes da publicação.
- **main**: produção, contendo somente a versão aprovada.

## Tripulante desenvolvedor

- João Vitor Alves Rodrigues (Lebot007)

## Módulo de suporte de vida

O arquivo `suporte-vida.java` monitora oxigênio, temperatura e pressão,
informando se os níveis estão nominais ou quais leituras precisam de atenção.

Para executar:

```bash
javac suporte-vida.java
java SuporteVida
```
