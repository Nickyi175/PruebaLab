package Ahorcado;

import javax.swing.JOptionPane;
import static Ahorcado.FramePalabraFija.palabraDef;

public class playAhorcado extends javax.swing.JFrame {

    private JuegoAhorcadoAzar juegoAhorcadoAzar;
    private JuegoAhorcadoFijo AhorcadoFijoJuego;
    public static String palabraDef;

    public playAhorcado() {

        initComponents();
        setLocationRelativeTo(null);

        PanePalabraAzar.setVisible(false);
        PanelAhorcadoFijo.setVisible(false);
        PanelPalabraFija.setVisible(false);
        PanelahorcadoAzar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AhorcadoFijo = new javax.swing.JButton();
        InicializarPalabras = new javax.swing.JButton();
        agregarpalabrasAzar = new javax.swing.JButton();
        JugarAhorcadoAlAzar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        PanelPalabraFija = new javax.swing.JPanel();
        GuardarFijo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PalabraFijaNueva = new javax.swing.JTextField();
        PanelahorcadoAzar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        palabraingresadafija = new javax.swing.JTextField();
        buscarcaracterazar1 = new javax.swing.JButton();
        PanelAhorcadoFijo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IngresadoFijo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BuscarCaracterFijo = new javax.swing.JButton();
        PanePalabraAzar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NuevaAzar = new javax.swing.JTextField();
        GuardarNuevaAzar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));

        AhorcadoFijo.setBackground(new java.awt.Color(0, 102, 153));
        AhorcadoFijo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AhorcadoFijo.setForeground(java.awt.Color.white);
        AhorcadoFijo.setText("Jugar Ahorcado Fijo");
        AhorcadoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AhorcadoFijoActionPerformed(evt);
            }
        });

        InicializarPalabras.setBackground(new java.awt.Color(0, 102, 153));
        InicializarPalabras.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        InicializarPalabras.setForeground(java.awt.Color.white);
        InicializarPalabras.setText("Agregar Palabra Fija");
        InicializarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicializarPalabrasActionPerformed(evt);
            }
        });

        agregarpalabrasAzar.setBackground(new java.awt.Color(0, 102, 153));
        agregarpalabrasAzar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        agregarpalabrasAzar.setForeground(java.awt.Color.white);
        agregarpalabrasAzar.setText("Agregar palabras para modo azar");
        agregarpalabrasAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarpalabrasAzarActionPerformed(evt);
            }
        });

        JugarAhorcadoAlAzar.setBackground(new java.awt.Color(0, 102, 153));
        JugarAhorcadoAlAzar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JugarAhorcadoAlAzar.setForeground(java.awt.Color.white);
        JugarAhorcadoAlAzar.setText("Jugar Ahorcado al Azar");
        JugarAhorcadoAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarAhorcadoAlAzarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 102, 153));
        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        salir.setForeground(java.awt.Color.white);
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        PanelPalabraFija.setBackground(new java.awt.Color(0, 102, 153));

        GuardarFijo.setText("Guardar");
        GuardarFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarFijoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Agregar palabra Ahorcado Fijo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingrese una palabra");

        PalabraFijaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraFijaNuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPalabraFijaLayout = new javax.swing.GroupLayout(PanelPalabraFija);
        PanelPalabraFija.setLayout(PanelPalabraFijaLayout);
        PanelPalabraFijaLayout.setHorizontalGroup(
            PanelPalabraFijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPalabraFijaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PanelPalabraFijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PalabraFijaNueva)
                    .addGroup(PanelPalabraFijaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(GuardarFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        PanelPalabraFijaLayout.setVerticalGroup(
            PanelPalabraFijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPalabraFijaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PalabraFijaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GuardarFijo)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PanelahorcadoAzar.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ahorcado Azar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese un caracter a adivinar");

        buscarcaracterazar1.setText("buscar");
        buscarcaracterazar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarcaracterazar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelahorcadoAzarLayout = new javax.swing.GroupLayout(PanelahorcadoAzar);
        PanelahorcadoAzar.setLayout(PanelahorcadoAzarLayout);
        PanelahorcadoAzarLayout.setHorizontalGroup(
            PanelahorcadoAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelahorcadoAzarLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PanelahorcadoAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelahorcadoAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(palabraingresadafija, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarcaracterazar1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        PanelahorcadoAzarLayout.setVerticalGroup(
            PanelahorcadoAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelahorcadoAzarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(palabraingresadafija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarcaracterazar1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        PanelAhorcadoFijo.setBackground(new java.awt.Color(0, 102, 153));
        PanelAhorcadoFijo.setPreferredSize(new java.awt.Dimension(486, 563));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ahorcado Fijo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese un caracter a adivinar");

        BuscarCaracterFijo.setText("buscar");
        BuscarCaracterFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaracterFijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAhorcadoFijoLayout = new javax.swing.GroupLayout(PanelAhorcadoFijo);
        PanelAhorcadoFijo.setLayout(PanelAhorcadoFijoLayout);
        PanelAhorcadoFijoLayout.setHorizontalGroup(
            PanelAhorcadoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAhorcadoFijoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(PanelAhorcadoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCaracterFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        PanelAhorcadoFijoLayout.setVerticalGroup(
            PanelAhorcadoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAhorcadoFijoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuscarCaracterFijo)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        PanePalabraAzar.setBackground(new java.awt.Color(0, 102, 153));
        PanePalabraAzar.setPreferredSize(new java.awt.Dimension(489, 563));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar palabra Ahorcado Azar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese una palabra");

        GuardarNuevaAzar.setText("Guardar");
        GuardarNuevaAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarNuevaAzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanePalabraAzarLayout = new javax.swing.GroupLayout(PanePalabraAzar);
        PanePalabraAzar.setLayout(PanePalabraAzarLayout);
        PanePalabraAzarLayout.setHorizontalGroup(
            PanePalabraAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanePalabraAzarLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PanePalabraAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanePalabraAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NuevaAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GuardarNuevaAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        PanePalabraAzarLayout.setVerticalGroup(
            PanePalabraAzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanePalabraAzarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NuevaAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GuardarNuevaAzar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(PanelPalabraFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelahorcadoAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(12, Short.MAX_VALUE)
                    .addComponent(PanelAhorcadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanePalabraAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelPalabraFija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelahorcadoAzar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelAhorcadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanePalabraAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 80)); // NOI18N
        jLabel7.setText("AHORCADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(AhorcadoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InicializarPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JugarAhorcadoAlAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarpalabrasAzar)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AhorcadoFijo, InicializarPalabras, JugarAhorcadoAlAzar, agregarpalabrasAzar, salir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AhorcadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InicializarPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JugarAhorcadoAlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarpalabrasAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir)))
                .addGap(157, 157, 157))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AhorcadoFijo, InicializarPalabras, JugarAhorcadoAlAzar, agregarpalabrasAzar, salir});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AhorcadoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AhorcadoFijoActionPerformed
        try {
        PanePalabraAzar.setVisible(false);
        PanelAhorcadoFijo.setVisible(false);
        PanelPalabraFija.setVisible(false);
        PanelahorcadoAzar.setVisible(false);
        System.out.println(palabraDef);
        AhorcadoFijoJuego = new JuegoAhorcadoFijo(palabraDef);
        AhorcadoFijoJuego.jugar();
//        
        } catch (NullPointerException  e) {
            JOptionPane.showMessageDialog(null, "No hay palabras disponibles, Agregar palabras antes de jugar ");
        } 
    }//GEN-LAST:event_AhorcadoFijoActionPerformed

    private void InicializarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicializarPalabrasActionPerformed
//        InicializarPalabrasFijo inicializar = new InicializarPalabrasFijo();
//        inicializar.setVisible(true);
//        this.setVisible(false);
        PanePalabraAzar.setVisible(false);
        PanelAhorcadoFijo.setVisible(false);
        PanelPalabraFija.setVisible(true);
        PanelahorcadoAzar.setVisible(false);
    }//GEN-LAST:event_InicializarPalabrasActionPerformed

    private void agregarpalabrasAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarpalabrasAzarActionPerformed
//        AgregarPalabras agregarPalabras = new AgregarPalabras();
//        agregarPalabras.setVisible(true);
//        this.setVisible(false);
        PanePalabraAzar.setVisible(true);
        PanelAhorcadoFijo.setVisible(false);
        PanelPalabraFija.setVisible(false);
        PanelahorcadoAzar.setVisible(false);
    }//GEN-LAST:event_agregarpalabrasAzarActionPerformed

    private void JugarAhorcadoAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarAhorcadoAlAzarActionPerformed
        try {
            
        
        PanePalabraAzar.setVisible(false);
        PanelAhorcadoFijo.setVisible(false);
        PanelPalabraFija.setVisible(false);
        PanelahorcadoAzar.setVisible(false);
        JuegoAhorcadoAzar juegoAhorcadoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.getpalabrasSecretas());
        juegoAhorcadoAzar.jugar();
        System.out.println(AdminPalabrasSecretas.getpalabrasSecretas());
        } catch (NullPointerException  e) {
            JOptionPane.showMessageDialog(null, "No hay palabras disponibles, Agregar palabras antes de jugar ");
        } 
    }//GEN-LAST:event_JugarAhorcadoAlAzarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void BuscarCaracterFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaracterFijoActionPerformed

    }//GEN-LAST:event_BuscarCaracterFijoActionPerformed

    private void buscarcaracterazar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarcaracterazar1ActionPerformed
        // TODO add your handling code here:
//        palabraingresadaazar.getText();
//        juegoAhorcadoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.getpalabrasSecretas());
//        juegoAhorcadoAzar.jugar();
//        System.out.println(AdminPalabrasSecretas.getpalabrasSecretas());

    }//GEN-LAST:event_buscarcaracterazar1ActionPerformed

    private void GuardarNuevaAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarNuevaAzarActionPerformed
        String palabra = NuevaAzar.getText();
        AdminPalabrasSecretas adminPalabrasSecretas = new AdminPalabrasSecretas();
        adminPalabrasSecretas.agregarPalabra(palabra.toUpperCase());
        JOptionPane.showMessageDialog(null, "La palabra se ha establecido correctamente.  ");
    }//GEN-LAST:event_GuardarNuevaAzarActionPerformed

    private void PalabraFijaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraFijaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PalabraFijaNuevaActionPerformed

    private void GuardarFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarFijoActionPerformed
        String palabra = PalabraFijaNueva.getText();
        palabraDef = palabra;
        System.out.println(palabraDef);
        JOptionPane.showMessageDialog(null, "La palabra se ha establecido correctamente.  ");
    }//GEN-LAST:event_GuardarFijoActionPerformed

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
            java.util.logging.Logger.getLogger(playAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AhorcadoFijo;
    private javax.swing.JButton BuscarCaracterFijo;
    private javax.swing.JButton GuardarFijo;
    private javax.swing.JButton GuardarNuevaAzar;
    private javax.swing.JTextField IngresadoFijo;
    private javax.swing.JButton InicializarPalabras;
    private javax.swing.JButton JugarAhorcadoAlAzar;
    private javax.swing.JTextField NuevaAzar;
    private javax.swing.JTextField PalabraFijaNueva;
    private javax.swing.JPanel PanePalabraAzar;
    private javax.swing.JPanel PanelAhorcadoFijo;
    private javax.swing.JPanel PanelPalabraFija;
    private javax.swing.JPanel PanelahorcadoAzar;
    private javax.swing.JButton agregarpalabrasAzar;
    private javax.swing.JButton buscarcaracterazar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField palabraingresadafija;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
