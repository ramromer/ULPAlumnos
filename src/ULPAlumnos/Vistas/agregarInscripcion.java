/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ULPAlumnos.Vistas;

import java.sql.ResultSet;
import java.util.HashMap;
import ULPAlumnos.Modelos.LogicaDB;
import javax.swing.DefaultListModel;

/**
 *
 * @author ramrromer
 */
public class agregarInscripcion extends javax.swing.JFrame {
    private DefaultListModel<String> model = new DefaultListModel<String>();
    private ResultSet resultado,resultadoMaterias;
    private HashMap<String, Integer> listaIdMaterias = new HashMap<String, Integer>();
    private HashMap<String, Integer> listaIdAlumnos = new HashMap<String, Integer>();
    /**
     * Creates new form agregarInscripcion
     */
    public agregarInscripcion() {
        initComponents();
        cargarAlumnos(true, "");
        cargarMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLAlumno = new javax.swing.JList<>();
        jBtnBorrar = new javax.swing.JButton();
        jBtnCargar = new javax.swing.JButton();
        jTFBusqueda = new javax.swing.JTextField();
        jTNota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriaActionPerformed(evt);
            }
        });

        jLAlumno.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLAlumno);

        jBtnBorrar.setText("Borrar");

        jBtnCargar.setText("Cargar");
        jBtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarActionPerformed(evt);
            }
        });

        jTFBusqueda.setText("Ingrese nombre o apellido...");
        jTFBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFBusquedaMouseClicked(evt);
            }
        });
        jTFBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBusquedaActionPerformed(evt);
            }
        });

        jTNota.setText("6");
        jTNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNotaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nota:");

        jLabel2.setText("Cargar Inscripcion");

        jLabel3.setText("Materia");

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNota, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnBorrar)
                                        .addGap(9, 9, 9)
                                        .addComponent(jBtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jBtnBuscar)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnBorrar)
                            .addComponent(jBtnCargar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNotaActionPerformed

    private void jTFBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFBusquedaActionPerformed

    private void jBtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarActionPerformed
        String valueAlumno = jLAlumno.getSelectedValue();
        String valueMateria =String.valueOf(jCBMateria.getSelectedItem());
        int idMateria = listaIdMaterias.get(valueMateria);
        int idAlumno = listaIdAlumnos.get(valueAlumno);
        String nota = jTNota.getText();
        ejecutarConsulta(nota,String.valueOf(idAlumno),String.valueOf(idMateria));
        
        
        
    }//GEN-LAST:event_jBtnCargarActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        String busqueda = jTFBusqueda.getText();
        if(!busqueda.isEmpty()){
            cargarAlumnos(false,busqueda);
        }else{
            cargarAlumnos(true,"");
        }
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jTFBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBusquedaMouseClicked
        jTFBusqueda.setText("");
    }//GEN-LAST:event_jTFBusquedaMouseClicked

    private void jCBMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriaActionPerformed
//        System.out.println(jCBMateria.getSelectedIndex());
    }//GEN-LAST:event_jCBMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(agregarInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarInscripcion().setVisible(true);
            }
        });
    }
    
    private void ejecutarConsulta(String nota, String idAlumno, String idMateria){
       String query = "INSERT INTO inscripcion VALUES (null,"+nota+", "+idAlumno+", "+idMateria+")";
       int resultado= -99;
       try{
            resultado = LogicaDB.ejecutarUpdate(query);
       }catch(Exception e){
           System.out.println("Error: "+e.getMessage());
       }
       System.out.println(resultado);
    }
    
    private void cargarAlumnos(boolean firstRun, String busqueda){
        borrarItems();
        String alumno = "";
        String query = "";
        if(firstRun){
            query = "SELECT * FROM alumno";
            resultado=LogicaDB.ejecutarConsulta(query);
            try{
                while(resultado.next()){
                    alumno = "";
                    alumno += resultado.getString("apellido") + ", ";
                    alumno += resultado.getString("nombre")+", DNI: ";
                    alumno += resultado.getInt("dni");
                    listaIdAlumnos.put(alumno, resultado.getInt("idAlumno"));
                    model.addElement(alumno);
                }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
            jLAlumno.setModel(model);
        }else{
            query = "SELECT * FROM alumno WHERE apellido LIKE '%"+busqueda+"%' OR nombre LIKE '%"+busqueda+"%' GROUP BY apellido";
            resultado=LogicaDB.ejecutarConsulta(query);
            try{
                while(resultado.next()){
                        alumno = "";
                        alumno += resultado.getString("apellido") + ", ";
                        alumno += resultado.getString("nombre")+", DNI: ";
                        alumno += resultado.getInt("dni");
                        model.addElement(alumno);

                }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
            jLAlumno.setModel(model);
        }       
       
       
       
        jLAlumno.setModel(model);
    }
    
    private void cargarMaterias(){
        String query = "SELECT * FROM materia ORDER BY nombre";
            resultado=LogicaDB.ejecutarConsulta(query);
            try{
                while(resultado.next()){
                    listaIdMaterias.put(resultado.getString("nombre"), resultado.getInt("idMateria"));
//                    System.out.println("ID: "+resultado.getInt("idMateria")+" Nombre: "+resultado.getString("nombre"));
                    jCBMateria.addItem(resultado.getString("nombre"));
                }
            }catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
    }
    
    private void borrarItems(){
        model.removeAllElements();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCargar;
    private javax.swing.JComboBox<String> jCBMateria;
    private javax.swing.JList<String> jLAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBusqueda;
    private javax.swing.JTextField jTNota;
    // End of variables declaration//GEN-END:variables
}
