# Trilha Java → Vaga Júnior

**Ritmo:** 3h/dia · 5 dias/semana · 15h/semana
**Duração estimada:** ~27 semanas (6 a 7 meses)
**Meta:** terminar o Nível 1 inteiro + o essencial do Nível 2, com 2 projetos no GitHub, e começar a se candidatar a partir da **Semana 20**.

> Como marcar: troque `[ ]` por `[x]` quando concluir.

---

## Como funcionam as aulas

As aulas são preparadas pelo Claude, seguindo os temas e a ordem dos cursos desta trilha. Cada uma fica em [`aulas/`](aulas/README.md), e o seu código fica em `exercicios/aula-XX/`.

- Começo do dia: **"Me passa a aula de hoje"**
- Fim dos exercícios: **"Corrige a aula XX"**
- Fim da fase: **"Terminei a Fase X, valida e me passa os posts"**

> Os nomes dos módulos (ex.: "Spring Boot 3") são os temas originais; as aulas usam as versões atuais das ferramentas.

## Rotina diária (3h)

- **2h** de aula: ler a aula do dia e rodar cada exemplo no seu computador
- **1h** de exercícios sem olhar a aula, anotar dúvidas e fazer commit no GitHub

**Regras para não se perder**
- [ ] Criar um repositório no GitHub só para os estudos (um commit por aula ou por dia)
- [ ] Manter um arquivo de anotações por curso (o que aprendi / o que não entendi)
- [ ] Se atrasar, **não pule aula**: empurre o cronograma uma semana
- [ ] Toda sexta: revisar a semana e marcar os critérios de saída da fase

---

## Validação e postagens (LinkedIn + GitHub)

Ao terminar cada fase, você me chama e a gente faz o ciclo abaixo **antes** de postar:

1. **Você** deixa o código da fase nesta pasta (`Estudo JAVA/`) ou me passa o link do repositório
2. **Eu** reviso o código com base nos critérios de saída da fase e aponto o que precisa ajustar
3. **Você** corrige, e eu confirmo que está ok ✅
4. **Eu** entrego os textos prontos:
   - **GitHub:** README do projeto, mensagem de commit e o que fixar no perfil
   - **LinkedIn:** o post pronto para copiar e colar, com sugestão de imagem (print do código, do Swagger, do teste passando…)

Para pedir, basta escrever: **"Terminei a Fase X, valida e me passa os posts"**.

**Ritmo das redes**
- **GitHub:** commit todo dia de estudo (o gráfico verde do perfil conta para o recrutador)
- **LinkedIn:** 1 post por fase concluída + 1 post por projeto, ou seja, um a cada 2 ou 3 semanas. Post de "terminei o curso X" sozinho não chama atenção; o post mostra **o que você construiu e aprendeu**.

**Estrutura sugerida do GitHub**
- `estudos-java` → um repositório com uma pasta por curso (é o seu diário de estudos)
- `projeto-1-...` e `projeto-2-...` → repositórios separados, fixados no perfil
- `seu-usuario/seu-usuario` → README de perfil (apresentação + tecnologias)

---

# NÍVEL 1 — Aplicações Web com Java e Spring (164h)

## Fase 1 · Fundamentos Java — Semanas 1 a 3 (36h)

- [ ] 01 · Java: criando a sua primeira aplicação (8h)
- [ ] 02 · Java: aplicando a Orientação a Objetos (10h)
- [ ] 03 · Java: trabalhando com listas e coleções de dados (8h)
- [ ] 04 · Java: consumindo API, gravando arquivos e lidando com erros (10h)

**Critérios de saída (você consegue...)**
- [ ] Explicar classe, objeto, herança, interface, polimorfismo e encapsulamento com suas palavras
- [ ] Escolher entre `List`, `Set` e `Map` e justificar
- [ ] Consumir uma API pública e salvar o resultado em arquivo, tratando erros com `try/catch`

**📣 Publicar** (após minha validação)
- [ ] **Semana 1:** GitHub: criar o repositório `estudos-java` com um README explicando a trilha
- [ ] **Semana 1:** LinkedIn: post de início da jornada ("estou estudando Java para back-end, vou compartilhar o caminho")
- [ ] **Fim da fase:** LinkedIn: post sobre o mini projeto que consome uma API (print do resultado)

