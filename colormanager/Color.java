package colormanager;

import java.util.Scanner;

public class Color {
    private String colorName;

    public Color(String colorName) throws InvalidColorException {
        setColorName(colorName);
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) throws InvalidColorException {
        if (colorName.equalsIgnoreCase("red") || colorName.equalsIgnoreCase("green") || colorName.equalsIgnoreCase("white")) {
            this.colorName = colorName;
        } else {
            throw new InvalidColorException("Invalid color: " + colorName + ". Allowed colors are red, green, or white.");
        }
    }

    @Override
    public String toString() {
        return "Color: " + colorName;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a color (red, green, or white): ");
			String userInput = scanner.nextLine();

			try {
			    Color color = new Color(userInput);
			    System.out.println(color);
			} catch (InvalidColorException e) {
			    System.out.println(e.getMessage());
			}
		}
    }
}