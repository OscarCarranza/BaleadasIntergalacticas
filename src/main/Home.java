/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Oscar
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        System.out.println("HELLO");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        AddIngre = new javax.swing.JLabel();
        EditIngre = new javax.swing.JLabel();
        RemoveIngre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Order = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        deleteOrder = new javax.swing.JLabel();
        newOrder = new javax.swing.JLabel();
        editOrder = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddDish = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EditDish = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DeleteDish = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        AddOrder = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        EditOrder = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        DeleteOrder = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        NewIngredient = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cellar = new javax.swing.JLabel();
        order = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        food = new javax.swing.JLabel();
        meramera = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        jPanel2.setLayout(null);

        AddIngre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/NewDish.png"))); // NOI18N
        AddIngre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddIngreMouseClicked(evt);
            }
        });
        jPanel2.add(AddIngre);
        AddIngre.setBounds(30, 40, 174, 40);

        EditIngre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/EditDish.png"))); // NOI18N
        EditIngre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditIngreMouseClicked(evt);
            }
        });
        jPanel2.add(EditIngre);
        EditIngre.setBounds(30, 100, 174, 40);

        RemoveIngre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/DeleteDish.png"))); // NOI18N
        RemoveIngre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveIngreMouseClicked(evt);
            }
        });
        jPanel2.add(RemoveIngre);
        RemoveIngre.setBounds(30, 160, 174, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/iconDish.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, -10, 280, 260);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 490, 250);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setLayout(null);

        deleteOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/DeleteOrder.png"))); // NOI18N
        deleteOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOrderMouseClicked(evt);
            }
        });
        jPanel4.add(deleteOrder);
        deleteOrder.setBounds(320, 170, 190, 40);

        newOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/NewOrder.png"))); // NOI18N
        newOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newOrderMouseClicked(evt);
            }
        });
        jPanel4.add(newOrder);
        newOrder.setBounds(320, 50, 191, 40);

        editOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/EditOrder.png"))); // NOI18N
        editOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editOrderMouseClicked(evt);
            }
        });
        jPanel4.add(editOrder);
        editOrder.setBounds(320, 110, 190, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/iconOrder.png"))); // NOI18N
        jPanel4.add(jLabel11);
        jLabel11.setBounds(-40, 0, 370, 260);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jPanel4.add(jLabel6);
        jLabel6.setBounds(0, 0, 550, 260);

        javax.swing.GroupLayout OrderLayout = new javax.swing.GroupLayout(Order.getContentPane());
        Order.getContentPane().setLayout(OrderLayout);
        OrderLayout.setHorizontalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        OrderLayout.setVerticalGroup(
            OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top1.png"))); // NOI18N
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 10, 580, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout AddDishLayout = new javax.swing.GroupLayout(AddDish.getContentPane());
        AddDish.getContentPane().setLayout(AddDishLayout);
        AddDishLayout.setHorizontalGroup(
            AddDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AddDishLayout.setVerticalGroup(
            AddDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top3.png"))); // NOI18N
        jPanel6.add(jLabel15);
        jLabel15.setBounds(20, 10, 580, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout EditDishLayout = new javax.swing.GroupLayout(EditDish.getContentPane());
        EditDish.getContentPane().setLayout(EditDishLayout);
        EditDishLayout.setHorizontalGroup(
            EditDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        EditDishLayout.setVerticalGroup(
            EditDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top2.png"))); // NOI18N
        jPanel7.add(jLabel17);
        jLabel17.setBounds(20, 10, 580, 80);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel18.setToolTipText("");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout DeleteDishLayout = new javax.swing.GroupLayout(DeleteDish.getContentPane());
        DeleteDish.getContentPane().setLayout(DeleteDishLayout);
        DeleteDishLayout.setHorizontalGroup(
            DeleteDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DeleteDishLayout.setVerticalGroup(
            DeleteDishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel8.setLayout(null);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top4.png"))); // NOI18N
        jPanel8.add(jLabel19);
        jLabel19.setBounds(0, 10, 520, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel20.setToolTipText("");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout AddOrderLayout = new javax.swing.GroupLayout(AddOrder.getContentPane());
        AddOrder.getContentPane().setLayout(AddOrderLayout);
        AddOrderLayout.setHorizontalGroup(
            AddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AddOrderLayout.setVerticalGroup(
            AddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel9.setLayout(null);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top6.png"))); // NOI18N
        jPanel9.add(jLabel21);
        jLabel21.setBounds(0, 10, 510, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel22.setToolTipText("");
        jPanel9.add(jLabel22);
        jLabel22.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout EditOrderLayout = new javax.swing.GroupLayout(EditOrder.getContentPane());
        EditOrder.getContentPane().setLayout(EditOrderLayout);
        EditOrderLayout.setHorizontalGroup(
            EditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        EditOrderLayout.setVerticalGroup(
            EditOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel10.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top5.png"))); // NOI18N
        jPanel10.add(jLabel23);
        jLabel23.setBounds(0, 10, 530, 80);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel24.setToolTipText("");
        jPanel10.add(jLabel24);
        jLabel24.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout DeleteOrderLayout = new javax.swing.GroupLayout(DeleteOrder.getContentPane());
        DeleteOrder.getContentPane().setLayout(DeleteOrderLayout);
        DeleteOrderLayout.setHorizontalGroup(
            DeleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DeleteOrderLayout.setVerticalGroup(
            DeleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setLayout(null);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Top7.png"))); // NOI18N
        jLabel25.setLabelFor(AddIngre);
        jPanel11.add(jLabel25);
        jLabel25.setBounds(20, 20, 580, 80);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jLabel26.setToolTipText("");
        jPanel11.add(jLabel26);
        jLabel26.setBounds(0, 0, 530, 300);

        javax.swing.GroupLayout NewIngredientLayout = new javax.swing.GroupLayout(NewIngredient.getContentPane());
        NewIngredient.getContentPane().setLayout(NewIngredientLayout);
        NewIngredientLayout.setHorizontalGroup(
            NewIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        NewIngredientLayout.setVerticalGroup(
            NewIngredientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 240, 170);

        cellar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/cellar.png"))); // NOI18N
        cellar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellarMouseClicked(evt);
            }
        });
        jPanel1.add(cellar);
        cellar.setBounds(40, 230, 250, 50);

        order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/order.png"))); // NOI18N
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        jPanel1.add(order);
        order.setBounds(40, 350, 250, 50);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/menu.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel1.add(menu);
        menu.setBounds(40, 290, 250, 50);

        food.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/food.png"))); // NOI18N
        jPanel1.add(food);
        food.setBounds(310, 90, 450, 320);

        meramera.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        meramera.setForeground(new java.awt.Color(255, 255, 255));
        meramera.setText("La Mera Mera ");
        jPanel1.add(meramera);
        meramera.setBounds(320, 40, 260, 42);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/links.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 40, 173, 52);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/black1926.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cellarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellarMouseClicked
        NewIngredient.pack();
        NewIngredient.setModal(true);
        NewIngredient.setLocationRelativeTo(null);
        NewIngredient.setVisible(true);
    }//GEN-LAST:event_cellarMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        Order.pack();
        Order.setModal(true);
        Order.setLocationRelativeTo(null);
        Order.setVisible(true);
    }//GEN-LAST:event_orderMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        Menu.pack();
        Menu.setModal(true);
        Menu.setLocationRelativeTo(null);
        Menu.setVisible(true);
    }//GEN-LAST:event_menuMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMouseClicked

    private void AddIngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddIngreMouseClicked
        AddDish.pack();
        AddDish.setModal(true);
        AddDish.setLocationRelativeTo(null);
        AddDish.setVisible(true);
    }//GEN-LAST:event_AddIngreMouseClicked

    private void EditIngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditIngreMouseClicked
        EditDish.pack();
        EditDish.setModal(true);
        EditDish.setLocationRelativeTo(null);
        EditDish.setVisible(true);
    }//GEN-LAST:event_EditIngreMouseClicked

    private void RemoveIngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveIngreMouseClicked
        DeleteDish.pack();
        DeleteDish.setModal(true);
        DeleteDish.setLocationRelativeTo(null);
        DeleteDish.setVisible(true);
    }//GEN-LAST:event_RemoveIngreMouseClicked

    private void newOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newOrderMouseClicked
        AddOrder.pack();
        AddOrder.setModal(true);
        AddOrder.setLocationRelativeTo(null);
        AddOrder.setVisible(true);
    }//GEN-LAST:event_newOrderMouseClicked

    private void editOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editOrderMouseClicked
        EditOrder.pack();
        EditOrder.setModal(true);
        EditOrder.setLocationRelativeTo(null);
        EditOrder.setVisible(true);
    }//GEN-LAST:event_editOrderMouseClicked

    private void deleteOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOrderMouseClicked
        DeleteOrder.pack();
        DeleteOrder.setModal(true);
        DeleteOrder.setLocationRelativeTo(null);
        DeleteOrder.setVisible(true);
    }//GEN-LAST:event_deleteOrderMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddDish;
    private javax.swing.JLabel AddIngre;
    private javax.swing.JDialog AddOrder;
    private javax.swing.JDialog DeleteDish;
    private javax.swing.JDialog DeleteOrder;
    private javax.swing.JDialog EditDish;
    private javax.swing.JLabel EditIngre;
    private javax.swing.JDialog EditOrder;
    private javax.swing.JDialog Menu;
    private javax.swing.JDialog NewIngredient;
    private javax.swing.JDialog Order;
    private javax.swing.JLabel RemoveIngre;
    private javax.swing.JLabel cellar;
    private javax.swing.JLabel deleteOrder;
    private javax.swing.JLabel editOrder;
    private javax.swing.JLabel food;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel meramera;
    private javax.swing.JLabel newOrder;
    private javax.swing.JLabel order;
    // End of variables declaration//GEN-END:variables
}
