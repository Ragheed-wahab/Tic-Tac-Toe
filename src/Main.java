import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Main extends JFrame {

    //-----------------------------home page----------------------
    JPanel homePage ;
    JButton settingButton;
    JButton multiplayerButton;
    JButton singlePlayerButton;
    JButton aboutButton;
    JButton exitButton;
    //---------------------------setting page------------------------
    JPanel settingsPage ;
    JLabel bord;
    JComboBox choose_bord;
    JLabel fontSize;
    JComboBox choose_font;
    JButton defaultSetting;
    JButton backSetting;
    //--------------------------single player--------------------------
    JPanel SinglePlayerPage;
    JLabel name;
    JTextField nameField;
    JButton nextSingle;
    JButton backSingle;
    //--------------------------multi player------------------------------
    JPanel MultiPlayerPage;
    JLabel namePlayerOne;
    JTextField namePlayerOneField;
    JLabel namePlayerTow;
    JTextField namePlayerTowField;
    JButton nextMulti;
    JButton backMulti;

    //-------------------------Game page-----------------------------------
    JPanel gamePage;
    JPanel gamePage_boardPanel;
    JLabel[] gamePage_boardLabels;
    JLabel gamePage_boardBackground;
    JLabel gamePage_firstPlayerName;
    JLabel gamePage_secondPlayerName;
    JLabel gamePage_firstPlayerScore;
    JLabel gamePage_secondPlayerScore;
    JLabel gamePage_currentPlayerIcon;
    JButton gamePage_back;
    JButton gamePage_restart;

    Font defaultFont = new Font("Arial", Font.BOLD, 16);
    Color defaultButtonBackgroundColor = Color.lightGray;
    Color defaultButtonTextColor = Color.black;
    Color xForeground = Color.blue;
    Color oForeground = Color.red;
    Color winnerSquaresBackground = Color.yellow;

    boolean challengeComputer = false;
    boolean isFirstPlayerTurn = true;
    int XOCounter = 0;
    boolean GameIsEnd = false;
    Random random = new Random();
    int randomNumber;
    public void setColor(Color background,Color foreground){
         settingButton.setBackground(background);
         multiplayerButton.setBackground(background);
         singlePlayerButton.setBackground(background);
         aboutButton.setBackground(background);
         exitButton.setBackground(background);
         settingButton.setForeground(foreground);
         multiplayerButton.setForeground(foreground);
         singlePlayerButton.setForeground(foreground);
         aboutButton.setForeground(foreground);
         exitButton.setForeground(foreground);


        defaultSetting.setBackground(background);
        backSetting.setBackground(background);
        defaultSetting.setForeground(foreground);
        backSetting.setForeground(foreground);

        nextSingle.setBackground(background);
        backSingle.setBackground(background);
        nextSingle.setForeground(foreground);
        backSingle.setForeground(foreground);

        nextMulti.setBackground(background);
        backMulti.setBackground(background);
        nextMulti.setForeground(foreground);
        backMulti.setForeground(foreground);

        gamePage_back.setBackground(background);
        gamePage_restart.setBackground(background);
        gamePage_back.setForeground(foreground);
        gamePage_restart.setForeground(foreground);
    }
    public void setTheFont(Font font){
         settingButton.setFont(font);
         multiplayerButton.setFont(font);
         singlePlayerButton.setFont(font);
         aboutButton.setFont(font);
         exitButton.setFont(font);

        defaultSetting.setFont(font);
        backSetting.setFont(font);

        nextSingle.setFont(font);
        backSingle.setFont(font);

        nextMulti.setFont(font);
        backMulti.setFont(font);

        gamePage_back.setFont(font);
        gamePage_restart.setFont(font);
    }
    public void createHomePage() {
        homePage = new JPanel(null);
        settingButton = new JButton("Setting");
        multiplayerButton = new JButton("MultiPlayer");
        singlePlayerButton = new JButton("SinglePlayer");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        homePage.add(settingButton);
        homePage.add(multiplayerButton);
        homePage.add(singlePlayerButton);
        homePage.add(aboutButton);
        homePage.add(exitButton);

        settingButton.setBounds(80,110,240,40);
        multiplayerButton.setBounds(80,170,240,40);
        singlePlayerButton.setBounds(80,230,240,40);
        aboutButton.setBounds(80,290,240,40);
        exitButton.setBounds(80,350,240,40);
    }
    public void createSettingPage(){
        settingsPage = new JPanel(null);
        bord = new JLabel("Choose bord");
        choose_bord = new JComboBox(new String[]{"Board 1","Board 2","Board 3","Board 3"});
        fontSize = new JLabel("Font size");
        choose_font = new JComboBox(new String[]{"Small","Medium","Large"});
        defaultSetting = new JButton("Default Setting");
        backSetting = new JButton("Back");

        settingsPage.add(bord);
        settingsPage.add(choose_bord);
        settingsPage.add(fontSize);
        settingsPage.add(choose_font);
        settingsPage.add(defaultSetting);
        settingsPage.add(backSetting);

        bord.setBounds(80, 130, 100, 30);
        choose_bord.setBounds(200, 130, 120, 30);
        fontSize.setBounds(80, 190, 100, 30);
        choose_font.setBounds(200, 190, 120, 30);
        defaultSetting.setBounds(80, 250, 240, 40);
        backSetting.setBounds(80, 310, 240, 40);
    }
    public void createSinglePlayerPage(){
        SinglePlayerPage = new JPanel(null);
        name = new JLabel("Player name : ");
        nameField = new JTextField();
        nextSingle = new JButton("Start Game");
        backSingle = new JButton("Cancel");

        SinglePlayerPage.add(name);
        SinglePlayerPage.add(nameField);
        SinglePlayerPage.add(nextSingle);
        SinglePlayerPage.add(backSingle);

        name.setBounds(80, 170, 100, 30);
        nameField.setBounds(190, 170, 130, 30);
        nextSingle.setBounds(80, 220, 240, 40);
        backSingle.setBounds(80, 280, 240, 40);
    }
    public void createMultiPlayerPage(){
        MultiPlayerPage = new JPanel(null);
        namePlayerOne = new JLabel("Player One");
        namePlayerOneField = new JTextField();
        namePlayerTow = new JLabel("Player Tow");
        namePlayerTowField = new JTextField();
        nextMulti = new JButton("Start Game");
        backMulti = new JButton("Cancel");

        MultiPlayerPage.add(namePlayerOne);
        MultiPlayerPage.add(namePlayerOneField);
        MultiPlayerPage.add(namePlayerTow);
        MultiPlayerPage.add(namePlayerTowField);
        MultiPlayerPage.add(nextMulti);
        MultiPlayerPage.add(backMulti);

        namePlayerOne.setBounds(80, 130, 70, 30);
        namePlayerOneField.setBounds(160, 130, 160, 30);
        namePlayerTow.setBounds(80, 190, 70, 30);
        namePlayerTowField.setBounds(160, 190, 160, 30);
        nextMulti.setBounds(80, 250, 240, 40);
        backMulti.setBounds(80, 310, 240, 40);
    }
    public void createGamePage(){
        gamePage = new JPanel(null);
        gamePage_firstPlayerName = new JLabel("", JLabel.CENTER);
        gamePage_secondPlayerName = new JLabel("", JLabel.CENTER);
        gamePage_firstPlayerScore = new JLabel("0", JLabel.CENTER);
        gamePage_secondPlayerScore = new JLabel("0", JLabel.CENTER);
        gamePage_currentPlayerIcon = new JLabel("", JLabel.CENTER);
        gamePage_boardPanel = new JPanel(new GridLayout(3, 3, 8, 8));
        gamePage_boardLabels = new JLabel[9];
        gamePage_back = new JButton("Back");
        gamePage_restart = new JButton("Restart");
        gamePage_boardBackground = new JLabel();

        gamePage_boardBackground.setIcon(new ImageIcon("bords/board_1.png"));

        for (int i = 0; i < gamePage_boardLabels.length; i++) {
            gamePage_boardLabels[i] = new JLabel("", JLabel.CENTER);
            gamePage_boardLabels[i].setFont(new Font("Arial", Font.BOLD, 40));
            gamePage_boardLabels[i].setBackground(winnerSquaresBackground);
            gamePage_boardPanel.add(gamePage_boardLabels[i]);
        }
        setCurrentPlayerIcon();

        gamePage_firstPlayerName.setBounds(20,20,150,30);
        gamePage_secondPlayerName.setBounds(190,20,150,30);
        gamePage_firstPlayerScore.setBounds(80,60,30,30);
        gamePage_secondPlayerScore.setBounds(250,60,30,30);
        gamePage_boardPanel.setBounds(45,100,300,300);
        gamePage_boardBackground.setBounds(45,100,300,300);
        gamePage_restart.setBounds(100,420,200,30);
        gamePage_back.setBounds(100,460,200,30);

        gamePage.add(gamePage_firstPlayerName);
        gamePage.add(gamePage_secondPlayerName);
        gamePage.add(gamePage_firstPlayerScore);
        gamePage.add(gamePage_secondPlayerScore);
        gamePage.add(gamePage_boardBackground);
        gamePage.add(gamePage_boardPanel);
        gamePage.add(gamePage_restart);
        gamePage.add(gamePage_back);


    }
    public void setWinner(JLabel l1,JLabel l2,JLabel l3){
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        GameIsEnd = true;
    }
    public void checkIfThereIsAWinner(){
        String c0 = gamePage_boardLabels[0].getText();
        String c1 = gamePage_boardLabels[1].getText();
        String c2 = gamePage_boardLabels[2].getText();
        String c3 = gamePage_boardLabels[3].getText();
        String c4 = gamePage_boardLabels[4].getText();
        String c5 = gamePage_boardLabels[5].getText();
        String c6 = gamePage_boardLabels[6].getText();
        String c7 = gamePage_boardLabels[7].getText();
        String c8 = gamePage_boardLabels[8].getText();

        int firstScore = Integer.parseInt(gamePage_firstPlayerScore.getText());
        int secondScore = Integer.parseInt(gamePage_secondPlayerScore.getText());

        if(c0.equals(c1) && c0.equals(c2) && !c0.equals("")){
            if(c0.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[0],gamePage_boardLabels[1],gamePage_boardLabels[2]);
        }
        if(c3.equals(c4) && c3.equals(c5) && !c3.equals("")){
            if(c3.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[3],gamePage_boardLabels[4],gamePage_boardLabels[5]);
        }
        if(c6.equals(c7) && c6.equals(c8) && !c6.equals("")){
            if(c6.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[6],gamePage_boardLabels[7],gamePage_boardLabels[8]);
        }
        if(c0.equals(c3) && c0.equals(c6) && !c0.equals("")){
            if(c0.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[0],gamePage_boardLabels[3],gamePage_boardLabels[6]);
        }
        if(c1.equals(c4) && c1.equals(c7) && !c1.equals("")){
            if(c1.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[1],gamePage_boardLabels[4],gamePage_boardLabels[7]);
        }
        if(c2.equals(c5) && c2.equals(c8) && !c2.equals("")){
            if(c2.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[2],gamePage_boardLabels[5],gamePage_boardLabels[8]);
        }
        if(c0.equals(c4) && c0.equals(c8) && !c0.equals("")){
            if(c0.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[0],gamePage_boardLabels[4],gamePage_boardLabels[8]);
        }
        if(c2.equals(c4) && c2.equals(c6) && !c2.equals("")){
            if(c2.equals("X"))
                gamePage_firstPlayerScore.setText((++firstScore)+"");
            else
                gamePage_secondPlayerScore.setText((++secondScore)+"");
            setWinner(gamePage_boardLabels[2],gamePage_boardLabels[4],gamePage_boardLabels[6]);
        }
        gamePage.repaint();
    }
    public boolean isTowPlayerGameEnds(JLabel pressedLabel){
        if(pressedLabel.getText().equals("")){
            if(isFirstPlayerTurn){
                pressedLabel.setText("X");
                pressedLabel.setForeground(xForeground);
                isFirstPlayerTurn = false;
            }else{
                pressedLabel.setText("O");
                pressedLabel.setForeground(oForeground);
                isFirstPlayerTurn = true;
            }
            gamePage.repaint();
            checkIfThereIsAWinner();

            XOCounter++;
            if(XOCounter==9 || GameIsEnd){
                removeXOListener();
                XOCounter=0;
            }
        }
        return GameIsEnd;
    }
    public boolean isOnePlayerGameEnds(JLabel pressedLabel){
        if(XOCounter <9 && pressedLabel.getText().equals("")){
            pressedLabel.setText("X");
            pressedLabel.setForeground(xForeground);

            XOCounter++;

            repaint();
            checkIfThereIsAWinner();

            if(XOCounter<9 && !GameIsEnd){
                for(;;){
                    randomNumber = random.nextInt(9);
                    if(gamePage_boardLabels[randomNumber].getText().equals("")){
                        gamePage_boardLabels[randomNumber].setText("O");
                        gamePage_boardLabels[randomNumber].setForeground(oForeground);

                        gamePage.repaint();

                        XOCounter++;
                        checkIfThereIsAWinner();
                        break;
                    }
                }
            }
        }
        if (XOCounter >= 9 || GameIsEnd ) {
            removeXOListener();
            repaint();
            return true;
        }

        return false;
    }
    private void removeXOListener(){
        for(JLabel l : gamePage_boardLabels){
            l.removeMouseListener(XOListener);
        }
    }
    private void setCurrentPlayerIcon() {
        if (isFirstPlayerTurn) {
            gamePage_currentPlayerIcon.setText("X");
            gamePage_currentPlayerIcon.setForeground(xForeground);
        }
        else {
            gamePage_currentPlayerIcon.setText("O");
            gamePage_currentPlayerIcon.setForeground(oForeground);
        }
        repaint();
    }
    MouseListener XOListener = new MouseListener() {
        @Override
        public void mousePressed(MouseEvent e) {
            JLabel pressedLabel = (JLabel) e.getSource();
            if (!GameIsEnd) {
                if (challengeComputer)
                    isOnePlayerGameEnds(pressedLabel);
                else
                    isTowPlayerGameEnds(pressedLabel);
            }

        }
        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };
    private void startNewGame() {

        GameIsEnd = false;
        XOCounter = 0;

        setCurrentPlayerIcon();

        gamePage_boardLabels[0].setOpaque(false);
        gamePage_boardLabels[1].setOpaque(false);
        gamePage_boardLabels[2].setOpaque(false);
        gamePage_boardLabels[3].setOpaque(false);
        gamePage_boardLabels[4].setOpaque(false);
        gamePage_boardLabels[5].setOpaque(false);
        gamePage_boardLabels[6].setOpaque(false);
        gamePage_boardLabels[7].setOpaque(false);
        gamePage_boardLabels[8].setOpaque(false);

        gamePage_boardLabels[0].setText("");
        gamePage_boardLabels[1].setText("");
        gamePage_boardLabels[2].setText("");
        gamePage_boardLabels[3].setText("");
        gamePage_boardLabels[4].setText("");
        gamePage_boardLabels[5].setText("");
        gamePage_boardLabels[6].setText("");
        gamePage_boardLabels[7].setText("");
        gamePage_boardLabels[8].setText("");

        repaint();

        gamePage_boardLabels[0].addMouseListener(XOListener);
        gamePage_boardLabels[1].addMouseListener(XOListener);
        gamePage_boardLabels[2].addMouseListener(XOListener);
        gamePage_boardLabels[3].addMouseListener(XOListener);
        gamePage_boardLabels[4].addMouseListener(XOListener);
        gamePage_boardLabels[5].addMouseListener(XOListener);
        gamePage_boardLabels[6].addMouseListener(XOListener);
        gamePage_boardLabels[7].addMouseListener(XOListener);
        gamePage_boardLabels[8].addMouseListener(XOListener);

    }
    public Main(){
        createAndShowGUI();
    }
    public void createAndShowGUI(){
        createHomePage();
        createGamePage();
        createSettingPage();
        createMultiPlayerPage();
        createSinglePlayerPage();

        CardLayout card = new CardLayout();
        Container container = getContentPane();
        container.setLayout(card);

        add(homePage);
        add(SinglePlayerPage);
        add(MultiPlayerPage);
        add(settingsPage);
        add(gamePage);

        container.getLayout().addLayoutComponent("startPage", homePage);
        container.getLayout().addLayoutComponent("singlePlayerPage", SinglePlayerPage);
        container.getLayout().addLayoutComponent("multiPlayerPage", MultiPlayerPage);
        container.getLayout().addLayoutComponent("settingsPage", settingsPage);
        container.getLayout().addLayoutComponent("gamePage", gamePage);

        setColor(defaultButtonBackgroundColor,defaultButtonTextColor);
        setTheFont(defaultFont);

        for(JLabel l: gamePage_boardLabels){
            l.addMouseListener(XOListener);
        }
        singlePlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"singlePlayerPage");
            }
        });
        multiplayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"multiPlayerPage");
            }
        });
        settingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"settingsPage");
            }
        });
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aboutGame
                        = "<html>"
                        + "<big>TIC TAC TOE</big><br><br>"
                        + "<p>Prepared by a <b>Ragheed Wahab</b><br><br>"
                        + "If you have any comments, ideas.. just let know<br><br>"
                        + "<u>Note</u><br>"
                        + "I used JDK 1.8 to compile the source code.<br><br><br>"
                        + "<p><i>© Copyright 2017 harmash.com - All Rights Reserved</i></p>"
                        + "<html>";

                JOptionPane.showMessageDialog(getContentPane(), aboutGame, "About Tic Tac Toe", JOptionPane.PLAIN_MESSAGE);
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        nextSingle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePage_firstPlayerName.setText("X - " +nameField.getText());
                gamePage_secondPlayerName.setText("O - Computer");
                challengeComputer = true;
                gamePage_firstPlayerScore.setText("0");
                gamePage_secondPlayerScore.setText("0");
                card.show(container, "gamePage");
            }
        });
        backSingle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"startPage");
            }
        });
        nextMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePage_firstPlayerName.setText("X - " +namePlayerOneField.getText());
                gamePage_secondPlayerName.setText("O - "+namePlayerTowField.getText());
                challengeComputer = false;
                gamePage_firstPlayerScore.setText("0");
                gamePage_secondPlayerScore.setText("0");
                card.show(container, "gamePage");
            }
        });
        backMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"startPage");
            }
        });
        gamePage_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (challengeComputer) {
                    card.show(container, "singlePlayerPage");
                } else {
                    card.show(container, "multiPlayerPage");
                }
                startNewGame();
            }
        });
        gamePage_restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });
        choose_bord.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String imgname ;
                if(e.getStateChange() == ItemEvent.SELECTED){
                    String selectedItem = e.getItem().toString();
                    switch (selectedItem){
                        case "Board 1":
                            imgname = "bords/board_1.png";
                            break;
                        case "Board 2" :
                            imgname = "bords/board_2.png";
                            break;
                        case "Board 3" :
                            imgname = "bords/board_3.png";
                            break;
                        case "Board 4" :
                            imgname = "bords/board_4.png";
                            break;
                        default:
                            imgname = "bords/board_1.png";
                    }
                    gamePage_boardBackground.setIcon(new ImageIcon(imgname));
                    repaint();
                }
            }
        });
        choose_font.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int fontSize=16;
                if(e.getStateChange()== ItemEvent.SELECTED){
                    String selected = e.getItem().toString();
                    switch (selected){
                        case "Small":
                            fontSize = 15 ;
                            break;
                        case "Medium":
                            fontSize = 16;
                            break;
                        case "Large":
                            fontSize = 17;
                            break;
                    }
                    setTheFont(new Font("Arial", Font.BOLD, fontSize));
                }
            }
        });
        defaultSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choose_bord.setSelectedItem("Board 1");
                choose_font.setSelectedItem("Medium");
                gamePage_boardBackground.setIcon(new ImageIcon("bords/board_1.png"));
                setTheFont(new Font("Arial", Font.BOLD, 16));
            }
        });
        backSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(container,"startPage");
            }
        });
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}