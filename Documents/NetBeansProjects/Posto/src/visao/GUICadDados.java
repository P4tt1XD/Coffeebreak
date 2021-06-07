/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PostoVO;
import servicos.PostoServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Pati
 */
public class GUICadDados extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Idpaciente", "Cartão", "Nome", "Cor", "Nacionalidade",
            "Sexo", "Rg", "Estado Civil","Endereço", "Numero", "Cep", "Cidade",
            "Estado", "Telefone"});

    /**
     * Creates new form GUICadDados
     */
    public GUICadDados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpTabela = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDados = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jlPesquisa = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jComboFiltro = new javax.swing.JComboBox<>();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfCor = new javax.swing.JTextField();
        jtfNacionalidade = new javax.swing.JTextField();
        jtfRg = new javax.swing.JTextField();
        jtfSexo = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfNum = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);

        javax.swing.GroupLayout jlpTabelaLayout = new javax.swing.GroupLayout(jlpTabela);
        jlpTabela.setLayout(jlpTabelaLayout);
        jlpTabelaLayout.setHorizontalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jlpTabelaLayout.setVerticalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jtDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cartao", "Nome", "Cor", "Nacionalidade", "Rg", "Sexo", "Endereço", "Numero", "Cidade", "Estado", "Telefone"
            }
        ));
        jtDados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtDados);

        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");

        jlPesquisa.setText("Pesquisar");

        jComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartao", "Nome", "Rg", "Cidade", "Endereco", "Telefone", "Nacionalidade" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jlPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboFiltro, 0, 128, Short.MAX_VALUE)
                                .addGap(206, 206, 206))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jlpTabela)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisa)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNacionalidade)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfCor)
                    .addComponent(jtfRg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jlpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jtfEndereco)
                            .addComponent(jtfSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNum)
                            .addComponent(jtfCidade)
                            .addComponent(jtfEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            PostoServicos ps = ServicosFactory.getPostoServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<PostoVO> pac = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            pac = ps.buscarPaciente();

            for (int i = 0; i < pac.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(pac.get(i).getIdpaciente()),
                    String.valueOf(pac.get(i).getNome()),
                    String.valueOf(pac.get(i).getCartao()),
                    String.valueOf(pac.get(i).getCor()),
                    String.valueOf(pac.get(i).getEstCivil()),
                    String.valueOf(pac.get(i).getNacionalidade()),
                    String.valueOf(pac.get(i).getSexo()),
                    String.valueOf(pac.get(i).getRg()),
                    String.valueOf(pac.get(i).getEndereco()),
                    String.valueOf(pac.get(i).getNum()),
                    String.valueOf(pac.get(i).getCidade()),
                    String.valueOf(pac.get(i).getEstado()),
                    String.valueOf(pac.get(i).getTel())
                  });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtDados.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela

    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
           linhas para zero no default table model */        
        dtm.setNumRows(0);
    }//fecha limparTabela
    
    private void deletar(){
        try {
            int linha = jtDados.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(this,
                        "Selecione uma linha para deletar!");
                
            }else{
                String id = jtDados.getValueAt(linha, 0).toString();
                PostoServicos ps = ServicosFactory.getPostoServicos();
                ps.deletarPaciente(Long.parseLong(id));
                JOptionPane.showMessageDialog(this,
                        "Paciente deletado com sucesso! ");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro" +e.getMessage());
        }//fecha catch
    }//fecha deletar

    private void filtrar(){
        try {
            if(jtfPesquisa.getText().isEmpty()){
                preencherTabela();
            }else{
                String pesq = jtfPesquisa.getText();
                String filtro = jComboFiltro.getSelectedItem().toString();
                String query = "";  
                if(filtro.equalsIgnoreCase("Nome")){
                    query="where nome like '"+pesq+"'";
                }else if(filtro.equalsIgnoreCase("Cartao")){
                    query="where cartao like '"+pesq+"'";
                }else if(filtro.equalsIgnoreCase("Cidade")){
                    query="where cidade like '"+pesq+"'";
                }else if(filtro.equalsIgnoreCase("Rg")){
                    query="where rg like '"+pesq+"'";
                } else if (filtro.equalsIgnoreCase("Endereco")) {
                    query = "where endereco '" + pesq+"'";
                } else if (filtro.equalsIgnoreCase("Nacionalidade")) {
                    query = "where nacionalidade '" + pesq+"'";
               
                }//fecha else if 
                PostoServicos ps = ServicosFactory.getPostoServicos();
                ArrayList<PostoVO> pac = ps.filtrar(query);
                
             
                for (int i = 0; i < pac.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(pac.get(i).getIdpaciente()),
                    String.valueOf(pac.get(i).getNome()),
                    String.valueOf(pac.get(i).getCartao()),
                    String.valueOf(pac.get(i).getCor()),
                    String.valueOf(pac.get(i).getEstCivil()),
                    String.valueOf(pac.get(i).getNacionalidade()),
                    String.valueOf(pac.get(i).getSexo()),
                    String.valueOf(pac.get(i).getRg()),
                    String.valueOf(pac.get(i).getEndereco()),
                    String.valueOf(pac.get(i).getNum()),
                    String.valueOf(pac.get(i).getCidade()),
                    String.valueOf(pac.get(i).getEstado()),
                    String.valueOf(pac.get(i).getTel())
                  });
            }//fecha for
                jtDados.setModel(dtm);
            }//fecha else
            
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro" +e.getMessage());
        }
    }//fecha filtrar
    
    private void alterarPaciente() {
        try {
            int linha = jtDados.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Selecione uma linha!");
            } else {
                String id = jtDados.getValueAt(linha, 0).toString();
                String cartao = jtDados.getValueAt(linha, 1).toString();
                String nome = jtDados.getValueAt(linha, 2).toString();
                String nacionalidade = jtDados.getValueAt(linha, 4).toString();
                String rg = jtDados.getValueAt(linha, 5).toString();
                String endereco = jtDados.getValueAt(linha, 7).toString();
                String cidade = jtDados.getValueAt(linha, 9).toString();
                String telefone = jtDados.getValueAt(linha, 11).toString();
                
                jtfCodigo.setText(id);
                jtfNome.setText(nome);
                jtfNacionalidade.setText(nacionalidade);
                jtfRg.setText(rg);
                jtfEndereco.setText(endereco);
                jtfCidade.setText(cidade);
                jtfTelefone.setText(telefone);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "erro! " + e.getMessage());
        }
    }
private void confirmarAlteracao() {
        try {
            PostoVO pVO = new PostoVO();
            pVO.setIdpaciente(Integer.parseInt(jtfCodigo.getText()));
            pVO.setNome(jtfNome.getText());
            pVO.setNacionalidade(jtfNacionalidade.getText());
            pVO.setRg(Long.parseLong(jtfRg.getText()));
            pVO.setEndereco(jtfEndereco.getText());
            pVO.setCidade(jtfCidade.getText());
            pVO.setTel(Integer.parseInt(jtfTelefone.getText()));
            
            PostoServicos ps = servicos.ServicosFactory.getPostoServicos();
            ps.alterarPaciente(pVO);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Produto alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "erro! " + e.getMessage());
        }
    }
    
    private void limparCampos(){
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfNacionalidade.setText("");
        jtfRg.setText("");
        jtfEndereco.setText("");
        jtfCidade.setText("");
        jtfTelefone.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLayeredPane jlpTabela;
    private javax.swing.JTable jtDados;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNacionalidade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNum;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfRg;
    private javax.swing.JTextField jtfSexo;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
