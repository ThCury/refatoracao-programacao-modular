/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author pedro
 */
public class ListarMesasView extends javax.swing.JFrame {

    /**
     * Creates new form ListarMesasView
     */
    public ListarMesasView() {
        initComponents();
    }

    public JTable getTbMesas() {
        return tbMesas;
    }

    public void setTbMesas(JTable tbMesas) {
        this.tbMesas = tbMesas;
    }

    public JButton getAddMesaViewBtn() {
        return AddMesaViewBtn;
    }

    public JButton getAtualizaTableBtn() {
        return AtualizaTableBtn;
    }

    public JButton getExcluirMesaBtn() {
        return ExcluirMesaBtn;
    }

    public JButton getDesocuparBtn() {
        return DesocuparBtn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMesas = new javax.swing.JTable();
        AddMesaViewBtn = new javax.swing.JButton();
        AtualizaTableBtn = new javax.swing.JButton();
        ExcluirMesaBtn = new javax.swing.JButton();
        DesocuparBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMesas);

        AddMesaViewBtn.setText("Adicionar");

        AtualizaTableBtn.setText("Atualizar");

        ExcluirMesaBtn.setText("Excluir");

        DesocuparBtn.setText("Desocupar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddMesaViewBtn)
                .addGap(18, 18, 18)
                .addComponent(AtualizaTableBtn)
                .addGap(18, 18, 18)
                .addComponent(ExcluirMesaBtn)
                .addGap(18, 18, 18)
                .addComponent(DesocuparBtn)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMesaViewBtn)
                    .addComponent(AtualizaTableBtn)
                    .addComponent(ExcluirMesaBtn)
                    .addComponent(DesocuparBtn))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMesaViewBtn;
    private javax.swing.JButton AtualizaTableBtn;
    private javax.swing.JButton DesocuparBtn;
    private javax.swing.JButton ExcluirMesaBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMesas;
    // End of variables declaration//GEN-END:variables
}
