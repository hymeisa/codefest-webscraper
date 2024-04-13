package src.os.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel {

    private JFrame frame;
    private JPanel mainPanel;
    private JButton saveButton;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JComboBox<String> languageComboBox;

    public SettingsPanel() {
        frame = new JFrame("Settings Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2));

        // Username field
        mainPanel.add(new JLabel("Username:"));
        usernameField = new JTextField(20);
        mainPanel.add(usernameField);

        // Password field
        mainPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(20);
        mainPanel.add(passwordField);

        // Language selection
        mainPanel.add(new JLabel("Language:"));
        String[] languages = {"English", "Spanish", "French", "German"};
        languageComboBox = new JComboBox<>(languages);
        mainPanel.add(languageComboBox);

        // Save button
        saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveSettings();
            }
        });
        mainPanel.add(saveButton);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on screen
    }

    private void saveSettings() {
        // Code to save settings
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String selectedLanguage = (String) languageComboBox.getSelectedItem();

        // Placeholder code to display saved settings
        JOptionPane.showMessageDialog(frame, "Settings saved:\nUsername: " + username +
                "\nPassword: " + password + "\nLanguage: " + selectedLanguage);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SettingsPanel settingsPanel = new SettingsPanel();
            settingsPanel.show();
        });
    }
}