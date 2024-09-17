
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author E5 575
 */
public class RaffleDraw extends javax.swing.JFrame {
    
    private String[] serialNumbers = {
        "1.HUMAN RESOURCES", "2.HOUSEKEEPING", "3.ADMINISTRATION", "4.FINANCE", "5.INTERNAL AUDIT", "6.ADMINISTRATION", "7.ADMINISTRATION", "8.HUMAN RESOURCES", "9.VELLA LEISURE", "10.MARKETING", "11.HUMAN RESOURCES", "12.VELLA", "13.HUMAN RESOURCES", "14.ADMINISTRATION", "15.FRONT OFFICE", "16.FRONT OFFICE", "17.FRONT OFFICE", "18.FRONT OFFICE", "19.FRONT OFFICE", "20.FRONT OFFICE", 
        "21.F&B", "22.F&B", "23.F&B", "24.F&B", "25.KITCHEN", "26.KITCHEN", "27.KITCHEN", "28.KITCHEN", "29.SPA", "30.ADMINISTRATION", "31.FINANCE", "32.FINANCE", "33.FINANCE", "34.FINANCE", "35.FINANCE", "36.HK", "37.HK", "38.HK", "39.HK", "40.HUMAN RESOURCES", "41.MAINTENANCE", "42.MAINTENANCE", "43.MAINTENANCE", "44.MAINTENANCE", "45.INTERNAL AUDIT", "46.INTERNAL AUDIT", 
        "47.INTERNAL AUDIT", "48.INTERNAL AUDIT", "49.MARKETING", "50.MARKETING", "51.MARKETING", "52.MARKETING", "53.MARKETING", "54.MARKETING", "55.MARKETING", "56.MARKETING", "57.ADMINISTRATION", "58.ADMINISTRATION", "59.FINANCE", "60.FINANCE", "61.FINANCE", "62.FINANCE", "63.ADMINISTRATION", "64.ADMINISTRATION", "65.ADMINISTRATION", "66.ADMINISTRATION", "67.HUMAN RESOURCES", 
        "68.ADMINISTRATION", "69.ADMINISTRATION", "70.ADMINISTRATION", "71.ADMINISTRATION", "72.ADMINISTRATION", "73.ADMINISTRATION", "74.SWING - AMBE", "75.ADMINISTRATION", "76.ADMINISTRATION", "77.ADMINISTRATION", "78.SALES", "79.FLYING RAVANA", "80.SWING ELLA", "81.FLYING RAVANA", "82.ADMINISTRATION", "83.ADMINISTRATION", "84.F&B", "85.F&B", "86.F&B", "87.FRONT OFFICE", "88.FRONT OFFICE", 
        "89.KITCHEN", "90.KITCHEN", "91.KITCHEN", "92.KITCHEN", "93.HUMAN RESOURCES", "94.FINANCE", "95.DJ", "96.ADMINISTRATION", "97.SKY CAFÉ", "98.SKY CAFÉ", "99.SKY CAFÉ", "100.SKY CAFÉ", "101.SKY CAFÉ", "102.SKY CAFÉ", "103.TEA FACTORY", "104.TEA FACTORY", "105.TEA FACTORY", "106.TEA FACTORY", "107.TEA FACTORY", "108.EXTENSION", "109.FINANCE", "110.HALPEWATTE", "111.TEA FACTORY", "112.GREENLAND", 
        "113.ADMINISTRATION", "114.TRANSPORT DIVISION", "115.TRANSPORT DIVISION", "116.TRANSPORT DIVISION", "117.TRANSPORT DIVISION", "118.TRANSPORT DIVISION", "119.TRANSPORT DIVISION", "120.TRANSPORT DIVISION", "121.TRANSPORT DIVISION", "122.VILLA LE MAAS TOTA", "123.WALAKULU", "124.WALAKULU", "125.ADMINISTRATION", "126.SALES", "127.ADMINISTRATION"

    };

