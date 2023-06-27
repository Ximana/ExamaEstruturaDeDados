package view;

import controller.ArvoreBinaria;
import controller.Fila;
import controller.Grafo;
import controller.ListaCircular;
import controller.Pilha;
import java.awt.CardLayout;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import model.Livro;
import model.Musica;
import model.Pessoa;

public class Main extends javax.swing.JFrame {

    // Objectos
    Fila<Pessoa> fila = new Fila<>();
    Pilha<Livro> pilha = new Pilha<>();
    ListaCircular<Musica> lista = new ListaCircular<>();
    ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
    Grafo<Pessoa> grafo = new Grafo<>();

    DefaultListModel listaCircular = new DefaultListModel();

    int contador_levantamento = 0,
            contador_deposito = 0,
            contador_atendimentoGeral = 0,
            contador_abrirConta = 0,
            contador_prioridade = 0,
            contador_livro = 0;
    int contadorGrafo = 1;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        Painel_Principal = new javax.swing.JPanel();
        Painel_Fila = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nome_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idade_txt = new javax.swing.JTextField();
        senha_txt = new javax.swing.JTextField();
        prioridade_comboBox = new javax.swing.JComboBox<>();
        operacao_comboBox = new javax.swing.JComboBox<>();
        botao_limpat = new javax.swing.JButton();
        botao_AdicionarNaFila = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        remover_primeiro_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fila_jList = new javax.swing.JList<>();
        Painel_Pilha = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        titulo_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        escritor_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        genero_comboBox1 = new javax.swing.JComboBox<>();
        botao_limpat1 = new javax.swing.JButton();
        botao_AdicionarNaPilha = new javax.swing.JButton();
        anoLancamento_txt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        remover_da_Pilha_Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pilha_jList = new javax.swing.JList<>();
        Painel_Arvore = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        elementoArvore_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        botao_buscarNaArvore = new javax.swing.JButton();
        botao_AdicionarNaArvore = new javax.swing.JButton();
        botao_RemoverNaArvore = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botao_verArvore = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        arvore_jList = new javax.swing.JList<>();
        verArvore_comboBox = new javax.swing.JComboBox<>();
        Painel_Grafo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        nomeGrafo_txt1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        idadeGrafo_txt1 = new javax.swing.JTextField();
        GeneroGrafo_comboBox1 = new javax.swing.JComboBox<>();
        botao_limpat3 = new javax.swing.JButton();
        botao_AdicionarNaFila1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        pessoa1_comboBox = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        pessoa2_comboBox = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        botao_AdicionarNaFila4 = new javax.swing.JButton();
        botao_AdicionarNaFila5 = new javax.swing.JButton();
        botao_AdicionarNaFila6 = new javax.swing.JButton();
        Painel_ListaCircular = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tituloMusica_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cantor_txt = new javax.swing.JTextField();
        posicaoLista_comboBox = new javax.swing.JComboBox<>();
        botao_limpat2 = new javax.swing.JButton();
        botao_AdicionarNaLista = new javax.swing.JButton();
        estiloLista_comboBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        indiceLista_txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_Circular_jLista = new javax.swing.JList<>();
        remover_da_Lista_Button = new javax.swing.JButton();
        removerDaLista_comboBox = new javax.swing.JComboBox<>();
        indiceRemover_txt = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Painel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Painel_Principal.setLayout(new java.awt.CardLayout());

