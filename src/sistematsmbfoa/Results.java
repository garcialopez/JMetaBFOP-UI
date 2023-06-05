package sistematsmbfoa;

import com.garcialopez.metaheuristic.tsmbfoa.TSMBFOA;
import com.garcialopez.optimizationmodel.CNOP;
import com.opencsv.CSVWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Results extends javax.swing.JDialog {

    private final CNOP cnop;
    private TSMBFOA tsmbfoa;

    public Results(Frame parent, boolean modal, CNOP cnop, TSMBFOA tsmbfoa) {
        super(parent, modal);
        initComponents();
        this.setSize(this.getParent().getSize());
        this.cnop = cnop;
        this.tsmbfoa = tsmbfoa;
        this.showResultsOne();
        this.showResultsTwo();
        this.showResultsThree();
        this.showResultsTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtBacteria = new javax.swing.JTextField();
        txtstepSize = new javax.swing.JTextField();
        txtCiclosQuimiotaxis = new javax.swing.JTextField();
        txtFactorEscalamiento = new javax.swing.JTextField();
        txtBacteriasReproducir = new javax.swing.JTextField();
        txtNumeroEvaluaciones = new javax.swing.JTextField();
        txtFrecuenciaReproduccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtIteratios = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRuntime = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtBest = new javax.swing.JTextField();
        txtAverage = new javax.swing.JTextField();
        txtMedian = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtFeasibleRate = new javax.swing.JTextField();
        txtWorst = new javax.swing.JTextField();
        txtStd = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtSuccessRate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtSuccessPerformance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtValorConocido = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnExport = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Results");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "TS-MBFOA Parameters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel19.setText("Bacteria");

        jLabel20.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel20.setText("Stepsize");

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel21.setText("Chemotoxic cycles");

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel22.setText("Scaling factor");

        jLabel24.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel24.setText("Bacteria to reproduce");

        jLabel23.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel23.setText("Reproduction frequency");

        jLabel25.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel25.setText("Evaluations");

        txtBacteria.setEditable(false);
        txtBacteria.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtBacteria.setForeground(new java.awt.Color(36, 160, 95));
        txtBacteria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBacteriaKeyTyped(evt);
            }
        });

        txtstepSize.setEditable(false);
        txtstepSize.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtstepSize.setForeground(new java.awt.Color(36, 160, 95));
        txtstepSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstepSizeKeyTyped(evt);
            }
        });

        txtCiclosQuimiotaxis.setEditable(false);
        txtCiclosQuimiotaxis.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCiclosQuimiotaxis.setForeground(new java.awt.Color(36, 160, 95));
        txtCiclosQuimiotaxis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiclosQuimiotaxisKeyTyped(evt);
            }
        });

        txtFactorEscalamiento.setEditable(false);
        txtFactorEscalamiento.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFactorEscalamiento.setForeground(new java.awt.Color(36, 160, 95));
        txtFactorEscalamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFactorEscalamientoKeyTyped(evt);
            }
        });

        txtBacteriasReproducir.setEditable(false);
        txtBacteriasReproducir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtBacteriasReproducir.setForeground(new java.awt.Color(36, 160, 95));
        txtBacteriasReproducir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBacteriasReproducirKeyTyped(evt);
            }
        });

        txtNumeroEvaluaciones.setEditable(false);
        txtNumeroEvaluaciones.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtNumeroEvaluaciones.setForeground(new java.awt.Color(36, 160, 95));
        txtNumeroEvaluaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroEvaluacionesKeyTyped(evt);
            }
        });

        txtFrecuenciaReproduccion.setEditable(false);
        txtFrecuenciaReproduccion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFrecuenciaReproduccion.setForeground(new java.awt.Color(36, 160, 95));
        txtFrecuenciaReproduccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaReproduccionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(txtBacteria, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(118, 118, 118)
                        .addComponent(txtstepSize, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(44, 44, 44)
                        .addComponent(txtCiclosQuimiotaxis, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(78, 78, 78)
                        .addComponent(txtFactorEscalamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(22, 22, 22)
                        .addComponent(txtBacteriasReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(6, 6, 6)
                        .addComponent(txtFrecuenciaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(95, 95, 95)
                        .addComponent(txtNumeroEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(txtBacteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(txtstepSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(txtCiclosQuimiotaxis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22))
                    .addComponent(txtFactorEscalamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel24))
                    .addComponent(txtBacteriasReproducir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23))
                    .addComponent(txtFrecuenciaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNumeroEvaluaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Execution time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel26.setText("Iterations");

        jLabel28.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel28.setText("Total time");

        txtIteratios.setEditable(false);
        txtIteratios.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtIteratios.setForeground(new java.awt.Color(36, 160, 95));
        txtIteratios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIteratiosKeyTyped(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtRuntime.setEditable(false);
        txtRuntime.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtRuntime.setForeground(new java.awt.Color(36, 160, 95));
        txtRuntime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuntimeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtIteratios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(25, 25, 25)
                        .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel26))
                    .addComponent(txtIteratios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel28))
                    .addComponent(txtRuntime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16), new java.awt.Color(51, 0, 255))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel29.setText("Best");

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel30.setText("Media");

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel31.setText("Median");

        txtBest.setEditable(false);
        txtBest.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtBest.setForeground(new java.awt.Color(36, 160, 95));
        txtBest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBestKeyTyped(evt);
            }
        });

        txtAverage.setEditable(false);
        txtAverage.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtAverage.setForeground(new java.awt.Color(36, 160, 95));
        txtAverage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAverageKeyTyped(evt);
            }
        });

        txtMedian.setEditable(false);
        txtMedian.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtMedian.setForeground(new java.awt.Color(36, 160, 95));
        txtMedian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMedianKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel32.setText("St.d");

        txtFeasibleRate.setEditable(false);
        txtFeasibleRate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFeasibleRate.setForeground(new java.awt.Color(36, 160, 95));
        txtFeasibleRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFeasibleRateKeyTyped(evt);
            }
        });

        txtWorst.setEditable(false);
        txtWorst.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtWorst.setForeground(new java.awt.Color(36, 160, 95));
        txtWorst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWorstKeyTyped(evt);
            }
        });

        txtStd.setEditable(false);
        txtStd.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtStd.setForeground(new java.awt.Color(36, 160, 95));
        txtStd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStdKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel33.setText("Worst");

        jLabel34.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel34.setText("Feasible rate");

        txtSuccessRate.setEditable(false);
        txtSuccessRate.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSuccessRate.setForeground(new java.awt.Color(36, 160, 95));
        txtSuccessRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuccessRateKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel35.setText("Success rate");

        jLabel36.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel36.setText("Success performance");

        txtSuccessPerformance.setEditable(false);
        txtSuccessPerformance.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtSuccessPerformance.setForeground(new java.awt.Color(36, 160, 95));
        txtSuccessPerformance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuccessPerformanceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtBest, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(39, 39, 39)
                        .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(46, 46, 46)
                        .addComponent(txtMedian, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtStd, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(53, 53, 53)
                        .addComponent(txtWorst, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(89, 89, 89)
                        .addComponent(txtFeasibleRate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(txtSuccessRate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(27, 27, 27)
                        .addComponent(txtSuccessPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel29))
                    .addComponent(txtBest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel30))
                    .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel31))
                    .addComponent(txtMedian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32))
                    .addComponent(txtStd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel33))
                    .addComponent(txtWorst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel34))
                    .addComponent(txtFeasibleRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel35))
                    .addComponent(txtSuccessRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel36))
                    .addComponent(txtSuccessPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel14.setLabelFor(txtValorConocido);
        jLabel14.setText("Best known value");

        txtValorConocido.setEditable(false);
        txtValorConocido.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        txtValorConocido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorConocido.setBorder(null);
        txtValorConocido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorConocidoActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(171, 235, 198));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(210, 180, 222));

        btnExport.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar.png"))); // NOI18N
        btnExport.setText("Export");
        btnExport.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExport.setContentAreaFilled(false);
        btnExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExport.setFocusCycleRoot(true);
        btnExport.setFocusPainted(false);
        btnExport.setFocusable(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar 32.png"))); // NOI18N
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafica24.png"))); // NOI18N
        btnShow.setText("Show graphic");
        btnShow.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnShow.setContentAreaFilled(false);
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.setFocusCycleRoot(true);
        btnShow.setFocusPainted(false);
        btnShow.setFocusable(false);
        btnShow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafica32.png"))); // NOI18N
        btnShow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Results viewer");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShow)
                    .addComponent(btnExport))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("JMeta");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("BFOP");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("METAheuristic with Bacteria For Optimization Problems UI");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explore test results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat", 0, 16), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setForeground(new java.awt.Color(240, 240, 240));
        jScrollPane3.setWheelScrollingEnabled(false);

        tableResults.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableResults.setToolTipText("");
        tableResults.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableResults.setGridColor(new java.awt.Color(153, 208, 249));
        jScrollPane3.setViewportView(tableResults);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);
        jScrollPane3.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Best value:");

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("Worst value:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167)
                                        .addComponent(txtValorConocido))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 149, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorConocido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar.png"))); // NOI18N
        jMenuItem2.setText("Export");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grafica24.png"))); // NOI18N
        jMenuItem5.setText("Show graphic");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acd24.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBacteriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBacteriaKeyTyped

    }//GEN-LAST:event_txtBacteriaKeyTyped

    private void txtstepSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstepSizeKeyTyped

    }//GEN-LAST:event_txtstepSizeKeyTyped

    private void txtCiclosQuimiotaxisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiclosQuimiotaxisKeyTyped

    }//GEN-LAST:event_txtCiclosQuimiotaxisKeyTyped

    private void txtFactorEscalamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFactorEscalamientoKeyTyped

    }//GEN-LAST:event_txtFactorEscalamientoKeyTyped

    private void txtBacteriasReproducirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBacteriasReproducirKeyTyped

    }//GEN-LAST:event_txtBacteriasReproducirKeyTyped

    private void txtNumeroEvaluacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroEvaluacionesKeyTyped

    }//GEN-LAST:event_txtNumeroEvaluacionesKeyTyped

    private void txtFrecuenciaReproduccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaReproduccionKeyTyped

    }//GEN-LAST:event_txtFrecuenciaReproduccionKeyTyped

    private void txtIteratiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIteratiosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIteratiosKeyTyped

    private void txtRuntimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuntimeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuntimeKeyTyped

    private void txtBestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBestKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBestKeyTyped

    private void txtAverageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAverageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAverageKeyTyped

    private void txtMedianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedianKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedianKeyTyped

    private void txtFeasibleRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeasibleRateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeasibleRateKeyTyped

    private void txtWorstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWorstKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWorstKeyTyped

    private void txtStdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStdKeyTyped

    private void txtSuccessRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuccessRateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuccessRateKeyTyped

    private void txtSuccessPerformanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuccessPerformanceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuccessPerformanceKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.btnExport.doClick();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        About about = new About(new JFrame(), true);
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.btnShow.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void txtValorConocidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorConocidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorConocidoActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        GraphicsGUI gp = new GraphicsGUI(new JFrame(), true, this.cnop, this.tsmbfoa);
        gp.setVisible(true);
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select destination folder");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File folderToSave = fileChooser.getSelectedFile();

            String nameFile = (this.cnop.getNameProblem() + "-" + tsmbfoa.getExecutions() + "-iter" + ".csv");
            String filePath = folderToSave.getAbsolutePath() + File.separator + nameFile;

            try {

                // Crea el escritor CSV con el archivo
                CSVWriter writer = new CSVWriter(new FileWriter(filePath));

                writer.writeNext(new String[]{cnop.getNameProblem(), ""});
                writer.writeNext(new String[]{"Iterations: ", this.tsmbfoa.getExecutions() + ""});
                writer.writeNext(new String[]{"Total time: ", this.tsmbfoa.getTimeSeconds() + " seconds"});
                writer.writeNext(new String[]{"Best known value: ", this.cnop.getBestKnownValue() + ""});
                writer.writeNext(new String[]{"", ""});
                writer.writeNext(new String[]{"Statistics: ", ""});
                for (int i = 0; i < tsmbfoa.getStatistic().length; i++) {
                    writer.writeNext(new String[]{tsmbfoa.getStatisticsName()[i], tsmbfoa.getStatistic()[i] + ""});
                }

                writer.writeNext(new String[]{"", ""});
                writer.writeNext(new String[]{"TS-MBFOA Parameters", ""});
                writer.writeNext(new String[]{"Bacteria", "" + tsmbfoa.getSb()});
                writer.writeNext(new String[]{"Stepsize", "" + tsmbfoa.getStepSize()});
                writer.writeNext(new String[]{"Chemotoxic cycles", "" + tsmbfoa.getNc()});
                writer.writeNext(new String[]{"Scaling factor", "" + tsmbfoa.getScalingFactor()});
                writer.writeNext(new String[]{"Bacteria to reproduce", "" + tsmbfoa.getBacteriaReproduce()});
                writer.writeNext(new String[]{"Reproduction frequency", "" + tsmbfoa.getRepcycle()});
                writer.writeNext(new String[]{"Evaluations", "" + tsmbfoa.getEvaluations()});

                writer.writeNext(new String[]{"", ""});

                writer.writeNext(new String[]{"Explore test results", ""});

                DefaultTableModel mod = (DefaultTableModel) this.tableResults.getModel();

                int col = mod.getColumnCount();

                String[] columns = new String[col];

                for (int i = 0; i < columns.length; i++) {
                    columns[i] = mod.getColumnName(i);
                }

                writer.writeNext(columns);

                // Obtener el número de filas y columnas
                int rowCount = mod.getRowCount();

                // Crear una matriz para almacenar los datos
                String[][] data = new String[rowCount][col];

                // Recorrer las filas y columnas del modelo
                for (int row = 0; row < rowCount; row++) {
                    for (int column = 0; column < col; column++) {
                        // Obtener el valor de la celda en la posición (fila, columna)
                        Object cellValue = mod.getValueAt(row, column);

                        // Asignar el valor a la matriz de datos
                        data[row][column] = String.valueOf(cellValue);
                    }
                    writer.writeNext(data[row]);

                }

                writer.close();

                JOptionPane.showMessageDialog(null, "The " + nameFile + " file has been successfully exported.", "Successful", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error saving the file. Please try a different path or check if you have\nthe necessary permissions to save files in the selected location.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnExportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnShow;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tableResults;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtBacteria;
    private javax.swing.JTextField txtBacteriasReproducir;
    private javax.swing.JTextField txtBest;
    private javax.swing.JTextField txtCiclosQuimiotaxis;
    private javax.swing.JTextField txtFactorEscalamiento;
    private javax.swing.JTextField txtFeasibleRate;
    private javax.swing.JTextField txtFrecuenciaReproduccion;
    private javax.swing.JTextField txtIteratios;
    private javax.swing.JTextField txtMedian;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumeroEvaluaciones;
    private javax.swing.JTextField txtRuntime;
    private javax.swing.JTextField txtStd;
    private javax.swing.JTextField txtSuccessPerformance;
    private javax.swing.JTextField txtSuccessRate;
    private javax.swing.JTextField txtValorConocido;
    private javax.swing.JTextField txtWorst;
    private javax.swing.JTextField txtstepSize;
    // End of variables declaration//GEN-END:variables

    private void showResultsOne() {
        this.txtName.setText(this.cnop.getNameProblem());
        this.txtIteratios.setText("" + this.tsmbfoa.getExecutions());
        this.txtRuntime.setText("" + this.tsmbfoa.getTimeSeconds() + " seconds");
        this.txtValorConocido.setText("" + this.cnop.getBestKnownValue());
    }

    private void showResultsTwo() {

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(20);

        this.txtBest.setText("" + this.tsmbfoa.getStatistic()[0]);
        this.txtAverage.setText("" + this.tsmbfoa.getStatistic()[1]);
        this.txtMedian.setText("" + this.tsmbfoa.getStatistic()[2]);
        this.txtStd.setText("" + nf.format(this.tsmbfoa.getStatistic()[3]));
        this.txtWorst.setText("" + this.tsmbfoa.getStatistic()[4]);
        this.txtFeasibleRate.setText("" + this.tsmbfoa.getStatistic()[5]);
        this.txtSuccessRate.setText("" + this.tsmbfoa.getStatistic()[6]);
        this.txtSuccessPerformance.setText("" + this.tsmbfoa.getStatistic()[7]);
    }

    private void showResultsThree() {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(8);

        this.txtBacteria.setText("" + this.tsmbfoa.getSb());
        this.txtstepSize.setText("" + nf.format(this.tsmbfoa.getStepSize()));
        this.txtCiclosQuimiotaxis.setText("" + this.tsmbfoa.getNc());
        this.txtFactorEscalamiento.setText("" + this.tsmbfoa.getScalingFactor());
        this.txtBacteriasReproducir.setText("" + this.tsmbfoa.getBacteriaReproduce());
        this.txtFrecuenciaReproduccion.setText("" + this.tsmbfoa.getRepcycle());
        this.txtNumeroEvaluaciones.setText("" + this.tsmbfoa.getEvaluations());
    }

    public void showResultsTable() {

        int objFunPosition = this.tsmbfoa.getBestResults()[0].length - 2;
        int constraintPosition = this.tsmbfoa.getBestResults()[0].length - 1;
        int matrixSize = this.tsmbfoa.getBestResults().length;

        int size = this.cnop.getNumberVariable() + 2 + 1;
        String[] column = new String[size];
        column[0] = "#";

        for (int i = 0; i < this.cnop.getNumberVariable(); i++) {
            column[i + 1] = this.cnop.getOrderVariables().get(i);
        }
        column[size - 2] = "OF";
        column[size - 1] = "CVS";

        Double[][] datosObj = new Double[this.tsmbfoa.getBestResults().length][size];

        for (int i = 0; i < matrixSize; i++) {

            datosObj[i][0] = Double.parseDouble(String.valueOf((i + 1)));

            for (int j = 0; j < this.cnop.getNumberVariable(); j++) {
                datosObj[i][j + 1] = this.tsmbfoa.getBestResults()[i][j];
            }
            datosObj[i][size - 2] = this.tsmbfoa.getBestResults()[i][objFunPosition];
            datosObj[i][size - 1] = this.tsmbfoa.getBestResults()[i][constraintPosition];

        }

        this.tableResults.setModel(new DefaultTableModel(datosObj, column));

        this.tableResults.getTableHeader().setOpaque(false);
        // cambia el tipo de letra del encabezado de la tabla
        this.tableResults.getTableHeader().setFont(new Font("Montserrat", 0, 18));
        this.tableResults.getTableHeader().setBackground(new Color(153, 208, 249));
        this.tableResults.getTableHeader().setForeground(Color.white);
        ((DefaultTableCellRenderer) this.tableResults.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);

        this.tableResults.setDefaultRenderer(this.tableResults.getColumnClass(0),
                new TableFormat(this.tsmbfoa.getStatistic()[0], this.tsmbfoa.getStatistic()[4])
        );

        this.tableResults.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.tableResults.setRowHeight(30);
        for (int i = 1; i < size - 1; i++) {
            this.tableResults.getColumnModel().getColumn(i).setPreferredWidth(200);
        }
        this.tableResults.getColumnModel().getColumn(size - 1).setPreferredWidth(100);

    }
}
