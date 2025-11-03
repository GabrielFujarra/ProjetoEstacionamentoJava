# Título do Projeto

Uma breve descrição sobre o que esse projeto faz e para quem ele é

# ProjetoEstacionamentoJava

## 🅰️ Sobre o projeto  
Projeto de sistema de controle de estacionamento desenvolvido em Java. O objetivo é gerir entradas e saídas de veículos, calcular tarifas e manter histórico de movimentações de um estacionamento.

## ✔️ Funcionalidades  
- Registro de entrada de veículos (placa, hora de entrada).  
- Registro de saída de veículos e cálculo de tarifa conforme tempo de permanência.  
- Visualização de veículos atualmente estacionados.  
- Histórico de movimentações (entradas e saídas).  
- Possibilidade de configurar tarifa por hora (ou outro modelo que você implementou).  
- Interface simples (console/gráfica conforme versão) ou lógica modular (separação de camadas).  

## 🧱 Arquitetura & Tecnologias  
- Linguagem: Java.  
- Estrutura principal: pacotes para domínio, serviços, persistência (se houver), entrada/saída.  
- Tratamento de exceções, uso de coleções ou listas para armazenamento temporário ou definitivo dos dados.        
- Convenção de código dentro dos padrões Java (nomenclatura, modificação de acesso, encapsulamento).  

## 🔍 Visão de uso  
1. Execute o sistema (por exemplo `java -jar ProjetoEstacionamentoJava.jar` ou diretamente na IDE).  
2. Escolha a opção de registrar entrada de veículo. Informe a placa e hora de entrada.  
3. Para saída, escolha a opção de registrar saída, informe a placa; o sistema calcula o tempo de permanência e aplica a tarifa.  
4. Consulte o relatório de veículos ainda no estacionamento ou histórico de movimentações.  
5. (Se aplicável) Ajuste a tarifa/hora na configuração do sistema.  