## Fase 2 · Web, Spring e Banco de Dados — Semanas 4 a 7 (60h)

- [ ] 05 · Redes e Protocolos: fundamentos da web (20h) — dica: dividir em pedaços ao longo das 4 semanas
- [ ] 06 · Java: trabalhando com lambdas, streams e Spring Framework (14h)
- [ ] 07 · Java: persistência de dados e consultas com Spring Data JPA (16h)
- [ ] 08 · Java: criando sua primeira API e conectando ao front (10h)

**Critérios de saída**
- [ ] Explicar o que acontece numa requisição HTTP (métodos, status codes, headers, HTTPS)
- [ ] Usar `stream().filter().map().collect()` sem consultar
- [ ] Mapear entidades com JPA (`@Entity`, `@OneToMany`, `@ManyToOne`) e criar consultas com repositórios
- [ ] Subir uma API Spring Boot que responde JSON

**📣 Publicar** (após minha validação)
- [ ] GitHub: código dos cursos 06 a 08 no `estudos-java`, com README em cada pasta
- [ ] LinkedIn: post "minha primeira API com Spring Boot" (explicar o que ela faz e mostrar print da resposta JSON)

## Fase 3 · Qualidade de Código — Semanas 8 a 10 (38h)

- [ ] 09 · Java exceções: aprenda a criar, lançar e controlar exceções (8h)
- [ ] 10 · Java e refatoração: melhorando códigos com boas práticas (10h)
- [ ] 11 · Boas práticas de programação: melhore o código de uma API Java (10h)
- [ ] 12 · Boas práticas de programação: automatizando testes com Java (10h)

**Critérios de saída**
- [ ] Criar exceções próprias e saber quando usar checked x unchecked
- [ ] Separar responsabilidades em `controller` / `service` / `repository`
- [ ] Escrever testes com JUnit e simular dependências com Mockito

**📣 Publicar** (após minha validação)
- [ ] GitHub: código refatorado com testes, mostrando o antes e o depois no README
- [ ] LinkedIn: post sobre testes ("por que escrever testes": print dos testes passando)

## Fase 4 · Ferramentas do dia a dia — Semanas 11 e 12 (30h)

- [ ] 13 · DevOps: trabalhando com repositórios no GitHub (8h)
- [ ] 14 · Docker na prática para Backend Java (8h)
- [ ] 15 · Desenvolvimento Back-end com IA: Fundamentos Práticos (12h)
- [ ] 16 · Checkpoint Nível 1: simulado de entrevista comigo (2h)

**Critérios de saída**
- [ ] Usar Git com branches, pull request e resolver conflito
- [ ] Rodar a aplicação e o banco de dados com Docker / docker-compose
- [ ] Guardar senhas e chaves em variáveis de ambiente (nunca no código)

**📣 Publicar** (após minha validação)
- [ ] GitHub: criar o README de perfil (`seu-usuario/seu-usuario`) com apresentação e tecnologias
- [ ] LinkedIn: adicionar Java, Git e Docker em "Competências"
- [ ] LinkedIn: post de conclusão do Nível 1 (o que aprendeu + próximo passo)

## 🛠 Semana 13 · Projeto de Portfólio 1 (15h)

Uma API REST pequena feita **sem acompanhar vídeo**. Sugestão: controle de gastos, biblioteca ou agenda.
- [ ] CRUD completo com Spring Boot + Spring Data JPA + banco (PostgreSQL ou MySQL)
- [ ] Tratamento de erros e validação de entrada
- [ ] Pelo menos 5 testes com JUnit/Mockito
- [ ] `docker-compose.yml` para subir banco + aplicação
- [ ] README com: o que é, tecnologias, como rodar, exemplos de requisição

**📣 Publicar** (após minha validação, que nesta etapa é uma revisão completa do projeto)
- [ ] GitHub: repositório próprio, fixado no perfil
- [ ] LinkedIn: post apresentando o projeto (problema que resolve, tecnologias, link do repositório, print ou GIF)
- [ ] LinkedIn: adicionar o projeto na seção "Projetos" do perfil

---

# NÍVEL 2 — APIs Seguras, Microsserviços e CI/CD (154h)

> Reordenei as fases em relação à plataforma: **testes e CI antes de microsserviços**, porque é o que mais aparece em vagas júnior.

