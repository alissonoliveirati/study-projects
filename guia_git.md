# 📌 Guia Rápido Git

## 1. Mensagens de Commit

### ✅ Boas práticas
- Mensagens curtas e objetivas (até 72 caracteres)
- Escreva no imperativo: **"Adiciona...", "Corrige..."**
- Evite mensagens genéricas como *update*, *teste*
- Use corpo da mensagem se precisar detalhar

### 📝 Estrutura recomendada
```
<tipo>: <mensagem curta>

[corpo opcional explicando mudanças mais detalhadas]
```

### 🔹 Tipos mais usados
- **feat**: nova funcionalidade  
- **fix**: correção de bug  
- **docs**: documentação  
- **style**: formatação/estilo  
- **refactor**: refatoração sem mudar comportamento  
- **test**: criação/alteração de testes  
- **chore**: manutenção/configurações  

### 🔹 Exemplos
```
feat: adiciona tela de login
fix: corrige falha ao validar CPF
docs: atualiza README com instruções
refactor: extrai método de cálculo de juros
```

---

## 2. Principais Comandos Git

### 🔹 Configuração inicial
```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
git config --list
```

### 🔹 Fluxo básico
```bash
git init              # inicia repositório local
git clone URL         # clona repositório remoto
git status            # status dos arquivos
git add .             # adiciona todos os arquivos
git commit -m "msg"   # cria commit
git push              # envia para remoto
git pull              # atualiza local
```

### 🔹 Branches
```bash
git branch            # lista branches
git branch nome       # cria nova branch
git checkout nome     # troca de branch
git checkout -b nome  # cria e troca branch
git merge nome        # mescla branch
```

### 🔹 Histórico
```bash
git log               # histórico completo
git log --oneline     # histórico resumido
git diff              # diferenças não commitadas
```

### 🔹 Remotos
```bash
git remote -v               # lista remotos
git remote add origin URL   # adiciona remoto
git push -u origin main     # envia branch e define upstream
```

### 🔹 Correções comuns
```bash
git rm -r pasta       # remove pasta do Git
git mv antigo novo    # renomeia arquivo/pasta
git reset --hard HEAD # descarta alterações locais
git stash             # guarda alterações temporárias
git stash pop         # recupera alterações guardadas
```

---

📌 **FIM DO GUIA**