    private String[] fullNames = {
        "SM KODITHUWAKKU",
"S R C RATHNASIRI",
"I C RAJASINGHE",
"H W C M WEERAKOON",
"D L R N GUNERATHNE",
"K K A C SHIVANKARA",
"BUDDHIKA LAHIRU",
"W P H ERANDA",
"P A D D CHAAMINDA",
"S A D C DINUKA",
"M D T PATHIRANA",
"NADEESHA THARANGANI",
"D N A D H MADHUSHAN",
"THUWAN",
"S R AMARASINGHE",
"R M A INDIKA",
"R M I RAJAPAKSHA",
"D M U BANDARA",
"D.S.R.R.T. GUNAWARDENA",
"W.M.J.A.B. WIJEKOON",
"C S KODIKARA",
"D R N RATHNASIRI",
"J K S ABERATHNE",
"R M C RATHNAYAKA",
"N G L P LAKSIRI",
"V L FERDINANDS",
"M K M SHIRAS",
"I RAMESH",
"W P G U KUMARA",
"D SAMARAWEERA",
"R M S MADUSANKA",
"T THILAKSHAPRIYAN",
"G C P BODHIWANSHA",
"PRABATH WEERAKOON",
"D N H M DHARMASIRI",
"W A W PREMATHILAKE",
"R M DHARMARATHNE",
"A P S HESHAL",
"A. KARUPPIA",
"M R A P S B MADDEGODA",
"ASHANTHA SURIYAARACHCHI",
"K. SATHYAWEL",
"S.W. DEVAN",
"R.D.J. KUMARASINGHE",
"P I MUDUNPITIYA",
"R M L L DHANANJAYA",
"E D E V EDIRISINGHE",
"K W DILHARA",
"W P S K PRIYANKARA",
"K DISSANAYAKA",
"J B D FERNANDO",
"L N T WEERASINGHE",
"C K WELHENA",
"SHAHANA PERERA",
"H M S S BANDARA",
"S H H BANUKA",
"C D RANATHUNGA",
"E A P S DISSANAYAKA",
"G D D P KUMARA",
"E A N S V NANDASENA",
"A K SANDUNIKA",
"A D G LAHIRU",
"H M S NISANSALA",
"A M K T ATHTHANAYAKE",
"G M P NUWANTHI",
"D C SENARATHNA",
"M M A D B MADUSHANI",
"S D KODAGODA",
"L A J BIMSARA",
"V A L N PIYARATNA",
"R P S SAMARASINGHE",
"K A N DANUSHKA",
"S M C A JAYARATHNE",
"H M S K HERATH",
"S K N S SOORIYAARACHCHI",
"S M T D SENANAYAKA",
"G K S C PRIYANKARA",
"M A S M ABEYRATHNA",
"R M D RATHNAYAKA",
"H G A LAKSHAN",
"ANANDA SAMARAKOON",
"K A D L A SILVA",
"K A P SENARATHNA",
"G H P GAMAGE",
"R M U RATHNAYAKA",
"M G S K PREMACHANDRA",
"R M G K ABEYKOON",
"MARILYN DUMLAO",
"R A D P P RANATHUNGA",
"J G S JINATHISSA",
"H G G N B WICKRAMASINGHE",
"P G D RAJAPAKSHA",
"M G H D KUMARI",
"D G A D MADUSHANKA",
"J W J L JAYARATHNA",
"K W R M FERNANDO",
"S SIVANATHAN",
"R CHANDRARAJA",
"T M D I SALLAY",
"D L G H N ARIYAWANSHA",
"D M L P L DISSANAYAKA",
"ARUNDA MADHUSHAN",
"W.M.GAMINI WIJESOORIYA",
"A RAGAVAN",
"H.M.THILAKARATHNA BANDA",
"R.D.I.L.KUMARA",
"D.THARANGA THUSHARA",
"AMITHA MAAPA",
"S P SATHIYANADAN",
"G.M.GUNARATNE",
"S.P. WIJESUNDARA",
"ARUNA PRIYADARSHANA",
"T VINODAN",
"G K W ABEYRATHNA",
"G K P ABEYRATHNA",
"D M SENARATHNA",
"T M T S THENNAKOON",
"A M J BANDARA",
"J M C M BANDARA",
"S P A CHANDRASENA",
"W M C P GUNASEKARA",
"S SUDHAGARAN",
"M D P S PERERA",
"T RAJKUMAR",
"S E M BHASHITHA",
"T SAJEEV",
"G M M J RAVISHANKA"

    };

    private Random random = new Random();
    private Map<String, String> raffleMap;

    public RaffleDraw() {
        initComponents();
        
        
        raffleMap = new HashMap<>();
        for (int i = 0; i < serialNumbers.length; i++) {
            raffleMap.put(serialNumbers[i], fullNames[i]);
        }
        
        Image icon = new ImageIcon(this.getClass().getResource("/raffle draw.png")).getImage();
        this.setIconImage(icon);
    }
    
    // Method to select and display a random value from the array
    private void drawValue() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int count = 0;
            final int maxCount = 50; // Adjust the number of iterations to change speed
        
        @Override
        public void run() {
                int randomIndex = random.nextInt(serialNumbers.length);
                String selectedSerialNumber = serialNumbers[randomIndex];
                numberWheel.setText(selectedSerialNumber);
                count++;
                if (count >= maxCount) {
                    timer.cancel();
                    showFullName(selectedSerialNumber);
                }
            }
    }, 0, 100); // Change value every 100 milliseconds (adjust to change animation speed)
}

    // Method to reset the numberWheel
    private void resetNumberWheel() {
        // Set the numberWheel text back to its default value
        numberWheel.setText("");
    }
    
    private void resetWinner() {
        // Set the numberWheel text back to its default value
        Winner.setText("");
    }
    
   private void showFullName(String serialNumber) {
    // Retrieve the full name from the map
    String fullName = raffleMap.get(serialNumber);
    
    // Update the JTextField with the winner's name
    Winner.setText(fullName);
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        numberWheel = new java.awt.Label();
        drawBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Winner = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(19, 91, 100));

        jPanel1.setBackground(new java.awt.Color(186, 167, 105));

        numberWheel.setAlignment(java.awt.Label.CENTER);
        numberWheel.setBackground(new java.awt.Color(255, 255, 255));
        numberWheel.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N
        numberWheel.setForeground(new java.awt.Color(35, 31, 32));
        numberWheel.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(numberWheel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(numberWheel, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        drawBtn.setBackground(new java.awt.Color(0, 51, 153));
        drawBtn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        drawBtn.setForeground(new java.awt.Color(255, 255, 255));
        drawBtn.setText("DRAW");
        drawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(255, 51, 0));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Winner :");

        Winner.setBackground(new java.awt.Color(255, 255, 255));
        Winner.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        Winner.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vella.PNG"))); // NOI18N
        jLabel3.setAutoscrolls(true);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(633, 633, 633)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(drawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(Winner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(250, 250, 250))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Winner))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetBtn))
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        resetNumberWheel();  
        resetWinner();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void drawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBtnActionPerformed
        // TODO add your handling code here:
        drawValue();
    }//GEN-LAST:event_drawBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RaffleDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaffleDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaffleDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaffleDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaffleDraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Winner;
    private javax.swing.JButton drawBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label numberWheel;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