## Fase 5 · API REST profissional — Semanas 14 a 16 (40h)

- [ ] 01 · Spring Boot 3: desenvolva uma API Rest em Java (10h)
- [ ] 02 · Spring Boot 3: aplique boas práticas e proteja uma API Rest (12h)
- [ ] 03 · Spring Boot 3: documente, teste e prepare uma API para o deploy (10h)
- [ ] 04 · Swagger: documentando suas APIs (8h)

**Critérios de saída**
- [ ] Usar DTOs (records), Bean Validation, paginação e tratamento global de erros (`@RestControllerAdvice`)
- [ ] Usar migrations (Flyway) e profiles (dev/prod)
- [ ] Documentar a API com Swagger/OpenAPI

**📣 Publicar** (após minha validação)
- [ ] GitHub: API do curso com Swagger e README
- [ ] LinkedIn: post sobre boas práticas em API REST (DTO, validação, tratamento de erros), com print do Swagger

## Fase 6 · Segurança — Semanas 17 a 19 (40h)

- [ ] 05 · Java e Spring Security: proteja suas aplicações web (8h)
- [ ] 06 · Java e Spring Security: crie perfis e autorize requisições (10h)
- [ ] 07 · Java e Spring Security: proteja suas APIs REST (12h)
- [ ] 08 · Java e Spring Security: login com GitHub, Google e autenticação de 2 fatores (10h)

**Critérios de saída**
- [ ] Implementar login com JWT do zero
- [ ] Restringir endpoints por perfil (ADMIN / USER)
- [ ] Explicar a diferença entre autenticação e autorização

**📣 Publicar** (após minha validação)
- [ ] LinkedIn: post explicando JWT de forma simples (um diagrama do fluxo de login funciona bem)

## 🛠 Semana 20 · Projeto de Portfólio 2 (15h) — o principal

Evoluir o Projeto 1 (ou começar um novo) com tudo do Nível 2 até aqui.
- [ ] Autenticação JWT + perfis de acesso
- [ ] Swagger publicado
- [ ] Migrations com Flyway
- [ ] README caprichado (com prints do Swagger)

**📣 Publicar** (após minha validação, que nesta etapa é uma revisão completa do projeto)
- [ ] GitHub: repositório fixado em 1º lugar no perfil
- [ ] LinkedIn: post de apresentação do projeto principal (o post mais importante da trilha)
- [ ] LinkedIn: ativar "Open to Work" (pode ser visível só para recrutadores)

### 🚀 A partir daqui: começar a se candidatar
- [ ] Currículo de 1 página com link do GitHub e dos 2 projetos
- [ ] LinkedIn atualizado (título: "Desenvolvedor Java Back-end")
- [ ] GitHub com os projetos fixados no perfil
- [ ] Revisar perguntas comuns de entrevista: OO, coleções, HTTP, REST, SQL, JPA, Git
- [ ] Praticar lógica 2 a 3 vezes por semana (beecrowd, HackerRank ou LeetCode fácil)

## Fase 7 · Testes e Integração Contínua — Semanas 21 a 23 (32h)

- [ ] 13 · Testes de Integração em Java: Garantindo Qualidade em Back-ends Modernos (16h)
- [ ] 14 · Integração Contínua: pipelines e testes automatizados com GitHub Actions (8h)
- [ ] 15 · Integração Contínua: Pipeline Docker no Github Actions (8h)

**Critérios de saída**
- [ ] Escrever testes de integração (`@SpringBootTest`, `@DataJpaTest`, MockMvc)
- [ ] Ter um pipeline no GitHub Actions rodando os testes a cada push no Projeto 2

**📣 Publicar** (após minha validação)
- [ ] GitHub: badge de "build passing" no README do Projeto 2
- [ ] LinkedIn: post sobre CI ("cada push meu agora roda os testes automaticamente"), com print do pipeline verde

## Fase 8 · Microsserviços (diferencial) — Semanas 24 a 26 (38h)

- [ ] 09 · Microsserviços na prática: entendendo a tomada de decisões (8h)
- [ ] 10 · Microsserviços na prática: implementando com Java e Spring (10h)
- [ ] 11 · Microsserviços na prática: IaC com CDK e deploy na AWS (10h)
- [ ] 12 · Microsserviços na prática: mensageria com RabbitMQ (10h)

