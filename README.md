# MVP — Coletivo Artesãos da Orla (Pontal do Paraná/PR)

Plataforma web *Mobile-First* desenvolvida como Minimum Viable Product (MVP) para centralizar a vitrine digital de peças artesanais, facilitar o contato direto via WhatsApp (`Click-to-WhatsApp`) e organizar encomendas dos expositores do **Coletivo Artesãos da Orla** (balneários de Pontal do Sul a Ipanema, Pontal do Paraná/PR).

## Arquitetura e Tecnologias
- **Backend:** Java 17 + Spring Boot 3.3.x (API REST desacoplada, Spring Security + BCrypt)
- **Banco de Dados:** PostgreSQL 16 (H2 em memória para testes automatizados)
- **Frontend:** HTML5, CSS3 e JavaScript puro (*Mobile-First*, WCAG AA, alto contraste ≥ 4,5:1)
- **Qualidade e CI:** JUnit 5, MockMvc e GitHub Actions

## Estrutura do Projeto
- `frontend/`: Interface *Mobile-First* acessível (Vitrine Pública, Painel do Artesão e Tela de Resultado)
- `backend/`: API REST em Java 17 / Spring Boot e testes automatizados JUnit 5
- `.github/workflows/`: Pipeline de Integração Contínua (CI)