        Painel_Fila.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Pilha");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Pessoa na Fila"));

        nome_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_txtActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel7.setText("Idade");

        jLabel8.setText("Operação");

        jLabel9.setText("Senha");

        jLabel10.setText("Deficiente");

        idade_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_txtActionPerformed(evt);
            }
        });

        senha_txt.setEditable(false);
        senha_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_txtActionPerformed(evt);
            }
        });

        prioridade_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        prioridade_comboBox.setToolTipText("aa\naaa\naaa");

        operacao_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Levantamento", "Deposito", "Abertura de Conta", "Atendimento Geral" }));

        botao_limpat.setText("Limpar");
        botao_limpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpatActionPerformed(evt);
            }
        });

        botao_AdicionarNaFila.setText("Adicionar");
        botao_AdicionarNaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senha_txt)
                            .addComponent(prioridade_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome_txt)
                            .addComponent(idade_txt)
                            .addComponent(operacao_comboBox, 0, 208, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_AdicionarNaFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_limpat)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idade_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(operacao_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prioridade_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpat)
                    .addComponent(botao_AdicionarNaFila))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoas na Fila"));

        remover_primeiro_Button.setText("Remover Primeiro");
        remover_primeiro_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_primeiro_ButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(fila_jList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remover_primeiro_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(remover_primeiro_Button)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout Painel_FilaLayout = new javax.swing.GroupLayout(Painel_Fila);
        Painel_Fila.setLayout(Painel_FilaLayout);
        Painel_FilaLayout.setHorizontalGroup(
            Painel_FilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_FilaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_FilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Painel_FilaLayout.setVerticalGroup(
            Painel_FilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_FilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_FilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Painel_Principal.add(Painel_Fila, "fila");

        Painel_Pilha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Pilha");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Livro na pilha"));

        titulo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo_txtActionPerformed(evt);
            }
        });

        jLabel11.setText("Titulo");

        jLabel12.setText("Escritor");

        jLabel13.setText("Lançamento(ano)");

        jLabel14.setText("Id");

        jLabel15.setText("Genero");

        escritor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escritor_txtActionPerformed(evt);
            }
        });

        id_txt.setEditable(false);
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });

        genero_comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aventura", "Computação", "Ciências", "Romance", "Matemática", "Fisíca" }));
        genero_comboBox1.setToolTipText("aa\naaa\naaa");

        botao_limpat1.setText("Limpar");
        botao_limpat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpat1ActionPerformed(evt);
            }
        });

        botao_AdicionarNaPilha.setText("Adicionar");
        botao_AdicionarNaPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaPilhaActionPerformed(evt);
            }
        });

        anoLancamento_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoLancamento_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_txt)
                            .addComponent(genero_comboBox1, 0, 208, Short.MAX_VALUE)
                            .addComponent(titulo_txt)
                            .addComponent(escritor_txt)
                            .addComponent(anoLancamento_txt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_AdicionarNaPilha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_limpat1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(anoLancamento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(escritor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(genero_comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpat1)
                    .addComponent(botao_AdicionarNaPilha))
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Livros na Pilha"));

        remover_da_Pilha_Button.setText("Remover Último");
        remover_da_Pilha_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_da_Pilha_ButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(pilha_jList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(remover_da_Pilha_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(remover_da_Pilha_Button)
                .addContainerGap())
        );

        javax.swing.GroupLayout Painel_PilhaLayout = new javax.swing.GroupLayout(Painel_Pilha);
        Painel_Pilha.setLayout(Painel_PilhaLayout);
        Painel_PilhaLayout.setHorizontalGroup(
            Painel_PilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PilhaLayout.createSequentialGroup()
                .addGroup(Painel_PilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PilhaLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel2))
                    .addGroup(Painel_PilhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Painel_PilhaLayout.setVerticalGroup(
            Painel_PilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_PilhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_PilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        Painel_Principal.add(Painel_Pilha, "pilha");

        Painel_Arvore.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Arvore Binaria");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Valor na Arvore"));

        elementoArvore_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoArvore_txtActionPerformed(evt);
            }
        });

        jLabel21.setText("Numero");

        botao_buscarNaArvore.setText("Buscar");
        botao_buscarNaArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_buscarNaArvoreActionPerformed(evt);
            }
        });

        botao_AdicionarNaArvore.setText("Adicionar");
        botao_AdicionarNaArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaArvoreActionPerformed(evt);
            }
        });

        botao_RemoverNaArvore.setText("Remover");
        botao_RemoverNaArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_RemoverNaArvoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21)
                .addGap(81, 81, 81)
                .addComponent(elementoArvore_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(botao_AdicionarNaArvore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_buscarNaArvore)
                .addGap(18, 18, 18)
                .addComponent(botao_RemoverNaArvore)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(elementoArvore_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_buscarNaArvore)
                    .addComponent(botao_AdicionarNaArvore)
                    .addComponent(botao_RemoverNaArvore))
                .addGap(17, 17, 17))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos na arvore"));

        botao_verArvore.setText("Ver Arvore Completa");
        botao_verArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_verArvoreActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(arvore_jList);

        verArvore_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre Ordem", "Em Ordem", "Pos Ordem" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(verArvore_comboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_verArvore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verArvore_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botao_verArvore)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout Painel_ArvoreLayout = new javax.swing.GroupLayout(Painel_Arvore);
        Painel_Arvore.setLayout(Painel_ArvoreLayout);
        Painel_ArvoreLayout.setHorizontalGroup(
            Painel_ArvoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ArvoreLayout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(349, 349, 349))
            .addGroup(Painel_ArvoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel_ArvoreLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Painel_ArvoreLayout.setVerticalGroup(
            Painel_ArvoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ArvoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(502, Short.MAX_VALUE))
            .addGroup(Painel_ArvoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel_ArvoreLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(Painel_ArvoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        Painel_Principal.add(Painel_Arvore, "arvore");

        Painel_Grafo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Grafo");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Vertice(Pessoa)"));

        nomeGrafo_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeGrafo_txt1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Nome");

        jLabel23.setText("Idade");

        jLabel24.setText("Genero");

        idadeGrafo_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeGrafo_txt1ActionPerformed(evt);
            }
        });

        GeneroGrafo_comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        botao_limpat3.setText("Limpar");
        botao_limpat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpat3ActionPerformed(evt);
            }
        });

        botao_AdicionarNaFila1.setText("Adicionar Vertice");
        botao_AdicionarNaFila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaFila1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeGrafo_txt1)
                            .addComponent(idadeGrafo_txt1)
                            .addComponent(GeneroGrafo_comboBox1, 0, 208, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_AdicionarNaFila1)
                        .addGap(26, 26, 26)
                        .addComponent(botao_limpat3)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeGrafo_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel24))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(idadeGrafo_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GeneroGrafo_comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpat3)
                    .addComponent(botao_AdicionarNaFila1))
                .addGap(23, 23, 23))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoas na Fila"));

        pessoa1_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        pessoa1_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoa1_comboBoxActionPerformed(evt);
            }
        });

        jLabel31.setText("Pessoa 1");

        pessoa2_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel32.setText("Pessoa 2");

        botao_AdicionarNaFila4.setText("Adicionar Aresta");
        botao_AdicionarNaFila4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaFila4ActionPerformed(evt);
            }
        });

        botao_AdicionarNaFila5.setText("Ver Vertices");
        botao_AdicionarNaFila5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaFila5ActionPerformed(evt);
            }
        });

        botao_AdicionarNaFila6.setText("Ver arestas");
        botao_AdicionarNaFila6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaFila6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(78, 78, 78)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pessoa2_comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pessoa1_comboBox, 0, 208, Short.MAX_VALUE))
                .addGap(69, 69, 69))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(botao_AdicionarNaFila4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao_AdicionarNaFila5)
                .addGap(18, 18, 18)
                .addComponent(botao_AdicionarNaFila6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel31))
                    .addComponent(pessoa1_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pessoa2_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_AdicionarNaFila4)
                    .addComponent(botao_AdicionarNaFila5)
                    .addComponent(botao_AdicionarNaFila6))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout Painel_GrafoLayout = new javax.swing.GroupLayout(Painel_Grafo);
        Painel_Grafo.setLayout(Painel_GrafoLayout);
        Painel_GrafoLayout.setHorizontalGroup(
            Painel_GrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_GrafoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(380, 380, 380))
            .addGroup(Painel_GrafoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_GrafoLayout.setVerticalGroup(
            Painel_GrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_GrafoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_GrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        Painel_Principal.add(Painel_Grafo, "grafo");

        Painel_ListaCircular.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setText("Lista Circular");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Item na Lista"));

        tituloMusica_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloMusica_txtActionPerformed(evt);
            }
        });

        jLabel16.setText("Titulo");

        jLabel17.setText("Cantor");

        jLabel18.setText("estilo");

        jLabel19.setText("Posição");

        cantor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantor_txtActionPerformed(evt);
            }
        });

        posicaoLista_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicio da lista", "meio da fista", "fim da lista" }));

        botao_limpat2.setText("Limpar");
        botao_limpat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpat2ActionPerformed(evt);
            }
        });

        botao_AdicionarNaLista.setText("Adicionar");
        botao_AdicionarNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_AdicionarNaListaActionPerformed(evt);
            }
        });

        estiloLista_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuduro", "Rap", "Semba", "Kizomba" }));

        jLabel20.setText("Indice");

        indiceLista_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceLista_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloMusica_txt)
                                    .addComponent(cantor_txt)
                                    .addComponent(posicaoLista_comboBox, 0, 208, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indiceLista_txt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_AdicionarNaLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_limpat2)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(estiloLista_comboBox, 0, 208, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloMusica_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel18))
                    .addComponent(cantor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(posicaoLista_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(indiceLista_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_limpat2)
                    .addComponent(botao_AdicionarNaLista))
                .addGap(23, 23, 23))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(estiloLista_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        jScrollPane3.setViewportView(lista_Circular_jLista);

        remover_da_Lista_Button.setText("Remover");
        remover_da_Lista_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover_da_Lista_ButtonActionPerformed(evt);
            }
        });

        removerDaLista_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inicio da lista", "meio da fista", "fim da lista" }));
        removerDaLista_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerDaLista_comboBoxActionPerformed(evt);
            }
        });

        indiceRemover_txt.setEditable(false);
        indiceRemover_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceRemover_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_ListaCircularLayout = new javax.swing.GroupLayout(Painel_ListaCircular);
        Painel_ListaCircular.setLayout(Painel_ListaCircularLayout);
        Painel_ListaCircularLayout.setHorizontalGroup(
            Painel_ListaCircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel5)
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_ListaCircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_ListaCircularLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Painel_ListaCircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removerDaLista_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remover_da_Lista_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indiceRemover_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))))
        );
        Painel_ListaCircularLayout.setVerticalGroup(
            Painel_ListaCircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_ListaCircularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(Painel_ListaCircularLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerDaLista_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indiceRemover_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(remover_da_Lista_Button)
                        .addGap(25, 25, 25))))
        );

        Painel_Principal.add(Painel_ListaCircular, "lista");

        jMenu5.setText("Estrutura de Dados");

        jMenuItem4.setText("Fila");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Pilha");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Lista Circular");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Avore Binaria");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Grafo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ajuda");

        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CardLayout cl = (CardLayout) Painel_Principal.getLayout();
        cl.show(Painel_Principal, "fila");

        //System.out.println("Ola");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CardLayout cl = (CardLayout) Painel_Principal.getLayout();
        cl.show(Painel_Principal, "pilha");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        CardLayout cl = (CardLayout) Painel_Principal.getLayout();
        cl.show(Painel_Principal, "lista");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        CardLayout cl = (CardLayout) Painel_Principal.getLayout();
        cl.show(Painel_Principal, "arvore");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CardLayout cl = (CardLayout) Painel_Principal.getLayout();
        cl.show(Painel_Principal, "grafo");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void nome_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_txtActionPerformed

    private void idade_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_txtActionPerformed

    private void senha_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_txtActionPerformed

    private void botao_limpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpatActionPerformed
        nome_txt.setText("");
        idade_txt.setText("");
        senha_txt.setText("");

    }//GEN-LAST:event_botao_limpatActionPerformed

    private void botao_AdicionarNaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaFilaActionPerformed

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome_txt.getText());
        pessoa.setIdade(Integer.parseInt(idade_txt.getText()));//convert o campo idade para int
        pessoa.setDeficiente(prioridade_comboBox.getSelectedItem().toString());
        pessoa.setOperacao(operacao_comboBox.getSelectedItem().toString());

        //Verificar se é deficienre ou tem prioridade
        if (prioridade_comboBox.getSelectedItem().toString().equals("Sim")) {
            pessoa.setSenha("P" + contador_prioridade++);
        } else {// se nao tem prioridade entao
            // Gerar Senha para a operacao
            switch (operacao_comboBox.getSelectedItem().toString()) {
                case "Levantamento":
                    pessoa.setSenha("A" + contador_levantamento++);
                    break;
                case "Deposito":
                    pessoa.setSenha("B" + contador_deposito++);
                    break;
                case "Abertura de Conta":
                    pessoa.setSenha("C" + contador_abrirConta++);
                    break;
                case "Atendimento Geral":
                    pessoa.setSenha("D" + contador_atendimentoGeral++);
                    break;
                default:
                    throw new AssertionError();
            }
        }
        senha_txt.setText(pessoa.getSenha());

        // System.out.println(" " + pessoa.toString());
        // adicionar na fila
        fila.enqueue(pessoa);

    }//GEN-LAST:event_botao_AdicionarNaFilaActionPerformed

    DefaultListModel modFila = new DefaultListModel();
    private void remover_primeiro_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_primeiro_ButtonActionPerformed

        if (fila.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Fila vazia");

        } else {
            fila_jList.setModel(modFila);
            modFila.addElement(fila.dequeue());
            //JOptionPane.showMessageDialog(rootPane, " " + fila.dequeue());
            //System.out.println("" + fila.dequeue());
        }
    }//GEN-LAST:event_remover_primeiro_ButtonActionPerformed

    private void titulo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo_txtActionPerformed

    private void escritor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escritor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escritor_txtActionPerformed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void botao_limpat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_limpat1ActionPerformed

    private void botao_AdicionarNaPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaPilhaActionPerformed
        Livro livro = new Livro();
        livro.setTitulo(titulo_txt.getText());
        livro.setEscritor(escritor_txt.getText());
        livro.setGenero(genero_comboBox1.getSelectedItem().toString());
        livro.setId(contador_livro++);

        System.out.println("" + livro.toString());

        pilha.push(livro);

        id_txt.setText("" + livro.getId());
    }//GEN-LAST:event_botao_AdicionarNaPilhaActionPerformed

    private void anoLancamento_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoLancamento_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoLancamento_txtActionPerformed

    DefaultListModel modPilha = new DefaultListModel();
    private void remover_da_Pilha_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_da_Pilha_ButtonActionPerformed
        if (pilha.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "A pilha está vazia");
        } else {
            pilha_jList.setModel(modPilha);
            modPilha.addElement(pilha.pop());
            //System.out.println();
        }
    }//GEN-LAST:event_remover_da_Pilha_ButtonActionPerformed

    private void tituloMusica_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloMusica_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloMusica_txtActionPerformed

    private void cantor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantor_txtActionPerformed

    private void botao_limpat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_limpat2ActionPerformed


    private void botao_AdicionarNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaListaActionPerformed
        Musica musica = new Musica();
        musica.setTitulo(tituloMusica_txt.getText());
        musica.setCantor(cantor_txt.getText());
        musica.setEstilo(estiloLista_comboBox.getSelectedItem().toString());

        lista_Circular_jLista.setModel(listaCircular);
        switch (posicaoLista_comboBox.getSelectedItem().toString()) {
            case "Inicio da lista":
                lista.inserirNoInicio(musica);
                break;
            case "meio da lista":
                lista.inserirNoMeio(musica, Integer.parseInt(indiceLista_txt.getText()));
                break;
            case "fim da lista":
                lista.inserirNoFinal(musica);
                break;
            default:
                throw new AssertionError();
        }
        listaCircular = lista.verElementosNoJList();

        //lista.verElementosNoJList();
    }//GEN-LAST:event_botao_AdicionarNaListaActionPerformed

    private void indiceLista_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceLista_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiceLista_txtActionPerformed

    private void remover_da_Lista_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover_da_Lista_ButtonActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "A lista está vazia");
        } else {
            lista_Circular_jLista.setModel(listaCircular);
            switch (removerDaLista_comboBox.getSelectedItem().toString()) {
                case "Inicio da lista":
                    lista.removerDoInicio();
                    break;
                case "meio da lista":
                    lista.removerDoMeio(Integer.parseInt(indiceRemover_txt.getText()));
                    break;
                case "fim da lista":
                    lista.removerDoFinal();
                    break;
                default:
                    throw new AssertionError();
            }
            listaCircular = lista.verElementosNoJList();
        }
    }//GEN-LAST:event_remover_da_Lista_ButtonActionPerformed

    private void indiceRemover_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceRemover_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indiceRemover_txtActionPerformed

    private void removerDaLista_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerDaLista_comboBoxActionPerformed

        if (removerDaLista_comboBox.getSelectedItem().toString().equals("meio da fista")) {
            indiceRemover_txt.setEditable(true);
        } else {
            indiceRemover_txt.setEditable(false);
        }
    }//GEN-LAST:event_removerDaLista_comboBoxActionPerformed

    private void elementoArvore_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoArvore_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elementoArvore_txtActionPerformed

    private void botao_buscarNaArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_buscarNaArvoreActionPerformed

        if (arvore.buscar(Integer.valueOf(elementoArvore_txt.getText()))) {
            JOptionPane.showMessageDialog(rootPane, "O valor " + elementoArvore_txt.getText() + " existe na arvore");
        } else {
            JOptionPane.showMessageDialog(rootPane, "O valor " + elementoArvore_txt.getText() + " não existe na arvore");
        }


    }//GEN-LAST:event_botao_buscarNaArvoreActionPerformed

    private void botao_AdicionarNaArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaArvoreActionPerformed

        arvore.inserir(Integer.valueOf(elementoArvore_txt.getText()));

    }//GEN-LAST:event_botao_AdicionarNaArvoreActionPerformed

    private void botao_verArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_verArvoreActionPerformed
        switch (verArvore_comboBox.getSelectedItem().toString()) {
            case "Pre Ordem":
                arvore.verPreOrdem();
                break;
            case "Em Ordem":
                arvore.verEmOrdem();
                break;
            case "Pos Ordem":
                arvore.verPosOrdem();
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_botao_verArvoreActionPerformed

    private void botao_RemoverNaArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_RemoverNaArvoreActionPerformed

        if (arvore.buscar(Integer.valueOf(elementoArvore_txt.getText()))) {
            arvore.remover(Integer.valueOf(elementoArvore_txt.getText()));
            JOptionPane.showMessageDialog(rootPane, "O valor " + elementoArvore_txt.getText() + " foi removido da arvore");

        } else {
            JOptionPane.showMessageDialog(rootPane, "O valor " + elementoArvore_txt.getText() + " não existe na arvore");
        }


    }//GEN-LAST:event_botao_RemoverNaArvoreActionPerformed

    private void nomeGrafo_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeGrafo_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeGrafo_txt1ActionPerformed

    private void idadeGrafo_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeGrafo_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeGrafo_txt1ActionPerformed

    private void botao_limpat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpat3ActionPerformed

        nomeGrafo_txt1.setText("");
        idadeGrafo_txt1.setText("");
    }//GEN-LAST:event_botao_limpat3ActionPerformed

    private void botao_AdicionarNaFila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaFila1ActionPerformed

        Pessoa pessoa = new Pessoa();
        pessoa.setId(contadorGrafo);
        contadorGrafo++;
        pessoa.setNome(nomeGrafo_txt1.getText());
        pessoa.setIdade(Integer.parseInt(idadeGrafo_txt1.getText()));
        pessoa.setGenero(GeneroGrafo_comboBox1.getSelectedItem().toString());

        grafo.adicionarVertice(pessoa);
        JOptionPane.showMessageDialog(rootPane, "Pessoa(Vertice) adicionado ao grafo");


    }//GEN-LAST:event_botao_AdicionarNaFila1ActionPerformed

    private void botao_AdicionarNaFila4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaFila4ActionPerformed

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        boolean confirmarPessoa1 = false;
        boolean confirmarPessoa2 = false;

        //Verificar se a pessoa1 (vertice) existe no grafo
        for (Pessoa a : grafo.obterTodosVertices()) {

            //Verificar a pessoa 1
            if (a.getId() == Integer.parseInt(pessoa1_comboBox.getSelectedItem().toString())) {
                pessoa1 = a;
                confirmarPessoa1 = true;
                /*
                System.out.println("\nPessoa 1");
                System.out.println("Vertice: " + a.toStringGrafo());
                System.out.println("Id: " + pessoa1.getId());
                System.out.println("Id Combobox: " + Integer.valueOf(pessoa1_comboBox.getSelectedItem().toString()));
                 */

            }
            //Verificar a pessoa 2
            if (a.getId() == Integer.parseInt(pessoa2_comboBox.getSelectedItem().toString())) {
                pessoa2 = a;
                confirmarPessoa2 = true;
                /*
                System.out.println("\nPessoa 2");
                System.out.println("Vertice: " + pessoa2.toStringGrafo());
                System.out.println("Id: " + a.getId());
                System.out.println("Id Combobox: " + Integer.valueOf(pessoa2_comboBox.getSelectedItem().toString()));
                 */

            }

            if (confirmarPessoa2 && confirmarPessoa1) {
                grafo.adicionarAresta(pessoa1, pessoa2);
                JOptionPane.showMessageDialog(rootPane, "Aresta adicionado com sucesso");
                break;
            }

        }

        //Verificar se a pessoa2 (vertice) existe no grafo
        // Adicionar novo aresta com as duas pessoas(vertice)
        //grafo.adicionarAresta(pessoa1, pessoa2);
        //System.out.println("Aresta adicionado com sucesso");

    }//GEN-LAST:event_botao_AdicionarNaFila4ActionPerformed

    private void botao_AdicionarNaFila5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaFila5ActionPerformed
        
        System.out.println("Lista de Vertices");
        System.out.println("\n");
        
        for (Pessoa a : grafo.obterTodosVertices()) {
            System.out.println(" " + a.toStringGrafo());
        }
    }//GEN-LAST:event_botao_AdicionarNaFila5ActionPerformed

    private void botao_AdicionarNaFila6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_AdicionarNaFila6ActionPerformed


    }//GEN-LAST:event_botao_AdicionarNaFila6ActionPerformed

    private void pessoa1_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoa1_comboBoxActionPerformed


    }//GEN-LAST:event_pessoa1_comboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GeneroGrafo_comboBox1;
    private javax.swing.JComboBox<String> GeneroGrafo_comboBox2;
    private javax.swing.JComboBox<String> GeneroGrafo_comboBox3;
    private javax.swing.JPanel Painel_Arvore;
    private javax.swing.JPanel Painel_Fila;
    private javax.swing.JPanel Painel_Grafo;
    private javax.swing.JPanel Painel_ListaCircular;
    private javax.swing.JPanel Painel_Pilha;
    private javax.swing.JPanel Painel_Principal;
    private javax.swing.JTextField anoLancamento_txt;
    private javax.swing.JList<String> arvore_jList;
    private javax.swing.JButton botao_AdicionarNaArvore;
    private javax.swing.JButton botao_AdicionarNaFila;
    private javax.swing.JButton botao_AdicionarNaFila1;
    private javax.swing.JButton botao_AdicionarNaFila2;
    private javax.swing.JButton botao_AdicionarNaFila3;
    private javax.swing.JButton botao_AdicionarNaFila4;
    private javax.swing.JButton botao_AdicionarNaFila5;
    private javax.swing.JButton botao_AdicionarNaFila6;
    private javax.swing.JButton botao_AdicionarNaLista;
    private javax.swing.JButton botao_AdicionarNaPilha;
    private javax.swing.JButton botao_RemoverNaArvore;
    private javax.swing.JButton botao_buscarNaArvore;
    private javax.swing.JButton botao_limpat;
    private javax.swing.JButton botao_limpat1;
    private javax.swing.JButton botao_limpat2;
    private javax.swing.JButton botao_limpat3;
    private javax.swing.JButton botao_limpat4;
    private javax.swing.JButton botao_limpat5;
    private javax.swing.JButton botao_verArvore;
    private javax.swing.JTextField cantor_txt;
    private javax.swing.JTextField elementoArvore_txt;
    private javax.swing.JTextField escritor_txt;
    private javax.swing.JComboBox<String> estiloLista_comboBox;
    private javax.swing.JList<String> fila_jList;
    private javax.swing.JComboBox<String> genero_comboBox1;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField idadeGrafo_txt1;
    private javax.swing.JTextField idadeGrafo_txt2;
    private javax.swing.JTextField idadeGrafo_txt3;
    private javax.swing.JTextField idade_txt;
    private javax.swing.JTextField indiceLista_txt;
    private javax.swing.JTextField indiceRemover_txt;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista_Circular_jLista;
    private javax.swing.JTextField nomeGrafo_txt1;
    private javax.swing.JTextField nomeGrafo_txt2;
    private javax.swing.JTextField nomeGrafo_txt3;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JComboBox<String> operacao_comboBox;
    private javax.swing.JComboBox<String> pessoa1_comboBox;
    private javax.swing.JComboBox<String> pessoa2_comboBox;
    private javax.swing.JList<String> pilha_jList;
    private javax.swing.JComboBox<String> posicaoLista_comboBox;
    private javax.swing.JComboBox<String> prioridade_comboBox;
    private javax.swing.JComboBox<String> removerDaLista_comboBox;
    private javax.swing.JButton remover_da_Lista_Button;
    private javax.swing.JButton remover_da_Pilha_Button;
    private javax.swing.JButton remover_primeiro_Button;
    private javax.swing.JTextField senha_txt;
    private javax.swing.JTextField tituloMusica_txt;
    private javax.swing.JTextField titulo_txt;
    private javax.swing.JComboBox<String> verArvore_comboBox;
    // End of variables declaration//GEN-END:variables
}