**Critérios de saída**
- [ ] Explicar quando **não** usar microsserviços (pergunta clássica de entrevista)
- [ ] Fazer dois serviços se comunicarem por HTTP e por fila (RabbitMQ)

**📣 Publicar** (após minha validação)
- [ ] GitHub: repositório dos microsserviços com diagrama da arquitetura no README
- [ ] LinkedIn: post "monolito x microsserviços: o que aprendi" (opinião + diagrama)

## Semana 27 · Fechamento do Nível 2

- [ ] 16 · Desenvolvimento Back-end com IA: Práticas Avançadas e Integração (2h)
- [ ] 17 · Checkpoint Nível 2: simulado de entrevista comigo (2h)
- [ ] Atualizar README dos projetos com testes e badge do CI

**📣 Publicar** (após minha validação)
- [ ] LinkedIn: post de retrospectiva da trilha (onde começou, o que construiu, links dos projetos)
- [ ] LinkedIn: atualizar "Sobre" e "Competências" (Java, Spring Boot, Spring Security, JPA, JUnit, Mockito, Docker, Git, GitHub Actions)

---

# NÍVEL 3 — Depois da vaga (opcional)

O Nível 3 é conteúdo de pleno/sênior (arquitetura, Kafka, WebFlux, Kubernetes). **Não é necessário para vaga júnior.** Se quiser um diferencial enquanto procura vaga, faça só estes:

- [ ] 05 · Mensageria com Java: RabbitMQ e Kafka (14h)
- [ ] 01 · Fundamentos da Arquitetura de Software Moderna (16h)

Restante do Nível 3 (para depois de contratado):
- [ ] 02 · Padrões de Integração em Sistemas Distribuídos (16h)
- [ ] 03 · Padrões arquiteturais de software: escala, resiliência e observabilidade (10h)
- [ ] 04 · Back-ends Modernos em Java: Reatividade, Observabilidade e Performance (12h)
- [ ] 06 · LangChain4j: desenvolvimento de agentes de IA em Java (12h)
- [ ] 07 · Java e Spring: construindo aplicações reativas com WebFlux (10h)
- [ ] 08 · Java e Spring: Realizando processamento em lote com Spring Batch (8h)
- [ ] 09 · Persistência Poliglota: arquiteturas e otimização de desempenho (12h)
- [ ] 10 · Kubernetes para Desenvolvedores Java (8h)
- [ ] 11 · Integração Contínua: Pipeline de entrega e implementação contínua na EC2 (8h)
- [ ] 12 · Integração Contínua: automatize o deploy no Amazon ECS (8h)
- [ ] 13 · Integração Contínua: Rollback e teste de carga (8h)
- [ ] 14 · Integração Contínua: automatizando a entrega no Kubernetes (8h)
- [ ] 15 · Checkpoint Nível 3: simulado de entrevista comigo (2h)

---

## Paralelo (encaixar 1h por semana, se der)

- [ ] SQL puro: `SELECT`, `JOIN`, `GROUP BY`, subqueries (entrevistas cobram muito)
- [ ] Inglês técnico: ler documentação do Spring e mensagens de erro em inglês

## Painel de progresso

| Fase | Semanas | Concluída | Validada | GitHub | LinkedIn |
|---|---|---|---|---|---|
| 1 · Fundamentos Java | 1–3 | [ ] | [ ] | [ ] | [ ] |
| 2 · Web, Spring e Banco | 4–7 | [ ] | [ ] | [ ] | [ ] |
| 3 · Qualidade de Código | 8–10 | [ ] | [ ] | [ ] | [ ] |
| 4 · Ferramentas | 11–12 | [ ] | [ ] | [ ] | [ ] |
| Projeto 1 | 13 | [ ] | [ ] | [ ] | [ ] |
| 5 · API REST profissional | 14–16 | [ ] | [ ] | [ ] | [ ] |
| 6 · Segurança | 17–19 | [ ] | [ ] | [ ] | [ ] |
| Projeto 2 + candidaturas | 20 | [ ] | [ ] | [ ] | [ ] |
| 7 · Testes e CI | 21–23 | [ ] | [ ] | [ ] | [ ] |
| 8 · Microsserviços | 24–26 | [ ] | [ ] | [ ] | [ ] |
| Fechamento Nível 2 | 27 | [ ] | [ ] | [ ] | [ ] |
