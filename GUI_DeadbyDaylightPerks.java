/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Spring21;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Robert
 */
public class GUI_DeadbyDaylightPerks extends JFrame {

    private JLabel jlblMessage = new JLabel("Dead by Daylight Perks", JLabel.CENTER);

    private JRadioButton jrbANursesCalling = new JRadioButton("A Nurse's Calling");
    private JRadioButton jrbGearhead = new JRadioButton("Gearhead");
    private JRadioButton jrbSprintBurst = new JRadioButton("Sprint Burst");
    private JRadioButton jrbDecisiveStrike = new JRadioButton("Decisive Strike");
    private JRadioButton jrbBorrowedTime = new JRadioButton("Borrowed Time");
    private JRadioButton jrbUnbreakable = new JRadioButton("Unbreakable");
    private JRadioButton jrbLeftBehind = new JRadioButton("Left Behind");
    private JRadioButton jrbIronWill = new JRadioButton("Iron Will");
    private JRadioButton jrbSelfCare = new JRadioButton("Self Care");

    private JFrame perkDetailFrame = new JFrame();
    
    private JLabel perkDescription;

    public GUI_DeadbyDaylightPerks() {
        MovableMessagePanel p = new MovableMessagePanel("Dead by Daylight Perks");
        add(p);
        JPanel jpRadioButtons = new JPanel();
        jpRadioButtons.setLayout(new GridLayout(3, 1));
        jpRadioButtons.add(jrbANursesCalling);
        jpRadioButtons.add(jrbGearhead);
        jpRadioButtons.add(jrbSprintBurst);
        jpRadioButtons.add(jrbDecisiveStrike);
        jpRadioButtons.add(jrbBorrowedTime);
        jpRadioButtons.add(jrbUnbreakable);
        jpRadioButtons.add(jrbLeftBehind);
        jpRadioButtons.add(jrbIronWill);
        jpRadioButtons.add(jrbSelfCare);
        add(jpRadioButtons, BorderLayout.CENTER);

        ButtonGroup group = new ButtonGroup();
        group.add(jrbANursesCalling);
        group.add(jrbGearhead);
        group.add(jrbSprintBurst);
        group.add(jrbDecisiveStrike);
        group.add(jrbBorrowedTime);
        group.add(jrbUnbreakable);
        group.add(jrbLeftBehind);
        group.add(jrbIronWill);
        group.add(jrbSelfCare);

        jrbANursesCalling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("A Nurse's Calling - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>Unlocks potential in one's reading ability."
                        + "The aura's of survivors who are healing or being healed are revealed to you when they are within a 28 meter range.</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });

        jrbGearhead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Gearhead - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                perkDescription = new JLabel();
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>You have got an ear for well-oiled gears, After hitting a Survivor twice with your basic attack, Gearhead activates for 30 seconds."
                        + " Each time a survivor succeeds a Good Skill Check while reparing, the Generator will be revealed by a yellow Aura for as long as it continues being repaired.</body></html>");
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });

        jrbSprintBurst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Sprint Burst - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                perkDescription = new JLabel();
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>When starting to run, break into a sprint at 150% of your normal speed for a maximum of 3 seconds."
                        + " Sprint Burst causes the Exhausted Status effect for 40 seconds. Sprint Burst cannot be used when exhausted</body></html>");
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });

        jrbDecisiveStrike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Decisive Strike - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                perkDescription = new JLabel();
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>Using whatever is at hand, you stab your aggressor in an ultimate attempt to escape."
                        + " After being unhooked or unhooking yourself, Decisive Strike activates for the next 60 seconds."
                        + " When being grabbed or picked up by the Killer, succeed a Skill Check to automatically escape their grasp, stunning them for 5 seconds.</html></body>");
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });
        
        jrbBorrowedTime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Borrowed Time - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>You are fuelled with unexpected energy when saving an ally from a hook."
                        + " For 15 seconds after unhooking a Survivor, the unhooked Survivor is protected by the Endurance Status Effect."
                        + " Any damage taken that would put the survivor into the Dying State will instead trigger the Deep Wound Status Effect,"
                        + " after which the Survivor has 20 seconds to Mend themselves. Taking any damage while under the effect of Deep Wound or"
                        + " if its timer runs out will put the Survivor into the Dying State</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });
        
        jrbUnbreakable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Unbreakable - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>Past battles have taught you a thing or two about survival."
                        + " Once per trial, you can completely recover from the Dying State. Your recovery speed is permanently increased by 35%.</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });
        
        jrbLeftBehind.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Left Behind - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>You will get the job done... no matter the cost. When you are the last Survivor remaining in the Trial, "
                        + "the Aura of the hatch is revealed to you when you are within 32 metres.</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });
        
        jrbIronWill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Iron Will - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>You are able to concentrate and enter a meditative-like state to numb and pain."
                        + " When injured, Grunts of Pain are reduced by 100%.</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });
        
        jrbSelfCare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configure second frame
                perkDetailFrame.setLocationRelativeTo(null);
                perkDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                perkDetailFrame.setTitle("Self Care - Very Rare Perk");
                perkDetailFrame.setSize(500, 300);
                perkDetailFrame.getContentPane().setBackground(Color.black);
                // Step 1: Make instance of component class
                perkDescription = new JLabel();
                // Step 2: Configure our new component
                perkDescription.setForeground(Color.white);
                perkDescription.setFont(perkDescription.getFont().deriveFont (13.0f));
                perkDescription.setText("<html><body>Unlocks the ability to heal yourself without needing a Med-Kit at 50% of the normal Healing Speed."
                        + " When using a Med-Kit, it's Depletion rate is decreased by 20%.</html></body>");
                // Step 3: Add the component to it's parent container
                perkDetailFrame.add(perkDescription);
                perkDetailFrame.setVisible(true);
            }
        });

    } // close GUI_DeadbyDaylightPerks

    public static void main(String[] args) {
        GUI_DeadbyDaylightPerks frame = new GUI_DeadbyDaylightPerks();
        frame.setTitle("GUI_DeadbyDaylightPerks");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } // close main

    static class MovableMessagePanel extends JPanel {

        private String message = "Welcome to Java";
        private int x = 20;
        private int y = 20;

        public MovableMessagePanel(String s) {
            message = s;
            addMouseMotionListener(new MouseMotionListener() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                    repaint();
                }

                @Override
                public void mouseMoved(MouseEvent e) {
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString(message, x, y);
        } // close paintComponent
    } // close static class
} // close class
