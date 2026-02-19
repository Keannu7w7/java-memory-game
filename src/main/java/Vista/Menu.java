/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Panel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author 71T3
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private javax.swing.JPanel panelTemas;

    public Menu() {
    initComponents();

    // este panel será el contenedor REAL de las temáticas
    panelTemas = new JPanel();
    panelTemas.setOpaque(false);
    panelTemas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

    // jPanel1 deja de usar el layout raro de NetBeans
    jPanel1.removeAll();
    jPanel1.setLayout(new java.awt.BorderLayout());

    // título arriba
    jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

    // temas al centro
    jPanel1.add(panelTemas, java.awt.BorderLayout.CENTER);

    // botones abajo
    JPanel panelBotones = new JPanel();
    panelBotones.setOpaque(false);
    panelBotones.add(play);
    panelBotones.add(volver);

    jPanel1.add(panelBotones, java.awt.BorderLayout.SOUTH);

    crearTarjetas();   // ← IMPORTANTÍSIMO
}
public void crearTarjetas() {

    panelTemas.removeAll();

    agregarTarjeta(op1, iop1);
    agregarTarjeta(op2, iop2);
    agregarTarjeta(op3, iop3);
    agregarTarjeta(op4, iop4);
    agregarTarjeta(op5, iop5);
    agregarTarjeta(op6, iop6);
    agregarTarjeta(op7, iop7);
    agregarTarjeta(op8, iop8);

    panelTemas.revalidate();
    panelTemas.repaint();
}
private void agregarTarjeta(JRadioButton radio, Panel imagenPanel){

    JPanel tarjeta = new JPanel();
    tarjeta.setOpaque(false);
    tarjeta.setLayout(new java.awt.BorderLayout());

    radio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    tarjeta.add(radio, java.awt.BorderLayout.NORTH);
    tarjeta.add(imagenPanel, java.awt.BorderLayout.CENTER);

    panelTemas.add(tarjeta);
}


    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JLabel getAnimalitos() {
        return animalitos;
    }

    public JLabel getAnime() {
        return anime;
    }

    public void setAnime(JLabel anime) {
        this.anime = anime;
    }

    public JLabel getFutbol() {
        return futbol;
    }

    public void setFutbol(JLabel futbol) {
        this.futbol = futbol;
    }

    public JLabel getPaisaje() {
        return paisaje;
    }

    public void setPaisaje(JLabel paisaje) {
        this.paisaje = paisaje;
    }

    public JLabel getDinos() {
        return dinos;
    }

    public JButton getVolver() {
        return volver;
    }

    public void setVolver(JButton volver) {
        this.volver = volver;
    }

    public JButton getPlay() {
        return play;
    }

    public void setPlay(JButton play) {
        this.play = play;
    }

    public JLabel getFormula1() {
        return formula1;
    }

    public JLabel getPokemon() {
        return poke;
    }

    public JLabel getSecreto() {
        return secreto;
    }

    public JLabel getPoke() {
        return poke;
    }

    public Panel getIop6() {
        return iop6;
    }

    public void setIop6(Panel iop6) {
        this.iop6 = iop6;
    }

    public Panel getIop7() {
        return iop7;
    }

    public void setIop7(Panel iop7) {
        this.iop7 = iop7;
    }

    public Panel getIop8() {
        return iop8;
    }

    public void setIop8(Panel iop8) {
        this.iop8 = iop8;
    }

    public JRadioButton getOp6() {
        return op6;
    }

    public void setOp6(JRadioButton op6) {
        this.op6 = op6;
    }

    public JRadioButton getOp7() {
        return op7;
    }

    public void setOp7(JRadioButton op7) {
        this.op7 = op7;
    }

    public JRadioButton getOp8() {
        return op8;
    }

    public void setOp8(JRadioButton op8) {
        this.op8 = op8;
    }

    public Panel getIop1() {
        return iop1;
    }

    public void setIop1(Panel iop1) {
        this.iop1 = iop1;
    }

    public Panel getIop2() {
        return iop2;
    }

    public void setIop2(Panel iop2) {
        this.iop2 = iop2;
    }

    public Panel getIop3() {
        return iop3;
    }

    public void setIop3(Panel iop3) {
        this.iop3 = iop3;
    }

    public Panel getIop4() {
        return iop4;
    }

    public void setIop4(Panel iop4) {
        this.iop4 = iop4;
    }

    public Panel getIop5() {
        return iop5;
    }

    public void setIop5(Panel iop5) {
        this.iop5 = iop5;
    }

    public JRadioButton getOp1() {
        return op1;
    }

    public void setOp1(JRadioButton op1) {
        this.op1 = op1;
    }

    public JRadioButton getOp2() {
        return op2;
    }

    public void setOp2(JRadioButton op2) {
        this.op2 = op2;
    }

    public JRadioButton getOp3() {
        return op3;
    }

    public void setOp3(JRadioButton op3) {
        this.op3 = op3;
    }

    public JRadioButton getOp4() {
        return op4;
    }

    public void setOp4(JRadioButton op4) {
        this.op4 = op4;
    }

    public JRadioButton getOp5() {
        return op5;
    }

    public void setOp5(JRadioButton op5) {
        this.op5 = op5;
    }

    public void limpiarTemas() {
        panelTemas.removeAll();
        panelTemas.revalidate();
        panelTemas.repaint();
    }

    public void ocultarTodo() {
        secreto.setVisible(false);
        iop5.setVisible(false);
        op5.setVisible(false);

        animalitos.setVisible(false);
        iop1.setVisible(false);
        op1.setVisible(false);

        dinos.setVisible(false);
        iop4.setVisible(false);
        op4.setVisible(false);

        formula1.setVisible(false);
        iop3.setVisible(false);
        op3.setVisible(false);

        poke.setVisible(false);
        iop2.setVisible(false);
        op2.setVisible(false);

        paisaje.setVisible(false);
        iop6.setVisible(false);
        op6.setVisible(false);

        anime.setVisible(false);
        iop7.setVisible(false);
        op7.setVisible(false);

        futbol.setVisible(false);
        iop8.setVisible(false);
        op8.setVisible(false);
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        op2 = new javax.swing.JRadioButton();
        iop2 = new java.awt.Panel();
        poke = new javax.swing.JLabel();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        iop3 = new java.awt.Panel();
        formula1 = new javax.swing.JLabel();
        iop4 = new java.awt.Panel();
        dinos = new javax.swing.JLabel();
        iop5 = new java.awt.Panel();
        secreto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        iop1 = new java.awt.Panel();
        animalitos = new javax.swing.JLabel();
        op5 = new javax.swing.JRadioButton();
        volver = new javax.swing.JButton();
        play = new javax.swing.JButton();
        op6 = new javax.swing.JRadioButton();
        iop6 = new java.awt.Panel();
        futbol = new javax.swing.JLabel();
        op7 = new javax.swing.JRadioButton();
        iop7 = new java.awt.Panel();
        anime = new javax.swing.JLabel();
        op8 = new javax.swing.JRadioButton();
        iop8 = new java.awt.Panel();
        paisaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 55, 118));

        op2.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op2);
        op2.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("Pokemon");
        op2.setActionCommand("POKEMON");

        iop2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop2Layout = new javax.swing.GroupLayout(iop2);
        iop2.setLayout(iop2Layout);
        iop2Layout.setHorizontalGroup(
            iop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poke, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop2Layout.setVerticalGroup(
            iop2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poke, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        op3.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op3);
        op3.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("Formula 1");
        op3.setActionCommand("FORMULA 1");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op4);
        op4.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("Dinosaurios");
        op4.setActionCommand("DINOSAURIOS");

        iop3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop3Layout = new javax.swing.GroupLayout(iop3);
        iop3.setLayout(iop3Layout);
        iop3Layout.setHorizontalGroup(
            iop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formula1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop3Layout.setVerticalGroup(
            iop3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iop3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formula1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        iop4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop4Layout = new javax.swing.GroupLayout(iop4);
        iop4.setLayout(iop4Layout);
        iop4Layout.setHorizontalGroup(
            iop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iop4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dinos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop4Layout.setVerticalGroup(
            iop4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dinos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        iop5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop5Layout = new javax.swing.GroupLayout(iop5);
        iop5.setLayout(iop5Layout);
        iop5Layout.setHorizontalGroup(
            iop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secreto, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop5Layout.setVerticalGroup(
            iop5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secreto, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(55, 122, 118));
        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TEMATICAS");

        op1.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op1);
        op1.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("Animalitos");
        op1.setActionCommand("ANIMALITOS");

        iop1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop1Layout = new javax.swing.GroupLayout(iop1);
        iop1.setLayout(iop1Layout);
        iop1Layout.setHorizontalGroup(
            iop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalitos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop1Layout.setVerticalGroup(
            iop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalitos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        op5.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op5);
        op5.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op5.setForeground(new java.awt.Color(255, 255, 255));
        op5.setText("Secreto");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(55, 122, 118));
        volver.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("VOLVER");

        play.setBackground(new java.awt.Color(55, 122, 118));
        play.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        play.setForeground(new java.awt.Color(255, 255, 255));
        play.setText("JUGAR");

        op6.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op6);
        op6.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op6.setForeground(new java.awt.Color(255, 255, 255));
        op6.setText("Futboll");
        op6.setActionCommand("DINOSAURIOS");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        iop6.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop6Layout = new javax.swing.GroupLayout(iop6);
        iop6.setLayout(iop6Layout);
        iop6Layout.setHorizontalGroup(
            iop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(futbol, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop6Layout.setVerticalGroup(
            iop6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(futbol, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        op7.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op7);
        op7.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op7.setForeground(new java.awt.Color(255, 255, 255));
        op7.setText("Anime");
        op7.setActionCommand("POKEMON");

        iop7.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop7Layout = new javax.swing.GroupLayout(iop7);
        iop7.setLayout(iop7Layout);
        iop7Layout.setHorizontalGroup(
            iop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop7Layout.createSequentialGroup()
                .addComponent(anime, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop7Layout.setVerticalGroup(
            iop7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        op8.setBackground(new java.awt.Color(55, 122, 118));
        buttonGroup1.add(op8);
        op8.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        op8.setForeground(new java.awt.Color(255, 255, 255));
        op8.setText("Paisaje");
        op8.setActionCommand("POKEMON");

        iop8.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout iop8Layout = new javax.swing.GroupLayout(iop8);
        iop8.setLayout(iop8Layout);
        iop8Layout.setHorizontalGroup(
            iop8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paisaje, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        iop8Layout.setVerticalGroup(
            iop8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iop8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paisaje, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iop4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(op6)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op8)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(iop6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(iop8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(op4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op1)
                            .addComponent(iop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op2)
                            .addComponent(iop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op7)
                            .addComponent(iop7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(op3)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(iop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(op3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op4)
                            .addComponent(op6)
                            .addComponent(op8)
                            .addComponent(op5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iop4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iop6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iop8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iop5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(op1)
                                .addComponent(op7))
                            .addGap(11, 11, 11)
                            .addComponent(iop7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(op2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(iop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(iop2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play)
                    .addComponent(volver))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op6ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animalitos;
    private javax.swing.JLabel anime;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dinos;
    private javax.swing.JLabel formula1;
    private javax.swing.JLabel futbol;
    private java.awt.Panel iop1;
    private java.awt.Panel iop2;
    private java.awt.Panel iop3;
    private java.awt.Panel iop4;
    private java.awt.Panel iop5;
    private java.awt.Panel iop6;
    private java.awt.Panel iop7;
    private java.awt.Panel iop8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JRadioButton op7;
    private javax.swing.JRadioButton op8;
    private javax.swing.JLabel paisaje;
    private javax.swing.JButton play;
    private javax.swing.JLabel poke;
    private javax.swing.JLabel secreto;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
